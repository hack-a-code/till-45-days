package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CalendarYear;
import io.swagger.model.RequestInfo;




/**
 * CalendarYearReq
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-22T11:20:22.652+05:30")

public class CalendarYearReq   {
  private RequestInfo requestInfo = null;

  private CalendarYear calendarYear = null;

  public CalendarYearReq requestInfo(RequestInfo requestInfo) {
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

  public CalendarYearReq calendarYear(CalendarYear calendarYear) {
    this.calendarYear = calendarYear;
    return this;
  }

   /**
   * Get calendarYear
   * @return calendarYear
  **/
  @ApiModelProperty(value = "")
  public CalendarYear getCalendarYear() {
    return calendarYear;
  }

  public void setCalendarYear(CalendarYear calendarYear) {
    this.calendarYear = calendarYear;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalendarYearReq calendarYearReq = (CalendarYearReq) o;
    return Objects.equals(this.requestInfo, calendarYearReq.requestInfo) &&
        Objects.equals(this.calendarYear, calendarYearReq.calendarYear);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestInfo, calendarYear);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalendarYearReq {\n");
    
    sb.append("    requestInfo: ").append(toIndentedString(requestInfo)).append("\n");
    sb.append("    calendarYear: ").append(toIndentedString(calendarYear)).append("\n");
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

