package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.LocalDate;




/**
 * Probation
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-09T19:48:07.703+05:30")

public class Probation   {
  private Long id = null;

  private Long designation = null;

  private LocalDate declaredOn = null;

  private String orderNo = null;

  private LocalDate orderDate = null;

  private String remarks = null;

  private Long createdBy = null;

  private LocalDate createdDate = null;

  private Long lastModifiedBy = null;

  private LocalDate lastModifiedDate = null;

  public Probation id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the probation details.
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier of the probation details.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Probation designation(Long designation) {
    this.designation = designation;
    return this;
  }

   /**
   * The designated post in which probation was done for that employee.
   * @return designation
  **/
  @ApiModelProperty(required = true, value = "The designated post in which probation was done for that employee.")
  public Long getDesignation() {
    return designation;
  }

  public void setDesignation(Long designation) {
    this.designation = designation;
  }

  public Probation declaredOn(LocalDate declaredOn) {
    this.declaredOn = declaredOn;
    return this;
  }

   /**
   * The date on which probation was initiated.
   * @return declaredOn
  **/
  @ApiModelProperty(required = true, value = "The date on which probation was initiated.")
  public LocalDate getDeclaredOn() {
    return declaredOn;
  }

  public void setDeclaredOn(LocalDate declaredOn) {
    this.declaredOn = declaredOn;
  }

  public Probation orderNo(String orderNo) {
    this.orderNo = orderNo;
    return this;
  }

   /**
   * The government order number passed for the probation.
   * @return orderNo
  **/
  @ApiModelProperty(value = "The government order number passed for the probation.")
  public String getOrderNo() {
    return orderNo;
  }

  public void setOrderNo(String orderNo) {
    this.orderNo = orderNo;
  }

  public Probation orderDate(LocalDate orderDate) {
    this.orderDate = orderDate;
    return this;
  }

   /**
   * The date on which GO over was given.
   * @return orderDate
  **/
  @ApiModelProperty(value = "The date on which GO over was given.")
  public LocalDate getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(LocalDate orderDate) {
    this.orderDate = orderDate;
  }

  public Probation remarks(String remarks) {
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

  public Probation createdBy(Long createdBy) {
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

  public Probation createdDate(LocalDate createdDate) {
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

  public Probation lastModifiedBy(Long lastModifiedBy) {
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

  public Probation lastModifiedDate(LocalDate lastModifiedDate) {
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
    Probation probation = (Probation) o;
    return Objects.equals(this.id, probation.id) &&
        Objects.equals(this.designation, probation.designation) &&
        Objects.equals(this.declaredOn, probation.declaredOn) &&
        Objects.equals(this.orderNo, probation.orderNo) &&
        Objects.equals(this.orderDate, probation.orderDate) &&
        Objects.equals(this.remarks, probation.remarks) &&
        Objects.equals(this.createdBy, probation.createdBy) &&
        Objects.equals(this.createdDate, probation.createdDate) &&
        Objects.equals(this.lastModifiedBy, probation.lastModifiedBy) &&
        Objects.equals(this.lastModifiedDate, probation.lastModifiedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, designation, declaredOn, orderNo, orderDate, remarks, createdBy, createdDate, lastModifiedBy, lastModifiedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Probation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    designation: ").append(toIndentedString(designation)).append("\n");
    sb.append("    declaredOn: ").append(toIndentedString(declaredOn)).append("\n");
    sb.append("    orderNo: ").append(toIndentedString(orderNo)).append("\n");
    sb.append("    orderDate: ").append(toIndentedString(orderDate)).append("\n");
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

