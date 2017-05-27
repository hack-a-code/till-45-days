package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.HODDepartment;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;




/**
 * Assignment
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-09T19:48:07.703+05:30")

public class Assignment   {
  private Long id = null;

  private Long position = null;

  private Long fund = null;

  private String functionary = null;

  private String function = null;

  private Long designation = null;

  private Long department = null;

  private List<HODDepartment> hod = new ArrayList<HODDepartment>();

  private Boolean primary = null;

  private LocalDate fromDate = null;

  private LocalDate toDate = null;

  private String grade = null;

  private String govtOrderNumber = null;

  private Long createdBy = null;

  private LocalDate createdDate = null;

  private Long lastModifiedBy = null;

  private LocalDate lastModifiedDate = null;

  public Assignment id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the assignment.
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier of the assignment.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Assignment position(Long position) {
    this.position = position;
    return this;
  }

   /**
   * Position Id associated with the assignment.
   * @return position
  **/
  @ApiModelProperty(required = true, value = "Position Id associated with the assignment.")
  public Long getPosition() {
    return position;
  }

  public void setPosition(Long position) {
    this.position = position;
  }

  public Assignment fund(Long fund) {
    this.fund = fund;
    return this;
  }

   /**
   * Fund Id associated with the assignment.
   * @return fund
  **/
  @ApiModelProperty(value = "Fund Id associated with the assignment.")
  public Long getFund() {
    return fund;
  }

  public void setFund(Long fund) {
    this.fund = fund;
  }

  public Assignment functionary(String functionary) {
    this.functionary = functionary;
    return this;
  }

   /**
   * Functionary Id associated with the assignment.
   * @return functionary
  **/
  @ApiModelProperty(value = "Functionary Id associated with the assignment.")
  public String getFunctionary() {
    return functionary;
  }

  public void setFunctionary(String functionary) {
    this.functionary = functionary;
  }

  public Assignment function(String function) {
    this.function = function;
    return this;
  }

   /**
   * Function Id associated with the assignment.
   * @return function
  **/
  @ApiModelProperty(value = "Function Id associated with the assignment.")
  public String getFunction() {
    return function;
  }

  public void setFunction(String function) {
    this.function = function;
  }

  public Assignment designation(Long designation) {
    this.designation = designation;
    return this;
  }

   /**
   * Designation Id associated with the assignment.
   * @return designation
  **/
  @ApiModelProperty(required = true, value = "Designation Id associated with the assignment.")
  public Long getDesignation() {
    return designation;
  }

  public void setDesignation(Long designation) {
    this.designation = designation;
  }

  public Assignment department(Long department) {
    this.department = department;
    return this;
  }

   /**
   * Unique id of the Department associated with the assignment.
   * @return department
  **/
  @ApiModelProperty(required = true, value = "Unique id of the Department associated with the assignment.")
  public Long getDepartment() {
    return department;
  }

  public void setDepartment(Long department) {
    this.department = department;
  }

  public Assignment hod(List<HODDepartment> hod) {
    this.hod = hod;
    return this;
  }

  public Assignment addHodItem(HODDepartment hodItem) {
    this.hod.add(hodItem);
    return this;
  }

   /**
   * List of departments HOD.
   * @return hod
  **/
  @ApiModelProperty(value = "List of departments HOD.")
  public List<HODDepartment> getHod() {
    return hod;
  }

  public void setHod(List<HODDepartment> hod) {
    this.hod = hod;
  }

  public Assignment primary(Boolean primary) {
    this.primary = primary;
    return this;
  }

   /**
   * True if it is primary assignment and False if it is temporary assignment.
   * @return primary
  **/
  @ApiModelProperty(required = true, value = "True if it is primary assignment and False if it is temporary assignment.")
  public Boolean getPrimary() {
    return primary;
  }

  public void setPrimary(Boolean primary) {
    this.primary = primary;
  }

  public Assignment fromDate(LocalDate fromDate) {
    this.fromDate = fromDate;
    return this;
  }

   /**
   * From Date of assignment period.
   * @return fromDate
  **/
  @ApiModelProperty(required = true, value = "From Date of assignment period.")
  public LocalDate getFromDate() {
    return fromDate;
  }

  public void setFromDate(LocalDate fromDate) {
    this.fromDate = fromDate;
  }

  public Assignment toDate(LocalDate toDate) {
    this.toDate = toDate;
    return this;
  }

   /**
   * Till Date of assignment period.
   * @return toDate
  **/
  @ApiModelProperty(required = true, value = "Till Date of assignment period.")
  public LocalDate getToDate() {
    return toDate;
  }

  public void setToDate(LocalDate toDate) {
    this.toDate = toDate;
  }

  public Assignment grade(String grade) {
    this.grade = grade;
    return this;
  }

   /**
   * which grade does the employee belong to.
   * @return grade
  **/
  @ApiModelProperty(value = "which grade does the employee belong to.")
  public String getGrade() {
    return grade;
  }

  public void setGrade(String grade) {
    this.grade = grade;
  }

  public Assignment govtOrderNumber(String govtOrderNumber) {
    this.govtOrderNumber = govtOrderNumber;
    return this;
  }

   /**
   * The order number issued for any transfer, promotion, demotion or delegation of power.
   * @return govtOrderNumber
  **/
  @ApiModelProperty(value = "The order number issued for any transfer, promotion, demotion or delegation of power.")
  public String getGovtOrderNumber() {
    return govtOrderNumber;
  }

  public void setGovtOrderNumber(String govtOrderNumber) {
    this.govtOrderNumber = govtOrderNumber;
  }

  public Assignment createdBy(Long createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Id of the user who created the record.
   * @return createdBy
  **/
  @ApiModelProperty(value = "Id of the user who created the record.")
  public Long getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(Long createdBy) {
    this.createdBy = createdBy;
  }

  public Assignment createdDate(LocalDate createdDate) {
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

  public Assignment lastModifiedBy(Long lastModifiedBy) {
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

  public Assignment lastModifiedDate(LocalDate lastModifiedDate) {
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
    Assignment assignment = (Assignment) o;
    return Objects.equals(this.id, assignment.id) &&
        Objects.equals(this.position, assignment.position) &&
        Objects.equals(this.fund, assignment.fund) &&
        Objects.equals(this.functionary, assignment.functionary) &&
        Objects.equals(this.function, assignment.function) &&
        Objects.equals(this.designation, assignment.designation) &&
        Objects.equals(this.department, assignment.department) &&
        Objects.equals(this.hod, assignment.hod) &&
        Objects.equals(this.primary, assignment.primary) &&
        Objects.equals(this.fromDate, assignment.fromDate) &&
        Objects.equals(this.toDate, assignment.toDate) &&
        Objects.equals(this.grade, assignment.grade) &&
        Objects.equals(this.govtOrderNumber, assignment.govtOrderNumber) &&
        Objects.equals(this.createdBy, assignment.createdBy) &&
        Objects.equals(this.createdDate, assignment.createdDate) &&
        Objects.equals(this.lastModifiedBy, assignment.lastModifiedBy) &&
        Objects.equals(this.lastModifiedDate, assignment.lastModifiedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, position, fund, functionary, function, designation, department, hod, primary, fromDate, toDate, grade, govtOrderNumber, createdBy, createdDate, lastModifiedBy, lastModifiedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assignment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    fund: ").append(toIndentedString(fund)).append("\n");
    sb.append("    functionary: ").append(toIndentedString(functionary)).append("\n");
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
    sb.append("    designation: ").append(toIndentedString(designation)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    hod: ").append(toIndentedString(hod)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
    sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
    sb.append("    grade: ").append(toIndentedString(grade)).append("\n");
    sb.append("    govtOrderNumber: ").append(toIndentedString(govtOrderNumber)).append("\n");
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

