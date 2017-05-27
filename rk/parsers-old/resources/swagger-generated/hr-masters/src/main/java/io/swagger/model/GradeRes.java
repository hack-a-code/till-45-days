package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Grade;
import io.swagger.model.ResponseInfo;
import java.util.ArrayList;
import java.util.List;




/**
 * GradeRes
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-10T12:36:58.677+05:30")

public class GradeRes   {
  private ResponseInfo responseInfo = null;

  private List<Grade> grade = new ArrayList<Grade>();

  public GradeRes responseInfo(ResponseInfo responseInfo) {
    this.responseInfo = responseInfo;
    return this;
  }

   /**
   * Get responseInfo
   * @return responseInfo
  **/
  @ApiModelProperty(value = "")
  public ResponseInfo getResponseInfo() {
    return responseInfo;
  }

  public void setResponseInfo(ResponseInfo responseInfo) {
    this.responseInfo = responseInfo;
  }

  public GradeRes grade(List<Grade> grade) {
    this.grade = grade;
    return this;
  }

  public GradeRes addGradeItem(Grade gradeItem) {
    this.grade.add(gradeItem);
    return this;
  }

   /**
   * Get grade
   * @return grade
  **/
  @ApiModelProperty(value = "")
  public List<Grade> getGrade() {
    return grade;
  }

  public void setGrade(List<Grade> grade) {
    this.grade = grade;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GradeRes gradeRes = (GradeRes) o;
    return Objects.equals(this.responseInfo, gradeRes.responseInfo) &&
        Objects.equals(this.grade, gradeRes.grade);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseInfo, grade);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GradeRes {\n");
    
    sb.append("    responseInfo: ").append(toIndentedString(responseInfo)).append("\n");
    sb.append("    grade: ").append(toIndentedString(grade)).append("\n");
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

