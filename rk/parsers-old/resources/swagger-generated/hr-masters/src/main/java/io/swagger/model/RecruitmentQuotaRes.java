package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.RecruitmentQuota;
import io.swagger.model.ResponseInfo;
import java.util.ArrayList;
import java.util.List;




/**
 * RecruitmentQuotaRes
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-10T12:36:58.677+05:30")

public class RecruitmentQuotaRes   {
  private ResponseInfo responseInfo = null;

  private List<RecruitmentQuota> recruitmentQuota = new ArrayList<RecruitmentQuota>();

  public RecruitmentQuotaRes responseInfo(ResponseInfo responseInfo) {
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

  public RecruitmentQuotaRes recruitmentQuota(List<RecruitmentQuota> recruitmentQuota) {
    this.recruitmentQuota = recruitmentQuota;
    return this;
  }

  public RecruitmentQuotaRes addRecruitmentQuotaItem(RecruitmentQuota recruitmentQuotaItem) {
    this.recruitmentQuota.add(recruitmentQuotaItem);
    return this;
  }

   /**
   * Get recruitmentQuota
   * @return recruitmentQuota
  **/
  @ApiModelProperty(value = "")
  public List<RecruitmentQuota> getRecruitmentQuota() {
    return recruitmentQuota;
  }

  public void setRecruitmentQuota(List<RecruitmentQuota> recruitmentQuota) {
    this.recruitmentQuota = recruitmentQuota;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecruitmentQuotaRes recruitmentQuotaRes = (RecruitmentQuotaRes) o;
    return Objects.equals(this.responseInfo, recruitmentQuotaRes.responseInfo) &&
        Objects.equals(this.recruitmentQuota, recruitmentQuotaRes.recruitmentQuota);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseInfo, recruitmentQuota);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecruitmentQuotaRes {\n");
    
    sb.append("    responseInfo: ").append(toIndentedString(responseInfo)).append("\n");
    sb.append("    recruitmentQuota: ").append(toIndentedString(recruitmentQuota)).append("\n");
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

