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
import com.konfigthis.client.model.OBReadProduct2DataProductInnerOtherProductTypeCreditInterest;
import com.konfigthis.client.model.OBReadProduct2DataProductInnerOtherProductTypeLoanInterest;
import com.konfigthis.client.model.OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner;
import com.konfigthis.client.model.OBReadProduct2DataProductInnerOtherProductTypeOverdraft;
import com.konfigthis.client.model.OBReadProduct2DataProductInnerOtherProductTypeProductDetails;
import com.konfigthis.client.model.OBReadProduct2DataProductInnerOtherProductTypeRepayment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
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
 * Other product type details associated with the account.
 */
@ApiModel(description = "Other product type details associated with the account.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class OBReadProduct2DataProductInnerOtherProductType {
  public static final String SERIALIZED_NAME_CREDIT_INTEREST = "CreditInterest";
  @SerializedName(SERIALIZED_NAME_CREDIT_INTEREST)
  private OBReadProduct2DataProductInnerOtherProductTypeCreditInterest creditInterest;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_LOAN_INTEREST = "LoanInterest";
  @SerializedName(SERIALIZED_NAME_LOAN_INTEREST)
  private OBReadProduct2DataProductInnerOtherProductTypeLoanInterest loanInterest;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OTHER_FEES_CHARGES = "OtherFeesCharges";
  @SerializedName(SERIALIZED_NAME_OTHER_FEES_CHARGES)
  private List<OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner> otherFeesCharges = null;

  public static final String SERIALIZED_NAME_OVERDRAFT = "Overdraft";
  @SerializedName(SERIALIZED_NAME_OVERDRAFT)
  private OBReadProduct2DataProductInnerOtherProductTypeOverdraft overdraft;

  public static final String SERIALIZED_NAME_PRODUCT_DETAILS = "ProductDetails";
  @SerializedName(SERIALIZED_NAME_PRODUCT_DETAILS)
  private OBReadProduct2DataProductInnerOtherProductTypeProductDetails productDetails;

  public static final String SERIALIZED_NAME_REPAYMENT = "Repayment";
  @SerializedName(SERIALIZED_NAME_REPAYMENT)
  private OBReadProduct2DataProductInnerOtherProductTypeRepayment repayment;

  public static final String SERIALIZED_NAME_SUPPLEMENTARY_DATA = "SupplementaryData";
  @SerializedName(SERIALIZED_NAME_SUPPLEMENTARY_DATA)
  private Map<String, Object> supplementaryData = null;

  public OBReadProduct2DataProductInnerOtherProductType() {
  }

  public OBReadProduct2DataProductInnerOtherProductType creditInterest(OBReadProduct2DataProductInnerOtherProductTypeCreditInterest creditInterest) {
    
    
    
    
    this.creditInterest = creditInterest;
    return this;
  }

   /**
   * Get creditInterest
   * @return creditInterest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OBReadProduct2DataProductInnerOtherProductTypeCreditInterest getCreditInterest() {
    return creditInterest;
  }


  public void setCreditInterest(OBReadProduct2DataProductInnerOtherProductTypeCreditInterest creditInterest) {
    
    
    
    this.creditInterest = creditInterest;
  }


  public OBReadProduct2DataProductInnerOtherProductType description(String description) {
    
    
    if (description != null && description.length() < 1) {
      throw new IllegalArgumentException("Invalid value for description. Length must be greater than or equal to 1.");
    }
    
    this.description = description;
    return this;
  }

   /**
   * Description of the Product associated with the account
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Description of the Product associated with the account")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    if (description != null && description.length() < 1) {
      throw new IllegalArgumentException("Invalid value for description. Length must be greater than or equal to 1.");
    }
    this.description = description;
  }


  public OBReadProduct2DataProductInnerOtherProductType loanInterest(OBReadProduct2DataProductInnerOtherProductTypeLoanInterest loanInterest) {
    
    
    
    
    this.loanInterest = loanInterest;
    return this;
  }

   /**
   * Get loanInterest
   * @return loanInterest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterest getLoanInterest() {
    return loanInterest;
  }


  public void setLoanInterest(OBReadProduct2DataProductInnerOtherProductTypeLoanInterest loanInterest) {
    
    
    
    this.loanInterest = loanInterest;
  }


  public OBReadProduct2DataProductInnerOtherProductType name(String name) {
    
    
    if (name != null && name.length() < 1) {
      throw new IllegalArgumentException("Invalid value for name. Length must be greater than or equal to 1.");
    }
    
    this.name = name;
    return this;
  }

   /**
   * Long name associated with the product
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Long name associated with the product")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    if (name != null && name.length() < 1) {
      throw new IllegalArgumentException("Invalid value for name. Length must be greater than or equal to 1.");
    }
    this.name = name;
  }


  public OBReadProduct2DataProductInnerOtherProductType otherFeesCharges(List<OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner> otherFeesCharges) {
    
    
    
    
    this.otherFeesCharges = otherFeesCharges;
    return this;
  }

  public OBReadProduct2DataProductInnerOtherProductType addOtherFeesChargesItem(OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner otherFeesChargesItem) {
    if (this.otherFeesCharges == null) {
      this.otherFeesCharges = new ArrayList<>();
    }
    this.otherFeesCharges.add(otherFeesChargesItem);
    return this;
  }

   /**
   * Get otherFeesCharges
   * @return otherFeesCharges
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner> getOtherFeesCharges() {
    return otherFeesCharges;
  }


  public void setOtherFeesCharges(List<OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner> otherFeesCharges) {
    
    
    
    this.otherFeesCharges = otherFeesCharges;
  }


  public OBReadProduct2DataProductInnerOtherProductType overdraft(OBReadProduct2DataProductInnerOtherProductTypeOverdraft overdraft) {
    
    
    
    
    this.overdraft = overdraft;
    return this;
  }

   /**
   * Get overdraft
   * @return overdraft
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OBReadProduct2DataProductInnerOtherProductTypeOverdraft getOverdraft() {
    return overdraft;
  }


  public void setOverdraft(OBReadProduct2DataProductInnerOtherProductTypeOverdraft overdraft) {
    
    
    
    this.overdraft = overdraft;
  }


  public OBReadProduct2DataProductInnerOtherProductType productDetails(OBReadProduct2DataProductInnerOtherProductTypeProductDetails productDetails) {
    
    
    
    
    this.productDetails = productDetails;
    return this;
  }

   /**
   * Get productDetails
   * @return productDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OBReadProduct2DataProductInnerOtherProductTypeProductDetails getProductDetails() {
    return productDetails;
  }


  public void setProductDetails(OBReadProduct2DataProductInnerOtherProductTypeProductDetails productDetails) {
    
    
    
    this.productDetails = productDetails;
  }


  public OBReadProduct2DataProductInnerOtherProductType repayment(OBReadProduct2DataProductInnerOtherProductTypeRepayment repayment) {
    
    
    
    
    this.repayment = repayment;
    return this;
  }

   /**
   * Get repayment
   * @return repayment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OBReadProduct2DataProductInnerOtherProductTypeRepayment getRepayment() {
    return repayment;
  }


  public void setRepayment(OBReadProduct2DataProductInnerOtherProductTypeRepayment repayment) {
    
    
    
    this.repayment = repayment;
  }


  public OBReadProduct2DataProductInnerOtherProductType supplementaryData(Map<String, Object> supplementaryData) {
    
    
    
    
    this.supplementaryData = supplementaryData;
    return this;
  }

  public OBReadProduct2DataProductInnerOtherProductType putSupplementaryDataItem(String key, Object supplementaryDataItem) {
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
   * @return the OBReadProduct2DataProductInnerOtherProductType instance itself
   */
  public OBReadProduct2DataProductInnerOtherProductType putAdditionalProperty(String key, Object value) {
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
    OBReadProduct2DataProductInnerOtherProductType obReadProduct2DataProductInnerOtherProductType = (OBReadProduct2DataProductInnerOtherProductType) o;
    return Objects.equals(this.creditInterest, obReadProduct2DataProductInnerOtherProductType.creditInterest) &&
        Objects.equals(this.description, obReadProduct2DataProductInnerOtherProductType.description) &&
        Objects.equals(this.loanInterest, obReadProduct2DataProductInnerOtherProductType.loanInterest) &&
        Objects.equals(this.name, obReadProduct2DataProductInnerOtherProductType.name) &&
        Objects.equals(this.otherFeesCharges, obReadProduct2DataProductInnerOtherProductType.otherFeesCharges) &&
        Objects.equals(this.overdraft, obReadProduct2DataProductInnerOtherProductType.overdraft) &&
        Objects.equals(this.productDetails, obReadProduct2DataProductInnerOtherProductType.productDetails) &&
        Objects.equals(this.repayment, obReadProduct2DataProductInnerOtherProductType.repayment) &&
        Objects.equals(this.supplementaryData, obReadProduct2DataProductInnerOtherProductType.supplementaryData)&&
        Objects.equals(this.additionalProperties, obReadProduct2DataProductInnerOtherProductType.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditInterest, description, loanInterest, name, otherFeesCharges, overdraft, productDetails, repayment, supplementaryData, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataProductInnerOtherProductType {\n");
    sb.append("    creditInterest: ").append(toIndentedString(creditInterest)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    loanInterest: ").append(toIndentedString(loanInterest)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    otherFeesCharges: ").append(toIndentedString(otherFeesCharges)).append("\n");
    sb.append("    overdraft: ").append(toIndentedString(overdraft)).append("\n");
    sb.append("    productDetails: ").append(toIndentedString(productDetails)).append("\n");
    sb.append("    repayment: ").append(toIndentedString(repayment)).append("\n");
    sb.append("    supplementaryData: ").append(toIndentedString(supplementaryData)).append("\n");
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
    openapiFields.add("CreditInterest");
    openapiFields.add("Description");
    openapiFields.add("LoanInterest");
    openapiFields.add("Name");
    openapiFields.add("OtherFeesCharges");
    openapiFields.add("Overdraft");
    openapiFields.add("ProductDetails");
    openapiFields.add("Repayment");
    openapiFields.add("SupplementaryData");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Description");
    openapiRequiredFields.add("Name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OBReadProduct2DataProductInnerOtherProductType
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OBReadProduct2DataProductInnerOtherProductType.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OBReadProduct2DataProductInnerOtherProductType is not found in the empty JSON string", OBReadProduct2DataProductInnerOtherProductType.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OBReadProduct2DataProductInnerOtherProductType.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `CreditInterest`
      if (jsonObj.get("CreditInterest") != null && !jsonObj.get("CreditInterest").isJsonNull()) {
        OBReadProduct2DataProductInnerOtherProductTypeCreditInterest.validateJsonObject(jsonObj.getAsJsonObject("CreditInterest"));
      }
      if (!jsonObj.get("Description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Description").toString()));
      }
      // validate the optional field `LoanInterest`
      if (jsonObj.get("LoanInterest") != null && !jsonObj.get("LoanInterest").isJsonNull()) {
        OBReadProduct2DataProductInnerOtherProductTypeLoanInterest.validateJsonObject(jsonObj.getAsJsonObject("LoanInterest"));
      }
      if (!jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      if (jsonObj.get("OtherFeesCharges") != null && !jsonObj.get("OtherFeesCharges").isJsonNull()) {
        JsonArray jsonArrayotherFeesCharges = jsonObj.getAsJsonArray("OtherFeesCharges");
        if (jsonArrayotherFeesCharges != null) {
          // ensure the json data is an array
          if (!jsonObj.get("OtherFeesCharges").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `OtherFeesCharges` to be an array in the JSON string but got `%s`", jsonObj.get("OtherFeesCharges").toString()));
          }

          // validate the optional field `OtherFeesCharges` (array)
          for (int i = 0; i < jsonArrayotherFeesCharges.size(); i++) {
            OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner.validateJsonObject(jsonArrayotherFeesCharges.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `Overdraft`
      if (jsonObj.get("Overdraft") != null && !jsonObj.get("Overdraft").isJsonNull()) {
        OBReadProduct2DataProductInnerOtherProductTypeOverdraft.validateJsonObject(jsonObj.getAsJsonObject("Overdraft"));
      }
      // validate the optional field `ProductDetails`
      if (jsonObj.get("ProductDetails") != null && !jsonObj.get("ProductDetails").isJsonNull()) {
        OBReadProduct2DataProductInnerOtherProductTypeProductDetails.validateJsonObject(jsonObj.getAsJsonObject("ProductDetails"));
      }
      // validate the optional field `Repayment`
      if (jsonObj.get("Repayment") != null && !jsonObj.get("Repayment").isJsonNull()) {
        OBReadProduct2DataProductInnerOtherProductTypeRepayment.validateJsonObject(jsonObj.getAsJsonObject("Repayment"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OBReadProduct2DataProductInnerOtherProductType.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OBReadProduct2DataProductInnerOtherProductType' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OBReadProduct2DataProductInnerOtherProductType> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OBReadProduct2DataProductInnerOtherProductType.class));

       return (TypeAdapter<T>) new TypeAdapter<OBReadProduct2DataProductInnerOtherProductType>() {
           @Override
           public void write(JsonWriter out, OBReadProduct2DataProductInnerOtherProductType value) throws IOException {
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
           public OBReadProduct2DataProductInnerOtherProductType read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OBReadProduct2DataProductInnerOtherProductType instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OBReadProduct2DataProductInnerOtherProductType given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OBReadProduct2DataProductInnerOtherProductType
  * @throws IOException if the JSON string is invalid with respect to OBReadProduct2DataProductInnerOtherProductType
  */
  public static OBReadProduct2DataProductInnerOtherProductType fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OBReadProduct2DataProductInnerOtherProductType.class);
  }

 /**
  * Convert an instance of OBReadProduct2DataProductInnerOtherProductType to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

