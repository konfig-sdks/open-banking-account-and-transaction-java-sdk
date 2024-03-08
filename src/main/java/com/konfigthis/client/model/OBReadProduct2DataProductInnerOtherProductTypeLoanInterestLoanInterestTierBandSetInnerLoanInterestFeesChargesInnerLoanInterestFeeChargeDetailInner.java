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
import com.konfigthis.client.model.OBFeeFrequency1Code2;
import com.konfigthis.client.model.OBFeeFrequency1Code3;
import com.konfigthis.client.model.OBFeeType1Code;
import com.konfigthis.client.model.OBInterestRateType1Code1;
import com.konfigthis.client.model.OBOtherCodeType15;
import com.konfigthis.client.model.OBOtherCodeType16;
import com.konfigthis.client.model.OBOtherCodeType17;
import com.konfigthis.client.model.OBOtherFeeChargeDetailType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * Other fees/charges details
 */
@ApiModel(description = "Other fees/charges details")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner {
  public static final String SERIALIZED_NAME_APPLICATION_FREQUENCY = "ApplicationFrequency";
  @SerializedName(SERIALIZED_NAME_APPLICATION_FREQUENCY)
  private OBFeeFrequency1Code2 applicationFrequency;

  public static final String SERIALIZED_NAME_CALCULATION_FREQUENCY = "CalculationFrequency";
  @SerializedName(SERIALIZED_NAME_CALCULATION_FREQUENCY)
  private OBFeeFrequency1Code3 calculationFrequency;

  public static final String SERIALIZED_NAME_FEE_AMOUNT = "FeeAmount";
  @SerializedName(SERIALIZED_NAME_FEE_AMOUNT)
  private String feeAmount;

  public static final String SERIALIZED_NAME_FEE_RATE = "FeeRate";
  @SerializedName(SERIALIZED_NAME_FEE_RATE)
  private String feeRate;

  public static final String SERIALIZED_NAME_FEE_RATE_TYPE = "FeeRateType";
  @SerializedName(SERIALIZED_NAME_FEE_RATE_TYPE)
  private OBInterestRateType1Code1 feeRateType;

  public static final String SERIALIZED_NAME_FEE_TYPE = "FeeType";
  @SerializedName(SERIALIZED_NAME_FEE_TYPE)
  private OBFeeType1Code feeType;

  public static final String SERIALIZED_NAME_NEGOTIABLE_INDICATOR = "NegotiableIndicator";
  @SerializedName(SERIALIZED_NAME_NEGOTIABLE_INDICATOR)
  private Boolean negotiableIndicator;

  public static final String SERIALIZED_NAME_NOTES = "Notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private List<String> notes = null;

  public static final String SERIALIZED_NAME_OTHER_APPLICATION_FREQUENCY = "OtherApplicationFrequency";
  @SerializedName(SERIALIZED_NAME_OTHER_APPLICATION_FREQUENCY)
  private OBOtherCodeType16 otherApplicationFrequency;

  public static final String SERIALIZED_NAME_OTHER_CALCULATION_FREQUENCY = "OtherCalculationFrequency";
  @SerializedName(SERIALIZED_NAME_OTHER_CALCULATION_FREQUENCY)
  private OBOtherCodeType17 otherCalculationFrequency;

  public static final String SERIALIZED_NAME_OTHER_FEE_RATE_TYPE = "OtherFeeRateType";
  @SerializedName(SERIALIZED_NAME_OTHER_FEE_RATE_TYPE)
  private OBOtherCodeType15 otherFeeRateType;

  public static final String SERIALIZED_NAME_OTHER_FEE_TYPE = "OtherFeeType";
  @SerializedName(SERIALIZED_NAME_OTHER_FEE_TYPE)
  private OBOtherFeeChargeDetailType otherFeeType;

  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner() {
  }

  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner applicationFrequency(OBFeeFrequency1Code2 applicationFrequency) {
    
    
    
    
    this.applicationFrequency = applicationFrequency;
    return this;
  }

   /**
   * Get applicationFrequency
   * @return applicationFrequency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OBFeeFrequency1Code2 getApplicationFrequency() {
    return applicationFrequency;
  }


  public void setApplicationFrequency(OBFeeFrequency1Code2 applicationFrequency) {
    
    
    
    this.applicationFrequency = applicationFrequency;
  }


  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner calculationFrequency(OBFeeFrequency1Code3 calculationFrequency) {
    
    
    
    
    this.calculationFrequency = calculationFrequency;
    return this;
  }

   /**
   * Get calculationFrequency
   * @return calculationFrequency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OBFeeFrequency1Code3 getCalculationFrequency() {
    return calculationFrequency;
  }


  public void setCalculationFrequency(OBFeeFrequency1Code3 calculationFrequency) {
    
    
    
    this.calculationFrequency = calculationFrequency;
  }


  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner feeAmount(String feeAmount) {
    
    
    
    
    this.feeAmount = feeAmount;
    return this;
  }

   /**
   * Fee Amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)
   * @return feeAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Fee Amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)")

  public String getFeeAmount() {
    return feeAmount;
  }


  public void setFeeAmount(String feeAmount) {
    
    
    
    this.feeAmount = feeAmount;
  }


  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner feeRate(String feeRate) {
    
    
    
    
    this.feeRate = feeRate;
    return this;
  }

   /**
   * Rate charged for Fee/Charge (where it is charged in terms of a rate rather than an amount)
   * @return feeRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Rate charged for Fee/Charge (where it is charged in terms of a rate rather than an amount)")

  public String getFeeRate() {
    return feeRate;
  }


  public void setFeeRate(String feeRate) {
    
    
    
    this.feeRate = feeRate;
  }


  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner feeRateType(OBInterestRateType1Code1 feeRateType) {
    
    
    
    
    this.feeRateType = feeRateType;
    return this;
  }

   /**
   * Get feeRateType
   * @return feeRateType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OBInterestRateType1Code1 getFeeRateType() {
    return feeRateType;
  }


  public void setFeeRateType(OBInterestRateType1Code1 feeRateType) {
    
    
    
    this.feeRateType = feeRateType;
  }


  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner feeType(OBFeeType1Code feeType) {
    
    
    
    
    this.feeType = feeType;
    return this;
  }

   /**
   * Get feeType
   * @return feeType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OBFeeType1Code getFeeType() {
    return feeType;
  }


  public void setFeeType(OBFeeType1Code feeType) {
    
    
    
    this.feeType = feeType;
  }


  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner negotiableIndicator(Boolean negotiableIndicator) {
    
    
    
    
    this.negotiableIndicator = negotiableIndicator;
    return this;
  }

   /**
   * Fee/charge which is usually negotiable rather than a fixed amount
   * @return negotiableIndicator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Fee/charge which is usually negotiable rather than a fixed amount")

  public Boolean getNegotiableIndicator() {
    return negotiableIndicator;
  }


  public void setNegotiableIndicator(Boolean negotiableIndicator) {
    
    
    
    this.negotiableIndicator = negotiableIndicator;
  }


  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner notes(List<String> notes) {
    
    
    
    
    this.notes = notes;
    return this;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

   /**
   * Get notes
   * @return notes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getNotes() {
    return notes;
  }


  public void setNotes(List<String> notes) {
    
    
    
    this.notes = notes;
  }


  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner otherApplicationFrequency(OBOtherCodeType16 otherApplicationFrequency) {
    
    
    
    
    this.otherApplicationFrequency = otherApplicationFrequency;
    return this;
  }

   /**
   * Get otherApplicationFrequency
   * @return otherApplicationFrequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OBOtherCodeType16 getOtherApplicationFrequency() {
    return otherApplicationFrequency;
  }


  public void setOtherApplicationFrequency(OBOtherCodeType16 otherApplicationFrequency) {
    
    
    
    this.otherApplicationFrequency = otherApplicationFrequency;
  }


  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner otherCalculationFrequency(OBOtherCodeType17 otherCalculationFrequency) {
    
    
    
    
    this.otherCalculationFrequency = otherCalculationFrequency;
    return this;
  }

   /**
   * Get otherCalculationFrequency
   * @return otherCalculationFrequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OBOtherCodeType17 getOtherCalculationFrequency() {
    return otherCalculationFrequency;
  }


  public void setOtherCalculationFrequency(OBOtherCodeType17 otherCalculationFrequency) {
    
    
    
    this.otherCalculationFrequency = otherCalculationFrequency;
  }


  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner otherFeeRateType(OBOtherCodeType15 otherFeeRateType) {
    
    
    
    
    this.otherFeeRateType = otherFeeRateType;
    return this;
  }

   /**
   * Get otherFeeRateType
   * @return otherFeeRateType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OBOtherCodeType15 getOtherFeeRateType() {
    return otherFeeRateType;
  }


  public void setOtherFeeRateType(OBOtherCodeType15 otherFeeRateType) {
    
    
    
    this.otherFeeRateType = otherFeeRateType;
  }


  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner otherFeeType(OBOtherFeeChargeDetailType otherFeeType) {
    
    
    
    
    this.otherFeeType = otherFeeType;
    return this;
  }

   /**
   * Get otherFeeType
   * @return otherFeeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OBOtherFeeChargeDetailType getOtherFeeType() {
    return otherFeeType;
  }


  public void setOtherFeeType(OBOtherFeeChargeDetailType otherFeeType) {
    
    
    
    this.otherFeeType = otherFeeType;
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
   * @return the OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner instance itself
   */
  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner putAdditionalProperty(String key, Object value) {
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
    OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner obReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner = (OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner) o;
    return Objects.equals(this.applicationFrequency, obReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner.applicationFrequency) &&
        Objects.equals(this.calculationFrequency, obReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner.calculationFrequency) &&
        Objects.equals(this.feeAmount, obReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner.feeAmount) &&
        Objects.equals(this.feeRate, obReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner.feeRate) &&
        Objects.equals(this.feeRateType, obReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner.feeRateType) &&
        Objects.equals(this.feeType, obReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner.feeType) &&
        Objects.equals(this.negotiableIndicator, obReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner.negotiableIndicator) &&
        Objects.equals(this.notes, obReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner.notes) &&
        Objects.equals(this.otherApplicationFrequency, obReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner.otherApplicationFrequency) &&
        Objects.equals(this.otherCalculationFrequency, obReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner.otherCalculationFrequency) &&
        Objects.equals(this.otherFeeRateType, obReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner.otherFeeRateType) &&
        Objects.equals(this.otherFeeType, obReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner.otherFeeType)&&
        Objects.equals(this.additionalProperties, obReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationFrequency, calculationFrequency, feeAmount, feeRate, feeRateType, feeType, negotiableIndicator, notes, otherApplicationFrequency, otherCalculationFrequency, otherFeeRateType, otherFeeType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner {\n");
    sb.append("    applicationFrequency: ").append(toIndentedString(applicationFrequency)).append("\n");
    sb.append("    calculationFrequency: ").append(toIndentedString(calculationFrequency)).append("\n");
    sb.append("    feeAmount: ").append(toIndentedString(feeAmount)).append("\n");
    sb.append("    feeRate: ").append(toIndentedString(feeRate)).append("\n");
    sb.append("    feeRateType: ").append(toIndentedString(feeRateType)).append("\n");
    sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
    sb.append("    negotiableIndicator: ").append(toIndentedString(negotiableIndicator)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    otherApplicationFrequency: ").append(toIndentedString(otherApplicationFrequency)).append("\n");
    sb.append("    otherCalculationFrequency: ").append(toIndentedString(otherCalculationFrequency)).append("\n");
    sb.append("    otherFeeRateType: ").append(toIndentedString(otherFeeRateType)).append("\n");
    sb.append("    otherFeeType: ").append(toIndentedString(otherFeeType)).append("\n");
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
    openapiFields.add("ApplicationFrequency");
    openapiFields.add("CalculationFrequency");
    openapiFields.add("FeeAmount");
    openapiFields.add("FeeRate");
    openapiFields.add("FeeRateType");
    openapiFields.add("FeeType");
    openapiFields.add("NegotiableIndicator");
    openapiFields.add("Notes");
    openapiFields.add("OtherApplicationFrequency");
    openapiFields.add("OtherCalculationFrequency");
    openapiFields.add("OtherFeeRateType");
    openapiFields.add("OtherFeeType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ApplicationFrequency");
    openapiRequiredFields.add("CalculationFrequency");
    openapiRequiredFields.add("FeeType");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner is not found in the empty JSON string", OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("FeeAmount") != null && !jsonObj.get("FeeAmount").isJsonNull()) && !jsonObj.get("FeeAmount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `FeeAmount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("FeeAmount").toString()));
      }
      if ((jsonObj.get("FeeRate") != null && !jsonObj.get("FeeRate").isJsonNull()) && !jsonObj.get("FeeRate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `FeeRate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("FeeRate").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("Notes") != null && !jsonObj.get("Notes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Notes` to be an array in the JSON string but got `%s`", jsonObj.get("Notes").toString()));
      }
      // validate the optional field `OtherApplicationFrequency`
      if (jsonObj.get("OtherApplicationFrequency") != null && !jsonObj.get("OtherApplicationFrequency").isJsonNull()) {
        OBOtherCodeType16.validateJsonObject(jsonObj.getAsJsonObject("OtherApplicationFrequency"));
      }
      // validate the optional field `OtherCalculationFrequency`
      if (jsonObj.get("OtherCalculationFrequency") != null && !jsonObj.get("OtherCalculationFrequency").isJsonNull()) {
        OBOtherCodeType17.validateJsonObject(jsonObj.getAsJsonObject("OtherCalculationFrequency"));
      }
      // validate the optional field `OtherFeeRateType`
      if (jsonObj.get("OtherFeeRateType") != null && !jsonObj.get("OtherFeeRateType").isJsonNull()) {
        OBOtherCodeType15.validateJsonObject(jsonObj.getAsJsonObject("OtherFeeRateType"));
      }
      // validate the optional field `OtherFeeType`
      if (jsonObj.get("OtherFeeType") != null && !jsonObj.get("OtherFeeType").isJsonNull()) {
        OBOtherFeeChargeDetailType.validateJsonObject(jsonObj.getAsJsonObject("OtherFeeType"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner.class));

       return (TypeAdapter<T>) new TypeAdapter<OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner>() {
           @Override
           public void write(JsonWriter out, OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner value) throws IOException {
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
           public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner
  * @throws IOException if the JSON string is invalid with respect to OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner
  */
  public static OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner.class);
  }

 /**
  * Convert an instance of OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

