package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Employee group master
 **/

/**
 * Employee group master
 */
@ApiModel(description = "Employee group master")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-10T12:36:58.677+05:30")

public class Group   {
  private Long id = null;

  private String name = null;

  private String description = null;

  public Group id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Unique Key of the group master
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique Key of the group master")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Group name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the group. For example- State, Central , Local.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the group. For example- State, Central , Local.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Group description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Brief description of what this group means.
   * @return description
  **/
  @ApiModelProperty(value = "Brief description of what this group means.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Group group = (Group) o;
    return Objects.equals(this.id, group.id) &&
        Objects.equals(this.name, group.name) &&
        Objects.equals(this.description, group.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Group {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

