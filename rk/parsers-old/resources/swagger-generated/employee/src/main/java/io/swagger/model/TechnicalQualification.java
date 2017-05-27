package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.LocalDate;




/**
 * TechnicalQualification
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-09T19:48:07.703+05:30")

public class TechnicalQualification   {
  private Long id = null;

  private String skill = null;

  private String grade = null;

  private Integer yearOfPassing = null;

  private String remarks = null;

  private Long createdBy = null;

  private LocalDate createdDate = null;

  private Long lastModifiedBy = null;

  private LocalDate lastModifiedDate = null;

  public TechnicalQualification id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the technical qualification details.
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier of the technical qualification details.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public TechnicalQualification skill(String skill) {
    this.skill = skill;
    return this;
  }

   /**
   * Name of the skill acquired.
   * @return skill
  **/
  @ApiModelProperty(required = true, value = "Name of the skill acquired.")
  public String getSkill() {
    return skill;
  }

  public void setSkill(String skill) {
    this.skill = skill;
  }

  public TechnicalQualification grade(String grade) {
    this.grade = grade;
    return this;
  }

   /**
   * What was the grade obtained for the skill mentioned. Values will be First Class, Second Class, A, A+, B etc.
   * @return grade
  **/
  @ApiModelProperty(value = "What was the grade obtained for the skill mentioned. Values will be First Class, Second Class, A, A+, B etc.")
  public String getGrade() {
    return grade;
  }

  public void setGrade(String grade) {
    this.grade = grade;
  }

  public TechnicalQualification yearOfPassing(Integer yearOfPassing) {
    this.yearOfPassing = yearOfPassing;
    return this;
  }

   /**
   * The year in which the employee has finished the skill course.
   * @return yearOfPassing
  **/
  @ApiModelProperty(value = "The year in which the employee has finished the skill course.")
  public Integer getYearOfPassing() {
    return yearOfPassing;
  }

  public void setYearOfPassing(Integer yearOfPassing) {
    this.yearOfPassing = yearOfPassing;
  }

  public TechnicalQualification remarks(String remarks) {
    this.remarks = remarks;
    return this;
  }

   /**
   * Any remarks to be captured for this service change.
   * @return remarks
  **/
  @ApiModelProperty(value = "Any remarks to be captured for this service change.")
  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }

  public TechnicalQualification createdBy(Long createdBy) {
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

  public TechnicalQualification createdDate(LocalDate createdDate) {
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

  public TechnicalQualification lastModifiedBy(Long lastModifiedBy) {
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

  public TechnicalQualification lastModifiedDate(LocalDate lastModifiedDate) {
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
    TechnicalQualification technicalQualification = (TechnicalQualification) o;
    return Objects.equals(this.id, technicalQualification.id) &&
        Objects.equals(this.skill, technicalQualification.skill) &&
        Objects.equals(this.grade, technicalQualification.grade) &&
        Objects.equals(this.yearOfPassing, technicalQualification.yearOfPassing) &&
        Objects.equals(this.remarks, technicalQualification.remarks) &&
        Objects.equals(this.createdBy, technicalQualification.createdBy) &&
        Objects.equals(this.createdDate, technicalQualification.createdDate) &&
        Objects.equals(this.lastModifiedBy, technicalQualification.lastModifiedBy) &&
        Objects.equals(this.lastModifiedDate, technicalQualification.lastModifiedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, skill, grade, yearOfPassing, remarks, createdBy, createdDate, lastModifiedBy, lastModifiedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TechnicalQualification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    skill: ").append(toIndentedString(skill)).append("\n");
    sb.append("    grade: ").append(toIndentedString(grade)).append("\n");
    sb.append("    yearOfPassing: ").append(toIndentedString(yearOfPassing)).append("\n");
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

