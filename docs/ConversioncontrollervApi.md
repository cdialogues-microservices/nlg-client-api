# ConversioncontrollervApi

All URIs are relative to *https://nlg-api-dev.cslash.io/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postConversionUsingPOST**](ConversioncontrollervApi.md#postConversionUsingPOST) | **POST** /api/v2.0/conversion/experiment/{experimentId} | postConversion
[**postReachUsingGET**](ConversioncontrollervApi.md#postReachUsingGET) | **GET** /api/v2.0/conversion/experiment_reach/{experimentId} | postReach


<a name="postConversionUsingPOST"></a>
# **postConversionUsingPOST**
> postConversionUsingPOST(experimentId, channel, messageContent, messageId)

postConversion

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConversioncontrollervApi;


ConversioncontrollervApi apiInstance = new ConversioncontrollervApi();
Long experimentId = 1L; // Long | ExperimentId
String channel = "channel_example"; // String | channel
String messageContent = "messageContent_example"; // String | messageContent
Long messageId = 10L; // Long | MessageId
try {
    apiInstance.postConversionUsingPOST(experimentId, channel, messageContent, messageId);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversioncontrollervApi#postConversionUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experimentId** | **Long**| ExperimentId |
 **channel** | **String**| channel | [optional]
 **messageContent** | **String**| messageContent | [optional]
 **messageId** | **Long**| MessageId | [optional] [default to 10]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: *_/_*

<a name="postReachUsingGET"></a>
# **postReachUsingGET**
> postReachUsingGET(experimentId, channel, messageId)

postReach

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConversioncontrollervApi;


ConversioncontrollervApi apiInstance = new ConversioncontrollervApi();
Long experimentId = 1L; // Long | ExperimentId
String channel = "channel_example"; // String | channel
Long messageId = 10L; // Long | MessageId
try {
    apiInstance.postReachUsingGET(experimentId, channel, messageId);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversioncontrollervApi#postReachUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experimentId** | **Long**| ExperimentId |
 **channel** | **String**| channel | [optional]
 **messageId** | **Long**| MessageId | [optional] [default to 10]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: *_/_*

