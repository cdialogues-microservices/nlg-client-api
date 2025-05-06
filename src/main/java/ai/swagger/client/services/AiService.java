package ai.swagger.client.services;

import ai.swagger.client.api.AifeaturesclientcontrollerApi;
import ai.swagger.client.model.*;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;

import java.util.List;

/**
 * AiService is a Java wrapper class that centralizes calls
 * to the AI feature controllers exposed by the backend Express API.
 * It uses the Swagger-generated AifeaturesclientcontrollerApi class.
 */
public class AiService {
    private final AifeaturesclientcontrollerApi api;

    public AiService(ApiClient apiClient) {
        this.api = new AifeaturesclientcontrollerApi(apiClient);
    }

    public String enhanceText(AiEnhanceRequest request) throws ApiException {
        return api.enhanceTextUsingPOST(request).getEnhancedText();
    }

    public String translateWithTone(AiTranslateRequest request) throws ApiException {
        return api.translateWithToneUsingPOST(request).getTranslatedText();
    }

    public List<String> generateVariations(AiVariationRequest request) throws ApiException {
        return api.generateVariationsUsingPOST(request).getVariations();
    }

    public int evaluateText(AiEvaluateRequest request) throws ApiException {
        return api.evaluateTextUsingPOST(request).getScore();
    }

    public String filterOutText(AiFilterRequest request) throws ApiException {
        return api.filterOutTextUsingPOST(request).getCleanedText();
    }

    public String checkSyntax(AiSyntaxRequest request) throws ApiException {
        return api.checkSyntaxUsingPOST(request).getCorrectedText();
    }

    public String evaluateVariations(AiEvaluateVariationsRequest request) throws ApiException {
        return api.evaluateVariationsUsingPOST(request).getEvaluationResult();
    }

    public String checkPreResult(AiPreResultRequest request) throws ApiException {
        return api.checkPreResultUsingPOST(request).getFeedback();
    }

    public String enhancePrompt(AiEnhancePromptRequest request) throws ApiException {
        return api.enhancePromptUsingPOST(request).getEnhancedPrompt();
    }
}
