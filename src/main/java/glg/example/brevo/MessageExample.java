package glg.example.brevo;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.MessageclientcontrollerApi;
import io.swagger.client.model.Message;
import io.swagger.client.model.RichContent;
import io.swagger.client.model.Tag;
import io.swagger.client.model.TemplateContextConfig;

import java.util.ArrayList;
import java.util.List;

public class MessageExample {
    public Message postCreateMessagesRich(String accessToken) throws ApiException {
        MessageclientcontrollerApi apiInstance = new MessageclientcontrollerApi();

        ApiClient apiClient = apiInstance.getApiClient();

        apiClient.setAccessToken(accessToken);
        try {
            Message message = buildBrevoMessage();
            Message createdMessage = apiInstance.createMessageRichUsingPOST(message);
            System.out.println("Result postCreateMessagesRich: " + createdMessage);
            return createdMessage;
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageclientcontrollerApi#createMessageUsingPOST");
            System.err.println("Error: " + e.getResponseBody());
            throw e;
        }
    }

    private Message buildBrevoMessage() {
        Message message = new Message();
        message.setTemplateContext(buildTemplateContextConfig());
        message.setChannel("EMAIL");

        List<RichContent> richContents = new ArrayList<>();
        richContents.add(createRichContent(1, "primary text",
                "Dear customer, it's time to enhance your journey!"));

        richContents.add(createRichContent(2, "primary text",
                "Experience the perks, submit your application for our Platinum Credit Card!"));

        richContents.add(createRichContent(3, "primary text",
                "Take advantage of 0% interest for the initial 12 months!"));

        richContents.add(createRichContent(4, "primary text",
                "Terms & Conditions:"));

        message.setRichContents(richContents);

        return message;
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

    private static RichContent createRichContent(int position, String tagName, String text) {
        RichContent content = new RichContent();
        content.setPosition(position);

        List<Tag> tags = new ArrayList<>();
        tags.add(new Tag(tagName));
        content.setTags(tags);

        content.setText(text);
        return content;
    }

    private TemplateContextConfig buildTemplateContextConfig() {
        TemplateContextConfig templateContextConfig = new TemplateContextConfig();

        templateContextConfig.setTargetUrl("https://example.com");
        templateContextConfig.setUnsubscribeLink("https://example.com");
        templateContextConfig.setSubject("Brevo");
        templateContextConfig.setPlaceholders(List.of(
                "messagepartOne",
                "messagepartTwo",
                "messagepartThree",
                "messagepartFour",
                "targetUrl",
                "unsubscribeUrl"
        ));
        templateContextConfig.setHtmlTemplate("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>\uD83D\uDE80 Important Message</title>\n" +
                "    <style>\n" +
                "        body {\n" +
                "            font-family: Arial, sans-serif;\n" +
                "            background-color: #f4f4f4;\n" +
                "            margin: 0;\n" +
                "            padding: 0;\n" +
                "        }\n" +
                "        .container {\n" +
                "            max-width: 600px;\n" +
                "            margin: 20px auto;\n" +
                "            background: #ffffff;\n" +
                "            padding: 20px;\n" +
                "            border-radius: 10px;\n" +
                "            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n" +
                "            text-align: left;\n" +
                "        }\n" +
                "        .header {\n" +
                "            background: #007BFF;\n" +
                "            color: white;\n" +
                "            padding: 15px;\n" +
                "            font-size: 20px;\n" +
                "            font-weight: bold;\n" +
                "            border-radius: 10px 10px 0 0;\n" +
                "            text-align: center;\n" +
                "        }\n" +
                "        .content {\n" +
                "            font-size: 16px;\n" +
                "            color: #333;\n" +
                "            padding: 20px;\n" +
                "            line-height: 1.6;\n" +
                "        }\n" +
                "        .footer {\n" +
                "            margin-top: 20px;\n" +
                "            font-size: 14px;\n" +
                "            color: #777;\n" +
                "            text-align: center;\n" +
                "        }\n" +
                "        .footer a {\n" +
                "            color: #777;\n" +
                "            text-decoration: none;\n" +
                "        }\n" +
                "        .footer a:hover {\n" +
                "            text-decoration: underline;\n" +
                "        }\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <div class=\"container\">\n" +
                "        <div class=\"header\">\uD83D\uDCE2 Important Announcement</div>\n" +
                "        <div class=\"content\">\n" +
                "            \uD83D\uDD25 ${messagepartOne} \uD83D\uDCA1 ${messagepartTwo} ✅ ${messagepartThree} \uD83D\uDE80 ${messagepartFour}\n" +
                "        </div>\n" +
                "        <div class=\"footer\">\n" +
                "            <p>Read more: <a href=\"${targetUrl}\">${targetUrl}</a></p>\n" +
                "            <p>If you no longer wish to receive these emails, you can <a href=\"${unsubscribeUrl}\">unsubscribe here</a>.</p>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "</body>\n" +
                "</html>\n");

        return templateContextConfig;
    }
}
