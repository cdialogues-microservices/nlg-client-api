package glg.example;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.MessageclientcontrollerApi;
import io.swagger.client.model.Message;
import io.swagger.client.model.MessageRequest;
import io.swagger.client.model.RichContent;
import io.swagger.client.model.Tag;

import java.util.ArrayList;
import java.util.List;

public class MessagesExample {
    public static Message lastMessage;
    public static List<Message> lastMessagesAlternatives;

    public void postCreateMessagesRich(String token) {
        MessageclientcontrollerApi apiInstance = new MessageclientcontrollerApi();

        ApiClient apiClient = apiInstance.getApiClient();

        apiClient.setAccessToken(token);
        try {
            Message message = buildMessage();
            lastMessage = apiInstance.createMessageRichUsingPOST(message);
            System.out.println("Result postCreateMessagesRich: " + lastMessage);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageclientcontrollerApi#createMessageUsingPOST");
            System.err.println("Error: " + e.getResponseBody() + ", Message: " + e.getMessage());
        }
    }

    public void postCreateMessageRichVariations(String token) {
        MessageclientcontrollerApi apiInstance = new MessageclientcontrollerApi();

        ApiClient apiClient = apiInstance.getApiClient();

        apiClient.setAccessToken(token);
        try {
            List<Long> messagesIds = List.of(lastMessage.getMessageId());
            lastMessagesAlternatives = apiInstance.createRichContentAlternativeMessagesUsingPOST(messagesIds, false);
            System.out.println("Result postCreateMessageRichVariations: " + lastMessagesAlternatives);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageclientcontrollerApi#createMessageUsingPOST");
            System.err.println("Error: " + e.getResponseBody() + ", messages ids: " + lastMessage.getMessageId());
        }
    }

    public void getMessages(String token) {
        MessageclientcontrollerApi apiInstance = new MessageclientcontrollerApi();

        ApiClient apiClient = apiInstance.getApiClient();

        apiClient.setAccessToken(token);
        try {
            List<Long> ids = new ArrayList<>();
            ids.add(1L);
            List<String> statuses = new ArrayList<>();
            statuses.add("DRAFT");
            List<Message>  messages = apiInstance.getMessagesUsingGET(ids, statuses);
            System.out.println("Result getMessages: " + messages);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageclientcontrollerApi#getMessagesUsingGET");
            System.err.println("Error: " + e.getResponseBody());
        }
    }

    public void postMessagesFilter(String token) {
        MessageclientcontrollerApi apiInstance = new MessageclientcontrollerApi();

        ApiClient apiClient = apiInstance.getApiClient();

        apiClient.setAccessToken(token);
        try {
            List<Long> ids = new ArrayList<>();
            ids.add(1L);
            List<MessageRequest.StatusEnum> statuses = new ArrayList<>();
            statuses.add(MessageRequest.StatusEnum.DRAFT);
            MessageRequest messageRequest = new MessageRequest();
            messageRequest.setId(ids);
            messageRequest.setStatus(statuses);
            List<Message> messages = apiInstance.getMessagesUsingPOST(messageRequest);
            System.out.println("Result postMessagesFilter: " + messages);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageclientcontrollerApi#getMessagesUsingGET");
            System.err.println("Error: " + e.getResponseBody());
        }
    }

    private Message buildMessage() {
        Message message = new Message();
        List<RichContent> richContents = new ArrayList<>();
            RichContent richContent = new RichContent();
            richContent.setText("Hello");
            richContent.setPosition(1);
            List<Tag> tags = new ArrayList<>();
                Tag tag = new Tag();
                tag.setTagName("Greeting");
                Tag tag2 = new Tag();
                tag2.setTagName("FIRST");
            tags.add(tag);
            tags.add(tag2);
            richContent.setTags(tags);

            RichContent richContent1 = new RichContent();
            richContent1.setText("Find in image hidden digit 10");
            richContent1.setPosition(2);
            List<Tag> tags1 = new ArrayList<>();
                Tag tag3 = new Tag();
                tag3.setTagName("ACTION");
            tags1.add(tag3);
            richContent1.setTags(tags1);

            RichContent richContent2 = new RichContent();
            richContent2.setText("Find in image hidden digit 10");
            richContent2.setPosition(3);
            List<Tag> tags2 = new ArrayList<>();
                Tag tag4 = new Tag();
                tag4.setTagName("IMAGE");
            tags2.add(tag4);
            richContent2.setTags(tags2);

            RichContent richContent3 = new RichContent();
            richContent3.setText("and earn 20 points");
            richContent3.setPosition(4);
            List<Tag> tags3 = new ArrayList<>();
                Tag tag5 = new Tag();
                tag5.setTagName("PRIZE_POINTS");
            tags3.add(tag5);
            richContent3.setTags(tags3);

            RichContent richContent4 = new RichContent();
            richContent4.setText("and get extra 30 questions");
            richContent4.setPosition(4);
            List<Tag> tags4 = new ArrayList<>();
                Tag tag6 = new Tag();
                tag6.setTagName("PRIZE_QUESTION");
            tags4.add(tag6);
            richContent4.setTags(tags4);

            RichContent richContent5 = new RichContent();
            richContent5.setText("mobile phone");
            richContent5.setPosition(5);
            List<Tag> tags5 = new ArrayList<>();
                Tag tag7 = new Tag();
                tag7.setTagName("CAR_5");
                Tag tag8 = new Tag();
                tag8.setTagName("CAR");
            tags5.add(tag7);
            tags5.add(tag8);
            richContent5.setTags(tags5);
        richContents.add(richContent);
        richContents.add(richContent1);
        richContents.add(richContent2);
        richContents.add(richContent3);
        richContents.add(richContent4);
        richContents.add(richContent5);
        message.setRichContents(richContents);
        List<Tag> tags6 = new ArrayList<>();
            Tag tag9 = new Tag();
            tag9.setTagName("AUGUST_PRIZE");
            Tag tag10 = new Tag();
            tag10.setTagName("TEST_TAG_MESSAGE");
            Tag tag11 = new Tag();
            tag11.setTagName("NLG_INTEGRATION");
        tags6.add(tag9);
        tags6.add(tag10);
        tags6.add(tag11);
        message.setTags(tags6);

        return message;
    }
}


