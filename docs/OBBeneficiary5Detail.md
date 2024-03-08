

# OBBeneficiary5Detail


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** | A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner. |  [optional] |
|**beneficiaryId** | **String** | A unique and immutable identifier used to identify the beneficiary resource. This identifier has no meaning to the account owner. |  [optional] |
|**beneficiaryType** | **OBBeneficiaryType1Code** |  |  [optional] |
|**creditorAccount** | [**OBCashAccount50**](OBCashAccount50.md) |  |  |
|**creditorAgent** | [**OBBranchAndFinancialInstitutionIdentification60**](OBBranchAndFinancialInstitutionIdentification60.md) |  |  [optional] |
|**reference** | **String** | Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. Usage: If available, the initiating party should provide this reference in the structured remittance information, to enable reconciliation by the creditor upon receipt of the amount of money. If the business context requires the use of a creditor reference or a payment remit identification, and only one identifier can be passed through the end-to-end chain, the creditor&#39;s reference or payment remittance identification should be quoted in the end-to-end transaction identification. |  [optional] |
|**supplementaryData** | **Map&lt;String, Object&gt;** | Additional information that can not be captured in the structured fields and/or any other specific block. |  [optional] |



