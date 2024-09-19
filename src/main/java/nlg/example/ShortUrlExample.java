package nlg.example;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.ShorturlclientcontrollerApi;
import io.swagger.client.model.TrackingRequest;
import io.swagger.client.model.TrackingResponse;

public class ShortUrlExample {
    public void getShortUrl(String token) {
        ShorturlclientcontrollerApi apiInstance = new ShorturlclientcontrollerApi();

        ApiClient apiClient = apiInstance.getApiClient();

        apiClient.setAccessToken(token);
        try {
            TrackingRequest request = new TrackingRequest();
            request.setExperimentId(ExperimentExample.lastExperiment.getExperimentId());
            request.setMessageId(ExperimentExample.lastExperiment.getMessages().stream().findFirst().get().getMessageId());
            request.setOriginalMessage("originalMessage");
            request.setUserId("16");

            TrackingResponse trackingResponse = apiInstance.applyTrackingUsingPOST(request);
            System.out.println("Result getShortUrl: " + trackingResponse);
        } catch (ApiException e) {
            System.err.println("Exception when calling ShorturlcontrollerApi#getShortUrlUsingGET");
            System.err.println("Error: " + e.getResponseBody());
        }
    }
}
