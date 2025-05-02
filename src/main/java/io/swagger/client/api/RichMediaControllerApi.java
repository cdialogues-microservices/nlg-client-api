package io.swagger.client.api;


import com.google.gson.reflect.TypeToken;
import io.swagger.client.*;
import io.swagger.client.model.RichContent;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RichMediaControllerApi {
    private ApiClient apiClient;

    public RichMediaControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RichMediaControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for uploadFileUsingPOST */
    private com.squareup.okhttp.Call uploadFileUsingPOSTCall(File file, String aspectRatio, String channel)
            throws ApiException {

        // Verify required parameter
        if (file == null) {
            throw new ApiException("Missing the required parameter 'file' when calling uploadFileUsingPOST(Async)");
        }

        // Create path
        String localVarPath = "/api/rich-content/upload".replaceAll("\\{format\\}","json");

        // Handle query parameters
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (aspectRatio != null) {
            localVarQueryParams.addAll(apiClient.parameterToPairs("", "aspectRatio", aspectRatio));
        }
        if (channel != null) {
            localVarQueryParams.addAll(apiClient.parameterToPairs("", "channel", channel));
        }

        // Set headers
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        // Set form parameters
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        localVarFormParams.put("file", file);

        // Configure accept and content type
        final String[] localVarAccepts = {"*/*"};
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {"multipart/form-data"};
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        // Authentication
        String[] localVarAuthNames = new String[] {"BearerTokenAuthentication"};

        // Build and return the call
        return apiClient.buildCall(
                localVarPath,
                "POST",
                localVarQueryParams,
                null,
                localVarHeaderParams,
                localVarFormParams,
                localVarAuthNames,
                null // No progress request listener
        );
    }

    public Long uploadFileUsingPOST(File file, String aspectRatio, String channel) throws ApiException {
        ApiResponse<Long> resp = uploadFileUsingPOSTWithHttpInfo(file, aspectRatio, channel);
        return resp.getData();
    }

    public ApiResponse<Long> uploadFileUsingPOSTWithHttpInfo(File file, String aspectRatio, String channel) throws ApiException {
        com.squareup.okhttp.Call call = uploadFileUsingPOSTCall(file, aspectRatio, channel);
        Type localVarReturnType = new TypeToken<Long>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /* Build call for downloadFileUsingGET */
    private com.squareup.okhttp.Call downloadFileUsingGETCall(Long id,
                                                              final ProgressResponseBody.ProgressListener progressListener,
                                                              final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling downloadFileUsingGET(Async)");
        }

        // create path and map variables
        String localVarPath = "/api/rich-content/download/{id}"
                .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
                "application/octet-stream"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
                "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                            .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {"BearerTokenAuthentication"};
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, null, localVarHeaderParams,
                localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    public byte[] downloadFileUsingGET(Long id) throws ApiException {
        ApiResponse<byte[]> resp = downloadFileUsingGETWithHttpInfo(id);
        return resp.getData();
    }

    public ApiResponse<byte[]> downloadFileUsingGETWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = downloadFileUsingGETCall(id, null, null);
        Type localVarReturnType = new TypeToken<byte[]>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /* Build call for getVersionsUsingGET */
    private com.squareup.okhttp.Call getVersionsUsingGETCall(Long richContentId,
                                                             final ProgressResponseBody.ProgressListener progressListener,
                                                             final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        // verify the required parameter 'richContentId' is set
        if (richContentId == null) {
            throw new ApiException("Missing the required parameter 'richContentId' when calling getVersionsUsingGET(Async)");
        }

        // create path and map variables
        String localVarPath = "/api/rich-content/versions/{richContentId}"
                .replaceAll("\\{" + "richContentId" + "\\}", apiClient.escapeString(richContentId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
                "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                            .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {"BearerTokenAuthentication"};
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, null, localVarHeaderParams,
                localVarFormParams, localVarAuthNames, progressRequestListener);
    }


    public List<RichContent> getVersionsUsingGET(Long richContentId) throws ApiException {
        ApiResponse<List<RichContent>> resp = getVersionsUsingGETWithHttpInfo(richContentId);
        return resp.getData();
    }

    public ApiResponse<List<RichContent>> getVersionsUsingGETWithHttpInfo(Long richContentId) throws ApiException {
        com.squareup.okhttp.Call call = getVersionsUsingGETCall(richContentId, null, null);
        Type localVarReturnType = new TypeToken<List<RichContent>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }
}