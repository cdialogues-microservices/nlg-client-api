package glg.example.brevo;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.CampaigncontrollerApi;
import io.swagger.client.model.*;
import glg.example.util.MessageMapper;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CampaignExample {
    public CampaignResponseDto createBrevoCampaign(String accessToken) throws ApiException {
        CampaigncontrollerApi apiInstance = new CampaigncontrollerApi();
        ApiClient apiClient = apiInstance.getApiClient();
        apiClient.setAccessToken(accessToken);

        MessageExample messageExample = new MessageExample();
        Message brevoInitialMessage = messageExample.postCreateMessagesRich(accessToken);
        List<Message> brevoMessageVariations = messageExample.postCreateMessageRichVariations(accessToken, brevoInitialMessage.getMessageId());

        TargetGroupExample targetGroupExample = new TargetGroupExample();
        TargetGroupDto targetGroup = targetGroupExample.createTargetGroup(accessToken);

        EmailExample emailExample = new EmailExample();
        emailExample.saveEmails(accessToken,targetGroup.getName());


        CampaignRequestV2 brevoCampaignRequest = buildCampaignRequest(brevoMessageVariations, targetGroup);

        return apiInstance.createNewUsingPOST(brevoCampaignRequest);
    }

    private CampaignRequestV2 buildCampaignRequest(List<Message> messages, TargetGroupDto targetGroup) {
        List<ExperimentMessage> experimentMessages = messages.stream().map(MessageMapper::mapToExperimentMessage).collect(Collectors.toList());

        TargetGroupMessage targetGroupMessage = new TargetGroupMessage();
        targetGroupMessage.setMessages(experimentMessages);
        targetGroupMessage.setTargetGroupId(targetGroup.getId());
        targetGroupMessage.setTargetGroupName(targetGroup.getName());

        BrevoConfig brevoConfig = new BrevoConfig();
        brevoConfig.setSenderEmail("info@cslash.i");
        brevoConfig.setSenderName("Brevo");

        Experiment experiment = new Experiment();
        String TIMEZONE = "Europe/London";
        experiment.setTimezoneUi(TIMEZONE);
        ZoneId defaultTimeZone = ZoneId.of(TIMEZONE);
        ZonedDateTime experimentStartDateUI = ZonedDateTime.now(defaultTimeZone).plus(5, ChronoUnit.MINUTES);
        ZonedDateTime experimentEndDateUI = experimentStartDateUI.plus(3, ChronoUnit.HOURS);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
        experiment.setStartDateUi(formatter.format(experimentStartDateUI));
        experiment.setEndDateUi(formatter.format(experimentEndDateUI));
        experiment.setBrevoConfig(brevoConfig);
        experiment.setChannel("EMAIL");
        experiment.setStrategy(Experiment.StrategyEnum.BEST_MESSAGES_ROUNDS_GA);
        experiment.setStatus(Experiment.StatusEnum.DRAFT);
        experiment.setTargetGroup(targetGroup);
        experiment.setCustomAttributes(buildCustomAttributes());

        CampaignDto campaign = new CampaignDto();
        campaign.setName("Brevo Campaign");

        CampaignRequestV2 request = new CampaignRequestV2();
        request.setCampaign(campaign);
        request.setExperiments(List.of(experiment));
        request.setTargetGroupMessages(List.of(targetGroupMessage));
        return request;
    }

    private Object buildCustomAttributes() {
        Map<String, Object> customAttributes = new HashMap<>();
        customAttributes.put("sample", 1);
        customAttributes.put("iterationResponses", 2);
        customAttributes.put("iterationDuration", 3600000);
        customAttributes.put("isBothConditions", false);

        return customAttributes;
    }


}
