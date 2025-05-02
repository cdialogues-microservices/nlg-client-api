package nlg.example.google;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.MessageclientcontrollerApi;
import io.swagger.client.model.Message;
import io.swagger.client.model.RichContent;
import io.swagger.client.model.Tag;

import java.util.ArrayList;
import java.util.List;

public class MessageExample {

    // Creates and submits a rich message for Google Search Ads
    public Message googleSearchPostCreateMessagesRich(String token) throws ApiException {
        // Initialize the Message API client
        MessageclientcontrollerApi apiInstance = new MessageclientcontrollerApi();
        ApiClient apiClient = apiInstance.getApiClient();

        // Set the access token for authentication
        apiClient.setAccessToken(token);

        try {
            // Build the message object specific to Google Search
            Message message = buildGoogleAdsSearchMessage();

            // Submit the message via the API and return the created message
            Message createdMessage = apiInstance.createMessageRichUsingPOST(message);
            System.out.println("Result postCreateMessagesRich: " + createdMessage);
            return createdMessage;

        } catch (ApiException e) {
            // Log and rethrow the API exception with detailed response
            System.err.println("Exception when calling MessageclientcontrollerApi#createMessageUsingPOST");
            System.err.println("Error: " + e.getResponseBody());
            throw e;
        }
    }

    // Creates and submits a rich message for Google Display Ads
    public Message googleDisplayPostCreateMessagesRich(String token) throws ApiException {
        MessageclientcontrollerApi apiInstance = new MessageclientcontrollerApi();
        ApiClient apiClient = apiInstance.getApiClient();
        apiClient.setAccessToken(token);

        try {
            // Build the message object specific to Google Display
            Message message = buildGoogleDisplayMessage();

            // Submit the message via the API and return the created message
            Message createdMessage = apiInstance.createMessageRichUsingPOST(message);
            System.out.println("Result postCreateMessagesRich: " + createdMessage);
            return createdMessage;

        } catch (ApiException e) {
            // Log and rethrow the API exception with detailed response
            System.err.println("Exception when calling MessageclientcontrollerApi#createMessageUsingPOST");
            System.err.println("Error: " + e.getResponseBody());
            throw e;
        }
    }

    // Creates and submits a rich message for Google YouTube Ads (Demand Gen)
    public Message googleYoutubePostCreateMessagesRich(String token) throws ApiException {
        MessageclientcontrollerApi apiInstance = new MessageclientcontrollerApi();
        ApiClient apiClient = apiInstance.getApiClient();
        apiClient.setAccessToken(token);

        try {
            // Build the message object specific to Google YouTube
            Message message = buildYouTubeAdMessage();

            // Submit the message via the API and return the created message
            Message createdMessage = apiInstance.createMessageRichUsingPOST(message);
            System.out.println("Result postCreateMessagesRich: " + createdMessage);
            return createdMessage;

        } catch (ApiException e) {
            // Log and rethrow the API exception with detailed response
            System.err.println("Exception when calling MessageclientcontrollerApi#createMessageUsingPOST");
            System.err.println("Error: " + e.getResponseBody());
            throw e;
        }
    }



    public List<Message> postCreateMessageRichVariations(String token, Long messageId) throws ApiException {
        MessageclientcontrollerApi apiInstance = new MessageclientcontrollerApi();

        ApiClient apiClient = apiInstance.getApiClient();

        apiClient.setAccessToken(token);
        try {
            List<Long> messagesIds = List.of(messageId);
            List<Message> messageVariations = apiInstance.createRichContentAlternativeMessagesUsingPOST(messagesIds, false);
            System.out.println("Result postCreateMessageRichVariations: " + messageVariations);
            return messageVariations;
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageclientcontrollerApi#createMessageUsingPOST");
            System.err.println("Error: " + e.getResponseBody());
            throw e;
        }
    }


    private Message buildGoogleAdsSearchMessage() {
        Message message = new Message();

        message.setLink("https://cslash.io/");
        message.setChannel("GOOGLE_ADS_SEARCH");

        List<RichContent> richContents = new ArrayList<>();

        // Headline Text 1
        richContents.add(createRichContent(1, "headline text 1", "AI-Generation"));
        richContents.add(createRichContent(1, "headline text 1", "AI-Creation"));
        richContents.add(createRichContent(1, "headline text 1", "AI-Formation"));
        richContents.add(createRichContent(1, "headline text 1", "AI-Development"));

        // Headline Text 2
        richContents.add(createRichContent(2, "headline text 2", "Dynamic Optimization"));
        richContents.add(createRichContent(2, "headline text 2", "Dynamic Enhancement"));
        richContents.add(createRichContent(2, "headline text 2", "Adaptive Improvement"));
        richContents.add(createRichContent(2, "headline text 2", "Flexible Refinement"));
        richContents.add(createRichContent(2, "headline text 2", "Progressive Refinement"));

        // Headline Text 3
        richContents.add(createRichContent(3, "headline text 3", "Real-time KPIs"));
        richContents.add(createRichContent(3, "headline text 3", "Live KPIs"));

        // Descriptions
        richContents.add(createRichContent(4, "description text 1", "Your content can be generated automatically with the power of AI!"));
        richContents.add(createRichContent(5, "description text 2", "Run A/B tests and allow GLG to optimize your content to increase conversions."));

        message.setRichContents(richContents);
        return message;
    }

    private Message buildGoogleDisplayMessage() {
        Message message = new Message();

        message.setLink("https://cslash.io/");
        message.setLogoImageRichContentID(407478L);
        message.setChannel("GOOGLE_ADS_DISPLAY");

        List<RichContent> richContents = new ArrayList<>();

        // Promo image
        richContents.add(createRichContentWithId(1, "promo image", 407491L));

        // Headline
        richContents.add(createRichContent(2, "headline text", "Solutions"));
        richContents.add(createRichContent(2, "headline text", "Innovative Tools"));

        // Long headlines
        richContents.add(createRichContent(3, "headline long text", "Explore new capabilities"));
        richContents.add(createRichContent(3, "headline long text", "Discover untapped potentials"));
        richContents.add(createRichContent(3, "headline long text", "Venture into novel competencies"));

        // Description
        richContents.add(createRichContent(4, "description text", "Download our tool"));
        richContents.add(createRichContent(4, "description text", "Get our tool"));

        message.setRichContents(richContents);
        return message;
    }

    private Message buildYouTubeAdMessage() {
        Message message = new Message();

        message.setLink("https://cslash.io/");
        message.setLogoImageRichContentID(407478L);
        message.setChannel("YOUTUBE");

        List<RichContent> richContents = new ArrayList<>();

        // Promo images
        richContents.add(createRichContentWithId(1, "promo image", 407828L));
        richContents.add(createRichContentWithId(1, "promo image", 407829L));

        // Headline Texts (Position 2)
        richContents.add(createRichContent(2, "headline text", "0% Interest for 12 Months!"));
        richContents.add(createRichContent(2, "headline text", "Pay Later, Grow Now"));

        // Headline Long Texts (Position 3)
        richContents.add(createRichContent(3, "headline long text", "Start now and pay no interest for a full year—smart financing that gives you room to grow."));
        richContents.add(createRichContent(3, "headline long text", "Enjoy a full year of growth without the burden of interest—start now!"));

        // Description Texts (Position 4)
        richContents.add(createRichContent(4, "description text", "Take control of your finances with our special 12-month 0% interest offer."));
        richContents.add(createRichContent(4, "description text", "Start your journey with zero-interest financing and stay in control of your expenses."));

        message.setRichContents(richContents);
        return message;
    }


    private static RichContent createRichContent(int position, String tagName, String text) {
        RichContent content = new RichContent();
        content.setPosition(position);

        List<Tag> tags = new ArrayList<>();
        tags.add(new Tag(tagName));
        content.setTags(tags);

        content.setText(text);
        return content;
    }

    private static RichContent createRichContentWithId(int position, String tagName, Long richContentID) {
        RichContent content = new RichContent();
        content.setPosition(position);

        List<Tag> tags = new ArrayList<>();
        tags.add(new Tag(tagName));
        content.setTags(tags);

        content.setRichContentID(richContentID);
        return content;
    }
}
