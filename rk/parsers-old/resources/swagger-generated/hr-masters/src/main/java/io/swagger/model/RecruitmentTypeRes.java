package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.RecruitmentType;
import io.swagger.model.ResponseInfo;
import java.util.ArrayList;
import java.util.List;




/**
 * RecruitmentTypeRes
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-10T12:36:58.677+05:30")

public class RecruitmentTypeRes   {
  private ResponseInfo responseInfo = null;

  private List<RecruitmentType> recruitmentType = new ArrayList<RecruitmentType>();

  public RecruitmentTypeRes responseInfo(ResponseInfo responseInfo) {
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

  public RecruitmentTypeRes recruitmentType(List<RecruitmentType> recruitmentType) {
    this.recruitmentType = recruitmentType;
    return this;
  }

  public RecruitmentTypeRes addRecruitmentTypeItem(RecruitmentType recruitmentTypeItem) {
    this.recruitmentType.add(recruitmentTypeItem);
    return this;
  }

   /**
   * Get recruitmentType
   * @return recruitmentType
  **/
  @ApiModelProperty(value = "")
  public List<RecruitmentType> getRecruitmentType() {
    return recruitmentType;
  }

  public void setRecruitmentType(List<RecruitmentType> recruitmentType) {
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
    RecruitmentTypeRes recruitmentTypeRes = (RecruitmentTypeRes) o;
    return Objects.equals(this.responseInfo, recruitmentTypeRes.responseInfo) &&
        Objects.equals(this.recruitmentType, recruitmentTypeRes.recruitmentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseInfo, recruitmentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecruitmentTypeRes {\n");
    
    sb.append("    responseInfo: ").append(toIndentedString(responseInfo)).append("\n");
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

