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
import java.time.OffsetDateTime;
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
 * OBReadConsentResponse1Data
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class OBReadConsentResponse1Data {
  public static final String SERIALIZED_NAME_CONSENT_ID = "ConsentId";
  @SerializedName(SERIALIZED_NAME_CONSENT_ID)
  private String consentId;

  public static final String SERIALIZED_NAME_CREATION_DATE_TIME = "CreationDateTime";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE_TIME)
  private OffsetDateTime creationDateTime;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE_TIME = "ExpirationDateTime";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE_TIME)
  private OffsetDateTime expirationDateTime;

  /**
   * Specifies the Open Banking account access data types. This is a list of the data clusters being consented by the PSU, and requested for authorisation with the ASPSP.
   */
  @JsonAdapter(PermissionsEnum.Adapter.class)
 public enum PermissionsEnum {
    READACCOUNTSBASIC("ReadAccountsBasic"),
    
    READACCOUNTSDETAIL("ReadAccountsDetail"),
    
    READBALANCES("ReadBalances"),
    
    READBENEFICIARIESBASIC("ReadBeneficiariesBasic"),
    
    READBENEFICIARIESDETAIL("ReadBeneficiariesDetail"),
    
    READDIRECTDEBITS("ReadDirectDebits"),
    
    READOFFERS("ReadOffers"),
    
    READPAN("ReadPAN"),
    
    READPARTY("ReadParty"),
    
    READPARTYPSU("ReadPartyPSU"),
    
    READPRODUCTS("ReadProducts"),
    
    READSCHEDULEDPAYMENTSBASIC("ReadScheduledPaymentsBasic"),
    
    READSCHEDULEDPAYMENTSDETAIL("ReadScheduledPaymentsDetail"),
    
    READSTANDINGORDERSBASIC("ReadStandingOrdersBasic"),
    
    READSTANDINGORDERSDETAIL("ReadStandingOrdersDetail"),
    
    READSTATEMENTSBASIC("ReadStatementsBasic"),
    
    READSTATEMENTSDETAIL("ReadStatementsDetail"),
    
    READTRANSACTIONSBASIC("ReadTransactionsBasic"),
    
    READTRANSACTIONSCREDITS("ReadTransactionsCredits"),
    
    READTRANSACTIONSDEBITS("ReadTransactionsDebits"),
    
    READTRANSACTIONSDETAIL("ReadTransactionsDetail");

    private String value;

    PermissionsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PermissionsEnum fromValue(String value) {
      for (PermissionsEnum b : PermissionsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PermissionsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PermissionsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PermissionsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PermissionsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PERMISSIONS = "Permissions";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  private List<PermissionsEnum> permissions = new ArrayList<>();

  /**
   * Specifies the status of consent resource in code form.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
 public enum StatusEnum {
    AUTHORISED("Authorised"),
    
    AWAITINGAUTHORISATION("AwaitingAuthorisation"),
    
    REJECTED("Rejected"),
    
    REVOKED("Revoked");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_STATUS_UPDATE_DATE_TIME = "StatusUpdateDateTime";
  @SerializedName(SERIALIZED_NAME_STATUS_UPDATE_DATE_TIME)
  private OffsetDateTime statusUpdateDateTime;

  public static final String SERIALIZED_NAME_TRANSACTION_FROM_DATE_TIME = "TransactionFromDateTime";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_FROM_DATE_TIME)
  private OffsetDateTime transactionFromDateTime;

  public static final String SERIALIZED_NAME_TRANSACTION_TO_DATE_TIME = "TransactionToDateTime";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_TO_DATE_TIME)
  private OffsetDateTime transactionToDateTime;

  public OBReadConsentResponse1Data() {
  }

  public OBReadConsentResponse1Data consentId(String consentId) {
    
    
    if (consentId != null && consentId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for consentId. Length must be greater than or equal to 1.");
    }
    
    this.consentId = consentId;
    return this;
  }

   /**
   * Unique identification as assigned to identify the account access consent resource.
   * @return consentId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unique identification as assigned to identify the account access consent resource.")

  public String getConsentId() {
    return consentId;
  }


  public void setConsentId(String consentId) {
    
    
    if (consentId != null && consentId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for consentId. Length must be greater than or equal to 1.");
    }
    this.consentId = consentId;
  }


  public OBReadConsentResponse1Data creationDateTime(OffsetDateTime creationDateTime) {
    
    
    
    
    this.creationDateTime = creationDateTime;
    return this;
  }

   /**
   * Date and time at which the resource was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return creationDateTime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Date and time at which the resource was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")

  public OffsetDateTime getCreationDateTime() {
    return creationDateTime;
  }


  public void setCreationDateTime(OffsetDateTime creationDateTime) {
    
    
    
    this.creationDateTime = creationDateTime;
  }


  public OBReadConsentResponse1Data expirationDateTime(OffsetDateTime expirationDateTime) {
    
    
    
    
    this.expirationDateTime = expirationDateTime;
    return this;
  }

   /**
   * Specified date and time the permissions will expire. If this is not populated, the permissions will be open ended.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return expirationDateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specified date and time the permissions will expire. If this is not populated, the permissions will be open ended.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")

  public OffsetDateTime getExpirationDateTime() {
    return expirationDateTime;
  }


  public void setExpirationDateTime(OffsetDateTime expirationDateTime) {
    
    
    
    this.expirationDateTime = expirationDateTime;
  }


  public OBReadConsentResponse1Data permissions(List<PermissionsEnum> permissions) {
    
    
    
    
    this.permissions = permissions;
    return this;
  }

  public OBReadConsentResponse1Data addPermissionsItem(PermissionsEnum permissionsItem) {
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<PermissionsEnum> getPermissions() {
    return permissions;
  }


  public void setPermissions(List<PermissionsEnum> permissions) {
    
    
    
    this.permissions = permissions;
  }


  public OBReadConsentResponse1Data status(StatusEnum status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Specifies the status of consent resource in code form.
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the status of consent resource in code form.")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    
    
    
    this.status = status;
  }


  public OBReadConsentResponse1Data statusUpdateDateTime(OffsetDateTime statusUpdateDateTime) {
    
    
    
    
    this.statusUpdateDateTime = statusUpdateDateTime;
    return this;
  }

   /**
   * Date and time at which the resource status was updated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return statusUpdateDateTime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Date and time at which the resource status was updated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")

  public OffsetDateTime getStatusUpdateDateTime() {
    return statusUpdateDateTime;
  }


  public void setStatusUpdateDateTime(OffsetDateTime statusUpdateDateTime) {
    
    
    
    this.statusUpdateDateTime = statusUpdateDateTime;
  }


  public OBReadConsentResponse1Data transactionFromDateTime(OffsetDateTime transactionFromDateTime) {
    
    
    
    
    this.transactionFromDateTime = transactionFromDateTime;
    return this;
  }

   /**
   * Specified start date and time for the transaction query period. If this is not populated, the start date will be open ended, and data will be returned from the earliest available transaction.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return transactionFromDateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specified start date and time for the transaction query period. If this is not populated, the start date will be open ended, and data will be returned from the earliest available transaction.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")

  public OffsetDateTime getTransactionFromDateTime() {
    return transactionFromDateTime;
  }


  public void setTransactionFromDateTime(OffsetDateTime transactionFromDateTime) {
    
    
    
    this.transactionFromDateTime = transactionFromDateTime;
  }


  public OBReadConsentResponse1Data transactionToDateTime(OffsetDateTime transactionToDateTime) {
    
    
    
    
    this.transactionToDateTime = transactionToDateTime;
    return this;
  }

   /**
   * Specified end date and time for the transaction query period. If this is not populated, the end date will be open ended, and data will be returned to the latest available transaction.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return transactionToDateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specified end date and time for the transaction query period. If this is not populated, the end date will be open ended, and data will be returned to the latest available transaction.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")

  public OffsetDateTime getTransactionToDateTime() {
    return transactionToDateTime;
  }


  public void setTransactionToDateTime(OffsetDateTime transactionToDateTime) {
    
    
    
    this.transactionToDateTime = transactionToDateTime;
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
   * @return the OBReadConsentResponse1Data instance itself
   */
  public OBReadConsentResponse1Data putAdditionalProperty(String key, Object value) {
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
    OBReadConsentResponse1Data obReadConsentResponse1Data = (OBReadConsentResponse1Data) o;
    return Objects.equals(this.consentId, obReadConsentResponse1Data.consentId) &&
        Objects.equals(this.creationDateTime, obReadConsentResponse1Data.creationDateTime) &&
        Objects.equals(this.expirationDateTime, obReadConsentResponse1Data.expirationDateTime) &&
        Objects.equals(this.permissions, obReadConsentResponse1Data.permissions) &&
        Objects.equals(this.status, obReadConsentResponse1Data.status) &&
        Objects.equals(this.statusUpdateDateTime, obReadConsentResponse1Data.statusUpdateDateTime) &&
        Objects.equals(this.transactionFromDateTime, obReadConsentResponse1Data.transactionFromDateTime) &&
        Objects.equals(this.transactionToDateTime, obReadConsentResponse1Data.transactionToDateTime)&&
        Objects.equals(this.additionalProperties, obReadConsentResponse1Data.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consentId, creationDateTime, expirationDateTime, permissions, status, statusUpdateDateTime, transactionFromDateTime, transactionToDateTime, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadConsentResponse1Data {\n");
    sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    expirationDateTime: ").append(toIndentedString(expirationDateTime)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusUpdateDateTime: ").append(toIndentedString(statusUpdateDateTime)).append("\n");
    sb.append("    transactionFromDateTime: ").append(toIndentedString(transactionFromDateTime)).append("\n");
    sb.append("    transactionToDateTime: ").append(toIndentedString(transactionToDateTime)).append("\n");
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
    openapiFields.add("ConsentId");
    openapiFields.add("CreationDateTime");
    openapiFields.add("ExpirationDateTime");
    openapiFields.add("Permissions");
    openapiFields.add("Status");
    openapiFields.add("StatusUpdateDateTime");
    openapiFields.add("TransactionFromDateTime");
    openapiFields.add("TransactionToDateTime");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ConsentId");
    openapiRequiredFields.add("CreationDateTime");
    openapiRequiredFields.add("Permissions");
    openapiRequiredFields.add("Status");
    openapiRequiredFields.add("StatusUpdateDateTime");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OBReadConsentResponse1Data
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OBReadConsentResponse1Data.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OBReadConsentResponse1Data is not found in the empty JSON string", OBReadConsentResponse1Data.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OBReadConsentResponse1Data.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("ConsentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ConsentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ConsentId").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("Permissions") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("Permissions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Permissions` to be an array in the JSON string but got `%s`", jsonObj.get("Permissions").toString()));
      }
      if (!jsonObj.get("Status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OBReadConsentResponse1Data.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OBReadConsentResponse1Data' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OBReadConsentResponse1Data> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OBReadConsentResponse1Data.class));

       return (TypeAdapter<T>) new TypeAdapter<OBReadConsentResponse1Data>() {
           @Override
           public void write(JsonWriter out, OBReadConsentResponse1Data value) throws IOException {
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
           public OBReadConsentResponse1Data read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OBReadConsentResponse1Data instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OBReadConsentResponse1Data given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OBReadConsentResponse1Data
  * @throws IOException if the JSON string is invalid with respect to OBReadConsentResponse1Data
  */
  public static OBReadConsentResponse1Data fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OBReadConsentResponse1Data.class);
  }

 /**
  * Convert an instance of OBReadConsentResponse1Data to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

