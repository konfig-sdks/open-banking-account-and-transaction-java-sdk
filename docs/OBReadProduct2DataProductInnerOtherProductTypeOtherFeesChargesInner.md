

# OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner

Contains details of fees and charges which are not associated with either Overdraft or features/benefits

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**feeChargeCap** | [**List&lt;OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeCapInner&gt;**](OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeCapInner.md) |  |  [optional] |
|**feeChargeDetail** | [**List&lt;OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner&gt;**](OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner.md) |  |  |
|**otherTariffType** | [**OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerOtherTariffType**](OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerOtherTariffType.md) |  |  [optional] |
|**tariffName** | **String** | Name of the tariff |  [optional] |
|**tariffType** | [**TariffTypeEnum**](#TariffTypeEnum) | TariffType which defines the fee and charges. |  [optional] |



## Enum: TariffTypeEnum

| Name | Value |
|---- | -----|
| TTEL | &quot;TTEL&quot; |
| TTMX | &quot;TTMX&quot; |
| TTOT | &quot;TTOT&quot; |



