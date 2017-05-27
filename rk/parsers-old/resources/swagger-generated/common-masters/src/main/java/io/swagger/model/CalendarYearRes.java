package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CalendarYear;
import io.swagger.model.ResponseInfo;
import java.util.ArrayList;
import java.util.List;




/**
 * CalendarYearRes
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-22T11:20:22.652+05:30")

public class CalendarYearRes   {
  private ResponseInfo responseInfo = null;

  private List<CalendarYear> calendarYear = new ArrayList<CalendarYear>();

  public CalendarYearRes responseInfo(ResponseInfo responseInfo) {
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

  public CalendarYearRes calendarYear(List<CalendarYear> calendarYear) {
    this.calendarYear = calendarYear;
    return this;
  }

  public CalendarYearRes addCalendarYearItem(CalendarYear calendarYearItem) {
    this.calendarYear.add(calendarYearItem);
    return this;
  }

   /**
   * Get calendarYear
   * @return calendarYear
  **/
  @ApiModelProperty(value = "")
  public List<CalendarYear> getCalendarYear() {
    return calendarYear;
  }

  public void setCalendarYear(List<CalendarYear> calendarYear) {
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
    CalendarYearRes calendarYearRes = (CalendarYearRes) o;
    return Objects.equals(this.responseInfo, calendarYearRes.responseInfo) &&
        Objects.equals(this.calendarYear, calendarYearRes.calendarYear);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseInfo, calendarYear);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalendarYearRes {\n");
    
    sb.append("    responseInfo: ").append(toIndentedString(responseInfo)).append("\n");
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

