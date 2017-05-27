package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * Community
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-22T11:20:22.652+05:30")

public class Community   {
  private Long id = null;

  private String name = null;

  private String description = null;

  private Boolean active = null;

  public Community id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the community.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique identifier of the community.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Community name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The Name of the community.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The Name of the community.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Community description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the community.
   * @return description
  **/
  @ApiModelProperty(value = "The description of the community.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Community active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * TRUE for active community and FALSE for inactive community.
   * @return active
  **/
  @ApiModelProperty(required = true, value = "TRUE for active community and FALSE for inactive community.")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
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
    Community community = (Community) o;
    return Objects.equals(this.id, community.id) &&
        Objects.equals(this.name, community.name) &&
        Objects.equals(this.description, community.description) &&
        Objects.equals(this.active, community.active);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, active);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Community {\n");
    
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

