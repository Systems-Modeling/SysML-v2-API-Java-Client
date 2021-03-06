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
import java.util.UUID;
import org.omg.sysml.model.ProjectDefaultBranch;

/**
 * Project
 */

public class Project {
  public static final String SERIALIZED_NAME_AT_ID = "@id";
  @SerializedName(SERIALIZED_NAME_AT_ID)
  private UUID atId;

  /**
   * Gets or Sets atType
   */
  @JsonAdapter(AtTypeEnum.Adapter.class)
  public enum AtTypeEnum {
    PROJECT("Project");

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
  private AtTypeEnum atType;

  public static final String SERIALIZED_NAME_DEFAULT_BRANCH = "defaultBranch";
  @SerializedName(SERIALIZED_NAME_DEFAULT_BRANCH)
  private ProjectDefaultBranch defaultBranch;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public Project atId(UUID atId) {
    
    this.atId = atId;
    return this;
  }

   /**
   * Get atId
   * @return atId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getAtId() {
    return atId;
  }


  public void setAtId(UUID atId) {
    this.atId = atId;
  }


  public Project atType(AtTypeEnum atType) {
    
    this.atType = atType;
    return this;
  }

   /**
   * Get atType
   * @return atType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AtTypeEnum getAtType() {
    return atType;
  }


  public void setAtType(AtTypeEnum atType) {
    this.atType = atType;
  }


  public Project defaultBranch(ProjectDefaultBranch defaultBranch) {
    
    this.defaultBranch = defaultBranch;
    return this;
  }

   /**
   * Get defaultBranch
   * @return defaultBranch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProjectDefaultBranch getDefaultBranch() {
    return defaultBranch;
  }


  public void setDefaultBranch(ProjectDefaultBranch defaultBranch) {
    this.defaultBranch = defaultBranch;
  }


  public Project description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Project name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Project project = (Project) o;
    return Objects.equals(this.atId, project.atId) &&
        Objects.equals(this.atType, project.atType) &&
        Objects.equals(this.defaultBranch, project.defaultBranch) &&
        Objects.equals(this.description, project.description) &&
        Objects.equals(this.name, project.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atId, atType, defaultBranch, description, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Project {\n");
    sb.append("    atId: ").append(toIndentedString(atId)).append("\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    defaultBranch: ").append(toIndentedString(defaultBranch)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

