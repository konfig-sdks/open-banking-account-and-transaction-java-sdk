

# OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetailInner

Details about specific fees/charges that are applied for repayment

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**applicationFrequency** | **OBFeeFrequency1Code2** |  |  |
|**calculationFrequency** | **OBFeeFrequency1Code3** |  |  |
|**feeAmount** | **String** | Fee Amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate) |  [optional] |
|**feeRate** | **String** | Rate charged for Fee/Charge (where it is charged in terms of a rate rather than an amount) |  [optional] |
|**feeRateType** | **OBInterestRateType1Code1** |  |  [optional] |
|**feeType** | **OBFeeType1Code** |  |  |
|**negotiableIndicator** | **Boolean** | Fee/charge which is usually negotiable rather than a fixed amount |  [optional] |
|**notes** | **List&lt;String&gt;** |  |  [optional] |
|**otherApplicationFrequency** | [**OBOtherCodeType16**](OBOtherCodeType16.md) |  |  [optional] |
|**otherCalculationFrequency** | [**OBOtherCodeType17**](OBOtherCodeType17.md) |  |  [optional] |
|**otherFeeRateType** | [**OBOtherCodeType18**](OBOtherCodeType18.md) |  |  [optional] |
|**otherFeeType** | [**OBOtherFeeChargeDetailType**](OBOtherFeeChargeDetailType.md) |  |  [optional] |



