package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * This is a set up object which contains the different types of attendance marking that is possible in the system. Based on holiday, present, leave etc, the value will change.
 **/

/**
 * This is a set up object which contains the different types of attendance marking that is possible in the system. Based on holiday, present, leave etc, the value will change.
 */
@ApiModel(description = "This is a set up object which contains the different types of attendance marking that is possible in the system. Based on holiday, present, leave etc, the value will change.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-22T10:24:33.929+05:30")

public class AttendanceType   {
  private Long id = null;

  private String code = null;

  private String description = null;

  public AttendanceType id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the attendance.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique identifier of the attendance.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public AttendanceType code(String code) {
    this.code = code;
    return this;
  }

   /**
   * The unique code to identify the attendance type.
   * @return code
  **/
  @ApiModelProperty(required = true, value = "The unique code to identify the attendance type.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public AttendanceType description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the attendance type.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "The description of the attendance type.")
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
    AttendanceType attendanceType = (AttendanceType) o;
    return Objects.equals(this.id, attendanceType.id) &&
        Objects.equals(this.code, attendanceType.code) &&
        Objects.equals(this.description, attendanceType.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, code, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttendanceType {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

