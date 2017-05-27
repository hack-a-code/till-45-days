package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Mode of recruitment of the employee
 **/

/**
 * Mode of recruitment of the employee
 */
@ApiModel(description = "Mode of recruitment of the employee")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-10T12:36:58.677+05:30")

public class RecruitmentMode   {
  private Long id = null;

  private String name = null;

  private String description = null;

  public RecruitmentMode id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Unique Key of the mode of recruitment master.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique Key of the mode of recruitment master.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public RecruitmentMode name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the mode of recruitment. For example- UPSC, Department Exams, Direct
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the mode of recruitment. For example- UPSC, Department Exams, Direct")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RecruitmentMode description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Brief description of the mode of recruitment. For example- UPSC, Department Exams, Direct
   * @return description
  **/
  @ApiModelProperty(value = "Brief description of the mode of recruitment. For example- UPSC, Department Exams, Direct")
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
    RecruitmentMode recruitmentMode = (RecruitmentMode) o;
    return Objects.equals(this.id, recruitmentMode.id) &&
        Objects.equals(this.name, recruitmentMode.name) &&
        Objects.equals(this.description, recruitmentMode.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecruitmentMode {\n");
    
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

