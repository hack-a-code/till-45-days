package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.HRConfigurationKeyValuesConfigValues;
import java.util.ArrayList;
import java.util.List;



/**
 * This object will depict how the respose object of configuration looks like. There will be a map of key value pairs where values will be a list. One key can have multiple values.
 **/

/**
 * This object will depict how the respose object of configuration looks like. There will be a map of key value pairs where values will be a list. One key can have multiple values.
 */
@ApiModel(description = "This object will depict how the respose object of configuration looks like. There will be a map of key value pairs where values will be a list. One key can have multiple values.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-10T12:36:58.677+05:30")

public class HRConfigurationKeyValues   {
  private List<HRConfigurationKeyValuesConfigValues> configValues = new ArrayList<HRConfigurationKeyValuesConfigValues>();

  public HRConfigurationKeyValues configValues(List<HRConfigurationKeyValuesConfigValues> configValues) {
    this.configValues = configValues;
    return this;
  }

  public HRConfigurationKeyValues addConfigValuesItem(HRConfigurationKeyValuesConfigValues configValuesItem) {
    this.configValues.add(configValuesItem);
    return this;
  }

   /**
   * Get configValues
   * @return configValues
  **/
  @ApiModelProperty(value = "")
  public List<HRConfigurationKeyValuesConfigValues> getConfigValues() {
    return configValues;
  }

  public void setConfigValues(List<HRConfigurationKeyValuesConfigValues> configValues) {
    this.configValues = configValues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HRConfigurationKeyValues hRConfigurationKeyValues = (HRConfigurationKeyValues) o;
    return Objects.equals(this.configValues, hRConfigurationKeyValues.configValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HRConfigurationKeyValues {\n");
    
    sb.append("    configValues: ").append(toIndentedString(configValues)).append("\n");
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

