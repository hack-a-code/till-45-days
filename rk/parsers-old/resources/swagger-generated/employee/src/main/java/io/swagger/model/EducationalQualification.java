package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.LocalDate;




/**
 * EducationalQualification
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-09T19:48:07.703+05:30")

public class EducationalQualification   {
  private Long id = null;

  private String qualification = null;

  private String majorSubject = null;

  private Integer yearOfPassing = null;

  private String university = null;

  private Long createdBy = null;

  private LocalDate createdDate = null;

  private Long lastModifiedBy = null;

  private LocalDate lastModifiedDate = null;

  public EducationalQualification id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the qualification details.
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier of the qualification details.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public EducationalQualification qualification(String qualification) {
    this.qualification = qualification;
    return this;
  }

   /**
   * Name of the qualifying degree.
   * @return qualification
  **/
  @ApiModelProperty(required = true, value = "Name of the qualifying degree.")
  public String getQualification() {
    return qualification;
  }

  public void setQualification(String qualification) {
    this.qualification = qualification;
  }

  public EducationalQualification majorSubject(String majorSubject) {
    this.majorSubject = majorSubject;
    return this;
  }

   /**
   * The main subject studies as part of the qualifying degree.
   * @return majorSubject
  **/
  @ApiModelProperty(value = "The main subject studies as part of the qualifying degree.")
  public String getMajorSubject() {
    return majorSubject;
  }

  public void setMajorSubject(String majorSubject) {
    this.majorSubject = majorSubject;
  }

  public EducationalQualification yearOfPassing(Integer yearOfPassing) {
    this.yearOfPassing = yearOfPassing;
    return this;
  }

   /**
   * The year in which the employee has finished the qualification.
   * @return yearOfPassing
  **/
  @ApiModelProperty(required = true, value = "The year in which the employee has finished the qualification.")
  public Integer getYearOfPassing() {
    return yearOfPassing;
  }

  public void setYearOfPassing(Integer yearOfPassing) {
    this.yearOfPassing = yearOfPassing;
  }

  public EducationalQualification university(String university) {
    this.university = university;
    return this;
  }

   /**
   * Name of the university/board from which the mentioned qualification was acquired.
   * @return university
  **/
  @ApiModelProperty(value = "Name of the university/board from which the mentioned qualification was acquired.")
  public String getUniversity() {
    return university;
  }

  public void setUniversity(String university) {
    this.university = university;
  }

  public EducationalQualification createdBy(Long createdBy) {
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

  public EducationalQualification createdDate(LocalDate createdDate) {
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

  public EducationalQualification lastModifiedBy(Long lastModifiedBy) {
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

  public EducationalQualification lastModifiedDate(LocalDate lastModifiedDate) {
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
    EducationalQualification educationalQualification = (EducationalQualification) o;
    return Objects.equals(this.id, educationalQualification.id) &&
        Objects.equals(this.qualification, educationalQualification.qualification) &&
        Objects.equals(this.majorSubject, educationalQualification.majorSubject) &&
        Objects.equals(this.yearOfPassing, educationalQualification.yearOfPassing) &&
        Objects.equals(this.university, educationalQualification.university) &&
        Objects.equals(this.createdBy, educationalQualification.createdBy) &&
        Objects.equals(this.createdDate, educationalQualification.createdDate) &&
        Objects.equals(this.lastModifiedBy, educationalQualification.lastModifiedBy) &&
        Objects.equals(this.lastModifiedDate, educationalQualification.lastModifiedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, qualification, majorSubject, yearOfPassing, university, createdBy, createdDate, lastModifiedBy, lastModifiedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EducationalQualification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    qualification: ").append(toIndentedString(qualification)).append("\n");
    sb.append("    majorSubject: ").append(toIndentedString(majorSubject)).append("\n");
    sb.append("    yearOfPassing: ").append(toIndentedString(yearOfPassing)).append("\n");
    sb.append("    university: ").append(toIndentedString(university)).append("\n");
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

