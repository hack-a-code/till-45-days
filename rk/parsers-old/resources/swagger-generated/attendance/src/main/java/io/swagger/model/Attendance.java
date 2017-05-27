package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.LocalDate;



/**
 * Employee attendance will be marked day wise. Holidays will be marked as &#x60;H&#x60; and present will be marked as &#x60;P&#x60;.
 **/

/**
 * Employee attendance will be marked day wise. Holidays will be marked as &#x60;H&#x60; and present will be marked as &#x60;P&#x60;.
 */
@ApiModel(description = "Employee attendance will be marked day wise. Holidays will be marked as `H` and present will be marked as `P`.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-22T10:24:33.929+05:30")

public class Attendance   {
  private Long id = null;

  private LocalDate date = null;

  private Long employee = null;

  private String month = null;

  private String year = null;

  private Object type = null;

  private String remarks = null;

  private Long createdBy = null;

  private LocalDate createdDate = null;

  private Long lastModifiedBy = null;

  private LocalDate lastModifiedDate = null;

  public Attendance id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the attendance.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique identifier of the attendance.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Attendance date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * Date of attendance of the employee.
   * @return date
  **/
  @ApiModelProperty(required = true, value = "Date of attendance of the employee.")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public Attendance employee(Long employee) {
    this.employee = employee;
    return this;
  }

   /**
   * Unique Employee Id to whom this attendance data belongs to.
   * @return employee
  **/
  @ApiModelProperty(required = true, value = "Unique Employee Id to whom this attendance data belongs to.")
  public Long getEmployee() {
    return employee;
  }

  public void setEmployee(Long employee) {
    this.employee = employee;
  }

  public Attendance month(String month) {
    this.month = month;
    return this;
  }

   /**
   * The month for which this attendance belongs to.
   * @return month
  **/
  @ApiModelProperty(required = true, value = "The month for which this attendance belongs to.")
  public String getMonth() {
    return month;
  }

  public void setMonth(String month) {
    this.month = month;
  }

  public Attendance year(String year) {
    this.year = year;
    return this;
  }

   /**
   * Calander year for which this attendance belongs to.
   * @return year
  **/
  @ApiModelProperty(required = true, value = "Calander year for which this attendance belongs to.")
  public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }

  public Attendance type(Object type) {
    this.type = type;
    return this;
  }

   /**
   *  The attendance type applicable to this employee as on this date, based on if he/she was on leave or absent or holiday etc. Various types available in the system are-  type  | definition ----- |-----------     1 |Present     2 |Absent     3 |CompOff     4 |LeavePaid     5 |HalfPresent     6 |HalfLeavePaid     7 |TwoHalfLeavesPaid     8 |LeaveUnpaid     9 |HalfLeaveUnpaid     10|TwoHalfLeavesUnpaid     11|OverTime     12|CompOffElligibe     13|Holiday 
   * @return type
  **/
  @ApiModelProperty(required = true, value = " The attendance type applicable to this employee as on this date, based on if he/she was on leave or absent or holiday etc. Various types available in the system are-  type  | definition ----- |-----------     1 |Present     2 |Absent     3 |CompOff     4 |LeavePaid     5 |HalfPresent     6 |HalfLeavePaid     7 |TwoHalfLeavesPaid     8 |LeaveUnpaid     9 |HalfLeaveUnpaid     10|TwoHalfLeavesUnpaid     11|OverTime     12|CompOffElligibe     13|Holiday ")
  public Object getType() {
    return type;
  }

  public void setType(Object type) {
    this.type = type;
  }

  public Attendance remarks(String remarks) {
    this.remarks = remarks;
    return this;
  }

   /**
   * any general remark regarding that day attendance.
   * @return remarks
  **/
  @ApiModelProperty(value = "any general remark regarding that day attendance.")
  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }

  public Attendance createdBy(Long createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Id of the user who created the record.
   * @return createdBy
  **/
  @ApiModelProperty(required = true, value = "Id of the user who created the record.")
  public Long getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(Long createdBy) {
    this.createdBy = createdBy;
  }

  public Attendance createdDate(LocalDate createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Date on which the role master data was added into the system.
   * @return createdDate
  **/
  @ApiModelProperty(required = true, value = "Date on which the role master data was added into the system.")
  public LocalDate getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(LocalDate createdDate) {
    this.createdDate = createdDate;
  }

  public Attendance lastModifiedBy(Long lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

   /**
   * Id of the user who last modified the record.
   * @return lastModifiedBy
  **/
  @ApiModelProperty(value = "Id of the user who last modified the record.")
  public Long getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(Long lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }

  public Attendance lastModifiedDate(LocalDate lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
    return this;
  }

   /**
   * Date on which the role master data was last modified.
   * @return lastModifiedDate
  **/
  @ApiModelProperty(value = "Date on which the role master data was last modified.")
  public LocalDate getLastModifiedDate() {
    return lastModifiedDate;
  }

  public void setLastModifiedDate(LocalDate lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Attendance attendance = (Attendance) o;
    return Objects.equals(this.id, attendance.id) &&
        Objects.equals(this.date, attendance.date) &&
        Objects.equals(this.employee, attendance.employee) &&
        Objects.equals(this.month, attendance.month) &&
        Objects.equals(this.year, attendance.year) &&
        Objects.equals(this.type, attendance.type) &&
        Objects.equals(this.remarks, attendance.remarks) &&
        Objects.equals(this.createdBy, attendance.createdBy) &&
        Objects.equals(this.createdDate, attendance.createdDate) &&
        Objects.equals(this.lastModifiedBy, attendance.lastModifiedBy) &&
        Objects.equals(this.lastModifiedDate, attendance.lastModifiedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, date, employee, month, year, type, remarks, createdBy, createdDate, lastModifiedBy, lastModifiedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attendance {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    employee: ").append(toIndentedString(employee)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
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

