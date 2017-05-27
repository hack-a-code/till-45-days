package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.LeaveAllotment;
import io.swagger.model.ResponseInfo;
import java.util.ArrayList;
import java.util.List;




/**
 * LeaveAllotmentRes
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-22T11:21:39.340+05:30")

public class LeaveAllotmentRes   {
  private ResponseInfo responseInfo = null;

  private List<LeaveAllotment> leaveAllotment = new ArrayList<LeaveAllotment>();

  public LeaveAllotmentRes responseInfo(ResponseInfo responseInfo) {
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

  public LeaveAllotmentRes leaveAllotment(List<LeaveAllotment> leaveAllotment) {
    this.leaveAllotment = leaveAllotment;
    return this;
  }

  public LeaveAllotmentRes addLeaveAllotmentItem(LeaveAllotment leaveAllotmentItem) {
    this.leaveAllotment.add(leaveAllotmentItem);
    return this;
  }

   /**
   * Get leaveAllotment
   * @return leaveAllotment
  **/
  @ApiModelProperty(value = "")
  public List<LeaveAllotment> getLeaveAllotment() {
    return leaveAllotment;
  }

  public void setLeaveAllotment(List<LeaveAllotment> leaveAllotment) {
    this.leaveAllotment = leaveAllotment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeaveAllotmentRes leaveAllotmentRes = (LeaveAllotmentRes) o;
    return Objects.equals(this.responseInfo, leaveAllotmentRes.responseInfo) &&
        Objects.equals(this.leaveAllotment, leaveAllotmentRes.leaveAllotment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseInfo, leaveAllotment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeaveAllotmentRes {\n");
    
    sb.append("    responseInfo: ").append(toIndentedString(responseInfo)).append("\n");
    sb.append("    leaveAllotment: ").append(toIndentedString(leaveAllotment)).append("\n");
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

