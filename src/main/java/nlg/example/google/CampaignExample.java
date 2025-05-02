package nlg.example.google;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.CampaigncontrollerApi;
import io.swagger.client.model.*;
import nlg.example.util.MessageMapper;

import java.util.List;
import java.util.stream.Collectors;

public class CampaignExample {

    // Creates a Google Search campaign using message variations
    public CampaignResponseDto createGoogleSearchCampaign(String token) throws ApiException {
        // Initialize the campaign controller API
        CampaigncontrollerApi apiInstance = new CampaigncontrollerApi();
        ApiClient apiClient = apiInstance.getApiClient();

        // Set the OAuth access token for authentication
        apiClient.setAccessToken(token);

        // Prepare the initial message content specific to Google Search
        MessageExample messageExample = new MessageExample();
        Message googleInitial = messageExample.googleSearchPostCreateMessagesRich(token);

        // Generate multiple rich content variations based on the initial message
        List<Message> googleMessageVariations = messageExample.postCreateMessageRichVariations(token, googleInitial.getMessageId());

        // Build the campaign request with the message variations and campaign details
        CampaignRequestV2 googleSearchCampaignRequest = buildCampaignRequest(googleMessageVariations, "SEARCH", "Google Search", "GOOGLE");

        // Submit the campaign creation request via API
        return apiInstance.createNewUsingPOST(googleSearchCampaignRequest);
    }

    // Creates a Google Display campaign using message variations
    public CampaignResponseDto createGoogleDisplayCampaign(String token) throws ApiException {
        CampaigncontrollerApi apiInstance = new CampaigncontrollerApi();
        ApiClient apiClient = apiInstance.getApiClient();
        apiClient.setAccessToken(token);

        // Prepare display-specific initial message
        MessageExample messageExample = new MessageExample();
        Message googleInitial = messageExample.googleDisplayPostCreateMessagesRich(token);

        // Generate message variations for display
        List<Message> googleMessageVariations = messageExample.postCreateMessageRichVariations(token, googleInitial.getMessageId());

        // Build the display campaign request
        CampaignRequestV2 googleSearchCampaignRequest = buildCampaignRequest(googleMessageVariations, "DISPLAY", "Google Display", "GOOGLE");

        // Submit to the campaign creation API
        return apiInstance.createNewUsingPOST(googleSearchCampaignRequest);
    }

    // Creates a YouTube campaign (Demand Gen) using message variations
    public CampaignResponseDto createGoogleYoutubeCampaign(String token) throws ApiException {
        CampaigncontrollerApi apiInstance = new CampaigncontrollerApi();
        ApiClient apiClient = apiInstance.getApiClient();
        apiClient.setAccessToken(token);

        // Prepare YouTube-specific initial message
        MessageExample messageExample = new MessageExample();
        Message googleInitial = messageExample.googleYoutubePostCreateMessagesRich(token);

        // Generate message variations for YouTube
        List<Message> googleMessageVariations = messageExample.postCreateMessageRichVariations(token, googleInitial.getMessageId());

        // Build the YouTube campaign request (Demand Gen campaign type)
        CampaignRequestV2 googleSearchCampaignRequest = buildCampaignRequest(googleMessageVariations, "DEMAND_GEN", "Google Youtube", "YOUTUBE");

        // Submit to the campaign creation API
        return apiInstance.createNewUsingPOST(googleSearchCampaignRequest);
    }


    private CampaignRequestV2 buildCampaignRequest(List<Message> messages, String campaignType,
                                                   String experimentName, String channel){

        List<ExperimentMessage> experimentMessages = messages.stream().map(MessageMapper::mapToExperimentMessage).collect(Collectors.toList());

        TargetGroupMessage targetGroupMessage = new TargetGroupMessage();
        targetGroupMessage.setMessages(experimentMessages);

        GoogleAdsConfig googleAdsConfig = new GoogleAdsConfig();
        googleAdsConfig.setCampaignType(campaignType);
        googleAdsConfig.setLangCode("en");
        googleAdsConfig.setBudgetAmount(1L);

        Experiment experiment = new Experiment();
        experiment.setStartDateUi("2025-04-29T13:20:00");
        experiment.setEndDateUi("2025-04-30T12:20:00");
        experiment.setTimezoneUi("Asia/Bishkek");
        experiment.setExperimentName(experimentName);
        experiment.setGoogleAdsConfig(googleAdsConfig);
        experiment.setChannel(channel);
        experiment.setStrategy(Experiment.StrategyEnum.BEST_MESSAGES_ROUNDS_GA);
        experiment.setStatus(Experiment.StatusEnum.DRAFT);

        CampaignDto campaign = new CampaignDto();
        campaign.setName("Google Campaign");

        CampaignRequestV2 request = new CampaignRequestV2();
        request.setCampaign(campaign);
        request.setExperiments(List.of(experiment));
        request.setTargetGroupMessages(List.of(targetGroupMessage));
        return request;
    }
}
