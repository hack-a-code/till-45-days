package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PositionHierarchy;
import io.swagger.model.ResponseInfo;
import java.util.ArrayList;
import java.util.List;




/**
 * PositionHierarchyRes
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-10T12:36:58.677+05:30")

public class PositionHierarchyRes   {
  private ResponseInfo responseInfo = null;

  private List<PositionHierarchy> positionHierarchy = new ArrayList<PositionHierarchy>();

  public PositionHierarchyRes responseInfo(ResponseInfo responseInfo) {
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

  public PositionHierarchyRes positionHierarchy(List<PositionHierarchy> positionHierarchy) {
    this.positionHierarchy = positionHierarchy;
    return this;
  }

  public PositionHierarchyRes addPositionHierarchyItem(PositionHierarchy positionHierarchyItem) {
    this.positionHierarchy.add(positionHierarchyItem);
    return this;
  }

   /**
   * Get positionHierarchy
   * @return positionHierarchy
  **/
  @ApiModelProperty(value = "")
  public List<PositionHierarchy> getPositionHierarchy() {
    return positionHierarchy;
  }

  public void setPositionHierarchy(List<PositionHierarchy> positionHierarchy) {
    this.positionHierarchy = positionHierarchy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PositionHierarchyRes positionHierarchyRes = (PositionHierarchyRes) o;
    return Objects.equals(this.responseInfo, positionHierarchyRes.responseInfo) &&
        Objects.equals(this.positionHierarchy, positionHierarchyRes.positionHierarchy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseInfo, positionHierarchy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PositionHierarchyRes {\n");
    
    sb.append("    responseInfo: ").append(toIndentedString(responseInfo)).append("\n");
    sb.append("    positionHierarchy: ").append(toIndentedString(positionHierarchy)).append("\n");
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

