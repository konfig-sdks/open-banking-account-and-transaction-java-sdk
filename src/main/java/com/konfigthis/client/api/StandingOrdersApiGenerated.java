/*
 * Account and Transaction API Specification
 * Swagger for Account and Transaction API Specification
 *
 * The version of the OpenAPI document: 3.1.7
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.OBReadStandingOrder6;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class StandingOrdersApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public StandingOrdersApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public StandingOrdersApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call getCall(String accountId, String xFapiAuthDate, String xFapiCustomerIpAddress, String xFapiInteractionId, String xCustomerUserAgent, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/accounts/{AccountId}/standing-orders"
            .replace("{" + "AccountId" + "}", localVarApiClient.escapeString(accountId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (xFapiAuthDate != null) {
            localVarHeaderParams.put("x-fapi-auth-date", localVarApiClient.parameterToString(xFapiAuthDate));
        }

        if (xFapiCustomerIpAddress != null) {
            localVarHeaderParams.put("x-fapi-customer-ip-address", localVarApiClient.parameterToString(xFapiCustomerIpAddress));
        }

        if (xFapiInteractionId != null) {
            localVarHeaderParams.put("x-fapi-interaction-id", localVarApiClient.parameterToString(xFapiInteractionId));
        }

        if (xCustomerUserAgent != null) {
            localVarHeaderParams.put("x-customer-user-agent", localVarApiClient.parameterToString(xCustomerUserAgent));
        }

        final String[] localVarAccepts = {
            "application/json",
            "application/jose+jwe",
            "application/json; charset=utf-8"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "PSUOAuth2Security" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getValidateBeforeCall(String accountId, String xFapiAuthDate, String xFapiCustomerIpAddress, String xFapiInteractionId, String xCustomerUserAgent, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling get(Async)");
        }

        return getCall(accountId, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent, _callback);

    }


    private ApiResponse<OBReadStandingOrder6> getWithHttpInfo(String accountId, String xFapiAuthDate, String xFapiCustomerIpAddress, String xFapiInteractionId, String xCustomerUserAgent) throws ApiException {
        okhttp3.Call localVarCall = getValidateBeforeCall(accountId, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent, null);
        Type localVarReturnType = new TypeToken<OBReadStandingOrder6>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getAsync(String accountId, String xFapiAuthDate, String xFapiCustomerIpAddress, String xFapiInteractionId, String xCustomerUserAgent, final ApiCallback<OBReadStandingOrder6> _callback) throws ApiException {

        okhttp3.Call localVarCall = getValidateBeforeCall(accountId, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent, _callback);
        Type localVarReturnType = new TypeToken<OBReadStandingOrder6>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetRequestBuilder {
        private final String accountId;
        private String xFapiAuthDate;
        private String xFapiCustomerIpAddress;
        private String xFapiInteractionId;
        private String xCustomerUserAgent;

        private GetRequestBuilder(String accountId) {
            this.accountId = accountId;
        }

        /**
         * Set xFapiAuthDate
         * @param xFapiAuthDate The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC (optional)
         * @return GetRequestBuilder
         */
        public GetRequestBuilder xFapiAuthDate(String xFapiAuthDate) {
            this.xFapiAuthDate = xFapiAuthDate;
            return this;
        }
        
        /**
         * Set xFapiCustomerIpAddress
         * @param xFapiCustomerIpAddress The PSU&#39;s IP address if the PSU is currently logged in with the TPP. (optional)
         * @return GetRequestBuilder
         */
        public GetRequestBuilder xFapiCustomerIpAddress(String xFapiCustomerIpAddress) {
            this.xFapiCustomerIpAddress = xFapiCustomerIpAddress;
            return this;
        }
        
        /**
         * Set xFapiInteractionId
         * @param xFapiInteractionId An RFC4122 UID used as a correlation id. (optional)
         * @return GetRequestBuilder
         */
        public GetRequestBuilder xFapiInteractionId(String xFapiInteractionId) {
            this.xFapiInteractionId = xFapiInteractionId;
            return this;
        }
        
        /**
         * Set xCustomerUserAgent
         * @param xCustomerUserAgent Indicates the user-agent that the PSU is using. (optional)
         * @return GetRequestBuilder
         */
        public GetRequestBuilder xCustomerUserAgent(String xCustomerUserAgent) {
            this.xCustomerUserAgent = xCustomerUserAgent;
            return this;
        }
        
        /**
         * Build call for get
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Standing Orders Read </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 404 </td><td> Not found </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 405 </td><td> Method Not Allowed </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 406 </td><td> Not Acceptable </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 429 </td><td> Too Many Requests </td><td>  * Retry-After - Number in seconds to wait <br>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getCall(accountId, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent, _callback);
        }


        /**
         * Execute get request
         * @return OBReadStandingOrder6
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Standing Orders Read </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 404 </td><td> Not found </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 405 </td><td> Method Not Allowed </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 406 </td><td> Not Acceptable </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 429 </td><td> Too Many Requests </td><td>  * Retry-After - Number in seconds to wait <br>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
         </table>
         */
        public OBReadStandingOrder6 execute() throws ApiException {
            ApiResponse<OBReadStandingOrder6> localVarResp = getWithHttpInfo(accountId, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute get request with HTTP info returned
         * @return ApiResponse&lt;OBReadStandingOrder6&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Standing Orders Read </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 404 </td><td> Not found </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 405 </td><td> Method Not Allowed </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 406 </td><td> Not Acceptable </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 429 </td><td> Too Many Requests </td><td>  * Retry-After - Number in seconds to wait <br>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
         </table>
         */
        public ApiResponse<OBReadStandingOrder6> executeWithHttpInfo() throws ApiException {
            return getWithHttpInfo(accountId, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent);
        }

        /**
         * Execute get request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Standing Orders Read </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 404 </td><td> Not found </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 405 </td><td> Method Not Allowed </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 406 </td><td> Not Acceptable </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 429 </td><td> Too Many Requests </td><td>  * Retry-After - Number in seconds to wait <br>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<OBReadStandingOrder6> _callback) throws ApiException {
            return getAsync(accountId, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent, _callback);
        }
    }

    /**
     * Get Standing Orders
     * 
     * @param accountId AccountId (required)
     * @return GetRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Standing Orders Read </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
        <tr><td> 405 </td><td> Method Not Allowed </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  * Retry-After - Number in seconds to wait <br>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
     </table>
     */
    public GetRequestBuilder get(String accountId) throws IllegalArgumentException {
        if (accountId == null) throw new IllegalArgumentException("\"accountId\" is required but got null");
            

        return new GetRequestBuilder(accountId);
    }
    private okhttp3.Call getAllCall(String xFapiAuthDate, String xFapiCustomerIpAddress, String xFapiInteractionId, String xCustomerUserAgent, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/standing-orders";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (xFapiAuthDate != null) {
            localVarHeaderParams.put("x-fapi-auth-date", localVarApiClient.parameterToString(xFapiAuthDate));
        }

        if (xFapiCustomerIpAddress != null) {
            localVarHeaderParams.put("x-fapi-customer-ip-address", localVarApiClient.parameterToString(xFapiCustomerIpAddress));
        }

        if (xFapiInteractionId != null) {
            localVarHeaderParams.put("x-fapi-interaction-id", localVarApiClient.parameterToString(xFapiInteractionId));
        }

        if (xCustomerUserAgent != null) {
            localVarHeaderParams.put("x-customer-user-agent", localVarApiClient.parameterToString(xCustomerUserAgent));
        }

        final String[] localVarAccepts = {
            "application/json",
            "application/jose+jwe",
            "application/json; charset=utf-8"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "PSUOAuth2Security" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAllValidateBeforeCall(String xFapiAuthDate, String xFapiCustomerIpAddress, String xFapiInteractionId, String xCustomerUserAgent, final ApiCallback _callback) throws ApiException {
        return getAllCall(xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent, _callback);

    }


    private ApiResponse<OBReadStandingOrder6> getAllWithHttpInfo(String xFapiAuthDate, String xFapiCustomerIpAddress, String xFapiInteractionId, String xCustomerUserAgent) throws ApiException {
        okhttp3.Call localVarCall = getAllValidateBeforeCall(xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent, null);
        Type localVarReturnType = new TypeToken<OBReadStandingOrder6>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getAllAsync(String xFapiAuthDate, String xFapiCustomerIpAddress, String xFapiInteractionId, String xCustomerUserAgent, final ApiCallback<OBReadStandingOrder6> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAllValidateBeforeCall(xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent, _callback);
        Type localVarReturnType = new TypeToken<OBReadStandingOrder6>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetAllRequestBuilder {
        private String xFapiAuthDate;
        private String xFapiCustomerIpAddress;
        private String xFapiInteractionId;
        private String xCustomerUserAgent;

        private GetAllRequestBuilder() {
        }

        /**
         * Set xFapiAuthDate
         * @param xFapiAuthDate The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC (optional)
         * @return GetAllRequestBuilder
         */
        public GetAllRequestBuilder xFapiAuthDate(String xFapiAuthDate) {
            this.xFapiAuthDate = xFapiAuthDate;
            return this;
        }
        
        /**
         * Set xFapiCustomerIpAddress
         * @param xFapiCustomerIpAddress The PSU&#39;s IP address if the PSU is currently logged in with the TPP. (optional)
         * @return GetAllRequestBuilder
         */
        public GetAllRequestBuilder xFapiCustomerIpAddress(String xFapiCustomerIpAddress) {
            this.xFapiCustomerIpAddress = xFapiCustomerIpAddress;
            return this;
        }
        
        /**
         * Set xFapiInteractionId
         * @param xFapiInteractionId An RFC4122 UID used as a correlation id. (optional)
         * @return GetAllRequestBuilder
         */
        public GetAllRequestBuilder xFapiInteractionId(String xFapiInteractionId) {
            this.xFapiInteractionId = xFapiInteractionId;
            return this;
        }
        
        /**
         * Set xCustomerUserAgent
         * @param xCustomerUserAgent Indicates the user-agent that the PSU is using. (optional)
         * @return GetAllRequestBuilder
         */
        public GetAllRequestBuilder xCustomerUserAgent(String xCustomerUserAgent) {
            this.xCustomerUserAgent = xCustomerUserAgent;
            return this;
        }
        
        /**
         * Build call for getAll
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Standing Orders Read </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 404 </td><td> Not found </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 405 </td><td> Method Not Allowed </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 406 </td><td> Not Acceptable </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 429 </td><td> Too Many Requests </td><td>  * Retry-After - Number in seconds to wait <br>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getAllCall(xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent, _callback);
        }


        /**
         * Execute getAll request
         * @return OBReadStandingOrder6
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Standing Orders Read </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 404 </td><td> Not found </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 405 </td><td> Method Not Allowed </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 406 </td><td> Not Acceptable </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 429 </td><td> Too Many Requests </td><td>  * Retry-After - Number in seconds to wait <br>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
         </table>
         */
        public OBReadStandingOrder6 execute() throws ApiException {
            ApiResponse<OBReadStandingOrder6> localVarResp = getAllWithHttpInfo(xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getAll request with HTTP info returned
         * @return ApiResponse&lt;OBReadStandingOrder6&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Standing Orders Read </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 404 </td><td> Not found </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 405 </td><td> Method Not Allowed </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 406 </td><td> Not Acceptable </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 429 </td><td> Too Many Requests </td><td>  * Retry-After - Number in seconds to wait <br>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
         </table>
         */
        public ApiResponse<OBReadStandingOrder6> executeWithHttpInfo() throws ApiException {
            return getAllWithHttpInfo(xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent);
        }

        /**
         * Execute getAll request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Standing Orders Read </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 404 </td><td> Not found </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 405 </td><td> Method Not Allowed </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 406 </td><td> Not Acceptable </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 429 </td><td> Too Many Requests </td><td>  * Retry-After - Number in seconds to wait <br>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<OBReadStandingOrder6> _callback) throws ApiException {
            return getAllAsync(xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent, _callback);
        }
    }

    /**
     * Get Standing Orders
     * 
     * @return GetAllRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Standing Orders Read </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
        <tr><td> 405 </td><td> Method Not Allowed </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  * Retry-After - Number in seconds to wait <br>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
     </table>
     */
    public GetAllRequestBuilder getAll() throws IllegalArgumentException {
        return new GetAllRequestBuilder();
    }
}
