package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Holiday;
import io.swagger.model.RequestInfo;




/**
 * HolidayReq
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-22T11:20:22.652+05:30")

public class HolidayReq   {
  private RequestInfo requestInfo = null;

  private Holiday holiday = null;

  public HolidayReq requestInfo(RequestInfo requestInfo) {
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

  public HolidayReq holiday(Holiday holiday) {
    this.holiday = holiday;
    return this;
  }

   /**
   * Get holiday
   * @return holiday
  **/
  @ApiModelProperty(value = "")
  public Holiday getHoliday() {
    return holiday;
  }

  public void setHoliday(Holiday holiday) {
    this.holiday = holiday;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HolidayReq holidayReq = (HolidayReq) o;
    return Objects.equals(this.requestInfo, holidayReq.requestInfo) &&
        Objects.equals(this.holiday, holidayReq.holiday);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestInfo, holiday);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HolidayReq {\n");
    
    sb.append("    requestInfo: ").append(toIndentedString(requestInfo)).append("\n");
    sb.append("    holiday: ").append(toIndentedString(holiday)).append("\n");
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

