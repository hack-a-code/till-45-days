package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.EmployeeCompleteInfo;
import io.swagger.model.SwaggerYamlhrMastersJsondefinitionsResponseInfo;
import java.util.ArrayList;
import java.util.List;




/**
 * EmployeeRes
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-09T19:48:07.703+05:30")

public class EmployeeRes   {
  private SwaggerYamlhrMastersJsondefinitionsResponseInfo responseInfo = null;

  private List<EmployeeCompleteInfo> employee = new ArrayList<EmployeeCompleteInfo>();

  public EmployeeRes responseInfo(SwaggerYamlhrMastersJsondefinitionsResponseInfo responseInfo) {
    this.responseInfo = responseInfo;
    return this;
  }

   /**
   * Get responseInfo
   * @return responseInfo
  **/
  @ApiModelProperty(value = "")
  public SwaggerYamlhrMastersJsondefinitionsResponseInfo getResponseInfo() {
    return responseInfo;
  }

  public void setResponseInfo(SwaggerYamlhrMastersJsondefinitionsResponseInfo responseInfo) {
    this.responseInfo = responseInfo;
  }

  public EmployeeRes employee(List<EmployeeCompleteInfo> employee) {
    this.employee = employee;
    return this;
  }

  public EmployeeRes addEmployeeItem(EmployeeCompleteInfo employeeItem) {
    this.employee.add(employeeItem);
    return this;
  }

   /**
   * Get employee
   * @return employee
  **/
  @ApiModelProperty(value = "")
  public List<EmployeeCompleteInfo> getEmployee() {
    return employee;
  }

  public void setEmployee(List<EmployeeCompleteInfo> employee) {
    this.employee = employee;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeeRes employeeRes = (EmployeeRes) o;
    return Objects.equals(this.responseInfo, employeeRes.responseInfo) &&
        Objects.equals(this.employee, employeeRes.employee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseInfo, employee);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeRes {\n");
    
    sb.append("    responseInfo: ").append(toIndentedString(responseInfo)).append("\n");
    sb.append("    employee: ").append(toIndentedString(employee)).append("\n");
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

