package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.EmployeeType;
import io.swagger.model.ResponseInfo;
import java.util.ArrayList;
import java.util.List;




/**
 * EmployeeTypeRes
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-10T12:36:58.677+05:30")

public class EmployeeTypeRes   {
  private ResponseInfo responseInfo = null;

  private List<EmployeeType> employeeType = new ArrayList<EmployeeType>();

  public EmployeeTypeRes responseInfo(ResponseInfo responseInfo) {
    this.responseInfo = responseInfo;
    return this;
  }

   /**
   * Get responseInfo
   * @return responseInfo
  **/
  @ApiModelProperty(value = "")
  public ResponseInfo getResponseInfo() {
    return responseInfo;
  }

  public void setResponseInfo(ResponseInfo responseInfo) {
    this.responseInfo = responseInfo;
  }

  public EmployeeTypeRes employeeType(List<EmployeeType> employeeType) {
    this.employeeType = employeeType;
    return this;
  }

  public EmployeeTypeRes addEmployeeTypeItem(EmployeeType employeeTypeItem) {
    this.employeeType.add(employeeTypeItem);
    return this;
  }

   /**
   * Get employeeType
   * @return employeeType
  **/
  @ApiModelProperty(value = "")
  public List<EmployeeType> getEmployeeType() {
    return employeeType;
  }

  public void setEmployeeType(List<EmployeeType> employeeType) {
    this.employeeType = employeeType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeeTypeRes employeeTypeRes = (EmployeeTypeRes) o;
    return Objects.equals(this.responseInfo, employeeTypeRes.responseInfo) &&
        Objects.equals(this.employeeType, employeeTypeRes.employeeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseInfo, employeeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeTypeRes {\n");
    
    sb.append("    responseInfo: ").append(toIndentedString(responseInfo)).append("\n");
    sb.append("    employeeType: ").append(toIndentedString(employeeType)).append("\n");
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

