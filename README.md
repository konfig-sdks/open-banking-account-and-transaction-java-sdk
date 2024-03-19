<div align="center">

[![Visit Open banking](./header.png)](https://www.openbanking.org.uk&#x2F;)

# [Open banking](https://www.openbanking.org.uk&#x2F;)

Swagger for Account and Transaction API Specification

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Open%20Banking&serviceName=Account%20and%20Transaction&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>open-banking-account-and-transaction-java-sdk</artifactId>
  <version>3.1.7</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:open-banking-account-and-transaction-java-sdk:3.1.7"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/open-banking-account-and-transaction-java-sdk-3.1.7.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.OpenBankingAccountAndTransaction;
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
    
    OpenBankingAccountAndTransaction client = new OpenBankingAccountAndTransaction(configuration);
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

## Documentation for API Endpoints

All URIs are relative to *https://openbanking.org.uk*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountAccessApi* | [**createConsent**](docs/AccountAccessApi.md#createConsent) | **POST** /account-access-consents | Create Account Access Consents
*AccountAccessApi* | [**deleteConsent**](docs/AccountAccessApi.md#deleteConsent) | **DELETE** /account-access-consents/{ConsentId} | Delete Account Access Consents
*AccountAccessApi* | [**getConsent**](docs/AccountAccessApi.md#getConsent) | **GET** /account-access-consents/{ConsentId} | Get Account Access Consents
*AccountsApi* | [**get**](docs/AccountsApi.md#get) | **GET** /accounts/{AccountId} | Get Accounts
*AccountsApi* | [**getAll**](docs/AccountsApi.md#getAll) | **GET** /accounts | Get Accounts
*BalancesApi* | [**get**](docs/BalancesApi.md#get) | **GET** /accounts/{AccountId}/balances | Get Balances
*BalancesApi* | [**getAll**](docs/BalancesApi.md#getAll) | **GET** /balances | Get Balances
*BeneficiariesApi* | [**getAll**](docs/BeneficiariesApi.md#getAll) | **GET** /accounts/{AccountId}/beneficiaries | Get Beneficiaries
*BeneficiariesApi* | [**getAll_0**](docs/BeneficiariesApi.md#getAll_0) | **GET** /beneficiaries | Get Beneficiaries
*DirectDebitsApi* | [**getAll**](docs/DirectDebitsApi.md#getAll) | **GET** /direct-debits | Get Direct Debits
*DirectDebitsApi* | [**list**](docs/DirectDebitsApi.md#list) | **GET** /accounts/{AccountId}/direct-debits | Get Direct Debits
*OffersApi* | [**getById**](docs/OffersApi.md#getById) | **GET** /accounts/{AccountId}/offers | Get Offers
*OffersApi* | [**list**](docs/OffersApi.md#list) | **GET** /offers | Get Offers
*PartiesApi* | [**getByAccountId**](docs/PartiesApi.md#getByAccountId) | **GET** /accounts/{AccountId}/party | Get Parties
*PartiesApi* | [**getList**](docs/PartiesApi.md#getList) | **GET** /accounts/{AccountId}/parties | Get Parties
*PartiesApi* | [**getList_0**](docs/PartiesApi.md#getList_0) | **GET** /party | Get Parties
*ProductsApi* | [**getByAccountId**](docs/ProductsApi.md#getByAccountId) | **GET** /accounts/{AccountId}/product | Get Products
*ProductsApi* | [**list**](docs/ProductsApi.md#list) | **GET** /products | Get Products
*ScheduledPaymentsApi* | [**getAll**](docs/ScheduledPaymentsApi.md#getAll) | **GET** /accounts/{AccountId}/scheduled-payments | Get Scheduled Payments
*ScheduledPaymentsApi* | [**getAll_0**](docs/ScheduledPaymentsApi.md#getAll_0) | **GET** /scheduled-payments | Get Scheduled Payments
*StandingOrdersApi* | [**get**](docs/StandingOrdersApi.md#get) | **GET** /accounts/{AccountId}/standing-orders | Get Standing Orders
*StandingOrdersApi* | [**getAll**](docs/StandingOrdersApi.md#getAll) | **GET** /standing-orders | Get Standing Orders
*StatementsApi* | [**get**](docs/StatementsApi.md#get) | **GET** /accounts/{AccountId}/statements | Get Statements
*StatementsApi* | [**getAll**](docs/StatementsApi.md#getAll) | **GET** /statements | Get Statements
*StatementsApi* | [**getDetails**](docs/StatementsApi.md#getDetails) | **GET** /accounts/{AccountId}/statements/{StatementId} | Get Statements
*StatementsApi* | [**getFile**](docs/StatementsApi.md#getFile) | **GET** /accounts/{AccountId}/statements/{StatementId}/file | Get Statements
*TransactionsApi* | [**getDetails**](docs/TransactionsApi.md#getDetails) | **GET** /accounts/{AccountId}/statements/{StatementId}/transactions | Get Transactions
*TransactionsApi* | [**getDetails_0**](docs/TransactionsApi.md#getDetails_0) | **GET** /accounts/{AccountId}/transactions | Get Transactions
*TransactionsApi* | [**getDetails_1**](docs/TransactionsApi.md#getDetails_1) | **GET** /transactions | Get Transactions


## Documentation for Models

 - [CreditInterestProperty](docs/CreditInterestProperty.md)
 - [CreditInterestProperty1](docs/CreditInterestProperty1.md)
 - [FeeApplicableRangeProperty](docs/FeeApplicableRangeProperty.md)
 - [FeeChargeCapPropertyInner](docs/FeeChargeCapPropertyInner.md)
 - [FeeChargeCapPropertyInner1](docs/FeeChargeCapPropertyInner1.md)
 - [FeeChargeDetailPropertyInner](docs/FeeChargeDetailPropertyInner.md)
 - [FeeChargeDetailPropertyInner1](docs/FeeChargeDetailPropertyInner1.md)
 - [Links](docs/Links.md)
 - [Meta](docs/Meta.md)
 - [Model](docs/Model.md)
 - [OBAccount4](docs/OBAccount4.md)
 - [OBAccount4AccountInner](docs/OBAccount4AccountInner.md)
 - [OBAccount4Basic](docs/OBAccount4Basic.md)
 - [OBAccount4Detail](docs/OBAccount4Detail.md)
 - [OBAccount6](docs/OBAccount6.md)
 - [OBAccount6Basic](docs/OBAccount6Basic.md)
 - [OBAccount6Detail](docs/OBAccount6Detail.md)
 - [OBAccountStatus1Code](docs/OBAccountStatus1Code.md)
 - [OBActiveOrHistoricCurrencyAndAmount0](docs/OBActiveOrHistoricCurrencyAndAmount0.md)
 - [OBActiveOrHistoricCurrencyAndAmount1](docs/OBActiveOrHistoricCurrencyAndAmount1.md)
 - [OBActiveOrHistoricCurrencyAndAmount10](docs/OBActiveOrHistoricCurrencyAndAmount10.md)
 - [OBActiveOrHistoricCurrencyAndAmount11](docs/OBActiveOrHistoricCurrencyAndAmount11.md)
 - [OBActiveOrHistoricCurrencyAndAmount2](docs/OBActiveOrHistoricCurrencyAndAmount2.md)
 - [OBActiveOrHistoricCurrencyAndAmount3](docs/OBActiveOrHistoricCurrencyAndAmount3.md)
 - [OBActiveOrHistoricCurrencyAndAmount4](docs/OBActiveOrHistoricCurrencyAndAmount4.md)
 - [OBActiveOrHistoricCurrencyAndAmount5](docs/OBActiveOrHistoricCurrencyAndAmount5.md)
 - [OBActiveOrHistoricCurrencyAndAmount6](docs/OBActiveOrHistoricCurrencyAndAmount6.md)
 - [OBActiveOrHistoricCurrencyAndAmount7](docs/OBActiveOrHistoricCurrencyAndAmount7.md)
 - [OBActiveOrHistoricCurrencyAndAmount8](docs/OBActiveOrHistoricCurrencyAndAmount8.md)
 - [OBActiveOrHistoricCurrencyAndAmount9](docs/OBActiveOrHistoricCurrencyAndAmount9.md)
 - [OBAddressTypeCode](docs/OBAddressTypeCode.md)
 - [OBBCAData1](docs/OBBCAData1.md)
 - [OBBalanceType1Code](docs/OBBalanceType1Code.md)
 - [OBBankTransactionCodeStructure1](docs/OBBankTransactionCodeStructure1.md)
 - [OBBeneficiary5](docs/OBBeneficiary5.md)
 - [OBBeneficiary5Basic](docs/OBBeneficiary5Basic.md)
 - [OBBeneficiary5Detail](docs/OBBeneficiary5Detail.md)
 - [OBBeneficiaryType1Code](docs/OBBeneficiaryType1Code.md)
 - [OBBranchAndFinancialInstitutionIdentification50](docs/OBBranchAndFinancialInstitutionIdentification50.md)
 - [OBBranchAndFinancialInstitutionIdentification51](docs/OBBranchAndFinancialInstitutionIdentification51.md)
 - [OBBranchAndFinancialInstitutionIdentification60](docs/OBBranchAndFinancialInstitutionIdentification60.md)
 - [OBBranchAndFinancialInstitutionIdentification61](docs/OBBranchAndFinancialInstitutionIdentification61.md)
 - [OBBranchAndFinancialInstitutionIdentification62](docs/OBBranchAndFinancialInstitutionIdentification62.md)
 - [OBCashAccount50](docs/OBCashAccount50.md)
 - [OBCashAccount51](docs/OBCashAccount51.md)
 - [OBCashAccount60](docs/OBCashAccount60.md)
 - [OBCashAccount61](docs/OBCashAccount61.md)
 - [OBCreditDebitCode0](docs/OBCreditDebitCode0.md)
 - [OBCreditDebitCode1](docs/OBCreditDebitCode1.md)
 - [OBCreditDebitCode2](docs/OBCreditDebitCode2.md)
 - [OBCurrencyExchange5](docs/OBCurrencyExchange5.md)
 - [OBCurrencyExchange5InstructedAmount](docs/OBCurrencyExchange5InstructedAmount.md)
 - [OBEntryStatus1Code](docs/OBEntryStatus1Code.md)
 - [OBError1](docs/OBError1.md)
 - [OBExternalAccountSubType1Code](docs/OBExternalAccountSubType1Code.md)
 - [OBExternalAccountType1Code](docs/OBExternalAccountType1Code.md)
 - [OBExternalDirectDebitStatus1Code](docs/OBExternalDirectDebitStatus1Code.md)
 - [OBExternalPartyType1Code](docs/OBExternalPartyType1Code.md)
 - [OBExternalScheduleType1Code](docs/OBExternalScheduleType1Code.md)
 - [OBExternalStandingOrderStatus1Code](docs/OBExternalStandingOrderStatus1Code.md)
 - [OBExternalStatementType1Code](docs/OBExternalStatementType1Code.md)
 - [OBFeeCategory1Code](docs/OBFeeCategory1Code.md)
 - [OBFeeFrequency1Code0](docs/OBFeeFrequency1Code0.md)
 - [OBFeeFrequency1Code1](docs/OBFeeFrequency1Code1.md)
 - [OBFeeFrequency1Code2](docs/OBFeeFrequency1Code2.md)
 - [OBFeeFrequency1Code3](docs/OBFeeFrequency1Code3.md)
 - [OBFeeFrequency1Code4](docs/OBFeeFrequency1Code4.md)
 - [OBFeeType1Code](docs/OBFeeType1Code.md)
 - [OBInterestCalculationMethod1Code](docs/OBInterestCalculationMethod1Code.md)
 - [OBInterestFixedVariableType1Code](docs/OBInterestFixedVariableType1Code.md)
 - [OBInterestRateType1Code0](docs/OBInterestRateType1Code0.md)
 - [OBInterestRateType1Code1](docs/OBInterestRateType1Code1.md)
 - [OBMerchantDetails1](docs/OBMerchantDetails1.md)
 - [OBMinMaxType1Code](docs/OBMinMaxType1Code.md)
 - [OBOtherCodeType10](docs/OBOtherCodeType10.md)
 - [OBOtherCodeType11](docs/OBOtherCodeType11.md)
 - [OBOtherCodeType12](docs/OBOtherCodeType12.md)
 - [OBOtherCodeType13](docs/OBOtherCodeType13.md)
 - [OBOtherCodeType14](docs/OBOtherCodeType14.md)
 - [OBOtherCodeType15](docs/OBOtherCodeType15.md)
 - [OBOtherCodeType16](docs/OBOtherCodeType16.md)
 - [OBOtherCodeType17](docs/OBOtherCodeType17.md)
 - [OBOtherCodeType18](docs/OBOtherCodeType18.md)
 - [OBOtherFeeChargeDetailType](docs/OBOtherFeeChargeDetailType.md)
 - [OBOverdraftFeeType1Code](docs/OBOverdraftFeeType1Code.md)
 - [OBPCAData1](docs/OBPCAData1.md)
 - [OBParty2](docs/OBParty2.md)
 - [OBParty2AddressInner](docs/OBParty2AddressInner.md)
 - [OBPartyRelationships1](docs/OBPartyRelationships1.md)
 - [OBPartyRelationships1Account](docs/OBPartyRelationships1Account.md)
 - [OBPeriod1Code](docs/OBPeriod1Code.md)
 - [OBPostalAddress6](docs/OBPostalAddress6.md)
 - [OBReadAccount6](docs/OBReadAccount6.md)
 - [OBReadAccount6Data](docs/OBReadAccount6Data.md)
 - [OBReadBalance1](docs/OBReadBalance1.md)
 - [OBReadBalance1Data](docs/OBReadBalance1Data.md)
 - [OBReadBalance1DataBalanceInner](docs/OBReadBalance1DataBalanceInner.md)
 - [OBReadBalance1DataBalanceInnerAmount](docs/OBReadBalance1DataBalanceInnerAmount.md)
 - [OBReadBalance1DataBalanceInnerCreditLineInner](docs/OBReadBalance1DataBalanceInnerCreditLineInner.md)
 - [OBReadBalance1DataBalanceInnerCreditLineInnerAmount](docs/OBReadBalance1DataBalanceInnerCreditLineInnerAmount.md)
 - [OBReadBeneficiary5](docs/OBReadBeneficiary5.md)
 - [OBReadBeneficiary5Data](docs/OBReadBeneficiary5Data.md)
 - [OBReadConsent1](docs/OBReadConsent1.md)
 - [OBReadConsent1Data](docs/OBReadConsent1Data.md)
 - [OBReadConsentResponse1](docs/OBReadConsentResponse1.md)
 - [OBReadConsentResponse1Data](docs/OBReadConsentResponse1Data.md)
 - [OBReadDataStatement2](docs/OBReadDataStatement2.md)
 - [OBReadDataTransaction6](docs/OBReadDataTransaction6.md)
 - [OBReadDirectDebit2](docs/OBReadDirectDebit2.md)
 - [OBReadDirectDebit2Data](docs/OBReadDirectDebit2Data.md)
 - [OBReadDirectDebit2DataDirectDebitInner](docs/OBReadDirectDebit2DataDirectDebitInner.md)
 - [OBReadOffer1](docs/OBReadOffer1.md)
 - [OBReadOffer1Data](docs/OBReadOffer1Data.md)
 - [OBReadOffer1DataOfferInner](docs/OBReadOffer1DataOfferInner.md)
 - [OBReadOffer1DataOfferInnerAmount](docs/OBReadOffer1DataOfferInnerAmount.md)
 - [OBReadOffer1DataOfferInnerFee](docs/OBReadOffer1DataOfferInnerFee.md)
 - [OBReadParty2](docs/OBReadParty2.md)
 - [OBReadParty2Data](docs/OBReadParty2Data.md)
 - [OBReadParty3](docs/OBReadParty3.md)
 - [OBReadParty3Data](docs/OBReadParty3Data.md)
 - [OBReadProduct2](docs/OBReadProduct2.md)
 - [OBReadProduct2Data](docs/OBReadProduct2Data.md)
 - [OBReadProduct2DataProductInner](docs/OBReadProduct2DataProductInner.md)
 - [OBReadProduct2DataProductInnerOtherProductType](docs/OBReadProduct2DataProductInnerOtherProductType.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeCreditInterest](docs/OBReadProduct2DataProductInnerOtherProductTypeCreditInterest.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner](docs/OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner](docs/OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInnerOtherBankInterestType](docs/OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInnerOtherBankInterestType.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeLoanInterest](docs/OBReadProduct2DataProductInnerOtherProductTypeLoanInterest.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner](docs/OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInner](docs/OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInner.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner](docs/OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInnerOtherFeeTypeInner](docs/OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInnerOtherFeeTypeInner.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner](docs/OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInner](docs/OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInner.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerOtherLoanProviderInterestRateType](docs/OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerOtherLoanProviderInterestRateType.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner](docs/OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeCapInner](docs/OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeCapInner.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner](docs/OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInnerFeeApplicableRange](docs/OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInnerFeeApplicableRange.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerOtherTariffType](docs/OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerOtherTariffType.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeOverdraft](docs/OBReadProduct2DataProductInnerOtherProductTypeOverdraft.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInner](docs/OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInner.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftFeesChargesInner](docs/OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftFeesChargesInner.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftFeesChargesInnerOverdraftFeeChargeCapInner](docs/OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftFeesChargesInnerOverdraftFeeChargeCapInner.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftFeesChargesInnerOverdraftFeeChargeDetailInner](docs/OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftFeesChargesInnerOverdraftFeeChargeDetailInner.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner](docs/OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInner](docs/OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInner.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeProductDetails](docs/OBReadProduct2DataProductInnerOtherProductTypeProductDetails.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeRepayment](docs/OBReadProduct2DataProductInnerOtherProductTypeRepayment.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherAmountType](docs/OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherAmountType.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherRepaymentFrequency](docs/OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherRepaymentFrequency.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherRepaymentType](docs/OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherRepaymentType.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeCharges](docs/OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeCharges.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCapInner](docs/OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCapInner.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetailInner](docs/OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetailInner.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner](docs/OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner.md)
 - [OBReadScheduledPayment3](docs/OBReadScheduledPayment3.md)
 - [OBReadScheduledPayment3Data](docs/OBReadScheduledPayment3Data.md)
 - [OBReadStandingOrder6](docs/OBReadStandingOrder6.md)
 - [OBReadStandingOrder6Data](docs/OBReadStandingOrder6Data.md)
 - [OBReadStatement2](docs/OBReadStatement2.md)
 - [OBReadTransaction6](docs/OBReadTransaction6.md)
 - [OBScheduledPayment3](docs/OBScheduledPayment3.md)
 - [OBScheduledPayment3Basic](docs/OBScheduledPayment3Basic.md)
 - [OBScheduledPayment3Detail](docs/OBScheduledPayment3Detail.md)
 - [OBStandingOrder6](docs/OBStandingOrder6.md)
 - [OBStandingOrder6Basic](docs/OBStandingOrder6Basic.md)
 - [OBStandingOrder6Detail](docs/OBStandingOrder6Detail.md)
 - [OBStatement2](docs/OBStatement2.md)
 - [OBStatement2Basic](docs/OBStatement2Basic.md)
 - [OBStatement2Detail](docs/OBStatement2Detail.md)
 - [OBStatement2StatementAmountInner](docs/OBStatement2StatementAmountInner.md)
 - [OBStatement2StatementBenefitInner](docs/OBStatement2StatementBenefitInner.md)
 - [OBStatement2StatementDateTimeInner](docs/OBStatement2StatementDateTimeInner.md)
 - [OBStatement2StatementFeeInner](docs/OBStatement2StatementFeeInner.md)
 - [OBStatement2StatementInterestInner](docs/OBStatement2StatementInterestInner.md)
 - [OBStatement2StatementRateInner](docs/OBStatement2StatementRateInner.md)
 - [OBStatement2StatementValueInner](docs/OBStatement2StatementValueInner.md)
 - [OBTransaction6](docs/OBTransaction6.md)
 - [OBTransaction6Basic](docs/OBTransaction6Basic.md)
 - [OBTransaction6Detail](docs/OBTransaction6Detail.md)
 - [OBTransactionCardInstrument1](docs/OBTransactionCardInstrument1.md)
 - [OBTransactionCashBalance](docs/OBTransactionCashBalance.md)
 - [OBTransactionCashBalanceAmount](docs/OBTransactionCashBalanceAmount.md)
 - [OBTransactionMutability1Code](docs/OBTransactionMutability1Code.md)
 - [OtherApplicationFrequencyProperty](docs/OtherApplicationFrequencyProperty.md)
 - [OtherApplicationFrequencyProperty1](docs/OtherApplicationFrequencyProperty1.md)
 - [OtherBankInterestTypeProperty](docs/OtherBankInterestTypeProperty.md)
 - [OtherCalculationFrequencyProperty](docs/OtherCalculationFrequencyProperty.md)
 - [OtherCalculationFrequencyProperty1](docs/OtherCalculationFrequencyProperty1.md)
 - [OtherFeeCategoryTypeProperty](docs/OtherFeeCategoryTypeProperty.md)
 - [OtherFeeRateTypeProperty](docs/OtherFeeRateTypeProperty.md)
 - [OtherFeeRateTypeProperty1](docs/OtherFeeRateTypeProperty1.md)
 - [OtherFeeTypeProperty](docs/OtherFeeTypeProperty.md)
 - [OtherFeeTypeProperty1](docs/OtherFeeTypeProperty1.md)
 - [OtherFeeTypePropertyInner](docs/OtherFeeTypePropertyInner.md)
 - [OtherFeesChargesProperty](docs/OtherFeesChargesProperty.md)
 - [OtherFeesChargesPropertyInner](docs/OtherFeesChargesPropertyInner.md)
 - [OtherTariffTypeProperty](docs/OtherTariffTypeProperty.md)
 - [OverdraftFeeChargeCapProperty](docs/OverdraftFeeChargeCapProperty.md)
 - [OverdraftFeeChargeCapPropertyInner](docs/OverdraftFeeChargeCapPropertyInner.md)
 - [OverdraftFeeChargeCapPropertyInner1](docs/OverdraftFeeChargeCapPropertyInner1.md)
 - [OverdraftFeeChargeDetailPropertyInner](docs/OverdraftFeeChargeDetailPropertyInner.md)
 - [OverdraftFeeChargeDetailPropertyInner1](docs/OverdraftFeeChargeDetailPropertyInner1.md)
 - [OverdraftFeesChargesPropertyInner](docs/OverdraftFeesChargesPropertyInner.md)
 - [OverdraftFeesChargesPropertyInner1](docs/OverdraftFeesChargesPropertyInner1.md)
 - [OverdraftFeesChargesPropertyInner2](docs/OverdraftFeesChargesPropertyInner2.md)
 - [OverdraftFeesChargesPropertyInner3](docs/OverdraftFeesChargesPropertyInner3.md)
 - [OverdraftProperty](docs/OverdraftProperty.md)
 - [OverdraftProperty1](docs/OverdraftProperty1.md)
 - [OverdraftTierBandPropertyInner](docs/OverdraftTierBandPropertyInner.md)
 - [OverdraftTierBandPropertyInner1](docs/OverdraftTierBandPropertyInner1.md)
 - [OverdraftTierBandSetPropertyInner](docs/OverdraftTierBandSetPropertyInner.md)
 - [OverdraftTierBandSetPropertyInner1](docs/OverdraftTierBandSetPropertyInner1.md)
 - [ProductDetailsProperty](docs/ProductDetailsProperty.md)
 - [ProductDetailsProperty1](docs/ProductDetailsProperty1.md)
 - [ProprietaryBankTransactionCodeStructure1](docs/ProprietaryBankTransactionCodeStructure1.md)
 - [TierBandPropertyInner](docs/TierBandPropertyInner.md)
 - [TierBandPropertyInner1](docs/TierBandPropertyInner1.md)
 - [TierBandSetPropertyInner](docs/TierBandSetPropertyInner.md)
 - [TierBandSetPropertyInner1](docs/TierBandSetPropertyInner1.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
