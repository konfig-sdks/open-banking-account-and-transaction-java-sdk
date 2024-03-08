

# OtherFeesChargesPropertyInner

Contains details of fees and charges which are not associated with either Overdraft or features/benefits

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**feeChargeCap** | [**List&lt;FeeChargeCapPropertyInner&gt;**](FeeChargeCapPropertyInner.md) | Details about any caps (maximum charges) that apply to a particular or group of fee/charge |  [optional] |
|**feeChargeDetail** | [**List&lt;FeeChargeDetailPropertyInner&gt;**](FeeChargeDetailPropertyInner.md) | Other fees/charges details |  |
|**otherTariffType** | [**OtherTariffTypeProperty**](OtherTariffTypeProperty.md) |  |  [optional] |
|**tariffName** | **String** | Name of the tariff |  [optional] |
|**tariffType** | [**TariffTypeEnum**](#TariffTypeEnum) | TariffType which defines the fee and charges. |  [optional] |



## Enum: TariffTypeEnum

| Name | Value |
|---- | -----|
| ELECTRONIC | &quot;Electronic&quot; |
| MIXED | &quot;Mixed&quot; |
| OTHER | &quot;Other&quot; |



