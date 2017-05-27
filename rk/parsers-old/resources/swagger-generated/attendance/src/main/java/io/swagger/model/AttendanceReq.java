package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Attendance;
import io.swagger.model.RequestInfo;
import java.util.ArrayList;
import java.util.List;




/**
 * AttendanceReq
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-22T10:24:33.929+05:30")

public class AttendanceReq   {
  private RequestInfo requestInfo = null;

  private List<Attendance> attendance = new ArrayList<Attendance>();

  public AttendanceReq requestInfo(RequestInfo requestInfo) {
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

  public AttendanceReq attendance(List<Attendance> attendance) {
    this.attendance = attendance;
    return this;
  }

  public AttendanceReq addAttendanceItem(Attendance attendanceItem) {
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
    AttendanceReq attendanceReq = (AttendanceReq) o;
    return Objects.equals(this.requestInfo, attendanceReq.requestInfo) &&
        Objects.equals(this.attendance, attendanceReq.attendance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestInfo, attendance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttendanceReq {\n");
    
    sb.append("    requestInfo: ").append(toIndentedString(requestInfo)).append("\n");
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

