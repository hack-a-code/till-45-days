package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.LocalDate;




/**
 * Regularisation
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-09T19:48:07.703+05:30")

public class Regularisation   {
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

  public Regularisation id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the regularisation details.
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier of the regularisation details.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Regularisation designation(Long designation) {
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

  public Regularisation declaredOn(LocalDate declaredOn) {
    this.declaredOn = declaredOn;
    return this;
  }

   /**
   * The date on which regularisation was declared.
   * @return declaredOn
  **/
  @ApiModelProperty(required = true, value = "The date on which regularisation was declared.")
  public LocalDate getDeclaredOn() {
    return declaredOn;
  }

  public void setDeclaredOn(LocalDate declaredOn) {
    this.declaredOn = declaredOn;
  }

  public Regularisation orderNo(String orderNo) {
    this.orderNo = orderNo;
    return this;
  }

   /**
   * The government order number passed for the regularisation.
   * @return orderNo
  **/
  @ApiModelProperty(value = "The government order number passed for the regularisation.")
  public String getOrderNo() {
    return orderNo;
  }

  public void setOrderNo(String orderNo) {
    this.orderNo = orderNo;
  }

  public Regularisation orderDate(LocalDate orderDate) {
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

  public Regularisation remarks(String remarks) {
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

  public Regularisation createdBy(Long createdBy) {
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

  public Regularisation createdDate(LocalDate createdDate) {
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

  public Regularisation lastModifiedBy(Long lastModifiedBy) {
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

  public Regularisation lastModifiedDate(LocalDate lastModifiedDate) {
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
    Regularisation regularisation = (Regularisation) o;
    return Objects.equals(this.id, regularisation.id) &&
        Objects.equals(this.designation, regularisation.designation) &&
        Objects.equals(this.declaredOn, regularisation.declaredOn) &&
        Objects.equals(this.orderNo, regularisation.orderNo) &&
        Objects.equals(this.orderDate, regularisation.orderDate) &&
        Objects.equals(this.remarks, regularisation.remarks) &&
        Objects.equals(this.createdBy, regularisation.createdBy) &&
        Objects.equals(this.createdDate, regularisation.createdDate) &&
        Objects.equals(this.lastModifiedBy, regularisation.lastModifiedBy) &&
        Objects.equals(this.lastModifiedDate, regularisation.lastModifiedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, designation, declaredOn, orderNo, orderDate, remarks, createdBy, createdDate, lastModifiedBy, lastModifiedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Regularisation {\n");
    
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

