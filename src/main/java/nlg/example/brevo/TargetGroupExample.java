package nlg.example.brevo;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.TargetgroupcontrollerApi;
import io.swagger.client.model.TargetGroupDto;

public class TargetGroupExample {

    public TargetGroupDto createTargetGroup(String accessToken) throws ApiException {
        TargetgroupcontrollerApi apiInstance = new TargetgroupcontrollerApi();
        ApiClient apiClient = apiInstance.getApiClient();
        apiClient.setAccessToken(accessToken);

        TargetGroupDto targetGroupDto = new TargetGroupDto();
        targetGroupDto.setName("Brevo_TargetGroup");


        return apiInstance.createUsingPOST2(targetGroupDto);
    }
}
