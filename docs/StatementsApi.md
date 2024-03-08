# StatementsApi

All URIs are relative to *https://openbanking.org.uk*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**get**](StatementsApi.md#get) | **GET** /accounts/{AccountId}/statements | Get Statements |
| [**getAll**](StatementsApi.md#getAll) | **GET** /statements | Get Statements |
| [**getDetails**](StatementsApi.md#getDetails) | **GET** /accounts/{AccountId}/statements/{StatementId} | Get Statements |
| [**getFile**](StatementsApi.md#getFile) | **GET** /accounts/{AccountId}/statements/{StatementId}/file | Get Statements |


<a name="get"></a>
# **get**
> OBReadStatement2 get(accountId).xFapiAuthDate(xFapiAuthDate).xFapiCustomerIpAddress(xFapiCustomerIpAddress).xFapiInteractionId(xFapiInteractionId).xCustomerUserAgent(xCustomerUserAgent).fromStatementDateTime(fromStatementDateTime).toStatementDateTime(toStatementDateTime).execute();

Get Statements

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.OpenBanking;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StatementsApi;
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
    OffsetDateTime fromStatementDateTime = OffsetDateTime.now(); // The UTC ISO 8601 Date Time to filter statements FROM NB Time component is optional - set to 00:00:00 for just Date. If the Date Time contains a timezone, the ASPSP must ignore the timezone component.
    OffsetDateTime toStatementDateTime = OffsetDateTime.now(); // The UTC ISO 8601 Date Time to filter statements TO NB Time component is optional - set to 00:00:00 for just Date. If the Date Time contains a timezone, the ASPSP must ignore the timezone component.
    try {
      OBReadStatement2 result = client
              .statements
              .get(accountId)
              .xFapiAuthDate(xFapiAuthDate)
              .xFapiCustomerIpAddress(xFapiCustomerIpAddress)
              .xFapiInteractionId(xFapiInteractionId)
              .xCustomerUserAgent(xCustomerUserAgent)
              .fromStatementDateTime(fromStatementDateTime)
              .toStatementDateTime(toStatementDateTime)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getLinks());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling StatementsApi#get");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OBReadStatement2> response = client
              .statements
              .get(accountId)
              .xFapiAuthDate(xFapiAuthDate)
              .xFapiCustomerIpAddress(xFapiCustomerIpAddress)
              .xFapiInteractionId(xFapiInteractionId)
              .xCustomerUserAgent(xCustomerUserAgent)
              .fromStatementDateTime(fromStatementDateTime)
              .toStatementDateTime(toStatementDateTime)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling StatementsApi#get");
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
| **fromStatementDateTime** | **OffsetDateTime**| The UTC ISO 8601 Date Time to filter statements FROM NB Time component is optional - set to 00:00:00 for just Date. If the Date Time contains a timezone, the ASPSP must ignore the timezone component. | [optional] |
| **toStatementDateTime** | **OffsetDateTime**| The UTC ISO 8601 Date Time to filter statements TO NB Time component is optional - set to 00:00:00 for just Date. If the Date Time contains a timezone, the ASPSP must ignore the timezone component. | [optional] |

### Return type

[**OBReadStatement2**](OBReadStatement2.md)

### Authorization

[PSUOAuth2Security](../README.md#PSUOAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/jose+jwe, application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Statements Read |  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |
| **401** | Unauthorized |  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |
| **404** | Not found |  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |
| **405** | Method Not Allowed |  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |
| **406** | Not Acceptable |  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |
| **429** | Too Many Requests |  * Retry-After - Number in seconds to wait <br>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |

<a name="getAll"></a>
# **getAll**
> OBReadStatement2 getAll().xFapiAuthDate(xFapiAuthDate).xFapiCustomerIpAddress(xFapiCustomerIpAddress).xFapiInteractionId(xFapiInteractionId).fromStatementDateTime(fromStatementDateTime).toStatementDateTime(toStatementDateTime).xCustomerUserAgent(xCustomerUserAgent).execute();

Get Statements

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.OpenBanking;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StatementsApi;
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
    OffsetDateTime fromStatementDateTime = OffsetDateTime.now(); // The UTC ISO 8601 Date Time to filter statements FROM NB Time component is optional - set to 00:00:00 for just Date. If the Date Time contains a timezone, the ASPSP must ignore the timezone component.
    OffsetDateTime toStatementDateTime = OffsetDateTime.now(); // The UTC ISO 8601 Date Time to filter statements TO NB Time component is optional - set to 00:00:00 for just Date. If the Date Time contains a timezone, the ASPSP must ignore the timezone component.
    String xCustomerUserAgent = "xCustomerUserAgent_example"; // Indicates the user-agent that the PSU is using.
    try {
      OBReadStatement2 result = client
              .statements
              .getAll()
              .xFapiAuthDate(xFapiAuthDate)
              .xFapiCustomerIpAddress(xFapiCustomerIpAddress)
              .xFapiInteractionId(xFapiInteractionId)
              .fromStatementDateTime(fromStatementDateTime)
              .toStatementDateTime(toStatementDateTime)
              .xCustomerUserAgent(xCustomerUserAgent)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getLinks());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling StatementsApi#getAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OBReadStatement2> response = client
              .statements
              .getAll()
              .xFapiAuthDate(xFapiAuthDate)
              .xFapiCustomerIpAddress(xFapiCustomerIpAddress)
              .xFapiInteractionId(xFapiInteractionId)
              .fromStatementDateTime(fromStatementDateTime)
              .toStatementDateTime(toStatementDateTime)
              .xCustomerUserAgent(xCustomerUserAgent)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling StatementsApi#getAll");
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
| **fromStatementDateTime** | **OffsetDateTime**| The UTC ISO 8601 Date Time to filter statements FROM NB Time component is optional - set to 00:00:00 for just Date. If the Date Time contains a timezone, the ASPSP must ignore the timezone component. | [optional] |
| **toStatementDateTime** | **OffsetDateTime**| The UTC ISO 8601 Date Time to filter statements TO NB Time component is optional - set to 00:00:00 for just Date. If the Date Time contains a timezone, the ASPSP must ignore the timezone component. | [optional] |
| **xCustomerUserAgent** | **String**| Indicates the user-agent that the PSU is using. | [optional] |

### Return type

[**OBReadStatement2**](OBReadStatement2.md)

### Authorization

[PSUOAuth2Security](../README.md#PSUOAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/jose+jwe, application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Statements Read |  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |
| **401** | Unauthorized |  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |
| **404** | Not found |  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |
| **405** | Method Not Allowed |  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |
| **406** | Not Acceptable |  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |
| **429** | Too Many Requests |  * Retry-After - Number in seconds to wait <br>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |

<a name="getDetails"></a>
# **getDetails**
> OBReadStatement2 getDetails(statementId, accountId).xFapiAuthDate(xFapiAuthDate).xFapiCustomerIpAddress(xFapiCustomerIpAddress).xFapiInteractionId(xFapiInteractionId).xCustomerUserAgent(xCustomerUserAgent).execute();

Get Statements

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.OpenBanking;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StatementsApi;
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
    String statementId = "statementId_example"; // StatementId
    String accountId = "accountId_example"; // AccountId
    String xFapiAuthDate = "xFapiAuthDate_example"; // The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
    String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // The PSU's IP address if the PSU is currently logged in with the TPP.
    String xFapiInteractionId = "xFapiInteractionId_example"; // An RFC4122 UID used as a correlation id.
    String xCustomerUserAgent = "xCustomerUserAgent_example"; // Indicates the user-agent that the PSU is using.
    try {
      OBReadStatement2 result = client
              .statements
              .getDetails(statementId, accountId)
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
      System.err.println("Exception when calling StatementsApi#getDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OBReadStatement2> response = client
              .statements
              .getDetails(statementId, accountId)
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
      System.err.println("Exception when calling StatementsApi#getDetails");
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
| **statementId** | **String**| StatementId | |
| **accountId** | **String**| AccountId | |
| **xFapiAuthDate** | **String**| The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC | [optional] |
| **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional] |
| **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional] |
| **xCustomerUserAgent** | **String**| Indicates the user-agent that the PSU is using. | [optional] |

### Return type

[**OBReadStatement2**](OBReadStatement2.md)

### Authorization

[PSUOAuth2Security](../README.md#PSUOAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/jose+jwe, application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Statements Read |  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |
| **401** | Unauthorized |  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |
| **404** | Not found |  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |
| **405** | Method Not Allowed |  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |
| **406** | Not Acceptable |  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |
| **429** | Too Many Requests |  * Retry-After - Number in seconds to wait <br>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |

<a name="getFile"></a>
# **getFile**
> Object getFile(statementId, accountId).xFapiAuthDate(xFapiAuthDate).xFapiCustomerIpAddress(xFapiCustomerIpAddress).xFapiInteractionId(xFapiInteractionId).xCustomerUserAgent(xCustomerUserAgent).execute();

Get Statements

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.OpenBanking;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StatementsApi;
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
    String statementId = "statementId_example"; // StatementId
    String accountId = "accountId_example"; // AccountId
    String xFapiAuthDate = "xFapiAuthDate_example"; // The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
    String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // The PSU's IP address if the PSU is currently logged in with the TPP.
    String xFapiInteractionId = "xFapiInteractionId_example"; // An RFC4122 UID used as a correlation id.
    String xCustomerUserAgent = "xCustomerUserAgent_example"; // Indicates the user-agent that the PSU is using.
    try {
      Object result = client
              .statements
              .getFile(statementId, accountId)
              .xFapiAuthDate(xFapiAuthDate)
              .xFapiCustomerIpAddress(xFapiCustomerIpAddress)
              .xFapiInteractionId(xFapiInteractionId)
              .xCustomerUserAgent(xCustomerUserAgent)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling StatementsApi#getFile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .statements
              .getFile(statementId, accountId)
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
      System.err.println("Exception when calling StatementsApi#getFile");
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
| **statementId** | **String**| StatementId | |
| **accountId** | **String**| AccountId | |
| **xFapiAuthDate** | **String**| The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC | [optional] |
| **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional] |
| **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional] |
| **xCustomerUserAgent** | **String**| Indicates the user-agent that the PSU is using. | [optional] |

### Return type

**Object**

### Authorization

[PSUOAuth2Security](../README.md#PSUOAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/jose+jwe, application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Statements Read |  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |
| **401** | Unauthorized |  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |
| **404** | Not found |  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |
| **405** | Method Not Allowed |  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |
| **406** | Not Acceptable |  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |
| **429** | Too Many Requests |  * Retry-After - Number in seconds to wait <br>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |

