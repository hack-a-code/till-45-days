package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.LocalDate;




/**
 * ServiceHistory
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-09T19:48:07.703+05:30")

public class ServiceHistory   {
  private Long id = null;

  private String serviceInfo = null;

  private LocalDate serviceFrom = null;

  private String remarks = null;

  private String orderNo = null;

  private Long createdBy = null;

  private LocalDate createdDate = null;

  private Long lastModifiedBy = null;

  private LocalDate lastModifiedDate = null;

  public ServiceHistory id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the service details.
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier of the service details.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ServiceHistory serviceInfo(String serviceInfo) {
    this.serviceInfo = serviceInfo;
    return this;
  }

   /**
   * Detail of the service that the employee has done.
   * @return serviceInfo
  **/
  @ApiModelProperty(required = true, value = "Detail of the service that the employee has done.")
  public String getServiceInfo() {
    return serviceInfo;
  }

  public void setServiceInfo(String serviceInfo) {
    this.serviceInfo = serviceInfo;
  }

  public ServiceHistory serviceFrom(LocalDate serviceFrom) {
    this.serviceFrom = serviceFrom;
    return this;
  }

   /**
   * The date on which this service was applicable from.
   * @return serviceFrom
  **/
  @ApiModelProperty(required = true, value = "The date on which this service was applicable from.")
  public LocalDate getServiceFrom() {
    return serviceFrom;
  }

  public void setServiceFrom(LocalDate serviceFrom) {
    this.serviceFrom = serviceFrom;
  }

  public ServiceHistory remarks(String remarks) {
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

  public ServiceHistory orderNo(String orderNo) {
    this.orderNo = orderNo;
    return this;
  }

   /**
   * The government order number passed for the service change.
   * @return orderNo
  **/
  @ApiModelProperty(value = "The government order number passed for the service change.")
  public String getOrderNo() {
    return orderNo;
  }

  public void setOrderNo(String orderNo) {
    this.orderNo = orderNo;
  }

  public ServiceHistory createdBy(Long createdBy) {
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

  public ServiceHistory createdDate(LocalDate createdDate) {
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

  public ServiceHistory lastModifiedBy(Long lastModifiedBy) {
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

  public ServiceHistory lastModifiedDate(LocalDate lastModifiedDate) {
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
    ServiceHistory serviceHistory = (ServiceHistory) o;
    return Objects.equals(this.id, serviceHistory.id) &&
        Objects.equals(this.serviceInfo, serviceHistory.serviceInfo) &&
        Objects.equals(this.serviceFrom, serviceHistory.serviceFrom) &&
        Objects.equals(this.remarks, serviceHistory.remarks) &&
        Objects.equals(this.orderNo, serviceHistory.orderNo) &&
        Objects.equals(this.createdBy, serviceHistory.createdBy) &&
        Objects.equals(this.createdDate, serviceHistory.createdDate) &&
        Objects.equals(this.lastModifiedBy, serviceHistory.lastModifiedBy) &&
        Objects.equals(this.lastModifiedDate, serviceHistory.lastModifiedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, serviceInfo, serviceFrom, remarks, orderNo, createdBy, createdDate, lastModifiedBy, lastModifiedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceHistory {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    serviceInfo: ").append(toIndentedString(serviceInfo)).append("\n");
    sb.append("    serviceFrom: ").append(toIndentedString(serviceFrom)).append("\n");
    sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
    sb.append("    orderNo: ").append(toIndentedString(orderNo)).append("\n");
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

