package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.LocalDate;




/**
 * ObjectType
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-10T12:36:58.677+05:30")

public class ObjectType   {
  private Long id = null;

  private String type = null;

  private String description = null;

  private LocalDate lastmodifieddate = null;

  public ObjectType id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the object type.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique identifier of the object type.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ObjectType type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Unique name of the object type name.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Unique name of the object type name.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ObjectType description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Breif description of what this object type is used for.
   * @return description
  **/
  @ApiModelProperty(value = "Breif description of what this object type is used for.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ObjectType lastmodifieddate(LocalDate lastmodifieddate) {
    this.lastmodifieddate = lastmodifieddate;
    return this;
  }

   /**
   * Latest date of which the data was modified.
   * @return lastmodifieddate
  **/
  @ApiModelProperty(value = "Latest date of which the data was modified.")
  public LocalDate getLastmodifieddate() {
    return lastmodifieddate;
  }

  public void setLastmodifieddate(LocalDate lastmodifieddate) {
    this.lastmodifieddate = lastmodifieddate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectType objectType = (ObjectType) o;
    return Objects.equals(this.id, objectType.id) &&
        Objects.equals(this.type, objectType.type) &&
        Objects.equals(this.description, objectType.description) &&
        Objects.equals(this.lastmodifieddate, objectType.lastmodifieddate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, description, lastmodifieddate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectType {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    lastmodifieddate: ").append(toIndentedString(lastmodifieddate)).append("\n");
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

