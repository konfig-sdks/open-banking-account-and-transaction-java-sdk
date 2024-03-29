

# OBAccount4Detail

Unambiguous identification of the account to which credit and debit entries are made.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**account** | [**List&lt;OBAccount4AccountInner&gt;**](OBAccount4AccountInner.md) |  |  |
|**accountId** | **String** | A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner. |  |
|**accountSubType** | **OBExternalAccountSubType1Code** |  |  |
|**accountType** | **OBExternalAccountType1Code** |  |  |
|**currency** | **String** | Identification of the currency in which the account is held.  Usage: Currency should only be used in case one and the same account number covers several currencies and the initiating party needs to identify which currency needs to be used for settlement on the account. |  |
|**description** | **String** | Specifies the description of the account type. |  [optional] |
|**nickname** | **String** | The nickname of the account, assigned by the account owner in order to provide an additional means of identification of the account. |  [optional] |
|**servicer** | [**OBBranchAndFinancialInstitutionIdentification50**](OBBranchAndFinancialInstitutionIdentification50.md) |  |  [optional] |
|**status** | **OBAccountStatus1Code** |  |  [optional] |
|**statusUpdateDateTime** | **OffsetDateTime** | Date and time at which the resource status was updated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00 |  [optional] |



