package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Community;
import io.swagger.model.ResponseInfo;
import java.util.ArrayList;
import java.util.List;




/**
 * CommunityRes
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-22T11:20:22.652+05:30")

public class CommunityRes   {
  private ResponseInfo responseInfo = null;

  private List<Community> community = new ArrayList<Community>();

  public CommunityRes responseInfo(ResponseInfo responseInfo) {
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

  public CommunityRes community(List<Community> community) {
    this.community = community;
    return this;
  }

  public CommunityRes addCommunityItem(Community communityItem) {
    this.community.add(communityItem);
    return this;
  }

   /**
   * Get community
   * @return community
  **/
  @ApiModelProperty(value = "")
  public List<Community> getCommunity() {
    return community;
  }

  public void setCommunity(List<Community> community) {
    this.community = community;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommunityRes communityRes = (CommunityRes) o;
    return Objects.equals(this.responseInfo, communityRes.responseInfo) &&
        Objects.equals(this.community, communityRes.community);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseInfo, community);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommunityRes {\n");
    
    sb.append("    responseInfo: ").append(toIndentedString(responseInfo)).append("\n");
    sb.append("    community: ").append(toIndentedString(community)).append("\n");
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

