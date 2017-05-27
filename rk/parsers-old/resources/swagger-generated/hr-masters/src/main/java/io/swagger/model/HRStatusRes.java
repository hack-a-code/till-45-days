package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.HRStatus;
import io.swagger.model.ResponseInfo;
import java.util.ArrayList;
import java.util.List;




/**
 * HRStatusRes
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-10T12:36:58.677+05:30")

public class HRStatusRes   {
  private ResponseInfo responseInfo = null;

  private List<HRStatus> hRStatus = new ArrayList<HRStatus>();

  public HRStatusRes responseInfo(ResponseInfo responseInfo) {
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

  public HRStatusRes hRStatus(List<HRStatus> hRStatus) {
    this.hRStatus = hRStatus;
    return this;
  }

  public HRStatusRes addHRStatusItem(HRStatus hRStatusItem) {
    this.hRStatus.add(hRStatusItem);
    return this;
  }

   /**
   * Get hRStatus
   * @return hRStatus
  **/
  @ApiModelProperty(value = "")
  public List<HRStatus> getHRStatus() {
    return hRStatus;
  }

  public void setHRStatus(List<HRStatus> hRStatus) {
    this.hRStatus = hRStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HRStatusRes hRStatusRes = (HRStatusRes) o;
    return Objects.equals(this.responseInfo, hRStatusRes.responseInfo) &&
        Objects.equals(this.hRStatus, hRStatusRes.hRStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseInfo, hRStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HRStatusRes {\n");
    
    sb.append("    responseInfo: ").append(toIndentedString(responseInfo)).append("\n");
    sb.append("    hRStatus: ").append(toIndentedString(hRStatus)).append("\n");
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

