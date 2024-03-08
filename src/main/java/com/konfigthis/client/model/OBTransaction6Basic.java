/*
 * Account and Transaction API Specification
 * Swagger for Account and Transaction API Specification
 *
 * The version of the OpenAPI document: 3.1.7
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.OBActiveOrHistoricCurrencyAndAmount10;
import com.konfigthis.client.model.OBActiveOrHistoricCurrencyAndAmount9;
import com.konfigthis.client.model.OBBankTransactionCodeStructure1;
import com.konfigthis.client.model.OBCreditDebitCode1;
import com.konfigthis.client.model.OBCurrencyExchange5;
import com.konfigthis.client.model.OBEntryStatus1Code;
import com.konfigthis.client.model.OBTransactionCardInstrument1;
import com.konfigthis.client.model.OBTransactionMutability1Code;
import com.konfigthis.client.model.ProprietaryBankTransactionCodeStructure1;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * Provides further details on an entry in the report.
 */
@ApiModel(description = "Provides further details on an entry in the report.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class OBTransaction6Basic {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "AccountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_ADDRESS_LINE = "AddressLine";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE)
  private String addressLine;

  public static final String SERIALIZED_NAME_AMOUNT = "Amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private OBActiveOrHistoricCurrencyAndAmount9 amount;

  public static final String SERIALIZED_NAME_BANK_TRANSACTION_CODE = "BankTransactionCode";
  @SerializedName(SERIALIZED_NAME_BANK_TRANSACTION_CODE)
  private OBBankTransactionCodeStructure1 bankTransactionCode;

  public static final String SERIALIZED_NAME_BOOKING_DATE_TIME = "BookingDateTime";
  @SerializedName(SERIALIZED_NAME_BOOKING_DATE_TIME)
  private OffsetDateTime bookingDateTime;

  public static final String SERIALIZED_NAME_CARD_INSTRUMENT = "CardInstrument";
  @SerializedName(SERIALIZED_NAME_CARD_INSTRUMENT)
  private OBTransactionCardInstrument1 cardInstrument;

  public static final String SERIALIZED_NAME_CHARGE_AMOUNT = "ChargeAmount";
  @SerializedName(SERIALIZED_NAME_CHARGE_AMOUNT)
  private OBActiveOrHistoricCurrencyAndAmount10 chargeAmount;

  public static final String SERIALIZED_NAME_CREDIT_DEBIT_INDICATOR = "CreditDebitIndicator";
  @SerializedName(SERIALIZED_NAME_CREDIT_DEBIT_INDICATOR)
  private OBCreditDebitCode1 creditDebitIndicator;

  public static final String SERIALIZED_NAME_CURRENCY_EXCHANGE = "CurrencyExchange";
  @SerializedName(SERIALIZED_NAME_CURRENCY_EXCHANGE)
  private OBCurrencyExchange5 currencyExchange;

  public static final String SERIALIZED_NAME_PROPRIETARY_BANK_TRANSACTION_CODE = "ProprietaryBankTransactionCode";
  @SerializedName(SERIALIZED_NAME_PROPRIETARY_BANK_TRANSACTION_CODE)
  private ProprietaryBankTransactionCodeStructure1 proprietaryBankTransactionCode;

  public static final String SERIALIZED_NAME_STATEMENT_REFERENCE = "StatementReference";
  @SerializedName(SERIALIZED_NAME_STATEMENT_REFERENCE)
  private List<String> statementReference = null;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private OBEntryStatus1Code status;

  public static final String SERIALIZED_NAME_SUPPLEMENTARY_DATA = "SupplementaryData";
  @SerializedName(SERIALIZED_NAME_SUPPLEMENTARY_DATA)
  private Map<String, Object> supplementaryData = null;

  public static final String SERIALIZED_NAME_TRANSACTION_ID = "TransactionId";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private String transactionId;

  public static final String SERIALIZED_NAME_TRANSACTION_MUTABILITY = "TransactionMutability";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_MUTABILITY)
  private OBTransactionMutability1Code transactionMutability;

  public static final String SERIALIZED_NAME_TRANSACTION_REFERENCE = "TransactionReference";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_REFERENCE)
  private String transactionReference;

  public static final String SERIALIZED_NAME_VALUE_DATE_TIME = "ValueDateTime";
  @SerializedName(SERIALIZED_NAME_VALUE_DATE_TIME)
  private OffsetDateTime valueDateTime;

  public OBTransaction6Basic() {
  }

  public OBTransaction6Basic accountId(String accountId) {
    
    
    if (accountId != null && accountId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for accountId. Length must be greater than or equal to 1.");
    }
    
    this.accountId = accountId;
    return this;
  }

   /**
   * A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.
   * @return accountId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    
    
    if (accountId != null && accountId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for accountId. Length must be greater than or equal to 1.");
    }
    this.accountId = accountId;
  }


  public OBTransaction6Basic addressLine(String addressLine) {
    
    
    if (addressLine != null && addressLine.length() < 1) {
      throw new IllegalArgumentException("Invalid value for addressLine. Length must be greater than or equal to 1.");
    }
    
    this.addressLine = addressLine;
    return this;
  }

   /**
   * Information that locates and identifies a specific address for a transaction entry, that is presented in free format text.
   * @return addressLine
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Information that locates and identifies a specific address for a transaction entry, that is presented in free format text.")

  public String getAddressLine() {
    return addressLine;
  }


  public void setAddressLine(String addressLine) {
    
    
    if (addressLine != null && addressLine.length() < 1) {
      throw new IllegalArgumentException("Invalid value for addressLine. Length must be greater than or equal to 1.");
    }
    this.addressLine = addressLine;
  }


  public OBTransaction6Basic amount(OBActiveOrHistoricCurrencyAndAmount9 amount) {
    
    
    
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OBActiveOrHistoricCurrencyAndAmount9 getAmount() {
    return amount;
  }


  public void setAmount(OBActiveOrHistoricCurrencyAndAmount9 amount) {
    
    
    
    this.amount = amount;
  }


  public OBTransaction6Basic bankTransactionCode(OBBankTransactionCodeStructure1 bankTransactionCode) {
    
    
    
    
    this.bankTransactionCode = bankTransactionCode;
    return this;
  }

   /**
   * Get bankTransactionCode
   * @return bankTransactionCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OBBankTransactionCodeStructure1 getBankTransactionCode() {
    return bankTransactionCode;
  }


  public void setBankTransactionCode(OBBankTransactionCodeStructure1 bankTransactionCode) {
    
    
    
    this.bankTransactionCode = bankTransactionCode;
  }


  public OBTransaction6Basic bookingDateTime(OffsetDateTime bookingDateTime) {
    
    
    
    
    this.bookingDateTime = bookingDateTime;
    return this;
  }

   /**
   * Date and time when a transaction entry is posted to an account on the account servicer&#39;s books. Usage: Booking date is the expected booking date, unless the status is booked, in which case it is the actual booking date.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return bookingDateTime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Date and time when a transaction entry is posted to an account on the account servicer's books. Usage: Booking date is the expected booking date, unless the status is booked, in which case it is the actual booking date.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")

  public OffsetDateTime getBookingDateTime() {
    return bookingDateTime;
  }


  public void setBookingDateTime(OffsetDateTime bookingDateTime) {
    
    
    
    this.bookingDateTime = bookingDateTime;
  }


  public OBTransaction6Basic cardInstrument(OBTransactionCardInstrument1 cardInstrument) {
    
    
    
    
    this.cardInstrument = cardInstrument;
    return this;
  }

   /**
   * Get cardInstrument
   * @return cardInstrument
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OBTransactionCardInstrument1 getCardInstrument() {
    return cardInstrument;
  }


  public void setCardInstrument(OBTransactionCardInstrument1 cardInstrument) {
    
    
    
    this.cardInstrument = cardInstrument;
  }


  public OBTransaction6Basic chargeAmount(OBActiveOrHistoricCurrencyAndAmount10 chargeAmount) {
    
    
    
    
    this.chargeAmount = chargeAmount;
    return this;
  }

   /**
   * Get chargeAmount
   * @return chargeAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OBActiveOrHistoricCurrencyAndAmount10 getChargeAmount() {
    return chargeAmount;
  }


  public void setChargeAmount(OBActiveOrHistoricCurrencyAndAmount10 chargeAmount) {
    
    
    
    this.chargeAmount = chargeAmount;
  }


  public OBTransaction6Basic creditDebitIndicator(OBCreditDebitCode1 creditDebitIndicator) {
    
    
    
    
    this.creditDebitIndicator = creditDebitIndicator;
    return this;
  }

   /**
   * Get creditDebitIndicator
   * @return creditDebitIndicator
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OBCreditDebitCode1 getCreditDebitIndicator() {
    return creditDebitIndicator;
  }


  public void setCreditDebitIndicator(OBCreditDebitCode1 creditDebitIndicator) {
    
    
    
    this.creditDebitIndicator = creditDebitIndicator;
  }


  public OBTransaction6Basic currencyExchange(OBCurrencyExchange5 currencyExchange) {
    
    
    
    
    this.currencyExchange = currencyExchange;
    return this;
  }

   /**
   * Get currencyExchange
   * @return currencyExchange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OBCurrencyExchange5 getCurrencyExchange() {
    return currencyExchange;
  }


  public void setCurrencyExchange(OBCurrencyExchange5 currencyExchange) {
    
    
    
    this.currencyExchange = currencyExchange;
  }


  public OBTransaction6Basic proprietaryBankTransactionCode(ProprietaryBankTransactionCodeStructure1 proprietaryBankTransactionCode) {
    
    
    
    
    this.proprietaryBankTransactionCode = proprietaryBankTransactionCode;
    return this;
  }

   /**
   * Get proprietaryBankTransactionCode
   * @return proprietaryBankTransactionCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProprietaryBankTransactionCodeStructure1 getProprietaryBankTransactionCode() {
    return proprietaryBankTransactionCode;
  }


  public void setProprietaryBankTransactionCode(ProprietaryBankTransactionCodeStructure1 proprietaryBankTransactionCode) {
    
    
    
    this.proprietaryBankTransactionCode = proprietaryBankTransactionCode;
  }


  public OBTransaction6Basic statementReference(List<String> statementReference) {
    
    
    
    
    this.statementReference = statementReference;
    return this;
  }

  public OBTransaction6Basic addStatementReferenceItem(String statementReferenceItem) {
    if (this.statementReference == null) {
      this.statementReference = new ArrayList<>();
    }
    this.statementReference.add(statementReferenceItem);
    return this;
  }

   /**
   * Get statementReference
   * @return statementReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getStatementReference() {
    return statementReference;
  }


  public void setStatementReference(List<String> statementReference) {
    
    
    
    this.statementReference = statementReference;
  }


  public OBTransaction6Basic status(OBEntryStatus1Code status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OBEntryStatus1Code getStatus() {
    return status;
  }


  public void setStatus(OBEntryStatus1Code status) {
    
    
    
    this.status = status;
  }


  public OBTransaction6Basic supplementaryData(Map<String, Object> supplementaryData) {
    
    
    
    
    this.supplementaryData = supplementaryData;
    return this;
  }

  public OBTransaction6Basic putSupplementaryDataItem(String key, Object supplementaryDataItem) {
    if (this.supplementaryData == null) {
      this.supplementaryData = new HashMap<>();
    }
    this.supplementaryData.put(key, supplementaryDataItem);
    return this;
  }

   /**
   * Additional information that can not be captured in the structured fields and/or any other specific block.
   * @return supplementaryData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Additional information that can not be captured in the structured fields and/or any other specific block.")

  public Map<String, Object> getSupplementaryData() {
    return supplementaryData;
  }


  public void setSupplementaryData(Map<String, Object> supplementaryData) {
    
    
    
    this.supplementaryData = supplementaryData;
  }


  public OBTransaction6Basic transactionId(String transactionId) {
    
    
    if (transactionId != null && transactionId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for transactionId. Length must be greater than or equal to 1.");
    }
    
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Unique identifier for the transaction within an servicing institution. This identifier is both unique and immutable.
   * @return transactionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier for the transaction within an servicing institution. This identifier is both unique and immutable.")

  public String getTransactionId() {
    return transactionId;
  }


  public void setTransactionId(String transactionId) {
    
    
    if (transactionId != null && transactionId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for transactionId. Length must be greater than or equal to 1.");
    }
    this.transactionId = transactionId;
  }


  public OBTransaction6Basic transactionMutability(OBTransactionMutability1Code transactionMutability) {
    
    
    
    
    this.transactionMutability = transactionMutability;
    return this;
  }

   /**
   * Get transactionMutability
   * @return transactionMutability
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OBTransactionMutability1Code getTransactionMutability() {
    return transactionMutability;
  }


  public void setTransactionMutability(OBTransactionMutability1Code transactionMutability) {
    
    
    
    this.transactionMutability = transactionMutability;
  }


  public OBTransaction6Basic transactionReference(String transactionReference) {
    
    
    if (transactionReference != null && transactionReference.length() < 1) {
      throw new IllegalArgumentException("Invalid value for transactionReference. Length must be greater than or equal to 1.");
    }
    
    this.transactionReference = transactionReference;
    return this;
  }

   /**
   * Unique reference for the transaction. This reference is optionally populated, and may as an example be the FPID in the Faster Payments context.
   * @return transactionReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique reference for the transaction. This reference is optionally populated, and may as an example be the FPID in the Faster Payments context.")

  public String getTransactionReference() {
    return transactionReference;
  }


  public void setTransactionReference(String transactionReference) {
    
    
    if (transactionReference != null && transactionReference.length() < 1) {
      throw new IllegalArgumentException("Invalid value for transactionReference. Length must be greater than or equal to 1.");
    }
    this.transactionReference = transactionReference;
  }


  public OBTransaction6Basic valueDateTime(OffsetDateTime valueDateTime) {
    
    
    
    
    this.valueDateTime = valueDateTime;
    return this;
  }

   /**
   * Date and time at which assets become available to the account owner in case of a credit entry, or cease to be available to the account owner in case of a debit transaction entry. Usage: If transaction entry status is pending and value date is present, then the value date refers to an expected/requested value date. For transaction entries subject to availability/float and for which availability information is provided, the value date must not be used. In this case the availability component identifies the number of availability days.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return valueDateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date and time at which assets become available to the account owner in case of a credit entry, or cease to be available to the account owner in case of a debit transaction entry. Usage: If transaction entry status is pending and value date is present, then the value date refers to an expected/requested value date. For transaction entries subject to availability/float and for which availability information is provided, the value date must not be used. In this case the availability component identifies the number of availability days.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")

  public OffsetDateTime getValueDateTime() {
    return valueDateTime;
  }


  public void setValueDateTime(OffsetDateTime valueDateTime) {
    
    
    
    this.valueDateTime = valueDateTime;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the OBTransaction6Basic instance itself
   */
  public OBTransaction6Basic putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBTransaction6Basic obTransaction6Basic = (OBTransaction6Basic) o;
    return Objects.equals(this.accountId, obTransaction6Basic.accountId) &&
        Objects.equals(this.addressLine, obTransaction6Basic.addressLine) &&
        Objects.equals(this.amount, obTransaction6Basic.amount) &&
        Objects.equals(this.bankTransactionCode, obTransaction6Basic.bankTransactionCode) &&
        Objects.equals(this.bookingDateTime, obTransaction6Basic.bookingDateTime) &&
        Objects.equals(this.cardInstrument, obTransaction6Basic.cardInstrument) &&
        Objects.equals(this.chargeAmount, obTransaction6Basic.chargeAmount) &&
        Objects.equals(this.creditDebitIndicator, obTransaction6Basic.creditDebitIndicator) &&
        Objects.equals(this.currencyExchange, obTransaction6Basic.currencyExchange) &&
        Objects.equals(this.proprietaryBankTransactionCode, obTransaction6Basic.proprietaryBankTransactionCode) &&
        Objects.equals(this.statementReference, obTransaction6Basic.statementReference) &&
        Objects.equals(this.status, obTransaction6Basic.status) &&
        Objects.equals(this.supplementaryData, obTransaction6Basic.supplementaryData) &&
        Objects.equals(this.transactionId, obTransaction6Basic.transactionId) &&
        Objects.equals(this.transactionMutability, obTransaction6Basic.transactionMutability) &&
        Objects.equals(this.transactionReference, obTransaction6Basic.transactionReference) &&
        Objects.equals(this.valueDateTime, obTransaction6Basic.valueDateTime)&&
        Objects.equals(this.additionalProperties, obTransaction6Basic.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, addressLine, amount, bankTransactionCode, bookingDateTime, cardInstrument, chargeAmount, creditDebitIndicator, currencyExchange, proprietaryBankTransactionCode, statementReference, status, supplementaryData, transactionId, transactionMutability, transactionReference, valueDateTime, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBTransaction6Basic {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    addressLine: ").append(toIndentedString(addressLine)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    bankTransactionCode: ").append(toIndentedString(bankTransactionCode)).append("\n");
    sb.append("    bookingDateTime: ").append(toIndentedString(bookingDateTime)).append("\n");
    sb.append("    cardInstrument: ").append(toIndentedString(cardInstrument)).append("\n");
    sb.append("    chargeAmount: ").append(toIndentedString(chargeAmount)).append("\n");
    sb.append("    creditDebitIndicator: ").append(toIndentedString(creditDebitIndicator)).append("\n");
    sb.append("    currencyExchange: ").append(toIndentedString(currencyExchange)).append("\n");
    sb.append("    proprietaryBankTransactionCode: ").append(toIndentedString(proprietaryBankTransactionCode)).append("\n");
    sb.append("    statementReference: ").append(toIndentedString(statementReference)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    supplementaryData: ").append(toIndentedString(supplementaryData)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    transactionMutability: ").append(toIndentedString(transactionMutability)).append("\n");
    sb.append("    transactionReference: ").append(toIndentedString(transactionReference)).append("\n");
    sb.append("    valueDateTime: ").append(toIndentedString(valueDateTime)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("AccountId");
    openapiFields.add("AddressLine");
    openapiFields.add("Amount");
    openapiFields.add("BankTransactionCode");
    openapiFields.add("BookingDateTime");
    openapiFields.add("CardInstrument");
    openapiFields.add("ChargeAmount");
    openapiFields.add("CreditDebitIndicator");
    openapiFields.add("CurrencyExchange");
    openapiFields.add("ProprietaryBankTransactionCode");
    openapiFields.add("StatementReference");
    openapiFields.add("Status");
    openapiFields.add("SupplementaryData");
    openapiFields.add("TransactionId");
    openapiFields.add("TransactionMutability");
    openapiFields.add("TransactionReference");
    openapiFields.add("ValueDateTime");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("AccountId");
    openapiRequiredFields.add("Amount");
    openapiRequiredFields.add("BookingDateTime");
    openapiRequiredFields.add("CreditDebitIndicator");
    openapiRequiredFields.add("Status");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OBTransaction6Basic
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OBTransaction6Basic.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OBTransaction6Basic is not found in the empty JSON string", OBTransaction6Basic.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OBTransaction6Basic.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("AccountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AccountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AccountId").toString()));
      }
      if ((jsonObj.get("AddressLine") != null && !jsonObj.get("AddressLine").isJsonNull()) && !jsonObj.get("AddressLine").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AddressLine` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AddressLine").toString()));
      }
      // validate the required field `Amount`
      OBActiveOrHistoricCurrencyAndAmount9.validateJsonObject(jsonObj.getAsJsonObject("Amount"));
      // validate the optional field `BankTransactionCode`
      if (jsonObj.get("BankTransactionCode") != null && !jsonObj.get("BankTransactionCode").isJsonNull()) {
        OBBankTransactionCodeStructure1.validateJsonObject(jsonObj.getAsJsonObject("BankTransactionCode"));
      }
      // validate the optional field `CardInstrument`
      if (jsonObj.get("CardInstrument") != null && !jsonObj.get("CardInstrument").isJsonNull()) {
        OBTransactionCardInstrument1.validateJsonObject(jsonObj.getAsJsonObject("CardInstrument"));
      }
      // validate the optional field `ChargeAmount`
      if (jsonObj.get("ChargeAmount") != null && !jsonObj.get("ChargeAmount").isJsonNull()) {
        OBActiveOrHistoricCurrencyAndAmount10.validateJsonObject(jsonObj.getAsJsonObject("ChargeAmount"));
      }
      // validate the optional field `CurrencyExchange`
      if (jsonObj.get("CurrencyExchange") != null && !jsonObj.get("CurrencyExchange").isJsonNull()) {
        OBCurrencyExchange5.validateJsonObject(jsonObj.getAsJsonObject("CurrencyExchange"));
      }
      // validate the optional field `ProprietaryBankTransactionCode`
      if (jsonObj.get("ProprietaryBankTransactionCode") != null && !jsonObj.get("ProprietaryBankTransactionCode").isJsonNull()) {
        ProprietaryBankTransactionCodeStructure1.validateJsonObject(jsonObj.getAsJsonObject("ProprietaryBankTransactionCode"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("StatementReference") != null && !jsonObj.get("StatementReference").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `StatementReference` to be an array in the JSON string but got `%s`", jsonObj.get("StatementReference").toString()));
      }
      if ((jsonObj.get("TransactionId") != null && !jsonObj.get("TransactionId").isJsonNull()) && !jsonObj.get("TransactionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TransactionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TransactionId").toString()));
      }
      if ((jsonObj.get("TransactionReference") != null && !jsonObj.get("TransactionReference").isJsonNull()) && !jsonObj.get("TransactionReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TransactionReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TransactionReference").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OBTransaction6Basic.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OBTransaction6Basic' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OBTransaction6Basic> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OBTransaction6Basic.class));

       return (TypeAdapter<T>) new TypeAdapter<OBTransaction6Basic>() {
           @Override
           public void write(JsonWriter out, OBTransaction6Basic value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public OBTransaction6Basic read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OBTransaction6Basic instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OBTransaction6Basic given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OBTransaction6Basic
  * @throws IOException if the JSON string is invalid with respect to OBTransaction6Basic
  */
  public static OBTransaction6Basic fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OBTransaction6Basic.class);
  }

 /**
  * Convert an instance of OBTransaction6Basic to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

