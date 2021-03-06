package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.RecruitmentMode;
import io.swagger.model.ResponseInfo;
import java.util.ArrayList;
import java.util.List;




/**
 * RecruitmentModeRes
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-10T12:36:58.677+05:30")

public class RecruitmentModeRes   {
  private ResponseInfo responseInfo = null;

  private List<RecruitmentMode> recruitmentMode = new ArrayList<RecruitmentMode>();

  public RecruitmentModeRes responseInfo(ResponseInfo responseInfo) {
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

  public RecruitmentModeRes recruitmentMode(List<RecruitmentMode> recruitmentMode) {
    this.recruitmentMode = recruitmentMode;
    return this;
  }

  public RecruitmentModeRes addRecruitmentModeItem(RecruitmentMode recruitmentModeItem) {
    this.recruitmentMode.add(recruitmentModeItem);
    return this;
  }

   /**
   * Get recruitmentMode
   * @return recruitmentMode
  **/
  @ApiModelProperty(value = "")
  public List<RecruitmentMode> getRecruitmentMode() {
    return recruitmentMode;
  }

  public void setRecruitmentMode(List<RecruitmentMode> recruitmentMode) {
    this.recruitmentMode = recruitmentMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecruitmentModeRes recruitmentModeRes = (RecruitmentModeRes) o;
    return Objects.equals(this.responseInfo, recruitmentModeRes.responseInfo) &&
        Objects.equals(this.recruitmentMode, recruitmentModeRes.recruitmentMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseInfo, recruitmentMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecruitmentModeRes {\n");
    
    sb.append("    responseInfo: ").append(toIndentedString(responseInfo)).append("\n");
    sb.append("    recruitmentMode: ").append(toIndentedString(recruitmentMode)).append("\n");
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

