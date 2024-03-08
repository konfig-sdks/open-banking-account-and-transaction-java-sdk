

# OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeCapInner

Details about any caps (maximum charges) that apply to a particular or group of fee/charge

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cappingPeriod** | **OBPeriod1Code** |  |  [optional] |
|**feeCapAmount** | **String** | Cap amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate) |  [optional] |
|**feeCapOccurrence** | **Integer** | fee/charges are captured dependent on the number of occurrences rather than capped at a particular amount |  [optional] |
|**feeType** | [**List&lt;FeeTypeEnum&gt;**](#List&lt;FeeTypeEnum&gt;) |  |  |
|**minMaxType** | **OBMinMaxType1Code** |  |  |
|**notes** | **List&lt;String&gt;** |  |  [optional] |
|**otherFeeType** | [**List&lt;OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInnerOtherFeeTypeInner&gt;**](OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInnerOtherFeeTypeInner.md) |  |  [optional] |



## Enum: List&lt;FeeTypeEnum&gt;

| Name | Value |
|---- | -----|
| FEPF | &quot;FEPF&quot; |
| FTOT | &quot;FTOT&quot; |
| FYAF | &quot;FYAF&quot; |
| FYAM | &quot;FYAM&quot; |
| FYAQ | &quot;FYAQ&quot; |
| FYCP | &quot;FYCP&quot; |
| FYDB | &quot;FYDB&quot; |
| FYMI | &quot;FYMI&quot; |
| FYXX | &quot;FYXX&quot; |



