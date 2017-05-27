package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.RecruitmentType;
import io.swagger.model.RequestInfo;




/**
 * RecruitmentTypeReq
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-10T12:36:58.677+05:30")

public class RecruitmentTypeReq   {
  private String tenantId = null;

  private RequestInfo requestInfo = null;

  private RecruitmentType recruitmentType = null;

  public RecruitmentTypeReq tenantId(String tenantId) {
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

  public RecruitmentTypeReq requestInfo(RequestInfo requestInfo) {
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

  public RecruitmentTypeReq recruitmentType(RecruitmentType recruitmentType) {
    this.recruitmentType = recruitmentType;
    return this;
  }

   /**
   * Get recruitmentType
   * @return recruitmentType
  **/
  @ApiModelProperty(required = true, value = "")
  public RecruitmentType getRecruitmentType() {
    return recruitmentType;
  }

  public void setRecruitmentType(RecruitmentType recruitmentType) {
    this.recruitmentType = recruitmentType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecruitmentTypeReq recruitmentTypeReq = (RecruitmentTypeReq) o;
    return Objects.equals(this.tenantId, recruitmentTypeReq.tenantId) &&
        Objects.equals(this.requestInfo, recruitmentTypeReq.requestInfo) &&
        Objects.equals(this.recruitmentType, recruitmentTypeReq.recruitmentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, requestInfo, recruitmentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecruitmentTypeReq {\n");
    
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    requestInfo: ").append(toIndentedString(requestInfo)).append("\n");
    sb.append("    recruitmentType: ").append(toIndentedString(recruitmentType)).append("\n");
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

