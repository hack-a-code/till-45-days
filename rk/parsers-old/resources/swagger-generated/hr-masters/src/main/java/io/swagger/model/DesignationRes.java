package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Designation;
import io.swagger.model.ResponseInfo;
import java.util.ArrayList;
import java.util.List;




/**
 * DesignationRes
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-10T12:36:58.677+05:30")

public class DesignationRes   {
  private ResponseInfo responseInfo = null;

  private List<Designation> designation = new ArrayList<Designation>();

  public DesignationRes responseInfo(ResponseInfo responseInfo) {
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

  public DesignationRes designation(List<Designation> designation) {
    this.designation = designation;
    return this;
  }

  public DesignationRes addDesignationItem(Designation designationItem) {
    this.designation.add(designationItem);
    return this;
  }

   /**
   * Get designation
   * @return designation
  **/
  @ApiModelProperty(value = "")
  public List<Designation> getDesignation() {
    return designation;
  }

  public void setDesignation(List<Designation> designation) {
    this.designation = designation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DesignationRes designationRes = (DesignationRes) o;
    return Objects.equals(this.responseInfo, designationRes.responseInfo) &&
        Objects.equals(this.designation, designationRes.designation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseInfo, designation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DesignationRes {\n");
    
    sb.append("    responseInfo: ").append(toIndentedString(responseInfo)).append("\n");
    sb.append("    designation: ").append(toIndentedString(designation)).append("\n");
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

