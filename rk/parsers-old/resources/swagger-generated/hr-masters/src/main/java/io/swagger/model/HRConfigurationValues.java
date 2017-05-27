package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.LocalDate;




/**
 * HRConfigurationValues
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-10T12:36:58.677+05:30")

public class HRConfigurationValues   {
  private Long id = null;

  private Long keyId = null;

  private String value = null;

  private LocalDate effectiveFrom = null;

  private Long createdBy = null;

  private LocalDate createdDate = null;

  private Long lastModifiedBy = null;

  private LocalDate lastModifiedDate = null;

  public HRConfigurationValues id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the configuration key values.
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier of the configuration key values.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public HRConfigurationValues keyId(Long keyId) {
    this.keyId = keyId;
    return this;
  }

   /**
   * Unique Id of the configuration key.
   * @return keyId
  **/
  @ApiModelProperty(required = true, value = "Unique Id of the configuration key.")
  public Long getKeyId() {
    return keyId;
  }

  public void setKeyId(Long keyId) {
    this.keyId = keyId;
  }

  public HRConfigurationValues value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The value of the of the configuration parameter.
   * @return value
  **/
  @ApiModelProperty(required = true, value = "The value of the of the configuration parameter.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public HRConfigurationValues effectiveFrom(LocalDate effectiveFrom) {
    this.effectiveFrom = effectiveFrom;
    return this;
  }

   /**
   * Date on which the configuration value defined is to be made active in the system.
   * @return effectiveFrom
  **/
  @ApiModelProperty(required = true, value = "Date on which the configuration value defined is to be made active in the system.")
  public LocalDate getEffectiveFrom() {
    return effectiveFrom;
  }

  public void setEffectiveFrom(LocalDate effectiveFrom) {
    this.effectiveFrom = effectiveFrom;
  }

  public HRConfigurationValues createdBy(Long createdBy) {
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

  public HRConfigurationValues createdDate(LocalDate createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Date on which the master data was added into the system.
   * @return createdDate
  **/
  @ApiModelProperty(value = "Date on which the master data was added into the system.")
  public LocalDate getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(LocalDate createdDate) {
    this.createdDate = createdDate;
  }

  public HRConfigurationValues lastModifiedBy(Long lastModifiedBy) {
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

  public HRConfigurationValues lastModifiedDate(LocalDate lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
    return this;
  }

   /**
   * Date on which the master data was last modified.
   * @return lastModifiedDate
  **/
  @ApiModelProperty(value = "Date on which the master data was last modified.")
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
    HRConfigurationValues hRConfigurationValues = (HRConfigurationValues) o;
    return Objects.equals(this.id, hRConfigurationValues.id) &&
        Objects.equals(this.keyId, hRConfigurationValues.keyId) &&
        Objects.equals(this.value, hRConfigurationValues.value) &&
        Objects.equals(this.effectiveFrom, hRConfigurationValues.effectiveFrom) &&
        Objects.equals(this.createdBy, hRConfigurationValues.createdBy) &&
        Objects.equals(this.createdDate, hRConfigurationValues.createdDate) &&
        Objects.equals(this.lastModifiedBy, hRConfigurationValues.lastModifiedBy) &&
        Objects.equals(this.lastModifiedDate, hRConfigurationValues.lastModifiedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, keyId, value, effectiveFrom, createdBy, createdDate, lastModifiedBy, lastModifiedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HRConfigurationValues {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    effectiveFrom: ").append(toIndentedString(effectiveFrom)).append("\n");
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

