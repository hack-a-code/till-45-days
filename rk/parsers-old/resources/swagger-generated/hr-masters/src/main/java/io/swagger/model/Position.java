package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * Position
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-10T12:36:58.677+05:30")

public class Position   {
  private Long id = null;

  private String name = null;

  private Object deptdesig = null;

  private Boolean isPostOutsourced = null;

  private Boolean active = null;

  public Position id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the position.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique identifier of the position.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Position name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Unique Position name.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Unique Position name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Position deptdesig(Object deptdesig) {
    this.deptdesig = deptdesig;
    return this;
  }

   /**
   * Department and designation associated with this position.
   * @return deptdesig
  **/
  @ApiModelProperty(required = true, value = "Department and designation associated with this position.")
  public Object getDeptdesig() {
    return deptdesig;
  }

  public void setDeptdesig(Object deptdesig) {
    this.deptdesig = deptdesig;
  }

  public Position isPostOutsourced(Boolean isPostOutsourced) {
    this.isPostOutsourced = isPostOutsourced;
    return this;
  }

   /**
   * if this post is outsouced then value will be TRUE, else value will be FALSE.
   * @return isPostOutsourced
  **/
  @ApiModelProperty(value = "if this post is outsouced then value will be TRUE, else value will be FALSE.")
  public Boolean getIsPostOutsourced() {
    return isPostOutsourced;
  }

  public void setIsPostOutsourced(Boolean isPostOutsourced) {
    this.isPostOutsourced = isPostOutsourced;
  }

  public Position active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * TRUE for active positions and FALSE for inactive positions.
   * @return active
  **/
  @ApiModelProperty(value = "TRUE for active positions and FALSE for inactive positions.")
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
    Position position = (Position) o;
    return Objects.equals(this.id, position.id) &&
        Objects.equals(this.name, position.name) &&
        Objects.equals(this.deptdesig, position.deptdesig) &&
        Objects.equals(this.isPostOutsourced, position.isPostOutsourced) &&
        Objects.equals(this.active, position.active);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, deptdesig, isPostOutsourced, active);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Position {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    deptdesig: ").append(toIndentedString(deptdesig)).append("\n");
    sb.append("    isPostOutsourced: ").append(toIndentedString(isPostOutsourced)).append("\n");
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

