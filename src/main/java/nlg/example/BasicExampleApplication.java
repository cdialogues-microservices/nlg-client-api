package nlg.example;

import io.swagger.client.ApiException;
import io.swagger.client.api.AuthcontrollerApi;
import io.swagger.client.model.AuthModel;
import io.swagger.client.model.RefreshTokenModel;
import org.json.JSONObject;

import javax.sound.midi.Soundbank;

public class BasicExampleApplication {
    public static void main(String[] args) {

        AuthcontrollerApi apiInstance = new AuthcontrollerApi();
        AuthModel model = new AuthModel();
        model.setUsername("api-demo");
        model.setPassword("api-demo");

        String token = null;
        String refreshToken = null;

        try {
            Object result = apiInstance.loginUsingPOST(model);

            JSONObject jsonObject = new JSONObject(result.toString().replace('=', ':'));

            token = jsonObject.getString("token");
            refreshToken = jsonObject.getString("refreshToken");

            System.out.println("Token: " + token);
            System.out.println("Refresh Token: " + refreshToken);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthcontrollerApi#loginUsingPOST");
            System.err.println("Error: " + e.getResponseBody());
        }

        try {
            RefreshTokenModel refreshTokenModel = new RefreshTokenModel();
            refreshTokenModel.setRefreshToken(refreshToken);

            Object result = apiInstance.refreshAccessTokenUsingPOST(refreshTokenModel);

            JSONObject jsonObject = new JSONObject(result.toString().replace('=', ':'));

            token = jsonObject.getString("token");
            refreshToken = jsonObject.getString("refreshToken");

            System.out.println("Token: " + token);
            System.out.println("Refresh Token: " + refreshToken);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthcontrollerApi#refreshTokenUsingPOST");
            System.err.println("Error: " + e.getResponseBody());
        }


        MessagesExample messagesExample = new MessagesExample();
        messagesExample.postCreateMessagesRich(token);
        messagesExample.postCreateMessageRichVariations(token);

        ExperimentExample experimentExample = new ExperimentExample();
        experimentExample.createExperimentMoreReadable(token);
        experimentExample.getExperiment(token);

        ConversionExample conversionExample = new ConversionExample();
        conversionExample.postConversionExperiment(token);
        conversionExample.getConversionReachExperiment(token);

        ShortUrlExample shortUrlExample = new ShortUrlExample();
        shortUrlExample.getShortUrl(token);
    }
}
