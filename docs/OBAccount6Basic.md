

# OBAccount6Basic

Unambiguous identification of the account to which credit and debit entries are made.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** | A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner. |  |
|**accountSubType** | **OBExternalAccountSubType1Code** |  |  |
|**accountType** | **OBExternalAccountType1Code** |  |  |
|**currency** | **String** | Identification of the currency in which the account is held.  Usage: Currency should only be used in case one and the same account number covers several currencies and the initiating party needs to identify which currency needs to be used for settlement on the account. |  |
|**description** | **String** | Specifies the description of the account type. |  [optional] |
|**maturityDate** | **OffsetDateTime** | Maturity date of the account.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00 |  [optional] |
|**nickname** | **String** | The nickname of the account, assigned by the account owner in order to provide an additional means of identification of the account. |  [optional] |
|**openingDate** | **OffsetDateTime** | Date on which the account and related basic services are effectively operational for the account owner.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00 |  [optional] |
|**status** | **OBAccountStatus1Code** |  |  [optional] |
|**statusUpdateDateTime** | **OffsetDateTime** | Date and time at which the resource status was updated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00 |  [optional] |
|**switchStatus** | **String** | Specifies the switch status for the account, in a coded form. |  [optional] |



