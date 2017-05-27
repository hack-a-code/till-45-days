package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * HRStatus
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-10T12:36:58.677+05:30")

public class HRStatus   {
  private Long id = null;

  private String objectName = null;

  private String code = null;

  private String description = null;

  public HRStatus id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the status master.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique identifier of the status master.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public HRStatus objectName(String objectName) {
    this.objectName = objectName;
    return this;
  }

   /**
   * The Name of the object for which statuses are defined.
   * @return objectName
  **/
  @ApiModelProperty(required = true, value = "The Name of the object for which statuses are defined.")
  public String getObjectName() {
    return objectName;
  }

  public void setObjectName(String objectName) {
    this.objectName = objectName;
  }

  public HRStatus code(String code) {
    this.code = code;
    return this;
  }

   /**
   * The status code.
   * @return code
  **/
  @ApiModelProperty(required = true, value = "The status code.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public HRStatus description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the status.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "The description of the status.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HRStatus hRStatus = (HRStatus) o;
    return Objects.equals(this.id, hRStatus.id) &&
        Objects.equals(this.objectName, hRStatus.objectName) &&
        Objects.equals(this.code, hRStatus.code) &&
        Objects.equals(this.description, hRStatus.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, objectName, code, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HRStatus {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    objectName: ").append(toIndentedString(objectName)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

