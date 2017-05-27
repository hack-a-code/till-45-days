package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * Grade
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-10T12:36:58.677+05:30")

public class Grade   {
  private Long id = null;

  private String name = null;

  private String description = null;

  private Integer orderno = null;

  private String active = null;

  public Grade id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the grade.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique identifier of the grade.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Grade name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The Name of the grade.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The Name of the grade.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Grade description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the grade.
   * @return description
  **/
  @ApiModelProperty(value = "The description of the grade.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Grade orderno(Integer orderno) {
    this.orderno = orderno;
    return this;
  }

   /**
   * order of hierarchy can be defined as a numeric value. Highest will have value 1.
   * @return orderno
  **/
  @ApiModelProperty(value = "order of hierarchy can be defined as a numeric value. Highest will have value 1.")
  public Integer getOrderno() {
    return orderno;
  }

  public void setOrderno(Integer orderno) {
    this.orderno = orderno;
  }

  public Grade active(String active) {
    this.active = active;
    return this;
  }

   /**
   * Shows if this grade data is active or not. If the value is TRUE, then this data is active one. If this needs to be marked as a deleted data then the value will be FALSE.
   * @return active
  **/
  @ApiModelProperty(required = true, value = "Shows if this grade data is active or not. If the value is TRUE, then this data is active one. If this needs to be marked as a deleted data then the value will be FALSE.")
  public String getActive() {
    return active;
  }

  public void setActive(String active) {
    this.active = active;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Grade grade = (Grade) o;
    return Objects.equals(this.id, grade.id) &&
        Objects.equals(this.name, grade.name) &&
        Objects.equals(this.description, grade.description) &&
        Objects.equals(this.orderno, grade.orderno) &&
        Objects.equals(this.active, grade.active);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, orderno, active);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Grade {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    orderno: ").append(toIndentedString(orderno)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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

