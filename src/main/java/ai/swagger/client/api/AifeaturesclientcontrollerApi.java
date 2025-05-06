package ai.swagger.client.api;

import ai.swagger.client.model.*;
import com.google.gson.reflect.TypeToken;
import io.swagger.client.*;

import java.lang.reflect.Type;
import java.util.*;

public class AifeaturesclientcontrollerApi {
    private ApiClient apiClient;

    public AifeaturesclientcontrollerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AifeaturesclientcontrollerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    private com.squareup.okhttp.Call enhanceTextUsingPOSTCall(AiEnhanceRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling enhanceTextUsingPOST");
        }

        String localVarPath = "/ai/api/enhance-text";

        List<Pair> localVarQueryParams = new ArrayList<>();
        Map<String, String> localVarHeaderParams = new HashMap<>();
        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = { "*/*" };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                        .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                        .build();
            });
        }

        String[] localVarAuthNames = new String[] { "BearerTokenAuthentication" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody,
                localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    public AiEnhanceResponse enhanceTextUsingPOST(AiEnhanceRequest body) throws ApiException {
        ApiResponse<AiEnhanceResponse> resp = enhanceTextUsingPOSTWithHttpInfo(body);
        return resp.getData();
    }

    public ApiResponse<AiEnhanceResponse> enhanceTextUsingPOSTWithHttpInfo(AiEnhanceRequest body) throws ApiException {
        com.squareup.okhttp.Call call = enhanceTextUsingPOSTCall(body, null, null);
        Type localVarReturnType = new TypeToken<AiEnhanceResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    public com.squareup.okhttp.Call enhanceTextUsingPOSTAsync(AiEnhanceRequest body, final ApiCallback<AiEnhanceResponse> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);
            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = enhanceTextUsingPOSTCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AiEnhanceResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    private com.squareup.okhttp.Call translateWithToneUsingPOSTCall(AiTranslateRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        if (body == null) throw new ApiException("Missing required parameter 'body'");
        String path = "/ai/api/translateWithTone";
        return apiClient.buildCall(path, "POST", new ArrayList<>(), body, new HashMap<>(), new HashMap<>(), new String[] { "BearerTokenAuthentication" }, progressRequestListener);
    }

    public AiTranslateResponse translateWithToneUsingPOST(AiTranslateRequest body) throws ApiException {
        com.squareup.okhttp.Call call = translateWithToneUsingPOSTCall(body, null, null);
        Type returnType = new TypeToken<AiTranslateResponse>(){}.getType();
        return (AiTranslateResponse) apiClient.execute(call, returnType).getData();
    }

    private com.squareup.okhttp.Call generateVariationsUsingPOSTCall(AiVariationRequest body, final ProgressResponseBody.ProgressListener pl, final ProgressRequestBody.ProgressRequestListener prl) throws ApiException {
        if (body == null) throw new ApiException("Missing required parameter 'body'");
        String path = "/ai/api/generate-variations";
        return apiClient.buildCall(path, "POST", new ArrayList<>(), body, new HashMap<>(), new HashMap<>(), new String[] { "BearerTokenAuthentication" }, prl);
    }

    public AiVariationResponse generateVariationsUsingPOST(AiVariationRequest body) throws ApiException {
        com.squareup.okhttp.Call call = generateVariationsUsingPOSTCall(body, null, null);
        Type returnType = new TypeToken<AiVariationResponse>(){}.getType();
        return (AiVariationResponse) apiClient.execute(call, returnType).getData();
    }

    private com.squareup.okhttp.Call evaluateTextUsingPOSTCall(AiEvaluateRequest body, final ProgressResponseBody.ProgressListener pl, final ProgressRequestBody.ProgressRequestListener prl) throws ApiException {
        if (body == null) throw new ApiException("Missing required parameter 'body'");
        String path = "/ai/api/evaluate-text";
        return apiClient.buildCall(path, "POST", new ArrayList<>(), body, new HashMap<>(), new HashMap<>(), new String[] { "BearerTokenAuthentication" }, prl);
    }

    public AiEvaluateResponse evaluateTextUsingPOST(AiEvaluateRequest body) throws ApiException {
        com.squareup.okhttp.Call call = evaluateTextUsingPOSTCall(body, null, null);
        Type returnType = new TypeToken<AiEvaluateResponse>(){}.getType();
        return (AiEvaluateResponse) apiClient.execute(call, returnType).getData();
    }

    private com.squareup.okhttp.Call filterOutTextUsingPOSTCall(AiFilterRequest body, final ProgressResponseBody.ProgressListener pl, final ProgressRequestBody.ProgressRequestListener prl) throws ApiException {
        if (body == null) throw new ApiException("Missing required parameter 'body'");
        String path = "/ai/api/filterOut";
        return apiClient.buildCall(path, "POST", new ArrayList<>(), body, new HashMap<>(), new HashMap<>(), new String[] { "BearerTokenAuthentication" }, prl);
    }

    public AiFilterResponse filterOutTextUsingPOST(AiFilterRequest body) throws ApiException {
        com.squareup.okhttp.Call call = filterOutTextUsingPOSTCall(body, null, null);
        Type returnType = new TypeToken<AiFilterResponse>(){}.getType();
        return (AiFilterResponse) apiClient.execute(call, returnType).getData();
    }
    public AiSyntaxResponse checkSyntaxUsingPOST(AiSyntaxRequest body) throws ApiException {
        com.squareup.okhttp.Call call = apiClient.buildCall(
                "/ai/api/check-syntax", "POST", new ArrayList<>(), body, new HashMap<>(), new HashMap<>(),
                new String[] { "BearerTokenAuthentication" }, null
        );
        Type returnType = new TypeToken<AiSyntaxResponse>(){}.getType();
        return (AiSyntaxResponse) apiClient.execute(call, returnType).getData();
    }

    public AiEvaluateVariationsResponse evaluateVariationsUsingPOST(AiEvaluateVariationsRequest body) throws ApiException {
        com.squareup.okhttp.Call call = apiClient.buildCall(
                "/ai/api/evaluate-variations", "POST", new ArrayList<>(), body, new HashMap<>(), new HashMap<>(),
                new String[] { "BearerTokenAuthentication" }, null
        );
        Type returnType = new TypeToken<AiEvaluateVariationsResponse>(){}.getType();
        return (AiEvaluateVariationsResponse) apiClient.execute(call, returnType).getData();
    }

    public AiPreResultResponse checkPreResultUsingPOST(AiPreResultRequest body) throws ApiException {
        com.squareup.okhttp.Call call = apiClient.buildCall(
                "/ai/api/check-pre-result", "POST", new ArrayList<>(), body, new HashMap<>(), new HashMap<>(),
                new String[] { "BearerTokenAuthentication" }, null
        );
        Type returnType = new TypeToken<AiPreResultResponse>(){}.getType();
        return (AiPreResultResponse) apiClient.execute(call, returnType).getData();
    }

    public AiEnhancePromptResponse enhancePromptUsingPOST(AiEnhancePromptRequest body) throws ApiException {
        com.squareup.okhttp.Call call = apiClient.buildCall(
                "/ai/api/enhance-prompt", "POST", new ArrayList<>(), body, new HashMap<>(), new HashMap<>(),
                new String[] { "BearerTokenAuthentication" }, null
        );
        Type returnType = new TypeToken<AiEnhancePromptResponse>(){}.getType();
        return (AiEnhancePromptResponse) apiClient.execute(call, returnType).getData();
    }

}
