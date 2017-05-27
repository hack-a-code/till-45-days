package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Position;
import io.swagger.model.RequestInfo;
import java.util.ArrayList;
import java.util.List;




/**
 * PositionReq
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-10T12:36:58.677+05:30")

public class PositionReq   {
  private String tenantId = null;

  private RequestInfo requestInfo = null;

  private List<Position> position = new ArrayList<Position>();

  public PositionReq tenantId(String tenantId) {
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

  public PositionReq requestInfo(RequestInfo requestInfo) {
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

  public PositionReq position(List<Position> position) {
    this.position = position;
    return this;
  }

  public PositionReq addPositionItem(Position positionItem) {
    this.position.add(positionItem);
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @ApiModelProperty(required = true, value = "")
  public List<Position> getPosition() {
    return position;
  }

  public void setPosition(List<Position> position) {
    this.position = position;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PositionReq positionReq = (PositionReq) o;
    return Objects.equals(this.tenantId, positionReq.tenantId) &&
        Objects.equals(this.requestInfo, positionReq.requestInfo) &&
        Objects.equals(this.position, positionReq.position);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, requestInfo, position);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PositionReq {\n");
    
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    requestInfo: ").append(toIndentedString(requestInfo)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
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

