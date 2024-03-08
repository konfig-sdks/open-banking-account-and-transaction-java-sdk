

# OBReadProduct2DataProductInner

Product details associated with the Account

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** | A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner. |  |
|**BCA** | [**OBBCAData1**](OBBCAData1.md) |  |  [optional] |
|**marketingStateId** | **String** | Unique and unambiguous identification of a  Product Marketing State. |  [optional] |
|**otherProductType** | [**OBReadProduct2DataProductInnerOtherProductType**](OBReadProduct2DataProductInnerOtherProductType.md) |  |  [optional] |
|**PCA** | [**OBPCAData1**](OBPCAData1.md) |  |  [optional] |
|**productId** | **String** | The unique ID that has been internally assigned by the financial institution to each of the current account banking products they market to their retail and/or small to medium enterprise (SME) customers. |  [optional] |
|**productName** | **String** | The name of the Product used for marketing purposes from a customer perspective. I.e. what the customer would recognise. |  [optional] |
|**productType** | [**ProductTypeEnum**](#ProductTypeEnum) | Product type : Personal Current Account, Business Current Account |  |
|**secondaryProductId** | **String** | Any secondary Identification which  supports Product Identifier to uniquely identify the current account banking products. |  [optional] |



## Enum: ProductTypeEnum

| Name | Value |
|---- | -----|
| BUSINESSCURRENTACCOUNT | &quot;BusinessCurrentAccount&quot; |
| COMMERCIALCREDITCARD | &quot;CommercialCreditCard&quot; |
| OTHER | &quot;Other&quot; |
| PERSONALCURRENTACCOUNT | &quot;PersonalCurrentAccount&quot; |
| SMELOAN | &quot;SMELoan&quot; |



