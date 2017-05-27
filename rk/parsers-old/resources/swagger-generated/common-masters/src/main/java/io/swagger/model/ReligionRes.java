package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Religion;
import io.swagger.model.ResponseInfo;
import java.util.ArrayList;
import java.util.List;




/**
 * ReligionRes
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-22T11:20:22.652+05:30")

public class ReligionRes   {
  private ResponseInfo responseInfo = null;

  private List<Religion> religion = new ArrayList<Religion>();

  public ReligionRes responseInfo(ResponseInfo responseInfo) {
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

  public ReligionRes religion(List<Religion> religion) {
    this.religion = religion;
    return this;
  }

  public ReligionRes addReligionItem(Religion religionItem) {
    this.religion.add(religionItem);
    return this;
  }

   /**
   * Get religion
   * @return religion
  **/
  @ApiModelProperty(value = "")
  public List<Religion> getReligion() {
    return religion;
  }

  public void setReligion(List<Religion> religion) {
    this.religion = religion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReligionRes religionRes = (ReligionRes) o;
    return Objects.equals(this.responseInfo, religionRes.responseInfo) &&
        Objects.equals(this.religion, religionRes.religion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseInfo, religion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReligionRes {\n");
    
    sb.append("    responseInfo: ").append(toIndentedString(responseInfo)).append("\n");
    sb.append("    religion: ").append(toIndentedString(religion)).append("\n");
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

