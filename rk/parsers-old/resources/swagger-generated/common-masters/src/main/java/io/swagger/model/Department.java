package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * Department
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-22T11:20:22.652+05:30")

public class Department   {
  private Long id = null;

  private String name = null;

  private String code = null;

  private Boolean active = null;

  public Department id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the department.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique identifier of the department.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Department name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Unique Department name.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Unique Department name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Department code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Unique code of the department.
   * @return code
  **/
  @ApiModelProperty(required = true, value = "Unique code of the department.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Department active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * TRUE for active departments and FALSE for inactive departments.
   * @return active
  **/
  @ApiModelProperty(required = true, value = "TRUE for active departments and FALSE for inactive departments.")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
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
    Department department = (Department) o;
    return Objects.equals(this.id, department.id) &&
        Objects.equals(this.name, department.name) &&
        Objects.equals(this.code, department.code) &&
        Objects.equals(this.active, department.active);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, code, active);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Department {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

