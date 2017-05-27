package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.LocalDate;




/**
 * LeaveType
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-22T11:21:39.340+05:30")

public class LeaveType   {
  private Long id = null;

  private String name = null;

  private String description = null;

  private Boolean halfdayAllowed = null;

  private Boolean payEligible = null;

  private Boolean accumulative = null;

  private Boolean encashable = null;

  private Boolean active = true;

  private String createdBy = null;

  private LocalDate createdDate = null;

  private String lastModifiedBy = null;

  private LocalDate lastModifiedDate = null;

  public LeaveType id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * The unique id a leave type.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The unique id a leave type.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public LeaveType name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The unique name of Leave type.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The unique name of Leave type.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LeaveType description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Brief description of Leave type.
   * @return description
  **/
  @ApiModelProperty(value = "Brief description of Leave type.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LeaveType halfdayAllowed(Boolean halfdayAllowed) {
    this.halfdayAllowed = halfdayAllowed;
    return this;
  }

   /**
   * If half day leave is allowed for this leave type then the value will be TRUE, else the value will be FALSE.
   * @return halfdayAllowed
  **/
  @ApiModelProperty(required = true, value = "If half day leave is allowed for this leave type then the value will be TRUE, else the value will be FALSE.")
  public Boolean getHalfdayAllowed() {
    return halfdayAllowed;
  }

  public void setHalfdayAllowed(Boolean halfdayAllowed) {
    this.halfdayAllowed = halfdayAllowed;
  }

  public LeaveType payEligible(Boolean payEligible) {
    this.payEligible = payEligible;
    return this;
  }

   /**
   * Indicates if the leave type created is eligible for pay or not. This decides if the salary has to be deducted for this kind of leave. Set TRUE in case of pay eligible and FALSE if pay not eligible.
   * @return payEligible
  **/
  @ApiModelProperty(required = true, value = "Indicates if the leave type created is eligible for pay or not. This decides if the salary has to be deducted for this kind of leave. Set TRUE in case of pay eligible and FALSE if pay not eligible.")
  public Boolean getPayEligible() {
    return payEligible;
  }

  public void setPayEligible(Boolean payEligible) {
    this.payEligible = payEligible;
  }

  public LeaveType accumulative(Boolean accumulative) {
    this.accumulative = accumulative;
    return this;
  }

   /**
   * Indicates if the leave type is accumulative or unused days in employees account expire on closure of the year. Set TRUE if leave can be accumuated and FALSE if leave cannot be accumulated to next year.
   * @return accumulative
  **/
  @ApiModelProperty(required = true, value = "Indicates if the leave type is accumulative or unused days in employees account expire on closure of the year. Set TRUE if leave can be accumuated and FALSE if leave cannot be accumulated to next year.")
  public Boolean getAccumulative() {
    return accumulative;
  }

  public void setAccumulative(Boolean accumulative) {
    this.accumulative = accumulative;
  }

  public LeaveType encashable(Boolean encashable) {
    this.encashable = encashable;
    return this;
  }

   /**
   * Indicates if the leave type created is eligible for encashment. Set TRUE in case it is encashable and FALSE if not encashable.
   * @return encashable
  **/
  @ApiModelProperty(required = true, value = "Indicates if the leave type created is eligible for encashment. Set TRUE in case it is encashable and FALSE if not encashable.")
  public Boolean getEncashable() {
    return encashable;
  }

  public void setEncashable(Boolean encashable) {
    this.encashable = encashable;
  }

  public LeaveType active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * If this leave type needs to be shown for selection in leave application, it needs to be set to TRUE, else it will be FALSE.
   * @return active
  **/
  @ApiModelProperty(value = "If this leave type needs to be shown for selection in leave application, it needs to be set to TRUE, else it will be FALSE.")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public LeaveType createdBy(String createdBy) {
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

  public LeaveType createdDate(LocalDate createdDate) {
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

  public LeaveType lastModifiedBy(String lastModifiedBy) {
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

  public LeaveType lastModifiedDate(LocalDate lastModifiedDate) {
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
    LeaveType leaveType = (LeaveType) o;
    return Objects.equals(this.id, leaveType.id) &&
        Objects.equals(this.name, leaveType.name) &&
        Objects.equals(this.description, leaveType.description) &&
        Objects.equals(this.halfdayAllowed, leaveType.halfdayAllowed) &&
        Objects.equals(this.payEligible, leaveType.payEligible) &&
        Objects.equals(this.accumulative, leaveType.accumulative) &&
        Objects.equals(this.encashable, leaveType.encashable) &&
        Objects.equals(this.active, leaveType.active) &&
        Objects.equals(this.createdBy, leaveType.createdBy) &&
        Objects.equals(this.createdDate, leaveType.createdDate) &&
        Objects.equals(this.lastModifiedBy, leaveType.lastModifiedBy) &&
        Objects.equals(this.lastModifiedDate, leaveType.lastModifiedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, halfdayAllowed, payEligible, accumulative, encashable, active, createdBy, createdDate, lastModifiedBy, lastModifiedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeaveType {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    halfdayAllowed: ").append(toIndentedString(halfdayAllowed)).append("\n");
    sb.append("    payEligible: ").append(toIndentedString(payEligible)).append("\n");
    sb.append("    accumulative: ").append(toIndentedString(accumulative)).append("\n");
    sb.append("    encashable: ").append(toIndentedString(encashable)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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

