package nlg.example.brevo;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.CampaigncontrollerApi;
import io.swagger.client.model.*;
import nlg.example.util.MessageMapper;

import java.util.List;
import java.util.stream.Collectors;

public class CampaignExample {
    public CampaignResponseDto createBrevoCampaign(String accessToken) throws ApiException {
        CampaigncontrollerApi apiInstance = new CampaigncontrollerApi();
        ApiClient apiClient = apiInstance.getApiClient();
        apiClient.setAccessToken(accessToken);

        MessageExample messageExample = new MessageExample();
        Message brevoInitialMessage = messageExample.postCreateMessagesRich(accessToken);
        List<Message> brevoMessageVariations = messageExample.postCreateMessageRichVariations(accessToken, brevoInitialMessage.getMessageId());

        CampaignRequestV2 brevoCampaignRequest = buildCampaignRequest(brevoMessageVariations);

        return apiInstance.createNewUsingPOST(brevoCampaignRequest);
    }

    private CampaignRequestV2 buildCampaignRequest(List<Message> messages){

        List<ExperimentMessage> experimentMessages = messages.stream().map(MessageMapper::mapToExperimentMessage).collect(Collectors.toList());

        TargetGroupMessage targetGroupMessage = new TargetGroupMessage();
        targetGroupMessage.setMessages(experimentMessages);

        BrevoConfig brevoConfig = new BrevoConfig();
        brevoConfig.setSenderEmail("info@cslash.i");
        brevoConfig.setSenderName("Brevo");


        Experiment experiment = new Experiment();
        experiment.setStartDateUi("2025-04-29T13:20:00");
        experiment.setEndDateUi("2025-04-30T12:20:00");
        experiment.setTimezoneUi("Asia/Bishkek");
        experiment.setExperimentName("Brevo-Demo");
        experiment.setBrevoConfig(brevoConfig);
        experiment.setChannel("EMAIL");
        experiment.setStrategy(Experiment.StrategyEnum.BEST_MESSAGES_ROUNDS_GA);
        experiment.setStatus(Experiment.StatusEnum.DRAFT);

        CampaignDto campaign = new CampaignDto();
        campaign.setName("Brevo Campaign");

        CampaignRequestV2 request = new CampaignRequestV2();
        request.setCampaign(campaign);
        request.setExperiments(List.of(experiment));
        request.setTargetGroupMessages(List.of(targetGroupMessage));
        return request;
    }
}
