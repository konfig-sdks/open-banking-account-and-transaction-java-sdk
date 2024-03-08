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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Specifies the status of the direct debit in code form.
 */
@JsonAdapter(OBExternalDirectDebitStatus1Code.Adapter.class)public enum OBExternalDirectDebitStatus1Code {
  
  ACTIVE("Active"),
  
  INACTIVE("Inactive");

  private String value;

  OBExternalDirectDebitStatus1Code(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OBExternalDirectDebitStatus1Code fromValue(String value) {
    for (OBExternalDirectDebitStatus1Code b : OBExternalDirectDebitStatus1Code.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<OBExternalDirectDebitStatus1Code> {
    @Override
    public void write(final JsonWriter jsonWriter, final OBExternalDirectDebitStatus1Code enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public OBExternalDirectDebitStatus1Code read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return OBExternalDirectDebitStatus1Code.fromValue(value);
    }
  }
}

