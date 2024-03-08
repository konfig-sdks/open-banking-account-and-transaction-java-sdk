# ScheduledPaymentsApi

All URIs are relative to *https://openbanking.org.uk*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAll**](ScheduledPaymentsApi.md#getAll) | **GET** /accounts/{AccountId}/scheduled-payments | Get Scheduled Payments |
| [**getAll_0**](ScheduledPaymentsApi.md#getAll_0) | **GET** /scheduled-payments | Get Scheduled Payments |


<a name="getAll"></a>
# **getAll**
> OBReadScheduledPayment3 getAll(accountId).xFapiAuthDate(xFapiAuthDate).xFapiCustomerIpAddress(xFapiCustomerIpAddress).xFapiInteractionId(xFapiInteractionId).xCustomerUserAgent(xCustomerUserAgent).execute();

Get Scheduled Payments

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.OpenBanking;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ScheduledPaymentsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://openbanking.org.uk";
    
    // Configure OAuth2 access token for authorization: PSUOAuth2Security
    configuration.accessToken = "YOUR ACCESS TOKEN";
    OpenBanking client = new OpenBanking(configuration);
    String accountId = "accountId_example"; // AccountId
    String xFapiAuthDate = "xFapiAuthDate_example"; // The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
    String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // The PSU's IP address if the PSU is currently logged in with the TPP.
    String xFapiInteractionId = "xFapiInteractionId_example"; // An RFC4122 UID used as a correlation id.
    String xCustomerUserAgent = "xCustomerUserAgent_example"; // Indicates the user-agent that the PSU is using.
    try {
      OBReadScheduledPayment3 result = client
              .scheduledPayments
              .getAll(accountId)
              .xFapiAuthDate(xFapiAuthDate)
              .xFapiCustomerIpAddress(xFapiCustomerIpAddress)
              .xFapiInteractionId(xFapiInteractionId)
              .xCustomerUserAgent(xCustomerUserAgent)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getLinks());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScheduledPaymentsApi#getAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OBReadScheduledPayment3> response = client
              .scheduledPayments
              .getAll(accountId)
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
      System.err.println("Exception when calling ScheduledPaymentsApi#getAll");
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
| **accountId** | **String**| AccountId | |
| **xFapiAuthDate** | **String**| The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC | [optional] |
| **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional] |
| **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional] |
| **xCustomerUserAgent** | **String**| Indicates the user-agent that the PSU is using. | [optional] |

### Return type

[**OBReadScheduledPayment3**](OBReadScheduledPayment3.md)

### Authorization

[PSUOAuth2Security](../README.md#PSUOAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/jose+jwe, application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Scheduled Payments Read |  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |
| **401** | Unauthorized |  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |
| **404** | Not found |  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |
| **405** | Method Not Allowed |  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |
| **406** | Not Acceptable |  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |
| **429** | Too Many Requests |  * Retry-After - Number in seconds to wait <br>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |

<a name="getAll_0"></a>
# **getAll_0**
> OBReadScheduledPayment3 getAll_0().xFapiAuthDate(xFapiAuthDate).xFapiCustomerIpAddress(xFapiCustomerIpAddress).xFapiInteractionId(xFapiInteractionId).xCustomerUserAgent(xCustomerUserAgent).execute();

Get Scheduled Payments

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.OpenBanking;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ScheduledPaymentsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://openbanking.org.uk";
    
    // Configure OAuth2 access token for authorization: PSUOAuth2Security
    configuration.accessToken = "YOUR ACCESS TOKEN";
    OpenBanking client = new OpenBanking(configuration);
    String xFapiAuthDate = "xFapiAuthDate_example"; // The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
    String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // The PSU's IP address if the PSU is currently logged in with the TPP.
    String xFapiInteractionId = "xFapiInteractionId_example"; // An RFC4122 UID used as a correlation id.
    String xCustomerUserAgent = "xCustomerUserAgent_example"; // Indicates the user-agent that the PSU is using.
    try {
      OBReadScheduledPayment3 result = client
              .scheduledPayments
              .getAll_0()
              .xFapiAuthDate(xFapiAuthDate)
              .xFapiCustomerIpAddress(xFapiCustomerIpAddress)
              .xFapiInteractionId(xFapiInteractionId)
              .xCustomerUserAgent(xCustomerUserAgent)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getLinks());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScheduledPaymentsApi#getAll_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OBReadScheduledPayment3> response = client
              .scheduledPayments
              .getAll_0()
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
      System.err.println("Exception when calling ScheduledPaymentsApi#getAll_0");
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
| **xFapiAuthDate** | **String**| The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC | [optional] |
| **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional] |
| **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional] |
| **xCustomerUserAgent** | **String**| Indicates the user-agent that the PSU is using. | [optional] |

### Return type

[**OBReadScheduledPayment3**](OBReadScheduledPayment3.md)

### Authorization

[PSUOAuth2Security](../README.md#PSUOAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/jose+jwe, application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Scheduled Payments Read |  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |
| **401** | Unauthorized |  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |
| **404** | Not found |  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |
| **405** | Method Not Allowed |  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |
| **406** | Not Acceptable |  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |
| **429** | Too Many Requests |  * Retry-After - Number in seconds to wait <br>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |

