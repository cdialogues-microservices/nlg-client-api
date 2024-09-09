package nlg.example;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.MessageclientcontrollerApi;
import io.swagger.client.model.Message;
import io.swagger.client.model.MessageRequest;

import java.util.ArrayList;
import java.util.List;

public class MessagesExample {
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
}
