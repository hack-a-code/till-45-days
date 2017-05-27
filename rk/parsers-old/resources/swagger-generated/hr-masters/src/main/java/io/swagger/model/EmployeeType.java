package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * EmployeeType
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-10T12:36:58.677+05:30")

public class EmployeeType   {
  private Long id = null;

  private String name = null;

  private String chartOfAccounts = null;

  public EmployeeType id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the employee type.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique identifier of the employee type.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public EmployeeType name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Value for the employee type like -Permanent, Contract, Labour, Staff.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Value for the employee type like -Permanent, Contract, Labour, Staff.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EmployeeType chartOfAccounts(String chartOfAccounts) {
    this.chartOfAccounts = chartOfAccounts;
    return this;
  }

   /**
   * chartofaccount glcode associated with this employee type
   * @return chartOfAccounts
  **/
  @ApiModelProperty(value = "chartofaccount glcode associated with this employee type")
  public String getChartOfAccounts() {
    return chartOfAccounts;
  }

  public void setChartOfAccounts(String chartOfAccounts) {
    this.chartOfAccounts = chartOfAccounts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeeType employeeType = (EmployeeType) o;
    return Objects.equals(this.id, employeeType.id) &&
        Objects.equals(this.name, employeeType.name) &&
        Objects.equals(this.chartOfAccounts, employeeType.chartOfAccounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, chartOfAccounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeType {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    chartOfAccounts: ").append(toIndentedString(chartOfAccounts)).append("\n");
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

