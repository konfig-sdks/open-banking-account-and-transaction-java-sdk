

# OverdraftTierBandPropertyInner1

Provides overdraft details for a specific tier or band

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bankGuaranteedIndicator** | **Boolean** | Indicates that a bank provides the overdraft limit up to TierValueMIn to all customers automatically |  [optional] |
|**EAR** | **String** | EAR means Effective Annual Rate and/or Equivalent Annual Rate (frequently used interchangeably), being the actual annual interest rate of an Overdraft. |  [optional] |
|**identification** | **String** | Unique and unambiguous identification of a  Tier Band for a overdraft. |  [optional] |
|**notes** | **List&lt;String&gt;** | Optional additional notes to supplement the Tier/band details |  [optional] |
|**overdraftFeesCharges** | [**List&lt;OverdraftFeesChargesPropertyInner3&gt;**](OverdraftFeesChargesPropertyInner3.md) | Overdraft fees and charges |  [optional] |
|**overdraftInterestChargingCoverage** | [**OverdraftInterestChargingCoverageEnum**](#OverdraftInterestChargingCoverageEnum) | Interest charged on whole amount or tiered/banded |  [optional] |
|**representativeAPR** | **String** | An annual percentage rate (APR) is the annual rate charged for borrowing or earned through an investment. APR is expressed as a percentage that represents the actual yearly cost of funds over the term of a loan. This includes any fees or additional costs associated with the transaction but does not take compounding into account. |  [optional] |
|**tierValueMax** | **String** | Maximum value of Overdraft Tier/Band |  [optional] |
|**tierValueMin** | **String** | Minimum value of Overdraft Tier/Band |  |



## Enum: OverdraftInterestChargingCoverageEnum

| Name | Value |
|---- | -----|
| TIERED | &quot;Tiered&quot; |
| WHOLE | &quot;Whole&quot; |



