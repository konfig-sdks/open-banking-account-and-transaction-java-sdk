

# OverdraftFeeChargeDetailPropertyInner1

Details about the fees/charges

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**applicationFrequency** | [**ApplicationFrequencyEnum**](#ApplicationFrequencyEnum) | Frequency at which the overdraft charge is applied to the account |  |
|**calculationFrequency** | [**CalculationFrequencyEnum**](#CalculationFrequencyEnum) | How often is the overdraft fee/charge calculated for the account. |  [optional] |
|**feeAmount** | **String** | Amount charged for an overdraft fee/charge (where it is charged in terms of an amount rather than a rate) |  [optional] |
|**feeRate** | **String** | Rate charged for overdraft fee/charge (where it is charged in terms of a rate rather than an amount) |  [optional] |
|**feeRateType** | [**FeeRateTypeEnum**](#FeeRateTypeEnum) | Rate type for overdraft fee/charge (where it is charged in terms of a rate rather than an amount) |  [optional] |
|**feeType** | [**FeeTypeEnum**](#FeeTypeEnum) | Overdraft fee type |  |
|**incrementalBorrowingAmount** | **String** | Every additional tranche of an overdraft balance to which an overdraft fee is applied |  [optional] |
|**notes** | **List&lt;String&gt;** | Free text for capturing any other info related to Overdraft Fees Charge Details |  [optional] |
|**otherApplicationFrequency** | [**OtherApplicationFrequencyProperty**](OtherApplicationFrequencyProperty.md) |  |  [optional] |
|**otherCalculationFrequency** | [**OtherCalculationFrequencyProperty**](OtherCalculationFrequencyProperty.md) |  |  [optional] |
|**otherFeeRateType** | [**OtherFeeRateTypeProperty1**](OtherFeeRateTypeProperty1.md) |  |  [optional] |
|**otherFeeType** | [**OtherFeeTypeProperty1**](OtherFeeTypeProperty1.md) |  |  [optional] |
|**overdraftControlIndicator** | **Boolean** | Specifies for the overdraft control feature/benefit |  [optional] |
|**overdraftFeeChargeCap** | [**OverdraftFeeChargeCapProperty**](OverdraftFeeChargeCapProperty.md) |  |  [optional] |



## Enum: ApplicationFrequencyEnum

| Name | Value |
|---- | -----|
| ACCOUNTCLOSING | &quot;AccountClosing&quot; |
| ACCOUNTOPENING | &quot;AccountOpening&quot; |
| ACADEMICTERM | &quot;AcademicTerm&quot; |
| CHARGINGPERIOD | &quot;ChargingPeriod&quot; |
| DAILY | &quot;Daily&quot; |
| PERITEM | &quot;PerItem&quot; |
| MONTHLY | &quot;Monthly&quot; |
| ONACCOUNTANNIVERSARY | &quot;OnAccountAnniversary&quot; |
| OTHER | &quot;Other&quot; |
| PERHOUR | &quot;PerHour&quot; |
| PEROCCURRENCE | &quot;PerOccurrence&quot; |
| PERSHEET | &quot;PerSheet&quot; |
| PERTRANSACTION | &quot;PerTransaction&quot; |
| PERTRANSACTIONAMOUNT | &quot;PerTransactionAmount&quot; |
| PERTRANSACTIONPERCENTAGE | &quot;PerTransactionPercentage&quot; |
| QUARTERLY | &quot;Quarterly&quot; |
| SIXMONTHLY | &quot;SixMonthly&quot; |
| STATEMENTMONTHLY | &quot;StatementMonthly&quot; |
| WEEKLY | &quot;Weekly&quot; |
| YEARLY | &quot;Yearly&quot; |



## Enum: CalculationFrequencyEnum

| Name | Value |
|---- | -----|
| ACCOUNTCLOSING | &quot;AccountClosing&quot; |
| ACCOUNTOPENING | &quot;AccountOpening&quot; |
| ACADEMICTERM | &quot;AcademicTerm&quot; |
| CHARGINGPERIOD | &quot;ChargingPeriod&quot; |
| DAILY | &quot;Daily&quot; |
| PERITEM | &quot;PerItem&quot; |
| MONTHLY | &quot;Monthly&quot; |
| ONACCOUNTANNIVERSARY | &quot;OnAccountAnniversary&quot; |
| OTHER | &quot;Other&quot; |
| PERHOUR | &quot;PerHour&quot; |
| PEROCCURRENCE | &quot;PerOccurrence&quot; |
| PERSHEET | &quot;PerSheet&quot; |
| PERTRANSACTION | &quot;PerTransaction&quot; |
| PERTRANSACTIONAMOUNT | &quot;PerTransactionAmount&quot; |
| PERTRANSACTIONPERCENTAGE | &quot;PerTransactionPercentage&quot; |
| QUARTERLY | &quot;Quarterly&quot; |
| SIXMONTHLY | &quot;SixMonthly&quot; |
| STATEMENTMONTHLY | &quot;StatementMonthly&quot; |
| WEEKLY | &quot;Weekly&quot; |
| YEARLY | &quot;Yearly&quot; |



## Enum: FeeRateTypeEnum

| Name | Value |
|---- | -----|
| LINKEDBASERATE | &quot;LinkedBaseRate&quot; |
| GROSS | &quot;Gross&quot; |
| NET | &quot;Net&quot; |
| OTHER | &quot;Other&quot; |



## Enum: FeeTypeEnum

| Name | Value |
|---- | -----|
| ARRANGEDOVERDRAFT | &quot;ArrangedOverdraft&quot; |
| EMERGENCYBORROWING | &quot;EmergencyBorrowing&quot; |
| BORROWINGITEM | &quot;BorrowingItem&quot; |
| OVERDRAFTRENEWAL | &quot;OverdraftRenewal&quot; |
| ANNUALREVIEW | &quot;AnnualReview&quot; |
| OVERDRAFTSETUP | &quot;OverdraftSetup&quot; |
| SURCHARGE | &quot;Surcharge&quot; |
| TEMPOVERDRAFT | &quot;TempOverdraft&quot; |
| UNAUTHORISEDBORROWING | &quot;UnauthorisedBorrowing&quot; |
| UNAUTHORISEDPAIDTRANS | &quot;UnauthorisedPaidTrans&quot; |
| OTHER | &quot;Other&quot; |
| UNAUTHORISEDUNPAIDTRANS | &quot;UnauthorisedUnpaidTrans&quot; |



