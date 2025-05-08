package glg.example.brevo;

import io.swagger.client.ApiException;
import io.swagger.client.model.CampaignResponseDto;
import glg.example.AuthExample;

public class BrevoFlowExample {
    public static void main(String[] args) {
        try {
            AuthExample.TokenPair authenticate = AuthExample.authenticate("api-demo@clash.io", "api-demo");
            CampaignExample campaignExample = new CampaignExample();
            CampaignResponseDto brevoCampaign = campaignExample.createBrevoCampaign(authenticate.getAccessToken());

            System.out.println("Campaign successfully created:" + brevoCampaign);
        } catch (AuthExample.AuthenticationException | ApiException e) {
            throw new RuntimeException(e);
        }
    }
}
