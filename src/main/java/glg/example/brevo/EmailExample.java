package glg.example.brevo;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.EmailclientcontrollerApi;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EmailExample {
    public void saveEmails(String accessToken, String targetGroupName) {
        EmailclientcontrollerApi apiInstance = new EmailclientcontrollerApi();
        ApiClient apiClient = apiInstance.getApiClient();
        apiClient.setAccessToken(accessToken);

        File tempFile = null;
        try {
            tempFile = File.createTempFile("emails-", ".csv");
            try (FileWriter writer = new FileWriter(tempFile)) {
                writer.write("user1@example.com\n");
                writer.write("user2@example.com\n");
                writer.write("user3@example.com\n");
                writer.write("user4@example.com\n");
                writer.write("user5@example.com\n");
            }

            apiInstance.addEmailUsingPOST(tempFile, targetGroupName);
        } catch (IOException | ApiException e) {
            e.printStackTrace();
        } finally {
            if (tempFile != null && tempFile.exists()) {
                tempFile.delete();
            }
        }
    }
}
