package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.LocalDate;




/**
 * HRConfiguration
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-10T12:36:58.677+05:30")

public class HRConfiguration   {
  private Long id = null;

  private String keyName = null;

  private String description = null;

  private Long createdBy = null;

  private LocalDate createdDate = null;

  private Long lastModifiedBy = null;

  private LocalDate lastModifiedDate = null;

  public HRConfiguration id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the configuration master.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique identifier of the configuration master.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public HRConfiguration keyName(String keyName) {
    this.keyName = keyName;
    return this;
  }

   /**
   * The Name of the configuration parameter.
   * @return keyName
  **/
  @ApiModelProperty(required = true, value = "The Name of the configuration parameter.")
  public String getKeyName() {
    return keyName;
  }

  public void setKeyName(String keyName) {
    this.keyName = keyName;
  }

  public HRConfiguration description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the configuration parameter.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "The description of the configuration parameter.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public HRConfiguration createdBy(Long createdBy) {
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

  public HRConfiguration createdDate(LocalDate createdDate) {
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

  public HRConfiguration lastModifiedBy(Long lastModifiedBy) {
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

  public HRConfiguration lastModifiedDate(LocalDate lastModifiedDate) {
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
    HRConfiguration hRConfiguration = (HRConfiguration) o;
    return Objects.equals(this.id, hRConfiguration.id) &&
        Objects.equals(this.keyName, hRConfiguration.keyName) &&
        Objects.equals(this.description, hRConfiguration.description) &&
        Objects.equals(this.createdBy, hRConfiguration.createdBy) &&
        Objects.equals(this.createdDate, hRConfiguration.createdDate) &&
        Objects.equals(this.lastModifiedBy, hRConfiguration.lastModifiedBy) &&
        Objects.equals(this.lastModifiedDate, hRConfiguration.lastModifiedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, keyName, description, createdBy, createdDate, lastModifiedBy, lastModifiedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HRConfiguration {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

