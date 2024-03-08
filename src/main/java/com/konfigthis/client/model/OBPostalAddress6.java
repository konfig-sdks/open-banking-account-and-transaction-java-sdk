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
import com.konfigthis.client.model.OBAddressTypeCode;
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
 * Information that locates and identifies a specific address, as defined by postal services.
 */
@ApiModel(description = "Information that locates and identifies a specific address, as defined by postal services.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class OBPostalAddress6 {
  public static final String SERIALIZED_NAME_ADDRESS_LINE = "AddressLine";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE)
  private List<String> addressLine = null;

  public static final String SERIALIZED_NAME_ADDRESS_TYPE = "AddressType";
  @SerializedName(SERIALIZED_NAME_ADDRESS_TYPE)
  private OBAddressTypeCode addressType;

  public static final String SERIALIZED_NAME_BUILDING_NUMBER = "BuildingNumber";
  @SerializedName(SERIALIZED_NAME_BUILDING_NUMBER)
  private String buildingNumber;

  public static final String SERIALIZED_NAME_COUNTRY = "Country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_COUNTRY_SUB_DIVISION = "CountrySubDivision";
  @SerializedName(SERIALIZED_NAME_COUNTRY_SUB_DIVISION)
  private String countrySubDivision;

  public static final String SERIALIZED_NAME_DEPARTMENT = "Department";
  @SerializedName(SERIALIZED_NAME_DEPARTMENT)
  private String department;

  public static final String SERIALIZED_NAME_POST_CODE = "PostCode";
  @SerializedName(SERIALIZED_NAME_POST_CODE)
  private String postCode;

  public static final String SERIALIZED_NAME_STREET_NAME = "StreetName";
  @SerializedName(SERIALIZED_NAME_STREET_NAME)
  private String streetName;

  public static final String SERIALIZED_NAME_SUB_DEPARTMENT = "SubDepartment";
  @SerializedName(SERIALIZED_NAME_SUB_DEPARTMENT)
  private String subDepartment;

  public static final String SERIALIZED_NAME_TOWN_NAME = "TownName";
  @SerializedName(SERIALIZED_NAME_TOWN_NAME)
  private String townName;

  public OBPostalAddress6() {
  }

  public OBPostalAddress6 addressLine(List<String> addressLine) {
    
    
    
    
    this.addressLine = addressLine;
    return this;
  }

  public OBPostalAddress6 addAddressLineItem(String addressLineItem) {
    if (this.addressLine == null) {
      this.addressLine = new ArrayList<>();
    }
    this.addressLine.add(addressLineItem);
    return this;
  }

   /**
   * Get addressLine
   * @return addressLine
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getAddressLine() {
    return addressLine;
  }


  public void setAddressLine(List<String> addressLine) {
    
    
    
    this.addressLine = addressLine;
  }


  public OBPostalAddress6 addressType(OBAddressTypeCode addressType) {
    
    
    
    
    this.addressType = addressType;
    return this;
  }

   /**
   * Get addressType
   * @return addressType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OBAddressTypeCode getAddressType() {
    return addressType;
  }


  public void setAddressType(OBAddressTypeCode addressType) {
    
    
    
    this.addressType = addressType;
  }


  public OBPostalAddress6 buildingNumber(String buildingNumber) {
    
    
    if (buildingNumber != null && buildingNumber.length() < 1) {
      throw new IllegalArgumentException("Invalid value for buildingNumber. Length must be greater than or equal to 1.");
    }
    
    this.buildingNumber = buildingNumber;
    return this;
  }

   /**
   * Number that identifies the position of a building on a street.
   * @return buildingNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number that identifies the position of a building on a street.")

  public String getBuildingNumber() {
    return buildingNumber;
  }


  public void setBuildingNumber(String buildingNumber) {
    
    
    if (buildingNumber != null && buildingNumber.length() < 1) {
      throw new IllegalArgumentException("Invalid value for buildingNumber. Length must be greater than or equal to 1.");
    }
    this.buildingNumber = buildingNumber;
  }


  public OBPostalAddress6 country(String country) {
    
    
    
    
    this.country = country;
    return this;
  }

   /**
   * Nation with its own government.
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Nation with its own government.")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    
    
    
    this.country = country;
  }


  public OBPostalAddress6 countrySubDivision(String countrySubDivision) {
    
    
    if (countrySubDivision != null && countrySubDivision.length() < 1) {
      throw new IllegalArgumentException("Invalid value for countrySubDivision. Length must be greater than or equal to 1.");
    }
    
    this.countrySubDivision = countrySubDivision;
    return this;
  }

   /**
   * Identifies a subdivision of a country such as state, region, county.
   * @return countrySubDivision
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifies a subdivision of a country such as state, region, county.")

  public String getCountrySubDivision() {
    return countrySubDivision;
  }


  public void setCountrySubDivision(String countrySubDivision) {
    
    
    if (countrySubDivision != null && countrySubDivision.length() < 1) {
      throw new IllegalArgumentException("Invalid value for countrySubDivision. Length must be greater than or equal to 1.");
    }
    this.countrySubDivision = countrySubDivision;
  }


  public OBPostalAddress6 department(String department) {
    
    
    if (department != null && department.length() < 1) {
      throw new IllegalArgumentException("Invalid value for department. Length must be greater than or equal to 1.");
    }
    
    this.department = department;
    return this;
  }

   /**
   * Identification of a division of a large organisation or building.
   * @return department
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identification of a division of a large organisation or building.")

  public String getDepartment() {
    return department;
  }


  public void setDepartment(String department) {
    
    
    if (department != null && department.length() < 1) {
      throw new IllegalArgumentException("Invalid value for department. Length must be greater than or equal to 1.");
    }
    this.department = department;
  }


  public OBPostalAddress6 postCode(String postCode) {
    
    
    if (postCode != null && postCode.length() < 1) {
      throw new IllegalArgumentException("Invalid value for postCode. Length must be greater than or equal to 1.");
    }
    
    this.postCode = postCode;
    return this;
  }

   /**
   * Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail.
   * @return postCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail.")

  public String getPostCode() {
    return postCode;
  }


  public void setPostCode(String postCode) {
    
    
    if (postCode != null && postCode.length() < 1) {
      throw new IllegalArgumentException("Invalid value for postCode. Length must be greater than or equal to 1.");
    }
    this.postCode = postCode;
  }


  public OBPostalAddress6 streetName(String streetName) {
    
    
    if (streetName != null && streetName.length() < 1) {
      throw new IllegalArgumentException("Invalid value for streetName. Length must be greater than or equal to 1.");
    }
    
    this.streetName = streetName;
    return this;
  }

   /**
   * Name of a street or thoroughfare.
   * @return streetName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of a street or thoroughfare.")

  public String getStreetName() {
    return streetName;
  }


  public void setStreetName(String streetName) {
    
    
    if (streetName != null && streetName.length() < 1) {
      throw new IllegalArgumentException("Invalid value for streetName. Length must be greater than or equal to 1.");
    }
    this.streetName = streetName;
  }


  public OBPostalAddress6 subDepartment(String subDepartment) {
    
    
    if (subDepartment != null && subDepartment.length() < 1) {
      throw new IllegalArgumentException("Invalid value for subDepartment. Length must be greater than or equal to 1.");
    }
    
    this.subDepartment = subDepartment;
    return this;
  }

   /**
   * Identification of a sub-division of a large organisation or building.
   * @return subDepartment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identification of a sub-division of a large organisation or building.")

  public String getSubDepartment() {
    return subDepartment;
  }


  public void setSubDepartment(String subDepartment) {
    
    
    if (subDepartment != null && subDepartment.length() < 1) {
      throw new IllegalArgumentException("Invalid value for subDepartment. Length must be greater than or equal to 1.");
    }
    this.subDepartment = subDepartment;
  }


  public OBPostalAddress6 townName(String townName) {
    
    
    if (townName != null && townName.length() < 1) {
      throw new IllegalArgumentException("Invalid value for townName. Length must be greater than or equal to 1.");
    }
    
    this.townName = townName;
    return this;
  }

   /**
   * Name of a built-up area, with defined boundaries, and a local government.
   * @return townName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of a built-up area, with defined boundaries, and a local government.")

  public String getTownName() {
    return townName;
  }


  public void setTownName(String townName) {
    
    
    if (townName != null && townName.length() < 1) {
      throw new IllegalArgumentException("Invalid value for townName. Length must be greater than or equal to 1.");
    }
    this.townName = townName;
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
   * @return the OBPostalAddress6 instance itself
   */
  public OBPostalAddress6 putAdditionalProperty(String key, Object value) {
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
    OBPostalAddress6 obPostalAddress6 = (OBPostalAddress6) o;
    return Objects.equals(this.addressLine, obPostalAddress6.addressLine) &&
        Objects.equals(this.addressType, obPostalAddress6.addressType) &&
        Objects.equals(this.buildingNumber, obPostalAddress6.buildingNumber) &&
        Objects.equals(this.country, obPostalAddress6.country) &&
        Objects.equals(this.countrySubDivision, obPostalAddress6.countrySubDivision) &&
        Objects.equals(this.department, obPostalAddress6.department) &&
        Objects.equals(this.postCode, obPostalAddress6.postCode) &&
        Objects.equals(this.streetName, obPostalAddress6.streetName) &&
        Objects.equals(this.subDepartment, obPostalAddress6.subDepartment) &&
        Objects.equals(this.townName, obPostalAddress6.townName)&&
        Objects.equals(this.additionalProperties, obPostalAddress6.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressLine, addressType, buildingNumber, country, countrySubDivision, department, postCode, streetName, subDepartment, townName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBPostalAddress6 {\n");
    sb.append("    addressLine: ").append(toIndentedString(addressLine)).append("\n");
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    buildingNumber: ").append(toIndentedString(buildingNumber)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    countrySubDivision: ").append(toIndentedString(countrySubDivision)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    subDepartment: ").append(toIndentedString(subDepartment)).append("\n");
    sb.append("    townName: ").append(toIndentedString(townName)).append("\n");
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
    openapiFields.add("AddressLine");
    openapiFields.add("AddressType");
    openapiFields.add("BuildingNumber");
    openapiFields.add("Country");
    openapiFields.add("CountrySubDivision");
    openapiFields.add("Department");
    openapiFields.add("PostCode");
    openapiFields.add("StreetName");
    openapiFields.add("SubDepartment");
    openapiFields.add("TownName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OBPostalAddress6
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OBPostalAddress6.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OBPostalAddress6 is not found in the empty JSON string", OBPostalAddress6.openapiRequiredFields.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("AddressLine") != null && !jsonObj.get("AddressLine").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `AddressLine` to be an array in the JSON string but got `%s`", jsonObj.get("AddressLine").toString()));
      }
      if ((jsonObj.get("BuildingNumber") != null && !jsonObj.get("BuildingNumber").isJsonNull()) && !jsonObj.get("BuildingNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `BuildingNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("BuildingNumber").toString()));
      }
      if ((jsonObj.get("Country") != null && !jsonObj.get("Country").isJsonNull()) && !jsonObj.get("Country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Country").toString()));
      }
      if ((jsonObj.get("CountrySubDivision") != null && !jsonObj.get("CountrySubDivision").isJsonNull()) && !jsonObj.get("CountrySubDivision").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CountrySubDivision` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CountrySubDivision").toString()));
      }
      if ((jsonObj.get("Department") != null && !jsonObj.get("Department").isJsonNull()) && !jsonObj.get("Department").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Department` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Department").toString()));
      }
      if ((jsonObj.get("PostCode") != null && !jsonObj.get("PostCode").isJsonNull()) && !jsonObj.get("PostCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PostCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PostCode").toString()));
      }
      if ((jsonObj.get("StreetName") != null && !jsonObj.get("StreetName").isJsonNull()) && !jsonObj.get("StreetName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `StreetName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("StreetName").toString()));
      }
      if ((jsonObj.get("SubDepartment") != null && !jsonObj.get("SubDepartment").isJsonNull()) && !jsonObj.get("SubDepartment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SubDepartment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SubDepartment").toString()));
      }
      if ((jsonObj.get("TownName") != null && !jsonObj.get("TownName").isJsonNull()) && !jsonObj.get("TownName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TownName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TownName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OBPostalAddress6.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OBPostalAddress6' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OBPostalAddress6> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OBPostalAddress6.class));

       return (TypeAdapter<T>) new TypeAdapter<OBPostalAddress6>() {
           @Override
           public void write(JsonWriter out, OBPostalAddress6 value) throws IOException {
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
           public OBPostalAddress6 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OBPostalAddress6 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OBPostalAddress6 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OBPostalAddress6
  * @throws IOException if the JSON string is invalid with respect to OBPostalAddress6
  */
  public static OBPostalAddress6 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OBPostalAddress6.class);
  }

 /**
  * Convert an instance of OBPostalAddress6 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
