/*
 * SysML v2 API and Services
 * REST/HTTP binding (PSM) for the SysML v2 standard API.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.omg.sysml.model;

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
import java.util.HashMap;
import java.util.Map;

/**
 * Constraint
 */


public class Constraint extends HashMap<String, Object> {
  /**
   * Gets or Sets atType
   */
  @JsonAdapter(AtTypeEnum.Adapter.class)
  public enum AtTypeEnum {
    PRIMITIVECONSTRAINT("PrimitiveConstraint"),
    
    COMPOSITECONSTRAINT("CompositeConstraint");

    private String value;

    AtTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AtTypeEnum fromValue(String value) {
      for (AtTypeEnum b : AtTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AtTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AtTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AtTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AtTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_AT_TYPE = "@type";
  @SerializedName(SERIALIZED_NAME_AT_TYPE)
  protected AtTypeEnum atType;

  public Constraint() {
  }

  public Constraint atType(AtTypeEnum atType) {
    
    this.atType = atType;
    return this;
  }

   /**
   * Get atType
   * @return atType
  **/
  @ApiModelProperty(required = true, value = "")

  public AtTypeEnum getAtType() {
    return atType;
  }


  public void setAtType(AtTypeEnum atType) {
    this.atType = atType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Constraint constraint = (Constraint) o;
    return Objects.equals(this.atType, constraint.atType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Constraint {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

