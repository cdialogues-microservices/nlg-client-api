package nlg.example.facebook;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.RichMediaControllerApi;

import java.io.File;
import java.io.IOException;

public class UploadImageExample {

    public Long uploadImage(String accessToken, String filePath, String aspectRatio, String channel){
        try {
            RichMediaControllerApi apiInstance = new RichMediaControllerApi();
            ApiClient apiClient = apiInstance.getApiClient();
            apiClient.setAccessToken(accessToken);

            File imageFile = new File(filePath);
            if (!imageFile.exists() || !imageFile.isFile()) {
                throw new IllegalArgumentException("Invalid file path: " + filePath);
            }


            return apiInstance.uploadFileUsingPOST(imageFile, aspectRatio, channel);

        } catch (ApiException e) {
            if (e.getCode() == 401) {
                throw new RuntimeException("Authentication failed - invalid access token");
            } else {
                throw new RuntimeException("Failed to upload image: " + e.getMessage(), e);
            }
        }
    }

    private File prepareImageFile(String imagePath) throws IOException {
        File originalFile = new File(imagePath);
        return originalFile;
    }
}