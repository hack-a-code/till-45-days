package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.LocalDate;




/**
 * DepartmentalTest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-09T19:48:07.703+05:30")

public class DepartmentalTest   {
  private Long id = null;

  private String test = null;

  private Integer yearOfPassing = null;

  private String remarks = null;

  private Long createdBy = null;

  private LocalDate createdDate = null;

  private Long lastModifiedBy = null;

  private LocalDate lastModifiedDate = null;

  public DepartmentalTest id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the departmental test details.
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier of the departmental test details.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public DepartmentalTest test(String test) {
    this.test = test;
    return this;
  }

   /**
   * Name of the Test taken.
   * @return test
  **/
  @ApiModelProperty(required = true, value = "Name of the Test taken.")
  public String getTest() {
    return test;
  }

  public void setTest(String test) {
    this.test = test;
  }

  public DepartmentalTest yearOfPassing(Integer yearOfPassing) {
    this.yearOfPassing = yearOfPassing;
    return this;
  }

   /**
   * The year in which the employee has qualified this test.
   * @return yearOfPassing
  **/
  @ApiModelProperty(required = true, value = "The year in which the employee has qualified this test.")
  public Integer getYearOfPassing() {
    return yearOfPassing;
  }

  public void setYearOfPassing(Integer yearOfPassing) {
    this.yearOfPassing = yearOfPassing;
  }

  public DepartmentalTest remarks(String remarks) {
    this.remarks = remarks;
    return this;
  }

   /**
   * Any general remarks.
   * @return remarks
  **/
  @ApiModelProperty(value = "Any general remarks.")
  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }

  public DepartmentalTest createdBy(Long createdBy) {
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

  public DepartmentalTest createdDate(LocalDate createdDate) {
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

  public DepartmentalTest lastModifiedBy(Long lastModifiedBy) {
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

  public DepartmentalTest lastModifiedDate(LocalDate lastModifiedDate) {
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
    DepartmentalTest departmentalTest = (DepartmentalTest) o;
    return Objects.equals(this.id, departmentalTest.id) &&
        Objects.equals(this.test, departmentalTest.test) &&
        Objects.equals(this.yearOfPassing, departmentalTest.yearOfPassing) &&
        Objects.equals(this.remarks, departmentalTest.remarks) &&
        Objects.equals(this.createdBy, departmentalTest.createdBy) &&
        Objects.equals(this.createdDate, departmentalTest.createdDate) &&
        Objects.equals(this.lastModifiedBy, departmentalTest.lastModifiedBy) &&
        Objects.equals(this.lastModifiedDate, departmentalTest.lastModifiedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, test, yearOfPassing, remarks, createdBy, createdDate, lastModifiedBy, lastModifiedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepartmentalTest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    test: ").append(toIndentedString(test)).append("\n");
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

