package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * DepartmentDesignation
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-10T12:36:58.677+05:30")

public class DepartmentDesignation   {
  private Long id = null;

  private Long department = null;

  private Object designation = null;

  public DepartmentDesignation id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the department designation mapping.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique identifier of the department designation mapping.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public DepartmentDesignation department(Long department) {
    this.department = department;
    return this;
  }

   /**
   * reference to the mapping department id.
   * @return department
  **/
  @ApiModelProperty(required = true, value = "reference to the mapping department id.")
  public Long getDepartment() {
    return department;
  }

  public void setDepartment(Long department) {
    this.department = department;
  }

  public DepartmentDesignation designation(Object designation) {
    this.designation = designation;
    return this;
  }

   /**
   * reference of the designation.
   * @return designation
  **/
  @ApiModelProperty(required = true, value = "reference of the designation.")
  public Object getDesignation() {
    return designation;
  }

  public void setDesignation(Object designation) {
    this.designation = designation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepartmentDesignation departmentDesignation = (DepartmentDesignation) o;
    return Objects.equals(this.id, departmentDesignation.id) &&
        Objects.equals(this.department, departmentDesignation.department) &&
        Objects.equals(this.designation, departmentDesignation.designation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, department, designation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepartmentDesignation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    designation: ").append(toIndentedString(designation)).append("\n");
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

