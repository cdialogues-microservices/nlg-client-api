# MessageclientcontrollerApi

All URIs are relative to *https://nlg-api-dev.cdialogues.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMessagesUsingGET**](MessageclientcontrollerApi.md#getMessagesUsingGET) | **GET** /api/v1.0/messages | getMessages
[**getMessagesUsingPOST**](MessageclientcontrollerApi.md#getMessagesUsingPOST) | **POST** /api/v1.0/messages/filter | getMessages


<a name="getMessagesUsingGET"></a>
# **getMessagesUsingGET**
> List&lt;Message&gt; getMessagesUsingGET(id, status)

getMessages

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MessageclientcontrollerApi;


MessageclientcontrollerApi apiInstance = new MessageclientcontrollerApi();
List<Long> id = Arrays.asList(56L); // List<Long> | id
List<String> status = Arrays.asList("status_example"); // List<String> | status
try {
    List<Message> result = apiInstance.getMessagesUsingGET(id, status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessageclientcontrollerApi#getMessagesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**List&lt;Long&gt;**](Long.md)| id | [optional]
 **status** | [**List&lt;String&gt;**](String.md)| status | [optional] [enum: DRAFT, READY, USED, IDLE, COMPLETED, GENETIC_ALGORITHM_GENERATED, DELETED]

### Return type

[**List&lt;Message&gt;**](Message.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: *_/_*

<a name="getMessagesUsingPOST"></a>
# **getMessagesUsingPOST**
> List&lt;Message&gt; getMessagesUsingPOST(request)

getMessages

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MessageclientcontrollerApi;


MessageclientcontrollerApi apiInstance = new MessageclientcontrollerApi();
MessageRequest request = new MessageRequest(); // MessageRequest | request
try {
    List<Message> result = apiInstance.getMessagesUsingPOST(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessageclientcontrollerApi#getMessagesUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**MessageRequest**](MessageRequest.md)| request |

### Return type

[**List&lt;Message&gt;**](Message.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: *_/_*

