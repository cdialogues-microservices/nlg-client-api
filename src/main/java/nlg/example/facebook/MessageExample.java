package nlg.example.facebook;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.MessageclientcontrollerApi;
import io.swagger.client.model.Message;
import io.swagger.client.model.RichContent;
import io.swagger.client.model.Tag;

import java.util.ArrayList;
import java.util.List;

public class MessageExample {

    public Message postCreateMessagesRich(String token) throws ApiException {
        MessageclientcontrollerApi apiInstance = new MessageclientcontrollerApi();

        ApiClient apiClient = apiInstance.getApiClient();

        apiClient.setAccessToken(token);

        try {

            UploadImageExample uploadImageExample = new UploadImageExample();

            Long richMediaId = uploadImageExample.uploadImage(token, "nlg/example/facebook/resources/cslash-logo.jpeg", null, "FACEBOOK_ADS");

            Message message = buildFacebookMessage(richMediaId);
            Message createdMessage = apiInstance.createMessageRichUsingPOST(message);
            System.out.println("Result postCreateMessagesRich: " + createdMessage);
            return createdMessage;
        } catch (ApiException e) {
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


    private Message buildFacebookMessage(Long richMediaId) {
        Message message = new Message();

        message.setLink("https://cslash.io");
        message.setCallToAction("LEARN_MORE");
        message.setCampaignType("OUTCOME_TRAFFIC");
        message.setChannel("FACEBOOK_ADS");

        List<RichContent> richContents = new ArrayList<>();

        richContents.add(createRichContent(1, "primary text",
                "Join our ultimate fitness challenge and take your strength, endurance, and motivation to the next level! Whether you're a beginner or a pro, this challenge is designed to push your limits and help you achieve your goals."));

        richContents.add(createRichContent(1, "primary text",
                "Participate in our ultimate fitness challenge and elevate your strength, endurance, and motivation! Regardless of whether you're just starting out or are an experienced athlete, this challenge is crafted to test your boundaries and assist you in reaching your objectives."));

        richContents.add(createRichContent(1, "primary text",
                "Be a part of our ultimate fitness challenge and enhance your strength, endurance, and motivation! No matter if you're a novice or a seasoned pro, this challenge is tailored to stretch your limits and support you in accomplishing your goals."));

        richContents.add(createRichContent(1, "primary text",
                "Join us in the ultimate fitness challenge and boost your strength, endurance, and motivation! Whether you're starting fresh or already experienced, this challenge is meant to challenge you and help you reach your aspirations."));

        richContents.add(createRichContent(2, "headline text", "Fitness challenge"));
        richContents.add(createRichContent(2, "headline text", "Workout competition"));
        richContents.add(createRichContent(2, "headline text", "Exercise contest"));
        richContents.add(createRichContent(2, "headline text", "Training challenge"));

        richContents.add(createRichContent(3, "description text",
                "Please click on this link for further information."));

        richContents.add(createRichContentWithId(4, "promo visual", richMediaId));

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
