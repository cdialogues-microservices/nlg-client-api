# ExperimentclientcontrollerApi

All URIs are relative to *https://nlg-api-dev.cdialogues.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getExperimentUsingGET**](ExperimentclientcontrollerApi.md#getExperimentUsingGET) | **GET** /api/v1.0/experiments/{experimentId} | getExperiment
[**getExperimentsByStatusUsingGET**](ExperimentclientcontrollerApi.md#getExperimentsByStatusUsingGET) | **GET** /api/v1.0/experiments/status | getExperimentsByStatus
[**getNextMessageByExperimentIdUsingGET**](ExperimentclientcontrollerApi.md#getNextMessageByExperimentIdUsingGET) | **GET** /api/v1.0/experiments/next-message/{experimentId} | getNextMessageByExperimentId


<a name="getExperimentUsingGET"></a>
# **getExperimentUsingGET**
> Experiment getExperimentUsingGET(experimentId)

getExperiment

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ExperimentclientcontrollerApi;


ExperimentclientcontrollerApi apiInstance = new ExperimentclientcontrollerApi();
Long experimentId = 789L; // Long | experimentId
try {
    Experiment result = apiInstance.getExperimentUsingGET(experimentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExperimentclientcontrollerApi#getExperimentUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experimentId** | **Long**| experimentId |

### Return type

[**Experiment**](Experiment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: *_/_*

<a name="getExperimentsByStatusUsingGET"></a>
# **getExperimentsByStatusUsingGET**
> List&lt;Experiment&gt; getExperimentsByStatusUsingGET(status)

getExperimentsByStatus

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ExperimentclientcontrollerApi;


ExperimentclientcontrollerApi apiInstance = new ExperimentclientcontrollerApi();
String status = "status_example"; // String | status
try {
    List<Experiment> result = apiInstance.getExperimentsByStatusUsingGET(status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExperimentclientcontrollerApi#getExperimentsByStatusUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | **String**| status | [enum: DRAFT, READY, STARTED, CANCELLED, COMPLETED]

### Return type

[**List&lt;Experiment&gt;**](Experiment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: *_/_*

<a name="getNextMessageByExperimentIdUsingGET"></a>
# **getNextMessageByExperimentIdUsingGET**
> DisplayedMessage getNextMessageByExperimentIdUsingGET(experimentId)

getNextMessageByExperimentId

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ExperimentclientcontrollerApi;


ExperimentclientcontrollerApi apiInstance = new ExperimentclientcontrollerApi();
Long experimentId = 789L; // Long | experimentId
try {
    DisplayedMessage result = apiInstance.getNextMessageByExperimentIdUsingGET(experimentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExperimentclientcontrollerApi#getNextMessageByExperimentIdUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experimentId** | **Long**| experimentId |

### Return type

[**DisplayedMessage**](DisplayedMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: *_/_*

