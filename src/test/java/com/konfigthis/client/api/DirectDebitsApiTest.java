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

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.OBReadDirectDebit2;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DirectDebitsApi
 */
@Disabled
public class DirectDebitsApiTest {

    private static DirectDebitsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new DirectDebitsApi(apiClient);
    }

    /**
     * Get Direct Debits
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllTest() throws ApiException {
        String xFapiAuthDate = null;
        String xFapiCustomerIpAddress = null;
        String xFapiInteractionId = null;
        String xCustomerUserAgent = null;
        OBReadDirectDebit2 response = api.getAll()
                .xFapiAuthDate(xFapiAuthDate)
                .xFapiCustomerIpAddress(xFapiCustomerIpAddress)
                .xFapiInteractionId(xFapiInteractionId)
                .xCustomerUserAgent(xCustomerUserAgent)
                .execute();
        // TODO: test validations
    }

    /**
     * Get Direct Debits
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listTest() throws ApiException {
        String accountId = null;
        String xFapiAuthDate = null;
        String xFapiCustomerIpAddress = null;
        String xFapiInteractionId = null;
        String xCustomerUserAgent = null;
        OBReadDirectDebit2 response = api.list(accountId)
                .xFapiAuthDate(xFapiAuthDate)
                .xFapiCustomerIpAddress(xFapiCustomerIpAddress)
                .xFapiInteractionId(xFapiInteractionId)
                .xCustomerUserAgent(xCustomerUserAgent)
                .execute();
        // TODO: test validations
    }

}
