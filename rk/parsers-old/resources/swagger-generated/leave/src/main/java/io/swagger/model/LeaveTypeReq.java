package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.LeaveType;
import io.swagger.model.RequestInfo;
import java.util.ArrayList;
import java.util.List;




/**
 * LeaveTypeReq
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-22T11:21:39.340+05:30")

public class LeaveTypeReq   {
  private RequestInfo requestInfo = null;

  private List<LeaveType> leaveType = new ArrayList<LeaveType>();

  public LeaveTypeReq requestInfo(RequestInfo requestInfo) {
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

  public LeaveTypeReq leaveType(List<LeaveType> leaveType) {
    this.leaveType = leaveType;
    return this;
  }

  public LeaveTypeReq addLeaveTypeItem(LeaveType leaveTypeItem) {
    this.leaveType.add(leaveTypeItem);
    return this;
  }

   /**
   * Get leaveType
   * @return leaveType
  **/
  @ApiModelProperty(value = "")
  public List<LeaveType> getLeaveType() {
    return leaveType;
  }

  public void setLeaveType(List<LeaveType> leaveType) {
    this.leaveType = leaveType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeaveTypeReq leaveTypeReq = (LeaveTypeReq) o;
    return Objects.equals(this.requestInfo, leaveTypeReq.requestInfo) &&
        Objects.equals(this.leaveType, leaveTypeReq.leaveType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestInfo, leaveType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeaveTypeReq {\n");
    
    sb.append("    requestInfo: ").append(toIndentedString(requestInfo)).append("\n");
    sb.append("    leaveType: ").append(toIndentedString(leaveType)).append("\n");
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

