## Prerequisites:
 - Install Java 11: This is required to run the application. You can download it from the official Oracle website or use OpenJDK.
 - Install Maven: This is required to build the project. You can download it from the official Apache Maven website.
---
## Building the Project:
 - Navigate to the project directory where the `pom.xml` file is located.
 - Run the command `mvn clean package` to build the project. This will create a `.jar` file in the `target` directory.
---
## Running the Application:
 - Navigate to the `target` directory where the `swagger-java-client-1.0.0.jar` file is located.
 - Run the command `java -jar swagger-java-client-1.0.0.jar` to start the application.
---
## Application Description:

### Login endpoint:

Authorization and Access Token Retrieval: The application authenticates with the NLG system and retrieves an access token. This token is used for subsequent requests to the NLG system.

URL: `/api/auth/login`

Example:

```java
        AuthcontrollerApi apiInstance = new AuthcontrollerApi();
        AuthModel model = new AuthModel();
        model.setUsername("put_you_username_here");
        model.setPassword("put_your_password_here");

        String token = null;
        String refreshToken = null;

        try {
            Object result = apiInstance.loginUsingPOST(model);

            JSONObject jsonObject = new JSONObject(result.toString().replace('=', ':'));

            token = jsonObject.getString("token");
            refreshToken = jsonObject.getString("refreshToken");
        } catch (ApiException e) {
            e.printStackTrace();
        }
```

### Refresh Token endpoint:

Token Refresh: The application refreshes the access token using the refresh token.

URL: `/api/auth/refresh-token`

Example:

```java
        AuthcontrollerApi apiInstance = new AuthcontrollerApi();
        AuthModel model = new AuthModel();
        
        String token = null;
        String refreshToken = "put your refresh token here";
        try {
            RefreshTokenModel refreshTokenModel = new RefreshTokenModel();
            refreshTokenModel.setRefreshToken(refreshToken);

            Object result = apiInstance.refreshAccessTokenUsingPOST(refreshTokenModel);

            JSONObject jsonObject = new JSONObject(result.toString().replace('=', ':'));

            token = jsonObject.getString("token");
            refreshToken = jsonObject.getString("refreshToken");
        } catch (ApiException e) {
            e.printStackTrace();
        }
 ```       

### Message Creation endpoint:

Message Creation in NLG: The application creates messages in the NLG system.

URL: `/api/v1.0/messages/rich`

Example:

```java
        MessageclientcontrollerApi apiInstance = new MessageclientcontrollerApi();

        ApiClient apiClient = apiInstance.getApiClient();

        apiClient.setAccessToken("put your token here");
        try {
            Message message = new Message();
            //fill message object
            message = apiInstance.createMessageRichUsingPOST(message);
        } catch (ApiException e) {
            e.printStackTrace();
        }
```        

### Message variation Creation endpoint:

Experiment Variation Creation: Based on the created messages, the application creates variations for an experiment.

URL: `/api/v1.0/messages/rich/variations`

Example:

```java
        MessageclientcontrollerApi apiInstance = new MessageclientcontrollerApi();

        ApiClient apiClient = apiInstance.getApiClient();

        apiClient.setAccessToken("put your token here");
        try {
            //Change 0L to the id of the message you want to get
            List<Long> messagesIds = List.of(0L);
            List<Message> variations = apiInstance.createRichContentAlternativeMessagesUsingPOST(messagesIds, true);
        } catch (ApiException e) {
            e.printStackTrace();
        }
```

### Get Messages endpoint:

Retrieving Messages: The application retrieves messages from the NLG system.

URL: `/api/v1.0/messages`

Example:

```java
        MessageclientcontrollerApi apiInstance = new MessageclientcontrollerApi();

        ApiClient apiClient = apiInstance.getApiClient();

        apiClient.setAccessToken("put your token here");
        try {
            List<Long> ids = new ArrayList<>();
            // Add the ids of the messages you want to retrieve
            List<String> statuses = new ArrayList<>();
            // Add the statuses of the messages you want to retrieve
            List<Message>  messages = apiInstance.getMessagesUsingGET(ids, statuses);
        } catch (ApiException e) {
            e.printStackTrace();
        }
 ```     

### Get Messages by Filter endpoint:

Retrieving Messages by Filter: The application retrieves messages from the NLG system based on a filter.

URL: `/api/v1.0/messages/filter`

Example:

```java
        MessageclientcontrollerApi apiInstance = new MessageclientcontrollerApi();

        ApiClient apiClient = apiInstance.getApiClient();

        apiClient.setAccessToken("put your token here");
        try {
            List<Long> ids = new ArrayList<>();
            // Add the id of the message you want to get
            List<MessageRequest.StatusEnum> statuses = new ArrayList<>();
            // Add the status of the message you want to get
            MessageRequest messageRequest = new MessageRequest();
            messageRequest.setId(ids);
            messageRequest.setStatus(statuses);
            List<Message> messages = apiInstance.getMessagesUsingPOST(messageRequest);
        } catch (ApiException e) {
            e.printStackTrace();
        }
```            

### Experiment Creation endpoint:

Experiment Creation: The application creates an experiment in the NLG system.

URL: `/api/v1.0/experiments/client`

Example:

```java
        ExperimentclientcontrollerApi apiInstance = new ExperimentclientcontrollerApi();

        ApiClient apiClient = apiInstance.getApiClient();

        apiClient.setAccessToken("put your token here");
        try {
            ExperimentClient experiment = new ExperimentClient();
            // fill in the experiment object
            
            Experiment result = apiInstance.createExperimentMoreReadableUsingPOST(experiment);
        } catch (ApiException e) {
            e.printStackTrace();
        }
 ```       

### Get Experiment endpoint:

Retrieving the Created Experiment: The application retrieves the details of the created experiment.

URL: `/api/v1.0/experiments/{experimentId}`

Example:

```java
        ExperimentclientcontrollerApi apiInstance = new ExperimentclientcontrollerApi();

        ApiClient apiClient = apiInstance.getApiClient();

        apiClient.setAccessToken("put your token here");
        try {
            // Change the value of experimentId to a valid value
            Long experimentId = 0L;
            Experiment experiment = apiInstance.getExperimentUsingGET(experimentId);
        } catch (ApiException e) {
            e.printStackTrace();
        }
 ```     

### Get Experiment Next Message endpoint:

Experiment Next Message: The application retrieves the next message for an experiment.

URL: `/api/v1.0/experiments/next-message/{experimentId}`

Example:

```java
        ExperimentclientcontrollerApi apiInstance = new ExperimentclientcontrollerApi();

        ApiClient apiClient = apiInstance.getApiClient();

        apiClient.setAccessToken("put your token here");
        try {
            // Change the value of experimentId to a valid value
            Long experimentId = 0L;
            DisplayedMessage message = apiInstance.getNextMessageByExperimentIdUsingGET(experimentId);
        } catch (ApiException e) {
            e.printStackTrace();
        }
```      

### Get Experiments by Status endpoint:

Retrieving Experiments by Status: The application retrieves experiments from the NLG system based on their status.

URL: `/api/v1.0/experiments/status`

Example:

```java
        ExperimentclientcontrollerApi apiInstance = new ExperimentclientcontrollerApi();

        ApiClient apiClient = apiInstance.getApiClient();

        apiClient.setAccessToken("put your token here");
        try {
            String status = "put status here";
            List<Experiment> experiments = apiInstance.getExperimentsByStatusUsingGET(status);
        } catch (ApiException e) {
            e.printStackTrace();
        }
 ```           

### Update Conversion endpoint:

Experiment Update: The application updates the experiment in the NLG system.

URL: `/api/v2.0/conversion/experiment/{experimentId}`

Example:

```java
        ConversioncontrollervApi apiInstance = new ConversioncontrollervApi();

        ApiClient apiClient = apiInstance.getApiClient();

        apiClient.setAccessToken("put your token here");
        try {
            // Change experimentId to your experiment id
            Long experimentId = 0L;
            String channel = "put channel here";
            String messageContent = "put message content here";
            // Change messageId to your message id
            Long messageId = 0L;
            apiInstance.postConversionUsingPOST(experimentId, channel, messageContent, messageId);
        } catch (ApiException e) {
            e.printStackTrace();
        }
 ```           

### Update Reach endpoint:

Update Reach: The application updates the reach in the NLG system.

URL: `/api/v2.0/conversion/experiment_reach/{experimentId}`

Example:

```java
        ConversioncontrollervApi apiInstance = new ConversioncontrollervApi();

        ApiClient apiClient = apiInstance.getApiClient();

        apiClient.setAccessToken("put your token here");
        try {
            // Change experimentId to the id of your experiment
            Long experimentId = 0L;
            String channel = "put your channel here";
            // Change messageId to the id of your message
            Long messageId = 0L;
            apiInstance.postReachUsingGET(experimentId, channel, messageId);
        } catch (ApiException e) {
            e.printStackTrace();
        }
```        

### Apply Tracking endpoint:

Apply Tracking: The application track users by url.

URL: `/short_url/apply_tracking`

Example:

```java
        ShorturlclientcontrollerApi apiInstance = new ShorturlclientcontrollerApi();

        ApiClient apiClient = apiInstance.getApiClient();

        apiClient.setAccessToken("put your token here");
        try {
            TrackingRequest request = new TrackingRequest();
            // fill in the request object

            TrackingResponse trackingResponse = apiInstance.applyTrackingUsingPOST(request);
        } catch (ApiException e) {
            e.printStackTrace();
        }
```        

## Google Campaign Creation

Create and Manage Google Ads Campaigns:
This module handles the full flow of creating Google Ads campaigns (Search, Display, and YouTube) by authenticating with the NLG system, preparing message content, and submitting campaign requests.

**URL**: `/api/campaign/new`

```java
public static void main(String[] args) {
    try {
        // Step 1: Authenticate using provided credentials
        AuthExample.TokenPair authenticate = AuthExample.authenticate("admin@cdialogues.com", "#!6!Kh879");

        // Step 2: Create an instance of CampaignExample
        CampaignExample campaignExample = new CampaignExample();

        // Step 3: Create a Google Ads Search campaign
        CampaignResponseDto googleAdSearchCampaign = campaignExample.createGoogleSearchCampaign(authenticate.getAccessToken());
        System.out.println("Campaign for Google Ads Search successfully created: " + googleAdSearchCampaign);

        // Step 4: Create a Google Ads Display campaign
        CampaignResponseDto googleAdDisplayCampaign = campaignExample.createGoogleDisplayCampaign(authenticate.getAccessToken());
        System.out.println("Campaign for Google Ads Display successfully created: " + googleAdDisplayCampaign);

        // Step 5: Create a YouTube campaign
        CampaignResponseDto googleAdYoutubeCampaign = campaignExample.createGoogleYoutubeCampaign(authenticate.getAccessToken());
        System.out.println("Campaign for Google Ads YouTube successfully created: " + googleAdYoutubeCampaign);

    } catch (AuthExample.AuthenticationException | ApiException e) {
        throw new RuntimeException("An error occurred while creating campaigns", e);
    }
}

```
### Campaign Creation Functions

#### createGoogleSearchCampaign(String token)
Creates a Google Search campaign by:

    Setting the access token.

    Creating a rich initial message for search.

    Generating rich content message variations.

    Building and sending the campaign request.

#### createGoogleDisplayCampaign(String token)

Creates a Google Display campaign by:

    Preparing a Display-specific message.

    Generating content variations.

    Sending a campaign creation request.

#### createGoogleYoutubeCampaign(String token)

Creates a YouTube Demand Gen campaign by:

    Preparing a YouTube-specific message.

    Creating rich message variations.

    Submitting a campaign creation request with Demand Gen configuration.

### Campaign Request Builder
#### buildCampaignRequest(...)

Generates a standardized CampaignRequestV2 object used across all campaign types. It:

    Maps messages to experiment messages.

    Configures campaign metadata including start/end date, timezone, type, strategy, and budget.

    Sets up the experiment and wraps it into a CampaignRequestV2.

Example classes

[MessageExample class](./src/main/java/nlg/example/google/MessageExample.java)
[CampaignExample class](./src/main/java/nlg/example/google/CampaignExample.java)
[GoogleFlowExampleMain class](./src/main/java/nlg/example/google/GoogleFlowExampleMain.java)


# Reporting API 

This guide covers how to use the reporting endpoints of the NLG API to extract meaningful analytics based on time, experiment, and content segments.

## Reporting Endpoints

### Report by Time Dimension

Break down performance across time-based metrics.

**URL:** `/api/v1.0/report/filter`

Example:

```java
ReportcontrollerApi apiInstance = new ReportcontrollerApi();
ApiClient apiClient = apiInstance.getApiClient();
apiClient.setAccessToken("put your token here");

ReportExample reportExample = new ReportExample();
reportExample.reportsByType("put your token here");
```
This method retrieves:

    DAY_OF_WEEK
    ALIGNED_WEEK_OF_YEAR
    MONTH_OF_YEAR
    YEAR

### Top Messages by Experiment ID

Retrieve the top N performing messages for a specific experiment.

**URL**: `/api/v1.0/report`

Example:

```java
ReportExample reportExample = new ReportExample();
Long experimentId = 123L; // Replace with your actual experiment ID
reportExample.topNMessageByExperimentId("put your token here", experimentId);

```

### All Messages by Experiment ID

Retrieve all messages used in a specific experiment, not just the top performers.

**URL**: `/api/v1.0/report/full`

Example:

```java
ReportExample reportExample = new ReportExample();
Long experimentId = 123L;
reportExample.getAllMessageByExperimentId("put your token here", experimentId);

```

### Top Segments (Tags)

Identify which tags (segments) are most frequently or effectively used.

**URL**: `/api/v1.0/report/top-segment`

Example:
```java
ReportExample reportExample = new ReportExample();
reportExample.topSegments("put your token here");

```

#### Customize Time Range

Each method using ReportRequest supports startDate and endDate. You can modify the time window as follows:

```java
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
String startDate = LocalDateTime.now().minusDays(7).format(formatter); // 7 days ago
String endDate = LocalDateTime.now().format(formatter); // now

ReportRequest request = new ReportRequest();
request.setStartDate(startDate);
request.setEndDate(endDate);
request.setType(ReportRequest.TypeEnum.SEGMENT);
request.setLimit(10);

```

### Full Example
```java
String token = AuthExample.authenticate("api-demo", "api-demo").getAccessToken();

ReportExample reportExample = new ReportExample();

// 1. Time-based reports (day/week/month/year)
reportExample.reportsByType(token);

// 2. Top content segments/tags
reportExample.topSegments(token);

// 3. Messages linked to a specific experiment
Long experimentId = 123L;
reportExample.getAllMessageByExperimentId(token, experimentId);
reportExample.topNMessageByExperimentId(token, experimentId);
```

Example classes

[ReportExample class](./src/main/java/nlg/example/report/ReportExample.java)
[ReportFlowExampleMain class](./src/main/java/nlg/example/report/ReportFlowExampleMain.java)
