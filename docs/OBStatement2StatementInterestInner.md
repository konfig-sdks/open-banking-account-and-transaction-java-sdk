

# OBStatement2StatementInterestInner

Set of elements used to provide details of a generic interest amount related to the statement resource.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | [**OBActiveOrHistoricCurrencyAndAmount7**](OBActiveOrHistoricCurrencyAndAmount7.md) |  |  |
|**creditDebitIndicator** | **OBCreditDebitCode0** |  |  |
|**description** | **String** | Description that may be available for the statement interest. |  [optional] |
|**frequency** | **String** | Specifies the statement fee type requested |  [optional] |
|**rate** | **Double** | field representing a percentage (e.g. 0.05 represents 5% and 0.9525 represents 95.25%). Note the number of decimal places may vary. |  [optional] |
|**rateType** | **String** | Description that may be available for the statement Interest rate type. |  [optional] |
|**type** | **String** | Interest amount type, in a coded form. |  |



