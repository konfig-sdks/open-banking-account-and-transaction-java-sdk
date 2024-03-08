# AccountAccessApi

All URIs are relative to *https://openbanking.org.uk*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createConsent**](AccountAccessApi.md#createConsent) | **POST** /account-access-consents | Create Account Access Consents |
| [**deleteConsent**](AccountAccessApi.md#deleteConsent) | **DELETE** /account-access-consents/{ConsentId} | Delete Account Access Consents |
| [**getConsent**](AccountAccessApi.md#getConsent) | **GET** /account-access-consents/{ConsentId} | Get Account Access Consents |


<a name="createConsent"></a>
# **createConsent**
> OBReadConsentResponse1 createConsent(obReadConsent1).xFapiAuthDate(xFapiAuthDate).xFapiCustomerIpAddress(xFapiCustomerIpAddress).xFapiInteractionId(xFapiInteractionId).xCustomerUserAgent(xCustomerUserAgent).execute();

Create Account Access Consents

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.OpenBanking;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountAccessApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://openbanking.org.uk";
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String clientSecret = System.getenv("CLIENT_SECRET");
    configuration.clientId = "clientId";
    configuration.clientSecret = "clientSecret";
    
    OpenBanking client = new OpenBanking(configuration);
    OBReadConsent1Data data = new OBReadConsent1Data();
    Object risk = null; // The Risk section is sent by the initiating party to the ASPSP. It is used to specify additional details for risk scoring for Account Info.
    String xFapiAuthDate = "xFapiAuthDate_example"; // The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
    String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // The PSU's IP address if the PSU is currently logged in with the TPP.
    String xFapiInteractionId = "xFapiInteractionId_example"; // An RFC4122 UID used as a correlation id.
    String xCustomerUserAgent = "xCustomerUserAgent_example"; // Indicates the user-agent that the PSU is using.
    try {
      OBReadConsentResponse1 result = client
              .accountAccess
              .createConsent(data, risk)
              .xFapiAuthDate(xFapiAuthDate)
              .xFapiCustomerIpAddress(xFapiCustomerIpAddress)
              .xFapiInteractionId(xFapiInteractionId)
              .xCustomerUserAgent(xCustomerUserAgent)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getLinks());
      System.out.println(result.getMeta());
      System.out.println(result.getRisk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountAccessApi#createConsent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OBReadConsentResponse1> response = client
              .accountAccess
              .createConsent(data, risk)
              .xFapiAuthDate(xFapiAuthDate)
              .xFapiCustomerIpAddress(xFapiCustomerIpAddress)
              .xFapiInteractionId(xFapiInteractionId)
              .xCustomerUserAgent(xCustomerUserAgent)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountAccessApi#createConsent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **obReadConsent1** | [**OBReadConsent1**](OBReadConsent1.md)| Default | |
| **xFapiAuthDate** | **String**| The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC | [optional] |
| **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional] |
| **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional] |
| **xCustomerUserAgent** | **String**| Indicates the user-agent that the PSU is using. | [optional] |

### Return type

[**OBReadConsentResponse1**](OBReadConsentResponse1.md)

### Authorization

[TPPOAuth2Security](../README.md#TPPOAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json, application/jose+jwe, application/json; charset=utf-8
 - **Accept**: application/json, application/jose+jwe, application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Account Access Consents Created |  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |
| **401** | Unauthorized |  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |
| **405** | Method Not Allowed |  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |
| **406** | Not Acceptable |  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |
| **415** | Unsupported Media Type |  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |
| **429** | Too Many Requests |  * Retry-After - Number in seconds to wait <br>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |

<a name="deleteConsent"></a>
# **deleteConsent**
> deleteConsent(consentId).xFapiAuthDate(xFapiAuthDate).xFapiCustomerIpAddress(xFapiCustomerIpAddress).xFapiInteractionId(xFapiInteractionId).xCustomerUserAgent(xCustomerUserAgent).execute();

Delete Account Access Consents

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.OpenBanking;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountAccessApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://openbanking.org.uk";
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String clientSecret = System.getenv("CLIENT_SECRET");
    configuration.clientId = "clientId";
    configuration.clientSecret = "clientSecret";
    
    OpenBanking client = new OpenBanking(configuration);
    String consentId = "consentId_example"; // ConsentId
    String xFapiAuthDate = "xFapiAuthDate_example"; // The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
    String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // The PSU's IP address if the PSU is currently logged in with the TPP.
    String xFapiInteractionId = "xFapiInteractionId_example"; // An RFC4122 UID used as a correlation id.
    String xCustomerUserAgent = "xCustomerUserAgent_example"; // Indicates the user-agent that the PSU is using.
    try {
      client
              .accountAccess
              .deleteConsent(consentId)
              .xFapiAuthDate(xFapiAuthDate)
              .xFapiCustomerIpAddress(xFapiCustomerIpAddress)
              .xFapiInteractionId(xFapiInteractionId)
              .xCustomerUserAgent(xCustomerUserAgent)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountAccessApi#deleteConsent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .accountAccess
              .deleteConsent(consentId)
              .xFapiAuthDate(xFapiAuthDate)
              .xFapiCustomerIpAddress(xFapiCustomerIpAddress)
              .xFapiInteractionId(xFapiInteractionId)
              .xCustomerUserAgent(xCustomerUserAgent)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountAccessApi#deleteConsent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **consentId** | **String**| ConsentId | |
| **xFapiAuthDate** | **String**| The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC | [optional] |
| **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional] |
| **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional] |
| **xCustomerUserAgent** | **String**| Indicates the user-agent that the PSU is using. | [optional] |

### Return type

null (empty response body)

### Authorization

[TPPOAuth2Security](../README.md#TPPOAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/jose+jwe, application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Account Access Consents Deleted |  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |
| **401** | Unauthorized |  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |
| **405** | Method Not Allowed |  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |
| **406** | Not Acceptable |  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |
| **429** | Too Many Requests |  * Retry-After - Number in seconds to wait <br>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |

<a name="getConsent"></a>
# **getConsent**
> OBReadConsentResponse1 getConsent(consentId).xFapiAuthDate(xFapiAuthDate).xFapiCustomerIpAddress(xFapiCustomerIpAddress).xFapiInteractionId(xFapiInteractionId).xCustomerUserAgent(xCustomerUserAgent).execute();

Get Account Access Consents

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.OpenBanking;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountAccessApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://openbanking.org.uk";
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String clientSecret = System.getenv("CLIENT_SECRET");
    configuration.clientId = "clientId";
    configuration.clientSecret = "clientSecret";
    
    OpenBanking client = new OpenBanking(configuration);
    String consentId = "consentId_example"; // ConsentId
    String xFapiAuthDate = "xFapiAuthDate_example"; // The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
    String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // The PSU's IP address if the PSU is currently logged in with the TPP.
    String xFapiInteractionId = "xFapiInteractionId_example"; // An RFC4122 UID used as a correlation id.
    String xCustomerUserAgent = "xCustomerUserAgent_example"; // Indicates the user-agent that the PSU is using.
    try {
      OBReadConsentResponse1 result = client
              .accountAccess
              .getConsent(consentId)
              .xFapiAuthDate(xFapiAuthDate)
              .xFapiCustomerIpAddress(xFapiCustomerIpAddress)
              .xFapiInteractionId(xFapiInteractionId)
              .xCustomerUserAgent(xCustomerUserAgent)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getLinks());
      System.out.println(result.getMeta());
      System.out.println(result.getRisk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountAccessApi#getConsent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OBReadConsentResponse1> response = client
              .accountAccess
              .getConsent(consentId)
              .xFapiAuthDate(xFapiAuthDate)
              .xFapiCustomerIpAddress(xFapiCustomerIpAddress)
              .xFapiInteractionId(xFapiInteractionId)
              .xCustomerUserAgent(xCustomerUserAgent)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountAccessApi#getConsent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **consentId** | **String**| ConsentId | |
| **xFapiAuthDate** | **String**| The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC | [optional] |
| **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional] |
| **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional] |
| **xCustomerUserAgent** | **String**| Indicates the user-agent that the PSU is using. | [optional] |

### Return type

[**OBReadConsentResponse1**](OBReadConsentResponse1.md)

### Authorization

[TPPOAuth2Security](../README.md#TPPOAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/jose+jwe, application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Account Access Consents Read |  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |
| **401** | Unauthorized |  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |
| **405** | Method Not Allowed |  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |
| **406** | Not Acceptable |  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |
| **429** | Too Many Requests |  * Retry-After - Number in seconds to wait <br>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |

