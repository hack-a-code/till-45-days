package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.LeaveApplication;
import io.swagger.model.ResponseInfo;
import java.util.ArrayList;
import java.util.List;




/**
 * LeaveApplicationRes
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-22T11:21:39.340+05:30")

public class LeaveApplicationRes   {
  private ResponseInfo responseInfo = null;

  private List<LeaveApplication> leaveApplication = new ArrayList<LeaveApplication>();

  public LeaveApplicationRes responseInfo(ResponseInfo responseInfo) {
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

  public LeaveApplicationRes leaveApplication(List<LeaveApplication> leaveApplication) {
    this.leaveApplication = leaveApplication;
    return this;
  }

  public LeaveApplicationRes addLeaveApplicationItem(LeaveApplication leaveApplicationItem) {
    this.leaveApplication.add(leaveApplicationItem);
    return this;
  }

   /**
   * Get leaveApplication
   * @return leaveApplication
  **/
  @ApiModelProperty(value = "")
  public List<LeaveApplication> getLeaveApplication() {
    return leaveApplication;
  }

  public void setLeaveApplication(List<LeaveApplication> leaveApplication) {
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
    LeaveApplicationRes leaveApplicationRes = (LeaveApplicationRes) o;
    return Objects.equals(this.responseInfo, leaveApplicationRes.responseInfo) &&
        Objects.equals(this.leaveApplication, leaveApplicationRes.leaveApplication);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseInfo, leaveApplication);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeaveApplicationRes {\n");
    
    sb.append("    responseInfo: ").append(toIndentedString(responseInfo)).append("\n");
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

