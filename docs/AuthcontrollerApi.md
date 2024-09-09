# AuthcontrollerApi

All URIs are relative to *https://nlg-api-dev.cdialogues.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**loginUsingPOST**](AuthcontrollerApi.md#loginUsingPOST) | **POST** /api/auth/login | login
[**refreshAccessTokenUsingPOST**](AuthcontrollerApi.md#refreshAccessTokenUsingPOST) | **POST** /api/auth/refresh-token | refreshAccessToken


<a name="loginUsingPOST"></a>
# **loginUsingPOST**
> Object loginUsingPOST(model)

login

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthcontrollerApi;


AuthcontrollerApi apiInstance = new AuthcontrollerApi();
AuthModel model = new AuthModel(); // AuthModel | model
try {
    Object result = apiInstance.loginUsingPOST(model);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthcontrollerApi#loginUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | [**AuthModel**](AuthModel.md)| model |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: *_/_*

<a name="refreshAccessTokenUsingPOST"></a>
# **refreshAccessTokenUsingPOST**
> Object refreshAccessTokenUsingPOST(refreshToken)

refreshAccessToken

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthcontrollerApi;


AuthcontrollerApi apiInstance = new AuthcontrollerApi();
RefreshTokenModel refreshToken = new RefreshTokenModel(); // RefreshTokenModel | refreshToken
try {
    Object result = apiInstance.refreshAccessTokenUsingPOST(refreshToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthcontrollerApi#refreshAccessTokenUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **refreshToken** | [**RefreshTokenModel**](RefreshTokenModel.md)| refreshToken |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: *_/_*

