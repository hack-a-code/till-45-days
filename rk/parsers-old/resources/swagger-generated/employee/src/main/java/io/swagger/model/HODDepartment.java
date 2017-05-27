package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * HODDepartment
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-09T19:48:07.703+05:30")

public class HODDepartment   {
  private Long id = null;

  private Long department = null;

  public HODDepartment id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the hod department.
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier of the hod department.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public HODDepartment department(Long department) {
    this.department = department;
    return this;
  }

   /**
   * Departments for which HOD is defined.
   * @return department
  **/
  @ApiModelProperty(required = true, value = "Departments for which HOD is defined.")
  public Long getDepartment() {
    return department;
  }

  public void setDepartment(Long department) {
    this.department = department;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HODDepartment hODDepartment = (HODDepartment) o;
    return Objects.equals(this.id, hODDepartment.id) &&
        Objects.equals(this.department, hODDepartment.department);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, department);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HODDepartment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
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

