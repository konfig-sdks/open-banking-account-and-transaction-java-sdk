

# OBReadProduct2DataProductInnerOtherProductTypeRepayment

Repayment details of the Loan product

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amountType** | [**AmountTypeEnum**](#AmountTypeEnum) | The repayment is for paying just the interest only or both interest and capital or bullet amount or balance to date etc |  [optional] |
|**notes** | **List&lt;String&gt;** |  |  [optional] |
|**otherAmountType** | [**OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherAmountType**](OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherAmountType.md) |  |  [optional] |
|**otherRepaymentFrequency** | [**OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherRepaymentFrequency**](OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherRepaymentFrequency.md) |  |  [optional] |
|**otherRepaymentType** | [**OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherRepaymentType**](OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherRepaymentType.md) |  |  [optional] |
|**repaymentFeeCharges** | [**OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeCharges**](OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeCharges.md) |  |  [optional] |
|**repaymentFrequency** | [**RepaymentFrequencyEnum**](#RepaymentFrequencyEnum) | Repayment frequency |  [optional] |
|**repaymentHoliday** | [**List&lt;OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner&gt;**](OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner.md) |  |  [optional] |
|**repaymentType** | [**RepaymentTypeEnum**](#RepaymentTypeEnum) | Repayment type |  [optional] |



## Enum: AmountTypeEnum

| Name | Value |
|---- | -----|
| RABD | &quot;RABD&quot; |
| RABL | &quot;RABL&quot; |
| RACI | &quot;RACI&quot; |
| RAFC | &quot;RAFC&quot; |
| RAIO | &quot;RAIO&quot; |
| RALT | &quot;RALT&quot; |
| USOT | &quot;USOT&quot; |



## Enum: RepaymentFrequencyEnum

| Name | Value |
|---- | -----|
| SMDA | &quot;SMDA&quot; |
| SMFL | &quot;SMFL&quot; |
| SMFO | &quot;SMFO&quot; |
| SMHY | &quot;SMHY&quot; |
| SMMO | &quot;SMMO&quot; |
| SMOT | &quot;SMOT&quot; |
| SMQU | &quot;SMQU&quot; |
| SMWE | &quot;SMWE&quot; |
| SMYE | &quot;SMYE&quot; |



## Enum: RepaymentTypeEnum

| Name | Value |
|---- | -----|
| USBA | &quot;USBA&quot; |
| USBU | &quot;USBU&quot; |
| USCI | &quot;USCI&quot; |
| USCS | &quot;USCS&quot; |
| USER | &quot;USER&quot; |
| USFA | &quot;USFA&quot; |
| USFB | &quot;USFB&quot; |
| USFI | &quot;USFI&quot; |
| USIO | &quot;USIO&quot; |
| USOT | &quot;USOT&quot; |
| USPF | &quot;USPF&quot; |
| USRW | &quot;USRW&quot; |
| USSL | &quot;USSL&quot; |



