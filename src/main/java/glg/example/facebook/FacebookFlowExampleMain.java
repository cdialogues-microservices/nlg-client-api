package glg.example.facebook;

import io.swagger.client.ApiException;
import io.swagger.client.model.CampaignResponseDto;
import glg.example.AuthExample;

public class FacebookFlowExampleMain {
    public static void main(String[] args) {
        try {
            AuthExample.TokenPair authenticate = AuthExample.authenticate("api-demo@clash.io", "api-demo");
            CampaignExample campaignExample = new CampaignExample();
            CampaignResponseDto facebookCampaign = campaignExample.createFacebookCampaign(authenticate.getAccessToken());
            System.out.println("Campaign successfully created:" + facebookCampaign);
        } catch (AuthExample.AuthenticationException e) {
            throw new RuntimeException(e);
        } catch (ApiException e) {
            throw new RuntimeException(e);
        }
    }
}
