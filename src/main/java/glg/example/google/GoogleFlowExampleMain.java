package glg.example.google;

import io.swagger.client.ApiException;
import io.swagger.client.model.CampaignResponseDto;
import glg.example.AuthExample;

public class GoogleFlowExampleMain {
    public static void main(String[] args) {
        try {
            // Step 1: Authenticate using provided credentials
            // This returns an access token used for all subsequent API calls
            AuthExample.TokenPair authenticate = AuthExample.authenticate("use_provided_credentials", "use_provided_credentials");

            // Step 2: Create an instance of CampaignExample to handle campaign creation
            CampaignExample campaignExample = new CampaignExample();

            // Step 3: Create a Google Ads Search campaign
            CampaignResponseDto googleAdSearchCampaign = campaignExample.createGoogleSearchCampaign(authenticate.getAccessToken());
            System.out.println("Campaign for Google Ads Search successfully created: " + googleAdSearchCampaign);

            // Step 4: Create a Google Ads Display campaign
            CampaignResponseDto googleAdDisplayCampaign = campaignExample.createGoogleDisplayCampaign(authenticate.getAccessToken());
            System.out.println("Campaign for Google Ads Display successfully created: " + googleAdDisplayCampaign);

            // Step 5: Create a YouTube campaign via Google Ads
            CampaignResponseDto googleAdYoutubeCampaign = campaignExample.createGoogleYoutubeCampaign(authenticate.getAccessToken());
            System.out.println("Campaign for Google Ads YouTube successfully created: " + googleAdYoutubeCampaign);

        } catch (AuthExample.AuthenticationException | ApiException e) {
            // Handle authentication or API-related exceptions gracefully
            throw new RuntimeException("An error occurred while creating campaigns", e);
        }
    }

}
