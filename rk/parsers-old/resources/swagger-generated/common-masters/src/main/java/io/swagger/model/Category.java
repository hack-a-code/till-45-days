package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * Category
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-22T11:20:22.652+05:30")

public class Category   {
  private Long id = null;

  private String name = null;

  private String description = null;

  private String active = null;

  public Category id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the category.
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier of the category.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Category name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The Name of the category.
   * @return name
  **/
  @ApiModelProperty(value = "The Name of the category.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Category description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the category.
   * @return description
  **/
  @ApiModelProperty(value = "The description of the category.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Category active(String active) {
    this.active = active;
    return this;
  }

   /**
   * Shows if this category data is active or not. If the value is TRUE, then this data is active one. If this needs to be marked as a deleted data then the value will be FALSE.
   * @return active
  **/
  @ApiModelProperty(value = "Shows if this category data is active or not. If the value is TRUE, then this data is active one. If this needs to be marked as a deleted data then the value will be FALSE.")
  public String getActive() {
    return active;
  }

  public void setActive(String active) {
    this.active = active;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Category category = (Category) o;
    return Objects.equals(this.id, category.id) &&
        Objects.equals(this.name, category.name) &&
        Objects.equals(this.description, category.description) &&
        Objects.equals(this.active, category.active);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, active);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Category {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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

