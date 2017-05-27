package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.LeaveOpeningBalance;
import io.swagger.model.ResponseInfo;
import java.util.ArrayList;
import java.util.List;




/**
 * LeaveOpeningBalanceRes
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-22T11:21:39.340+05:30")

public class LeaveOpeningBalanceRes   {
  private ResponseInfo responseInfo = null;

  private List<LeaveOpeningBalance> leaveOpeningBalance = new ArrayList<LeaveOpeningBalance>();

  public LeaveOpeningBalanceRes responseInfo(ResponseInfo responseInfo) {
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

  public LeaveOpeningBalanceRes leaveOpeningBalance(List<LeaveOpeningBalance> leaveOpeningBalance) {
    this.leaveOpeningBalance = leaveOpeningBalance;
    return this;
  }

  public LeaveOpeningBalanceRes addLeaveOpeningBalanceItem(LeaveOpeningBalance leaveOpeningBalanceItem) {
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
    LeaveOpeningBalanceRes leaveOpeningBalanceRes = (LeaveOpeningBalanceRes) o;
    return Objects.equals(this.responseInfo, leaveOpeningBalanceRes.responseInfo) &&
        Objects.equals(this.leaveOpeningBalance, leaveOpeningBalanceRes.leaveOpeningBalance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseInfo, leaveOpeningBalance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeaveOpeningBalanceRes {\n");
    
    sb.append("    responseInfo: ").append(toIndentedString(responseInfo)).append("\n");
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

