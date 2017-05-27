package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.LocalDate;




/**
 * LeaveApplication
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-22T11:21:39.340+05:30")

public class LeaveApplication   {
  private String id = null;

  private String applicationNumber = null;

  private Long employee = null;

  private Object leaveType = null;

  private LocalDate fromDate = null;

  private LocalDate toDate = null;

  private LocalDate compensatoryForDate = null;

  private Float leaveDays = null;

  private Float availableDays = null;

  private Integer halfdays = null;

  private Boolean firstHalfleave = null;

  private String reason = null;

  private Object status = null;

  private String stateId = null;

  private String createdBy = null;

  private LocalDate createdDate = null;

  private String lastModifiedBy = null;

  private LocalDate lastModifiedDate = null;

  public LeaveApplication id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique id an employee leave.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The unique id an employee leave.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LeaveApplication applicationNumber(String applicationNumber) {
    this.applicationNumber = applicationNumber;
    return this;
  }

   /**
   * The unique leave application number.
   * @return applicationNumber
  **/
  @ApiModelProperty(required = true, value = "The unique leave application number.")
  public String getApplicationNumber() {
    return applicationNumber;
  }

  public void setApplicationNumber(String applicationNumber) {
    this.applicationNumber = applicationNumber;
  }

  public LeaveApplication employee(Long employee) {
    this.employee = employee;
    return this;
  }

   /**
   * Unique id of the employee
   * @return employee
  **/
  @ApiModelProperty(required = true, value = "Unique id of the employee")
  public Long getEmployee() {
    return employee;
  }

  public void setEmployee(Long employee) {
    this.employee = employee;
  }

  public LeaveApplication leaveType(Object leaveType) {
    this.leaveType = leaveType;
    return this;
  }

   /**
   * which leave type the leaves are allocated.
   * @return leaveType
  **/
  @ApiModelProperty(required = true, value = "which leave type the leaves are allocated.")
  public Object getLeaveType() {
    return leaveType;
  }

  public void setLeaveType(Object leaveType) {
    this.leaveType = leaveType;
  }

  public LeaveApplication fromDate(LocalDate fromDate) {
    this.fromDate = fromDate;
    return this;
  }

   /**
   * Date from which the leave is applied for.
   * @return fromDate
  **/
  @ApiModelProperty(required = true, value = "Date from which the leave is applied for.")
  public LocalDate getFromDate() {
    return fromDate;
  }

  public void setFromDate(LocalDate fromDate) {
    this.fromDate = fromDate;
  }

  public LeaveApplication toDate(LocalDate toDate) {
    this.toDate = toDate;
    return this;
  }

   /**
   * Date to which the leave is applied for.
   * @return toDate
  **/
  @ApiModelProperty(required = true, value = "Date to which the leave is applied for.")
  public LocalDate getToDate() {
    return toDate;
  }

  public void setToDate(LocalDate toDate) {
    this.toDate = toDate;
  }

  public LeaveApplication compensatoryForDate(LocalDate compensatoryForDate) {
    this.compensatoryForDate = compensatoryForDate;
    return this;
  }

   /**
   * Date worked on for which compensatory leave is applied for. This value will be given only when applying for compensatory leave.
   * @return compensatoryForDate
  **/
  @ApiModelProperty(value = "Date worked on for which compensatory leave is applied for. This value will be given only when applying for compensatory leave.")
  public LocalDate getCompensatoryForDate() {
    return compensatoryForDate;
  }

  public void setCompensatoryForDate(LocalDate compensatoryForDate) {
    this.compensatoryForDate = compensatoryForDate;
  }

  public LeaveApplication leaveDays(Float leaveDays) {
    this.leaveDays = leaveDays;
    return this;
  }

   /**
   * Number of days for which leaves are applied for. Only whole number and 0.5 to be allowed. Allow maximum value till 2000.
   * @return leaveDays
  **/
  @ApiModelProperty(value = "Number of days for which leaves are applied for. Only whole number and 0.5 to be allowed. Allow maximum value till 2000.")
  public Float getLeaveDays() {
    return leaveDays;
  }

  public void setLeaveDays(Float leaveDays) {
    this.leaveDays = leaveDays;
  }

  public LeaveApplication availableDays(Float availableDays) {
    this.availableDays = availableDays;
    return this;
  }

   /**
   * Number of days available for the employee at the time of applying for leave. Only whole number and 0.5 to be allowed. Allow maximum value till 2000.
   * @return availableDays
  **/
  @ApiModelProperty(value = "Number of days available for the employee at the time of applying for leave. Only whole number and 0.5 to be allowed. Allow maximum value till 2000.")
  public Float getAvailableDays() {
    return availableDays;
  }

  public void setAvailableDays(Float availableDays) {
    this.availableDays = availableDays;
  }

  public LeaveApplication halfdays(Integer halfdays) {
    this.halfdays = halfdays;
    return this;
  }

   /**
   * If the leave type allows for half day leave then, this info needs to be captured if user is opting for half day leave.
   * @return halfdays
  **/
  @ApiModelProperty(value = "If the leave type allows for half day leave then, this info needs to be captured if user is opting for half day leave.")
  public Integer getHalfdays() {
    return halfdays;
  }

  public void setHalfdays(Integer halfdays) {
    this.halfdays = halfdays;
  }

  public LeaveApplication firstHalfleave(Boolean firstHalfleave) {
    this.firstHalfleave = firstHalfleave;
    return this;
  }

   /**
   * If the leave is applied for the first half of the day, value will be set to TRUE and if its applied for second half then value will FALSE.
   * @return firstHalfleave
  **/
  @ApiModelProperty(value = "If the leave is applied for the first half of the day, value will be set to TRUE and if its applied for second half then value will FALSE.")
  public Boolean getFirstHalfleave() {
    return firstHalfleave;
  }

  public void setFirstHalfleave(Boolean firstHalfleave) {
    this.firstHalfleave = firstHalfleave;
  }

  public LeaveApplication reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Reason for applying leave.
   * @return reason
  **/
  @ApiModelProperty(value = "Reason for applying leave.")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public LeaveApplication status(Object status) {
    this.status = status;
    return this;
  }

   /**
   * Current status of leave.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "Current status of leave.")
  public Object getStatus() {
    return status;
  }

  public void setStatus(Object status) {
    this.status = status;
  }

  public LeaveApplication stateId(String stateId) {
    this.stateId = stateId;
    return this;
  }

   /**
   * The unique id of the workflow table to track the current state of the leave.
   * @return stateId
  **/
  @ApiModelProperty(value = "The unique id of the workflow table to track the current state of the leave.")
  public String getStateId() {
    return stateId;
  }

  public void setStateId(String stateId) {
    this.stateId = stateId;
  }

  public LeaveApplication createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Id of the user who created the record.
   * @return createdBy
  **/
  @ApiModelProperty(value = "Id of the user who created the record.")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public LeaveApplication createdDate(LocalDate createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Date on which the user master data was added into the system.
   * @return createdDate
  **/
  @ApiModelProperty(value = "Date on which the user master data was added into the system.")
  public LocalDate getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(LocalDate createdDate) {
    this.createdDate = createdDate;
  }

  public LeaveApplication lastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

   /**
   * Id of the user who last modified the record.
   * @return lastModifiedBy
  **/
  @ApiModelProperty(value = "Id of the user who last modified the record.")
  public String getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }

  public LeaveApplication lastModifiedDate(LocalDate lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
    return this;
  }

   /**
   * Date on which the user master data was last modified.
   * @return lastModifiedDate
  **/
  @ApiModelProperty(value = "Date on which the user master data was last modified.")
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
    LeaveApplication leaveApplication = (LeaveApplication) o;
    return Objects.equals(this.id, leaveApplication.id) &&
        Objects.equals(this.applicationNumber, leaveApplication.applicationNumber) &&
        Objects.equals(this.employee, leaveApplication.employee) &&
        Objects.equals(this.leaveType, leaveApplication.leaveType) &&
        Objects.equals(this.fromDate, leaveApplication.fromDate) &&
        Objects.equals(this.toDate, leaveApplication.toDate) &&
        Objects.equals(this.compensatoryForDate, leaveApplication.compensatoryForDate) &&
        Objects.equals(this.leaveDays, leaveApplication.leaveDays) &&
        Objects.equals(this.availableDays, leaveApplication.availableDays) &&
        Objects.equals(this.halfdays, leaveApplication.halfdays) &&
        Objects.equals(this.firstHalfleave, leaveApplication.firstHalfleave) &&
        Objects.equals(this.reason, leaveApplication.reason) &&
        Objects.equals(this.status, leaveApplication.status) &&
        Objects.equals(this.stateId, leaveApplication.stateId) &&
        Objects.equals(this.createdBy, leaveApplication.createdBy) &&
        Objects.equals(this.createdDate, leaveApplication.createdDate) &&
        Objects.equals(this.lastModifiedBy, leaveApplication.lastModifiedBy) &&
        Objects.equals(this.lastModifiedDate, leaveApplication.lastModifiedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, applicationNumber, employee, leaveType, fromDate, toDate, compensatoryForDate, leaveDays, availableDays, halfdays, firstHalfleave, reason, status, stateId, createdBy, createdDate, lastModifiedBy, lastModifiedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeaveApplication {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    applicationNumber: ").append(toIndentedString(applicationNumber)).append("\n");
    sb.append("    employee: ").append(toIndentedString(employee)).append("\n");
    sb.append("    leaveType: ").append(toIndentedString(leaveType)).append("\n");
    sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
    sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
    sb.append("    compensatoryForDate: ").append(toIndentedString(compensatoryForDate)).append("\n");
    sb.append("    leaveDays: ").append(toIndentedString(leaveDays)).append("\n");
    sb.append("    availableDays: ").append(toIndentedString(availableDays)).append("\n");
    sb.append("    halfdays: ").append(toIndentedString(halfdays)).append("\n");
    sb.append("    firstHalfleave: ").append(toIndentedString(firstHalfleave)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    stateId: ").append(toIndentedString(stateId)).append("\n");
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

