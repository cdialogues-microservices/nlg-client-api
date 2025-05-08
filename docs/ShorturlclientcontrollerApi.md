# ShorturlclientcontrollerApi

All URIs are relative to *https://nlg-api-dev.cslash.io/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**applyTrackingUsingPOST**](ShorturlclientcontrollerApi.md#applyTrackingUsingPOST) | **POST** /short_url/apply_tracking | applyTracking


<a name="applyTrackingUsingPOST"></a>
# **applyTrackingUsingPOST**
> TrackingResponse applyTrackingUsingPOST(request)

applyTracking

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ShorturlclientcontrollerApi;


ShorturlclientcontrollerApi apiInstance = new ShorturlclientcontrollerApi();
TrackingRequest request = new TrackingRequest(); // TrackingRequest | request
try {
    TrackingResponse result = apiInstance.applyTrackingUsingPOST(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShorturlclientcontrollerApi#applyTrackingUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**TrackingRequest**](TrackingRequest.md)| request |

### Return type

[**TrackingResponse**](TrackingResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: *_/_*

