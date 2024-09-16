package nlg.example;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.ExperimentclientcontrollerApi;
import io.swagger.client.model.*;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExperimentExample {
    public static Experiment lastExperiment;

    public void createExperimentMoreReadable(String token) {
        ExperimentclientcontrollerApi apiInstance = new ExperimentclientcontrollerApi();

        ApiClient apiClient = apiInstance.getApiClient();

        apiClient.setAccessToken(token);
        try {
            ExperimentClient experiment = new ExperimentClient();
            String TIMEZONE = "Europe/London";
            experiment.setExperimentName("NLG_INTEGRATION_CLIENT_" + Instant.now().truncatedTo(ChronoUnit.SECONDS).toString());
            experiment.setTimezoneUi(TIMEZONE);
            experiment.setStrategy(ExperimentClient.StrategyEnum.BEST_MESSAGES_ROUNDS_GA);
            experiment.setStatus(ExperimentClient.StatusEnum.DRAFT);
            ZoneId defaultTimeZone = ZoneId.of(TIMEZONE);
            ZonedDateTime experimentStartDateUI = ZonedDateTime.now(defaultTimeZone).plus(5, ChronoUnit.MINUTES);
            ZonedDateTime experimentEndDateUI = experimentStartDateUI.plus(3, ChronoUnit.HOURS);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
            experiment.setStartDateUi(formatter.format(experimentStartDateUI));
            experiment.setEndDateUi(formatter.format(experimentEndDateUI));
            experiment.setMessages(buildExperimentMessages());
            experiment.setGaIterationConfig(buildGaIterationConfig());
            experiment.setInitialIterationConfig(buildInitialIterationConfig());
            experiment.setIterationCondition(buildIterationCondition());
            experiment.setIterationConfiguration(buildIterationConfiguration());
            experiment.setChannel("SMS");


            lastExperiment = apiInstance.createExperimentMoreReadableUsingPOST(experiment);
            System.out.println("Result createExperimentMoreReadable: " + lastExperiment);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExperimentclientcontrollerApi#createExperimentUsingPOST");
            System.err.println("Error: " + e.getResponseBody());
        }
    }

    public void createExperiment(String token) {
        ExperimentclientcontrollerApi apiInstance = new ExperimentclientcontrollerApi();

        ApiClient apiClient = apiInstance.getApiClient();

        apiClient.setAccessToken(token);
        try {
            Experiment experiment = new Experiment();
            String TIMEZONE = "Europe/London";
            experiment.setExperimentName("NLG_INTEGRATION_CLIENT_" + Instant.now().truncatedTo(ChronoUnit.SECONDS).toString());
            experiment.setTimezoneUi(TIMEZONE);
            experiment.setStrategy(Experiment.StrategyEnum.BEST_MESSAGES_ROUNDS_GA);
            experiment.setStatus(Experiment.StatusEnum.DRAFT);
            ZoneId defaultTimeZone = ZoneId.of(TIMEZONE);
            ZonedDateTime experimentStartDateUI = ZonedDateTime.now(defaultTimeZone).plus(5, ChronoUnit.MINUTES);
            ZonedDateTime experimentEndDateUI = experimentStartDateUI.plus(3, ChronoUnit.HOURS);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
            experiment.setStartDateUi(formatter.format(experimentStartDateUI));
            experiment.setEndDateUi(formatter.format(experimentEndDateUI));
            experiment.setMessages(buildExperimentMessages());
            experiment.setCustomAttributes(buildCustronAttributes());
            experiment.setChannel("SMS");

            lastExperiment = apiInstance.createExperimentUsingPOST(experiment);
            System.out.println("Result createExperiment: " + lastExperiment);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExperimentclientcontrollerApi#createExperimentUsingPOST");
            System.err.println("Error: " + e.getResponseBody());
        }
    }

    public void getExperiment(String token) {
        ExperimentclientcontrollerApi apiInstance = new ExperimentclientcontrollerApi();

        ApiClient apiClient = apiInstance.getApiClient();

        apiClient.setAccessToken(token);
        try {
            Long experimentId = lastExperiment.getExperimentId();
            lastExperiment = apiInstance.getExperimentUsingGET(experimentId);
            System.out.println("Result getExperiment: " + lastExperiment);
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

    private List<ExperimentMessage> buildExperimentMessages() {
        List<ExperimentMessage> messages = new ArrayList<>();
        for (Message message : MessagesExample.lastMessagesAlternatives) {
            ExperimentMessage experimentMessage = new ExperimentMessage();
            experimentMessage.setMessageId(message.getMessageId());
            experimentMessage.setParentId(message.getParentId());
            experimentMessage.setRichContents(message.getRichContents());
            experimentMessage.setTags(message.getTags());
            messages.add(experimentMessage);
        }
        return messages;
    }

    private GaIterationConfig buildGaIterationConfig() {
        GaIterationConfig gaIterationConfig = new GaIterationConfig();
        gaIterationConfig.setMessageCount(1);
        gaIterationConfig.setRounds(1);
        gaIterationConfig.setSampleSize(1);
        return gaIterationConfig;
    }

    private InitialIterationConfig buildInitialIterationConfig() {
        InitialIterationConfig initialIterationConfig = new InitialIterationConfig();
        initialIterationConfig.setInitialSample(4);
        initialIterationConfig.setInitialPopulationSize(2);
        return initialIterationConfig;
    }

    private IterationCondition buildIterationCondition() {
        IterationCondition iterationCondition = new IterationCondition();
        iterationCondition.setIsBothConditions(true);
        iterationCondition.setIterationDuration(300000);
        iterationCondition.setIterationResponses(3);
        return iterationCondition;
    }

    private List<IterationConfig> buildIterationConfiguration() {
        List<IterationConfig> iterationConfigurations = new ArrayList<>();
        IterationConfig iterationConfig = new IterationConfig();
        iterationConfig.setMessageCount(1);
        iterationConfig.setSampleSize(2);
        iterationConfigurations.add(iterationConfig);

        IterationConfig iterationConfig2 = new IterationConfig();
        iterationConfig2.setMessageCount(2);
        iterationConfig2.setSampleSize(3);
        iterationConfigurations.add(iterationConfig2);
        return iterationConfigurations;
    }

    private Map<String, Object> buildCustronAttributes() {
        Map<String, Object> customAttributes = new HashMap<>();
        customAttributes.put("custom_x", "aziret");
        customAttributes.put("populationSize", 10000);
        customAttributes.put("sample", 10);
        customAttributes.put("isBothConditions", true);
        customAttributes.put("iterationResponses", 11);
        customAttributes.put("iterationDuration", 300000);
        customAttributes.put("messagesPerIteration", "2");
        customAttributes.put("sampleSizePerIteration", "10");
        customAttributes.put("numberOfFinalRounds", "2");
        customAttributes.put("finalRoundSampleSize", "2");
        customAttributes.put("finalRoundMessages", "6");
        customAttributes.put("channel", "SMS");
        return customAttributes;
    }
}