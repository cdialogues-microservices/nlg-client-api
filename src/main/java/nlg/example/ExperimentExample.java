package nlg.example;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.ExperimentclientcontrollerApi;
import io.swagger.client.model.DisplayedMessage;
import io.swagger.client.model.Experiment;

import java.util.List;

public class ExperimentExample {
    public void getExperiment(String token) {
        ExperimentclientcontrollerApi apiInstance = new ExperimentclientcontrollerApi();

        ApiClient apiClient = apiInstance.getApiClient();

        apiClient.setAccessToken(token);
        try {
            Long experimentId = 1L;
            Experiment experiment = apiInstance.getExperimentUsingGET(experimentId);
            System.out.println("Result getExperiment: " + experiment);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExperimentclientcontrollerApi#getExperimentUsingGET");
            System.err.println("Error: " + e.getResponseBody());
        }
    }

    public void getExperimentNextMessage(String token) {
        ExperimentclientcontrollerApi apiInstance = new ExperimentclientcontrollerApi();

        ApiClient apiClient = apiInstance.getApiClient();

        apiClient.setAccessToken(token);
        try {
            Long experimentId = 1L;
            DisplayedMessage displayedMessage = apiInstance.getNextMessageByExperimentIdUsingGET(experimentId);
            System.out.println("Result getExperimentNextMessage: " + displayedMessage);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExperimentclientcontrollerApi#getNextMessageByExperimentIdUsingGET");
            System.err.println("Error: " + e.getResponseBody());
        }
    }

    public void getExperimentsByStatus(String token) {
        ExperimentclientcontrollerApi apiInstance = new ExperimentclientcontrollerApi();

        ApiClient apiClient = apiInstance.getApiClient();

        apiClient.setAccessToken(token);
        try {
            String status = "DRAFT";
            List<Experiment> experiments = apiInstance.getExperimentsByStatusUsingGET(status);
            System.out.println("Result getExperimentsByStatus: " + experiments);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExperimentclientcontrollerApi#getExperimentsByStatusUsingGET");
            System.err.println("Error: " + e.getResponseBody());
        }
    }
}
