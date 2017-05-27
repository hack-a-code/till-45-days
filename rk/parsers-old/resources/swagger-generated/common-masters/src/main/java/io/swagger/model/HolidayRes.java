package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Holiday;
import io.swagger.model.ResponseInfo;
import java.util.ArrayList;
import java.util.List;




/**
 * HolidayRes
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-22T11:20:22.652+05:30")

public class HolidayRes   {
  private ResponseInfo responseInfo = null;

  private List<Holiday> holiday = new ArrayList<Holiday>();

  public HolidayRes responseInfo(ResponseInfo responseInfo) {
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

  public HolidayRes holiday(List<Holiday> holiday) {
    this.holiday = holiday;
    return this;
  }

  public HolidayRes addHolidayItem(Holiday holidayItem) {
    this.holiday.add(holidayItem);
    return this;
  }

   /**
   * Get holiday
   * @return holiday
  **/
  @ApiModelProperty(value = "")
  public List<Holiday> getHoliday() {
    return holiday;
  }

  public void setHoliday(List<Holiday> holiday) {
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
    HolidayRes holidayRes = (HolidayRes) o;
    return Objects.equals(this.responseInfo, holidayRes.responseInfo) &&
        Objects.equals(this.holiday, holidayRes.holiday);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseInfo, holiday);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HolidayRes {\n");
    
    sb.append("    responseInfo: ").append(toIndentedString(responseInfo)).append("\n");
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

