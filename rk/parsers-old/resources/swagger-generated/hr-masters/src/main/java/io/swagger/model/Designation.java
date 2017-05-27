package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * Designation
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-10T12:36:58.677+05:30")

public class Designation   {
  private Long id = null;

  private String name = null;

  private String code = null;

  private String description = null;

  private String chartOfAccounts = null;

  private Boolean active = null;

  public Designation id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the designation.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique identifier of the designation.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Designation name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Unique Designation name.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Unique Designation name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Designation code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Unique code of the designation.
   * @return code
  **/
  @ApiModelProperty(required = true, value = "Unique code of the designation.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Designation description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Brief description of Designation .
   * @return description
  **/
  @ApiModelProperty(value = "Brief description of Designation .")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Designation chartOfAccounts(String chartOfAccounts) {
    this.chartOfAccounts = chartOfAccounts;
    return this;
  }

   /**
   * Unique account code of the chartofaccounts master.
   * @return chartOfAccounts
  **/
  @ApiModelProperty(value = "Unique account code of the chartofaccounts master.")
  public String getChartOfAccounts() {
    return chartOfAccounts;
  }

  public void setChartOfAccounts(String chartOfAccounts) {
    this.chartOfAccounts = chartOfAccounts;
  }

  public Designation active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * TRUE for active designation and FALSE for inactive designation.
   * @return active
  **/
  @ApiModelProperty(required = true, value = "TRUE for active designation and FALSE for inactive designation.")
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
    Designation designation = (Designation) o;
    return Objects.equals(this.id, designation.id) &&
        Objects.equals(this.name, designation.name) &&
        Objects.equals(this.code, designation.code) &&
        Objects.equals(this.description, designation.description) &&
        Objects.equals(this.chartOfAccounts, designation.chartOfAccounts) &&
        Objects.equals(this.active, designation.active);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, code, description, chartOfAccounts, active);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Designation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    chartOfAccounts: ").append(toIndentedString(chartOfAccounts)).append("\n");
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

