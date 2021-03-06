package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.LeaveApplication;
import io.swagger.model.RequestInfo;




/**
 * LeaveApplicationSingleReq
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-22T11:21:39.340+05:30")

public class LeaveApplicationSingleReq   {
  private RequestInfo requestInfo = null;

  private LeaveApplication leaveApplication = null;

  public LeaveApplicationSingleReq requestInfo(RequestInfo requestInfo) {
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

  public LeaveApplicationSingleReq leaveApplication(LeaveApplication leaveApplication) {
    this.leaveApplication = leaveApplication;
    return this;
  }

   /**
   * Get leaveApplication
   * @return leaveApplication
  **/
  @ApiModelProperty(value = "")
  public LeaveApplication getLeaveApplication() {
    return leaveApplication;
  }

  public void setLeaveApplication(LeaveApplication leaveApplication) {
    this.leaveApplication = leaveApplication;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeaveApplicationSingleReq leaveApplicationSingleReq = (LeaveApplicationSingleReq) o;
    return Objects.equals(this.requestInfo, leaveApplicationSingleReq.requestInfo) &&
        Objects.equals(this.leaveApplication, leaveApplicationSingleReq.leaveApplication);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestInfo, leaveApplication);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeaveApplicationSingleReq {\n");
    
    sb.append("    requestInfo: ").append(toIndentedString(requestInfo)).append("\n");
    sb.append("    leaveApplication: ").append(toIndentedString(leaveApplication)).append("\n");
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

