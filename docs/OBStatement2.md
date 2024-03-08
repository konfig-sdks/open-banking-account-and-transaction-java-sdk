

# OBStatement2

Provides further details on a statement resource.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** | A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner. |  |
|**creationDateTime** | **OffsetDateTime** | Date and time at which the resource was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00 |  |
|**endDateTime** | **OffsetDateTime** | Date and time at which the statement period ends.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00 |  |
|**startDateTime** | **OffsetDateTime** | Date and time at which the statement period starts.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00 |  |
|**statementAmount** | [**List&lt;OBStatement2StatementAmountInner&gt;**](OBStatement2StatementAmountInner.md) |  |  [optional] |
|**statementBenefit** | [**List&lt;OBStatement2StatementBenefitInner&gt;**](OBStatement2StatementBenefitInner.md) |  |  [optional] |
|**statementDateTime** | [**List&lt;OBStatement2StatementDateTimeInner&gt;**](OBStatement2StatementDateTimeInner.md) |  |  [optional] |
|**statementDescription** | **List&lt;String&gt;** |  |  [optional] |
|**statementFee** | [**List&lt;OBStatement2StatementFeeInner&gt;**](OBStatement2StatementFeeInner.md) |  |  [optional] |
|**statementId** | **String** | Unique identifier for the statement resource within an servicing institution. This identifier is both unique and immutable. |  [optional] |
|**statementInterest** | [**List&lt;OBStatement2StatementInterestInner&gt;**](OBStatement2StatementInterestInner.md) |  |  [optional] |
|**statementRate** | [**List&lt;OBStatement2StatementRateInner&gt;**](OBStatement2StatementRateInner.md) |  |  [optional] |
|**statementReference** | **String** | Unique reference for the statement. This reference may be optionally populated if available. |  [optional] |
|**statementValue** | [**List&lt;OBStatement2StatementValueInner&gt;**](OBStatement2StatementValueInner.md) |  |  [optional] |
|**type** | **OBExternalStatementType1Code** |  |  |



