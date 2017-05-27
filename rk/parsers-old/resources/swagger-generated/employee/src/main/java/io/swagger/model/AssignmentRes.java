package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Assignment;
import io.swagger.model.SwaggerYamlhrMastersJsondefinitionsResponseInfo;
import java.util.ArrayList;
import java.util.List;




/**
 * AssignmentRes
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-09T19:48:07.703+05:30")

public class AssignmentRes   {
  private SwaggerYamlhrMastersJsondefinitionsResponseInfo responseInfo = null;

  private List<Assignment> assignment = new ArrayList<Assignment>();

  public AssignmentRes responseInfo(SwaggerYamlhrMastersJsondefinitionsResponseInfo responseInfo) {
    this.responseInfo = responseInfo;
    return this;
  }

   /**
   * Get responseInfo
   * @return responseInfo
  **/
  @ApiModelProperty(value = "")
  public SwaggerYamlhrMastersJsondefinitionsResponseInfo getResponseInfo() {
    return responseInfo;
  }

  public void setResponseInfo(SwaggerYamlhrMastersJsondefinitionsResponseInfo responseInfo) {
    this.responseInfo = responseInfo;
  }

  public AssignmentRes assignment(List<Assignment> assignment) {
    this.assignment = assignment;
    return this;
  }

  public AssignmentRes addAssignmentItem(Assignment assignmentItem) {
    this.assignment.add(assignmentItem);
    return this;
  }

   /**
   * Get assignment
   * @return assignment
  **/
  @ApiModelProperty(value = "")
  public List<Assignment> getAssignment() {
    return assignment;
  }

  public void setAssignment(List<Assignment> assignment) {
    this.assignment = assignment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssignmentRes assignmentRes = (AssignmentRes) o;
    return Objects.equals(this.responseInfo, assignmentRes.responseInfo) &&
        Objects.equals(this.assignment, assignmentRes.assignment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseInfo, assignment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssignmentRes {\n");
    
    sb.append("    responseInfo: ").append(toIndentedString(responseInfo)).append("\n");
    sb.append("    assignment: ").append(toIndentedString(assignment)).append("\n");
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

