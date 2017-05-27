package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PositionHierarchy;
import io.swagger.model.RequestInfo;




/**
 * PositionHierarchyReq
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-10T12:36:58.677+05:30")

public class PositionHierarchyReq   {
  private String tenantId = null;

  private RequestInfo requestInfo = null;

  private PositionHierarchy positionHierarchy = null;

  public PositionHierarchyReq tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Unique id for for a tenant.
   * @return tenantId
  **/
  @ApiModelProperty(required = true, value = "Unique id for for a tenant.")
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public PositionHierarchyReq requestInfo(RequestInfo requestInfo) {
    this.requestInfo = requestInfo;
    return this;
  }

   /**
   * Get requestInfo
   * @return requestInfo
  **/
  @ApiModelProperty(required = true, value = "")
  public RequestInfo getRequestInfo() {
    return requestInfo;
  }

  public void setRequestInfo(RequestInfo requestInfo) {
    this.requestInfo = requestInfo;
  }

  public PositionHierarchyReq positionHierarchy(PositionHierarchy positionHierarchy) {
    this.positionHierarchy = positionHierarchy;
    return this;
  }

   /**
   * Get positionHierarchy
   * @return positionHierarchy
  **/
  @ApiModelProperty(required = true, value = "")
  public PositionHierarchy getPositionHierarchy() {
    return positionHierarchy;
  }

  public void setPositionHierarchy(PositionHierarchy positionHierarchy) {
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
    PositionHierarchyReq positionHierarchyReq = (PositionHierarchyReq) o;
    return Objects.equals(this.tenantId, positionHierarchyReq.tenantId) &&
        Objects.equals(this.requestInfo, positionHierarchyReq.requestInfo) &&
        Objects.equals(this.positionHierarchy, positionHierarchyReq.positionHierarchy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, requestInfo, positionHierarchy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PositionHierarchyReq {\n");
    
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    requestInfo: ").append(toIndentedString(requestInfo)).append("\n");
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

