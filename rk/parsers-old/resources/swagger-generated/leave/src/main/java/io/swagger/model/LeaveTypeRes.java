package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.LeaveType;
import io.swagger.model.ResponseInfo;
import java.util.ArrayList;
import java.util.List;




/**
 * LeaveTypeRes
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-22T11:21:39.340+05:30")

public class LeaveTypeRes   {
  private ResponseInfo responseInfo = null;

  private List<LeaveType> leaveType = new ArrayList<LeaveType>();

  public LeaveTypeRes responseInfo(ResponseInfo responseInfo) {
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

  public LeaveTypeRes leaveType(List<LeaveType> leaveType) {
    this.leaveType = leaveType;
    return this;
  }

  public LeaveTypeRes addLeaveTypeItem(LeaveType leaveTypeItem) {
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
    LeaveTypeRes leaveTypeRes = (LeaveTypeRes) o;
    return Objects.equals(this.responseInfo, leaveTypeRes.responseInfo) &&
        Objects.equals(this.leaveType, leaveTypeRes.leaveType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseInfo, leaveType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeaveTypeRes {\n");
    
    sb.append("    responseInfo: ").append(toIndentedString(responseInfo)).append("\n");
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

