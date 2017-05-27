package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.LocalDate;




/**
 * LeaveAllotment
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-22T11:21:39.340+05:30")

public class LeaveAllotment   {
  private String id = null;

  private Long designation = null;

  private Object leaveType = null;

  private Float noOfDays = null;

  private String createdBy = null;

  private LocalDate createdDate = null;

  private String lastModifiedBy = null;

  private LocalDate lastModifiedDate = null;

  public LeaveAllotment id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique id of leave allotment.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The unique id of leave allotment.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LeaveAllotment designation(Long designation) {
    this.designation = designation;
    return this;
  }

   /**
   * Unique Designation id
   * @return designation
  **/
  @ApiModelProperty(value = "Unique Designation id")
  public Long getDesignation() {
    return designation;
  }

  public void setDesignation(Long designation) {
    this.designation = designation;
  }

  public LeaveAllotment leaveType(Object leaveType) {
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

  public LeaveAllotment noOfDays(Float noOfDays) {
    this.noOfDays = noOfDays;
    return this;
  }

   /**
   * Number of days of leaves allocated. Only whole number and 0.5 to be allowed. Allow maximum value till 2000.
   * @return noOfDays
  **/
  @ApiModelProperty(required = true, value = "Number of days of leaves allocated. Only whole number and 0.5 to be allowed. Allow maximum value till 2000.")
  public Float getNoOfDays() {
    return noOfDays;
  }

  public void setNoOfDays(Float noOfDays) {
    this.noOfDays = noOfDays;
  }

  public LeaveAllotment createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Id of the user who created the record.
   * @return createdBy
  **/
  @ApiModelProperty(required = true, value = "Id of the user who created the record.")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public LeaveAllotment createdDate(LocalDate createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Date on which the user master data was added into the system.
   * @return createdDate
  **/
  @ApiModelProperty(required = true, value = "Date on which the user master data was added into the system.")
  public LocalDate getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(LocalDate createdDate) {
    this.createdDate = createdDate;
  }

  public LeaveAllotment lastModifiedBy(String lastModifiedBy) {
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

  public LeaveAllotment lastModifiedDate(LocalDate lastModifiedDate) {
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
    LeaveAllotment leaveAllotment = (LeaveAllotment) o;
    return Objects.equals(this.id, leaveAllotment.id) &&
        Objects.equals(this.designation, leaveAllotment.designation) &&
        Objects.equals(this.leaveType, leaveAllotment.leaveType) &&
        Objects.equals(this.noOfDays, leaveAllotment.noOfDays) &&
        Objects.equals(this.createdBy, leaveAllotment.createdBy) &&
        Objects.equals(this.createdDate, leaveAllotment.createdDate) &&
        Objects.equals(this.lastModifiedBy, leaveAllotment.lastModifiedBy) &&
        Objects.equals(this.lastModifiedDate, leaveAllotment.lastModifiedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, designation, leaveType, noOfDays, createdBy, createdDate, lastModifiedBy, lastModifiedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeaveAllotment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    designation: ").append(toIndentedString(designation)).append("\n");
    sb.append("    leaveType: ").append(toIndentedString(leaveType)).append("\n");
    sb.append("    noOfDays: ").append(toIndentedString(noOfDays)).append("\n");
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

