package nlg.example.brevo;

import io.swagger.client.ApiException;
import io.swagger.client.model.CampaignResponseDto;
import nlg.example.AuthExample;

public class BrevoFlowExample {
    public static void main(String[] args) {
        try {
            AuthExample.TokenPair authenticate = AuthExample.authenticate("admin@cdialogues.com", "#!6!Kh879");

            CampaignExample campaignExample = new CampaignExample();
            CampaignResponseDto brevoCampaign = campaignExample.createBrevoCampaign(authenticate.getAccessToken());

            System.out.println("Campaign successfully created:" + brevoCampaign);
        } catch (AuthExample.AuthenticationException | ApiException e) {
            throw new RuntimeException(e);
        }
    }
}
