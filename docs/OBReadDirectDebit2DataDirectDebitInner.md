

# OBReadDirectDebit2DataDirectDebitInner

Account to or from which a cash entry is made.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** | A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner. |  |
|**directDebitId** | **String** | A unique and immutable identifier used to identify the direct debit resource. This identifier has no meaning to the account owner. |  [optional] |
|**directDebitStatusCode** | **OBExternalDirectDebitStatus1Code** |  |  [optional] |
|**frequency** | **String** | Regularity with which direct debit instructions are to be created and processed. |  [optional] |
|**mandateIdentification** | **String** | Direct Debit reference. For AUDDIS service users provide Core Reference. For non AUDDIS service users provide Core reference if possible or last used reference. |  |
|**name** | **String** | Name of Service User. |  |
|**previousPaymentAmount** | [**OBActiveOrHistoricCurrencyAndAmount0**](OBActiveOrHistoricCurrencyAndAmount0.md) |  |  [optional] |
|**previousPaymentDateTime** | **OffsetDateTime** | Date of most recent direct debit collection.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00 |  [optional] |



