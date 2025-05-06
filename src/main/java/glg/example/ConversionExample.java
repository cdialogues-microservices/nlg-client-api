package glg.example;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.CampaigncontrollerApi;
import io.swagger.client.api.ConversioncontrollervApi;

public class ConversionExample {
    public void postConversionExperiment(String token) {
        ConversioncontrollervApi apiInstance = new ConversioncontrollervApi();

        ApiClient apiClient = apiInstance.getApiClient();

        apiClient.setAccessToken(token);
        try {
            Long experimentId = ExperimentExample.lastExperiment.getExperimentId();
            String channel = "SMS";
            String messageContent = null;
            Long messageId = ExperimentExample.lastExperiment.getMessages().stream().findFirst().get().getMessageId();
            apiInstance.postConversionUsingPOST1(experimentId, channel, messageContent, messageId);
            System.out.println("Run postConversionExperiment");
        } catch (ApiException e) {
            System.err.println("Exception when calling ConversioncontrollervApi#postConversionUsingPOST");
            System.err.println("Error: " + e.getResponseBody());
        }
    }

    public void getConversionReachExperiment(String token) {
        ConversioncontrollervApi apiInstance = new ConversioncontrollervApi();

        ApiClient apiClient = apiInstance.getApiClient();

        apiClient.setAccessToken(token);
        try {
            Long experimentId = ExperimentExample.lastExperiment.getExperimentId();
            String channel = "SMS";
            Long messageId = ExperimentExample.lastExperiment.getMessages().stream().findFirst().get().getMessageId();
            apiInstance.postReachUsingGET1(experimentId, channel, messageId);
            System.out.println("Run getConversionReachExperiment");
        } catch (ApiException e) {
            System.err.println("Exception when calling ConversioncontrollervApi#postReachUsingGET");
            System.err.println("Error: " + e.getResponseBody());
        }

        CampaigncontrollerApi apiInstance2 = new CampaigncontrollerApi();

        ApiClient apiClient2 = apiInstance2.getApiClient();
    }
}
