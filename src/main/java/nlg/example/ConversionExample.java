package nlg.example;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.ConversioncontrollervApi;

public class ConversionExample {
    public void postConversionExperiment(String token) {
        ConversioncontrollervApi apiInstance = new ConversioncontrollervApi();

        ApiClient apiClient = apiInstance.getApiClient();

        apiClient.setAccessToken(token);
        try {
            Long experimentId = 1L;
            String channel = "channel";
            String messageContent = "content";
            Long messageId = 1L;
            apiInstance.postConversionUsingPOST(experimentId, channel, messageContent, messageId);
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
            Long experimentId = 1L;
            String channel = "channel";
            Long messageId = 1L;
            apiInstance.postReachUsingGET(experimentId, channel, messageId);
            System.out.println("Run getConversionReachExperiment");
        } catch (ApiException e) {
            System.err.println("Exception when calling ConversioncontrollervApi#postReachUsingGET");
            System.err.println("Error: " + e.getResponseBody());
        }
    }
}
