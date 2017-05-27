package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.HRConfigurationKeyValues;
import io.swagger.model.ResponseInfo;
import java.util.ArrayList;
import java.util.List;




/**
 * HRConfigurationRes
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-10T12:36:58.677+05:30")

public class HRConfigurationRes   {
  private ResponseInfo responseInfo = null;

  private List<HRConfigurationKeyValues> hRConfiguration = new ArrayList<HRConfigurationKeyValues>();

  public HRConfigurationRes responseInfo(ResponseInfo responseInfo) {
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

  public HRConfigurationRes hRConfiguration(List<HRConfigurationKeyValues> hRConfiguration) {
    this.hRConfiguration = hRConfiguration;
    return this;
  }

  public HRConfigurationRes addHRConfigurationItem(HRConfigurationKeyValues hRConfigurationItem) {
    this.hRConfiguration.add(hRConfigurationItem);
    return this;
  }

   /**
   * Get hRConfiguration
   * @return hRConfiguration
  **/
  @ApiModelProperty(value = "")
  public List<HRConfigurationKeyValues> getHRConfiguration() {
    return hRConfiguration;
  }

  public void setHRConfiguration(List<HRConfigurationKeyValues> hRConfiguration) {
    this.hRConfiguration = hRConfiguration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HRConfigurationRes hRConfigurationRes = (HRConfigurationRes) o;
    return Objects.equals(this.responseInfo, hRConfigurationRes.responseInfo) &&
        Objects.equals(this.hRConfiguration, hRConfigurationRes.hRConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseInfo, hRConfiguration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HRConfigurationRes {\n");
    
    sb.append("    responseInfo: ").append(toIndentedString(responseInfo)).append("\n");
    sb.append("    hRConfiguration: ").append(toIndentedString(hRConfiguration)).append("\n");
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

