package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.LeaveAllotment;
import io.swagger.model.RequestInfo;
import java.util.ArrayList;
import java.util.List;




/**
 * LeaveAllotmentReq
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-22T11:21:39.340+05:30")

public class LeaveAllotmentReq   {
  private RequestInfo requestInfo = null;

  private List<LeaveAllotment> leaveAllotment = new ArrayList<LeaveAllotment>();

  public LeaveAllotmentReq requestInfo(RequestInfo requestInfo) {
    this.requestInfo = requestInfo;
    return this;
  }

   /**
   * Get requestInfo
   * @return requestInfo
  **/
  @ApiModelProperty(value = "")
  public RequestInfo getRequestInfo() {
    return requestInfo;
  }

  public void setRequestInfo(RequestInfo requestInfo) {
    this.requestInfo = requestInfo;
  }

  public LeaveAllotmentReq leaveAllotment(List<LeaveAllotment> leaveAllotment) {
    this.leaveAllotment = leaveAllotment;
    return this;
  }

  public LeaveAllotmentReq addLeaveAllotmentItem(LeaveAllotment leaveAllotmentItem) {
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
    LeaveAllotmentReq leaveAllotmentReq = (LeaveAllotmentReq) o;
    return Objects.equals(this.requestInfo, leaveAllotmentReq.requestInfo) &&
        Objects.equals(this.leaveAllotment, leaveAllotmentReq.leaveAllotment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestInfo, leaveAllotment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeaveAllotmentReq {\n");
    
    sb.append("    requestInfo: ").append(toIndentedString(requestInfo)).append("\n");
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

