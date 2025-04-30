package nlg.example.facebook;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.CampaigncontrollerApi;
import io.swagger.client.model.*;
import nlg.example.util.MessageMapper;

import java.util.List;
import java.util.stream.Collectors;

public class CampaignExample {

    public CampaignResponseDto createFacebookCampaign(String token) throws ApiException {
        CampaigncontrollerApi apiInstance = new CampaigncontrollerApi();
        ApiClient apiClient = apiInstance.getApiClient();
        apiClient.setAccessToken(token);
        MessageExample messageExample = new MessageExample();
        Message facebookInitialMessage = messageExample.postCreateMessagesRich(token);
        List<Message> facebookMessageVariations = messageExample.postCreateMessageRichVariations(token, facebookInitialMessage.getMessageId());
        CampaignRequestV2 facebookCampaignRequest = buildCampaignRequest(facebookMessageVariations);
        return apiInstance.createNewUsingPOST(facebookCampaignRequest);
    }


    private CampaignRequestV2 buildCampaignRequest(List<Message> messages){

        List<ExperimentMessage> experimentMessages = messages.stream().map(MessageMapper::mapToExperimentMessage).collect(Collectors.toList());

        TargetGroupMessage targetGroupMessage = new TargetGroupMessage();
        targetGroupMessage.setMessages(experimentMessages);

        FacebookConfigDTO country = new FacebookConfigDTO();
        country.setId("AE");
        country.setName("United Arab Emirates");

        FacebookConfigDTO interest = new FacebookConfigDTO();
        interest.setId("6002866718622");
        interest.setName("Science (science)");

        FacebookAdConfigDTO fbConfig = new FacebookAdConfigDTO();
        fbConfig.setAgeMin(18);
        fbConfig.setAgeMax(45);
        fbConfig.setCountries(List.of(country));
        fbConfig.setInterests(List.of(interest));
        fbConfig.setLifetimeBudget(100l);
        fbConfig.setOptimizationGoal("LINK_CLICKS");
        fbConfig.setBillingEvent("IMPRESSIONS");

        Experiment experiment = new Experiment();
        experiment.setStartDateUi("2025-04-29T13:20:00");
        experiment.setEndDateUi("2025-04-30T12:20:00");
        experiment.setTimezoneUi("Asia/Bishkek");
        experiment.setExperimentName("Facebook Campaign");
        experiment.setFacebookAdConfig(fbConfig);
        experiment.setChannel("FACEBOOK_ADS");
        experiment.setFacebookPageIds(List.of("520468577812454"));
        experiment.setStrategy(Experiment.StrategyEnum.BEST_MESSAGES_ROUNDS_GA);
        experiment.setStatus(Experiment.StatusEnum.DRAFT);

        CampaignDto campaign = new CampaignDto();
        campaign.setName("Facebook Campaign");

        CampaignRequestV2 request = new CampaignRequestV2();
        request.setCampaign(campaign);
        request.setExperiments(List.of(experiment));
        request.setTargetGroupMessages(List.of(targetGroupMessage));
        return request;
    }
}
