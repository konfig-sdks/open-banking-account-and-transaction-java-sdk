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
import com.konfigthis.client.model.OBFeeFrequency1Code4;
import com.konfigthis.client.model.OBMinMaxType1Code;
import com.konfigthis.client.model.OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInnerOtherFeeTypeInner;
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
 * Details about any caps (minimum/maximum charges) that apply to a particular fee/charge
 */
@ApiModel(description = "Details about any caps (minimum/maximum charges) that apply to a particular fee/charge")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner {
  public static final String SERIALIZED_NAME_CAPPING_PERIOD = "CappingPeriod";
  @SerializedName(SERIALIZED_NAME_CAPPING_PERIOD)
  private OBFeeFrequency1Code4 cappingPeriod;

  public static final String SERIALIZED_NAME_FEE_CAP_AMOUNT = "FeeCapAmount";
  @SerializedName(SERIALIZED_NAME_FEE_CAP_AMOUNT)
  private String feeCapAmount;

  public static final String SERIALIZED_NAME_FEE_CAP_OCCURRENCE = "FeeCapOccurrence";
  @SerializedName(SERIALIZED_NAME_FEE_CAP_OCCURRENCE)
  private Integer feeCapOccurrence;

  /**
   * Fee/charge type which is being capped
   */
  @JsonAdapter(FeeTypeEnum.Adapter.class)
 public enum FeeTypeEnum {
    FEPF("FEPF"),
    
    FTOT("FTOT"),
    
    FYAF("FYAF"),
    
    FYAM("FYAM"),
    
    FYAQ("FYAQ"),
    
    FYCP("FYCP"),
    
    FYDB("FYDB"),
    
    FYMI("FYMI"),
    
    FYXX("FYXX");

    private String value;

    FeeTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FeeTypeEnum fromValue(String value) {
      for (FeeTypeEnum b : FeeTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FeeTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FeeTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FeeTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FeeTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FEE_TYPE = "FeeType";
  @SerializedName(SERIALIZED_NAME_FEE_TYPE)
  private List<FeeTypeEnum> feeType = new ArrayList<>();

  public static final String SERIALIZED_NAME_MIN_MAX_TYPE = "MinMaxType";
  @SerializedName(SERIALIZED_NAME_MIN_MAX_TYPE)
  private OBMinMaxType1Code minMaxType;

  public static final String SERIALIZED_NAME_NOTES = "Notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private List<String> notes = null;

  public static final String SERIALIZED_NAME_OTHER_FEE_TYPE = "OtherFeeType";
  @SerializedName(SERIALIZED_NAME_OTHER_FEE_TYPE)
  private List<OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInnerOtherFeeTypeInner> otherFeeType = null;

  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner() {
  }

  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner cappingPeriod(OBFeeFrequency1Code4 cappingPeriod) {
    
    
    
    
    this.cappingPeriod = cappingPeriod;
    return this;
  }

   /**
   * Get cappingPeriod
   * @return cappingPeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OBFeeFrequency1Code4 getCappingPeriod() {
    return cappingPeriod;
  }


  public void setCappingPeriod(OBFeeFrequency1Code4 cappingPeriod) {
    
    
    
    this.cappingPeriod = cappingPeriod;
  }


  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner feeCapAmount(String feeCapAmount) {
    
    
    
    
    this.feeCapAmount = feeCapAmount;
    return this;
  }

   /**
   * Cap amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)
   * @return feeCapAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Cap amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)")

  public String getFeeCapAmount() {
    return feeCapAmount;
  }


  public void setFeeCapAmount(String feeCapAmount) {
    
    
    
    this.feeCapAmount = feeCapAmount;
  }


  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner feeCapOccurrence(Integer feeCapOccurrence) {
    
    
    
    
    this.feeCapOccurrence = feeCapOccurrence;
    return this;
  }

   /**
   * fee/charges are captured dependent on the number of occurrences rather than capped at a particular amount
   * @return feeCapOccurrence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "fee/charges are captured dependent on the number of occurrences rather than capped at a particular amount")

  public Integer getFeeCapOccurrence() {
    return feeCapOccurrence;
  }


  public void setFeeCapOccurrence(Integer feeCapOccurrence) {
    
    
    
    this.feeCapOccurrence = feeCapOccurrence;
  }


  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner feeType(List<FeeTypeEnum> feeType) {
    
    
    
    
    this.feeType = feeType;
    return this;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner addFeeTypeItem(FeeTypeEnum feeTypeItem) {
    this.feeType.add(feeTypeItem);
    return this;
  }

   /**
   * Get feeType
   * @return feeType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<FeeTypeEnum> getFeeType() {
    return feeType;
  }


  public void setFeeType(List<FeeTypeEnum> feeType) {
    
    
    
    this.feeType = feeType;
  }


  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner minMaxType(OBMinMaxType1Code minMaxType) {
    
    
    
    
    this.minMaxType = minMaxType;
    return this;
  }

   /**
   * Get minMaxType
   * @return minMaxType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OBMinMaxType1Code getMinMaxType() {
    return minMaxType;
  }


  public void setMinMaxType(OBMinMaxType1Code minMaxType) {
    
    
    
    this.minMaxType = minMaxType;
  }


  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner notes(List<String> notes) {
    
    
    
    
    this.notes = notes;
    return this;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner addNotesItem(String notesItem) {
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


  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner otherFeeType(List<OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInnerOtherFeeTypeInner> otherFeeType) {
    
    
    
    
    this.otherFeeType = otherFeeType;
    return this;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner addOtherFeeTypeItem(OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInnerOtherFeeTypeInner otherFeeTypeItem) {
    if (this.otherFeeType == null) {
      this.otherFeeType = new ArrayList<>();
    }
    this.otherFeeType.add(otherFeeTypeItem);
    return this;
  }

   /**
   * Get otherFeeType
   * @return otherFeeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInnerOtherFeeTypeInner> getOtherFeeType() {
    return otherFeeType;
  }


  public void setOtherFeeType(List<OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInnerOtherFeeTypeInner> otherFeeType) {
    
    
    
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
   * @return the OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner instance itself
   */
  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner putAdditionalProperty(String key, Object value) {
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
    OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner obReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner = (OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner) o;
    return Objects.equals(this.cappingPeriod, obReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner.cappingPeriod) &&
        Objects.equals(this.feeCapAmount, obReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner.feeCapAmount) &&
        Objects.equals(this.feeCapOccurrence, obReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner.feeCapOccurrence) &&
        Objects.equals(this.feeType, obReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner.feeType) &&
        Objects.equals(this.minMaxType, obReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner.minMaxType) &&
        Objects.equals(this.notes, obReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner.notes) &&
        Objects.equals(this.otherFeeType, obReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner.otherFeeType)&&
        Objects.equals(this.additionalProperties, obReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cappingPeriod, feeCapAmount, feeCapOccurrence, feeType, minMaxType, notes, otherFeeType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner {\n");
    sb.append("    cappingPeriod: ").append(toIndentedString(cappingPeriod)).append("\n");
    sb.append("    feeCapAmount: ").append(toIndentedString(feeCapAmount)).append("\n");
    sb.append("    feeCapOccurrence: ").append(toIndentedString(feeCapOccurrence)).append("\n");
    sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
    sb.append("    minMaxType: ").append(toIndentedString(minMaxType)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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
    openapiFields.add("CappingPeriod");
    openapiFields.add("FeeCapAmount");
    openapiFields.add("FeeCapOccurrence");
    openapiFields.add("FeeType");
    openapiFields.add("MinMaxType");
    openapiFields.add("Notes");
    openapiFields.add("OtherFeeType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("FeeType");
    openapiRequiredFields.add("MinMaxType");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner is not found in the empty JSON string", OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("FeeCapAmount") != null && !jsonObj.get("FeeCapAmount").isJsonNull()) && !jsonObj.get("FeeCapAmount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `FeeCapAmount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("FeeCapAmount").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("FeeType") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("FeeType").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `FeeType` to be an array in the JSON string but got `%s`", jsonObj.get("FeeType").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("Notes") != null && !jsonObj.get("Notes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Notes` to be an array in the JSON string but got `%s`", jsonObj.get("Notes").toString()));
      }
      if (jsonObj.get("OtherFeeType") != null && !jsonObj.get("OtherFeeType").isJsonNull()) {
        JsonArray jsonArrayotherFeeType = jsonObj.getAsJsonArray("OtherFeeType");
        if (jsonArrayotherFeeType != null) {
          // ensure the json data is an array
          if (!jsonObj.get("OtherFeeType").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `OtherFeeType` to be an array in the JSON string but got `%s`", jsonObj.get("OtherFeeType").toString()));
          }

          // validate the optional field `OtherFeeType` (array)
          for (int i = 0; i < jsonArrayotherFeeType.size(); i++) {
            OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInnerOtherFeeTypeInner.validateJsonObject(jsonArrayotherFeeType.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner.class));

       return (TypeAdapter<T>) new TypeAdapter<OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner>() {
           @Override
           public void write(JsonWriter out, OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner value) throws IOException {
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
           public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner
  * @throws IOException if the JSON string is invalid with respect to OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner
  */
  public static OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner.class);
  }

 /**
  * Convert an instance of OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

