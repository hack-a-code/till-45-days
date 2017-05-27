package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.LeaveOpeningBalance;
import io.swagger.model.RequestInfo;
import java.util.ArrayList;
import java.util.List;




/**
 * LeaveOpeningBalanceReq
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-22T11:21:39.340+05:30")

public class LeaveOpeningBalanceReq   {
  private RequestInfo requestInfo = null;

  private List<LeaveOpeningBalance> leaveOpeningBalance = new ArrayList<LeaveOpeningBalance>();

  public LeaveOpeningBalanceReq requestInfo(RequestInfo requestInfo) {
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

  public LeaveOpeningBalanceReq leaveOpeningBalance(List<LeaveOpeningBalance> leaveOpeningBalance) {
    this.leaveOpeningBalance = leaveOpeningBalance;
    return this;
  }

  public LeaveOpeningBalanceReq addLeaveOpeningBalanceItem(LeaveOpeningBalance leaveOpeningBalanceItem) {
    this.leaveOpeningBalance.add(leaveOpeningBalanceItem);
    return this;
  }

   /**
   * Get leaveOpeningBalance
   * @return leaveOpeningBalance
  **/
  @ApiModelProperty(value = "")
  public List<LeaveOpeningBalance> getLeaveOpeningBalance() {
    return leaveOpeningBalance;
  }

  public void setLeaveOpeningBalance(List<LeaveOpeningBalance> leaveOpeningBalance) {
    this.leaveOpeningBalance = leaveOpeningBalance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeaveOpeningBalanceReq leaveOpeningBalanceReq = (LeaveOpeningBalanceReq) o;
    return Objects.equals(this.requestInfo, leaveOpeningBalanceReq.requestInfo) &&
        Objects.equals(this.leaveOpeningBalance, leaveOpeningBalanceReq.leaveOpeningBalance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestInfo, leaveOpeningBalance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeaveOpeningBalanceReq {\n");
    
    sb.append("    requestInfo: ").append(toIndentedString(requestInfo)).append("\n");
    sb.append("    leaveOpeningBalance: ").append(toIndentedString(leaveOpeningBalance)).append("\n");
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

