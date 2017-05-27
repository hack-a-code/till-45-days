package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Employee;
import io.swagger.model.SwaggerYamlhrMastersJsondefinitionsRequestInfo;
import java.util.ArrayList;
import java.util.List;




/**
 * EmployeeReq
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-09T19:48:07.703+05:30")

public class EmployeeReq   {
  private SwaggerYamlhrMastersJsondefinitionsRequestInfo requestInfo = null;

  private List<Employee> employee = new ArrayList<Employee>();

  public EmployeeReq requestInfo(SwaggerYamlhrMastersJsondefinitionsRequestInfo requestInfo) {
    this.requestInfo = requestInfo;
    return this;
  }

   /**
   * Get requestInfo
   * @return requestInfo
  **/
  @ApiModelProperty(required = true, value = "")
  public SwaggerYamlhrMastersJsondefinitionsRequestInfo getRequestInfo() {
    return requestInfo;
  }

  public void setRequestInfo(SwaggerYamlhrMastersJsondefinitionsRequestInfo requestInfo) {
    this.requestInfo = requestInfo;
  }

  public EmployeeReq employee(List<Employee> employee) {
    this.employee = employee;
    return this;
  }

  public EmployeeReq addEmployeeItem(Employee employeeItem) {
    this.employee.add(employeeItem);
    return this;
  }

   /**
   * Get employee
   * @return employee
  **/
  @ApiModelProperty(required = true, value = "")
  public List<Employee> getEmployee() {
    return employee;
  }

  public void setEmployee(List<Employee> employee) {
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
    EmployeeReq employeeReq = (EmployeeReq) o;
    return Objects.equals(this.requestInfo, employeeReq.requestInfo) &&
        Objects.equals(this.employee, employeeReq.employee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestInfo, employee);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeReq {\n");
    
    sb.append("    requestInfo: ").append(toIndentedString(requestInfo)).append("\n");
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

