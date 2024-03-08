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
 * Details of capital repayment holiday if any
 */
@ApiModel(description = "Details of capital repayment holiday if any")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner {
  public static final String SERIALIZED_NAME_MAX_HOLIDAY_LENGTH = "MaxHolidayLength";
  @SerializedName(SERIALIZED_NAME_MAX_HOLIDAY_LENGTH)
  private Integer maxHolidayLength;

  /**
   * The unit of period (days, weeks, months etc.) of the repayment holiday
   */
  @JsonAdapter(MaxHolidayPeriodEnum.Adapter.class)
 public enum MaxHolidayPeriodEnum {
    PACT("PACT"),
    
    PDAY("PDAY"),
    
    PHYR("PHYR"),
    
    PMTH("PMTH"),
    
    PQTR("PQTR"),
    
    PWEK("PWEK"),
    
    PYER("PYER");

    private String value;

    MaxHolidayPeriodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MaxHolidayPeriodEnum fromValue(String value) {
      for (MaxHolidayPeriodEnum b : MaxHolidayPeriodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MaxHolidayPeriodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MaxHolidayPeriodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MaxHolidayPeriodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MaxHolidayPeriodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MAX_HOLIDAY_PERIOD = "MaxHolidayPeriod";
  @SerializedName(SERIALIZED_NAME_MAX_HOLIDAY_PERIOD)
  private MaxHolidayPeriodEnum maxHolidayPeriod;

  public static final String SERIALIZED_NAME_NOTES = "Notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private List<String> notes = null;

  public OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner() {
  }

  public OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner maxHolidayLength(Integer maxHolidayLength) {
    
    
    
    
    this.maxHolidayLength = maxHolidayLength;
    return this;
  }

   /**
   * The maximum length/duration of a Repayment Holiday
   * @return maxHolidayLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum length/duration of a Repayment Holiday")

  public Integer getMaxHolidayLength() {
    return maxHolidayLength;
  }


  public void setMaxHolidayLength(Integer maxHolidayLength) {
    
    
    
    this.maxHolidayLength = maxHolidayLength;
  }


  public OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner maxHolidayPeriod(MaxHolidayPeriodEnum maxHolidayPeriod) {
    
    
    
    
    this.maxHolidayPeriod = maxHolidayPeriod;
    return this;
  }

   /**
   * The unit of period (days, weeks, months etc.) of the repayment holiday
   * @return maxHolidayPeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unit of period (days, weeks, months etc.) of the repayment holiday")

  public MaxHolidayPeriodEnum getMaxHolidayPeriod() {
    return maxHolidayPeriod;
  }


  public void setMaxHolidayPeriod(MaxHolidayPeriodEnum maxHolidayPeriod) {
    
    
    
    this.maxHolidayPeriod = maxHolidayPeriod;
  }


  public OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner notes(List<String> notes) {
    
    
    
    
    this.notes = notes;
    return this;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner addNotesItem(String notesItem) {
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
   * @return the OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner instance itself
   */
  public OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner putAdditionalProperty(String key, Object value) {
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
    OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner obReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner = (OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner) o;
    return Objects.equals(this.maxHolidayLength, obReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner.maxHolidayLength) &&
        Objects.equals(this.maxHolidayPeriod, obReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner.maxHolidayPeriod) &&
        Objects.equals(this.notes, obReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner.notes)&&
        Objects.equals(this.additionalProperties, obReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxHolidayLength, maxHolidayPeriod, notes, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner {\n");
    sb.append("    maxHolidayLength: ").append(toIndentedString(maxHolidayLength)).append("\n");
    sb.append("    maxHolidayPeriod: ").append(toIndentedString(maxHolidayPeriod)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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
    openapiFields.add("MaxHolidayLength");
    openapiFields.add("MaxHolidayPeriod");
    openapiFields.add("Notes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner is not found in the empty JSON string", OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("MaxHolidayPeriod") != null && !jsonObj.get("MaxHolidayPeriod").isJsonNull()) && !jsonObj.get("MaxHolidayPeriod").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MaxHolidayPeriod` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MaxHolidayPeriod").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("Notes") != null && !jsonObj.get("Notes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Notes` to be an array in the JSON string but got `%s`", jsonObj.get("Notes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner.class));

       return (TypeAdapter<T>) new TypeAdapter<OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner>() {
           @Override
           public void write(JsonWriter out, OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner value) throws IOException {
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
           public OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner
  * @throws IOException if the JSON string is invalid with respect to OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner
  */
  public static OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner.class);
  }

 /**
  * Convert an instance of OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

