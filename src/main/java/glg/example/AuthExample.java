package glg.example;

import io.swagger.client.ApiException;
import io.swagger.client.api.AuthcontrollerApi;
import io.swagger.client.model.AuthModel;
import org.json.JSONObject;

public class AuthExample {
    public static TokenPair authenticate(String username, String password) throws AuthenticationException {
        AuthcontrollerApi apiInstance = new AuthcontrollerApi();
        AuthModel model = new AuthModel();
        model.setUsername(username);
        model.setPassword(password);

        try {
            Object result = apiInstance.loginUsingPOST(model);
            JSONObject jsonObject = new JSONObject(result.toString().replace('=', ':'));

            return new TokenPair(
                    jsonObject.getString("token"),
                    jsonObject.getString("refreshToken")
            );

        } catch (ApiException e) {
            System.err.println("Exception when calling AuthcontrollerApi#loginUsingPOST");
            System.err.println("Error: " + e.getResponseBody());
            throw new AuthenticationException("Authentication failed: " + e.getMessage(), e);
        }
    }

    public static class TokenPair {
        private final String accessToken;
        private final String refreshToken;

        public TokenPair(String accessToken, String refreshToken) {
            this.accessToken = accessToken;
            this.refreshToken = refreshToken;
        }

        // Getters
        public String getAccessToken() { return accessToken; }
        public String getRefreshToken() { return refreshToken; }
    }

    public static class AuthenticationException extends Exception {
        public AuthenticationException(String message, Throwable cause) {
            super(message, cause);
        }
    }
}
