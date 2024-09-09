# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AuthcontrollerApi;

import java.io.File;
import java.util.*;

public class AuthcontrollerApiExample {

    public static void main(String[] args) {
        
        AuthcontrollerApi apiInstance = new AuthcontrollerApi();
        AuthModel model = new AuthModel(); // AuthModel | model
        try {
            Object result = apiInstance.loginUsingPOST(model);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthcontrollerApi#loginUsingPOST");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://nlg-api-dev.cdialogues.com/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthcontrollerApi* | [**loginUsingPOST**](docs/AuthcontrollerApi.md#loginUsingPOST) | **POST** /api/auth/login | login
*AuthcontrollerApi* | [**refreshAccessTokenUsingPOST**](docs/AuthcontrollerApi.md#refreshAccessTokenUsingPOST) | **POST** /api/auth/refresh-token | refreshAccessToken
*ConversioncontrollervApi* | [**postConversionUsingPOST**](docs/ConversioncontrollervApi.md#postConversionUsingPOST) | **POST** /api/v2.0/conversion/experiment/{experimentId} | postConversion
*ConversioncontrollervApi* | [**postReachUsingGET**](docs/ConversioncontrollervApi.md#postReachUsingGET) | **GET** /api/v2.0/conversion/experiment_reach/{experimentId} | postReach
*ExperimentclientcontrollerApi* | [**getExperimentUsingGET**](docs/ExperimentclientcontrollerApi.md#getExperimentUsingGET) | **GET** /api/v1.0/experiments/{experimentId} | getExperiment
*ExperimentclientcontrollerApi* | [**getExperimentsByStatusUsingGET**](docs/ExperimentclientcontrollerApi.md#getExperimentsByStatusUsingGET) | **GET** /api/v1.0/experiments/status | getExperimentsByStatus
*ExperimentclientcontrollerApi* | [**getNextMessageByExperimentIdUsingGET**](docs/ExperimentclientcontrollerApi.md#getNextMessageByExperimentIdUsingGET) | **GET** /api/v1.0/experiments/next-message/{experimentId} | getNextMessageByExperimentId
*MessageclientcontrollerApi* | [**getMessagesUsingGET**](docs/MessageclientcontrollerApi.md#getMessagesUsingGET) | **GET** /api/v1.0/messages | getMessages
*MessageclientcontrollerApi* | [**getMessagesUsingPOST**](docs/MessageclientcontrollerApi.md#getMessagesUsingPOST) | **POST** /api/v1.0/messages/filter | getMessages
*ShorturlclientcontrollerApi* | [**applyTrackingUsingPOST**](docs/ShorturlclientcontrollerApi.md#applyTrackingUsingPOST) | **POST** /short_url/apply_tracking | applyTracking


## Documentation for Models

 - [AuthModel](docs/AuthModel.md)
 - [DisplayedMessage](docs/DisplayedMessage.md)
 - [Experiment](docs/Experiment.md)
 - [ExperimentMessage](docs/ExperimentMessage.md)
 - [Message](docs/Message.md)
 - [MessagePart](docs/MessagePart.md)
 - [MessageRequest](docs/MessageRequest.md)
 - [RefreshTokenModel](docs/RefreshTokenModel.md)
 - [RichContent](docs/RichContent.md)
 - [ShortUrlEntity](docs/ShortUrlEntity.md)
 - [Tag](docs/Tag.md)
 - [TrackingRequest](docs/TrackingRequest.md)
 - [TrackingResponse](docs/TrackingResponse.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author



