package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * PositionHierarchy
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-10T12:36:58.677+05:30")

public class PositionHierarchy   {
  private Long id = null;

  private Object fromPosition = null;

  private Object toPosition = null;

  private Object objectType = null;

  private String objectSubType = null;

  public PositionHierarchy id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the position hierarchy.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique identifier of the position hierarchy.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public PositionHierarchy fromPosition(Object fromPosition) {
    this.fromPosition = fromPosition;
    return this;
  }

   /**
   * Position for which the hierarchy is mapped
   * @return fromPosition
  **/
  @ApiModelProperty(required = true, value = "Position for which the hierarchy is mapped")
  public Object getFromPosition() {
    return fromPosition;
  }

  public void setFromPosition(Object fromPosition) {
    this.fromPosition = fromPosition;
  }

  public PositionHierarchy toPosition(Object toPosition) {
    this.toPosition = toPosition;
    return this;
  }

   /**
   * Position to which the 'fromPosition' reports to.
   * @return toPosition
  **/
  @ApiModelProperty(required = true, value = "Position to which the 'fromPosition' reports to.")
  public Object getToPosition() {
    return toPosition;
  }

  public void setToPosition(Object toPosition) {
    this.toPosition = toPosition;
  }

  public PositionHierarchy objectType(Object objectType) {
    this.objectType = objectType;
    return this;
  }

   /**
   * Position hierarchy is defined for which type of Object.
   * @return objectType
  **/
  @ApiModelProperty(required = true, value = "Position hierarchy is defined for which type of Object.")
  public Object getObjectType() {
    return objectType;
  }

  public void setObjectType(Object objectType) {
    this.objectType = objectType;
  }

  public PositionHierarchy objectSubType(String objectSubType) {
    this.objectSubType = objectSubType;
    return this;
  }

   /**
   * what sub types of the specified object type.
   * @return objectSubType
  **/
  @ApiModelProperty(value = "what sub types of the specified object type.")
  public String getObjectSubType() {
    return objectSubType;
  }

  public void setObjectSubType(String objectSubType) {
    this.objectSubType = objectSubType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PositionHierarchy positionHierarchy = (PositionHierarchy) o;
    return Objects.equals(this.id, positionHierarchy.id) &&
        Objects.equals(this.fromPosition, positionHierarchy.fromPosition) &&
        Objects.equals(this.toPosition, positionHierarchy.toPosition) &&
        Objects.equals(this.objectType, positionHierarchy.objectType) &&
        Objects.equals(this.objectSubType, positionHierarchy.objectSubType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, fromPosition, toPosition, objectType, objectSubType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PositionHierarchy {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fromPosition: ").append(toIndentedString(fromPosition)).append("\n");
    sb.append("    toPosition: ").append(toIndentedString(toPosition)).append("\n");
    sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
    sb.append("    objectSubType: ").append(toIndentedString(objectSubType)).append("\n");
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

