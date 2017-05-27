package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Attendance;
import io.swagger.model.ResponseInfo;
import java.util.ArrayList;
import java.util.List;




/**
 * AttendanceRes
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-22T10:24:33.929+05:30")

public class AttendanceRes   {
  private ResponseInfo responseInfo = null;

  private List<Attendance> attendance = new ArrayList<Attendance>();

  public AttendanceRes responseInfo(ResponseInfo responseInfo) {
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

  public AttendanceRes attendance(List<Attendance> attendance) {
    this.attendance = attendance;
    return this;
  }

  public AttendanceRes addAttendanceItem(Attendance attendanceItem) {
    this.attendance.add(attendanceItem);
    return this;
  }

   /**
   * Get attendance
   * @return attendance
  **/
  @ApiModelProperty(value = "")
  public List<Attendance> getAttendance() {
    return attendance;
  }

  public void setAttendance(List<Attendance> attendance) {
    this.attendance = attendance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttendanceRes attendanceRes = (AttendanceRes) o;
    return Objects.equals(this.responseInfo, attendanceRes.responseInfo) &&
        Objects.equals(this.attendance, attendanceRes.attendance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseInfo, attendance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttendanceRes {\n");
    
    sb.append("    responseInfo: ").append(toIndentedString(responseInfo)).append("\n");
    sb.append("    attendance: ").append(toIndentedString(attendance)).append("\n");
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

