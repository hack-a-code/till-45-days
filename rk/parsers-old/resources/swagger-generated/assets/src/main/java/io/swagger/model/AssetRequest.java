package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Asset;
import io.swagger.model.RequestInfo;




/**
 * AssetRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-27T11:12:03.168+05:30")

public class AssetRequest   {
  private RequestInfo resposneInfo = null;

  private Asset assets = null;

  public AssetRequest resposneInfo(RequestInfo resposneInfo) {
    this.resposneInfo = resposneInfo;
    return this;
  }

   /**
   * Get resposneInfo
   * @return resposneInfo
  **/
  @ApiModelProperty(value = "")
  public RequestInfo getResposneInfo() {
    return resposneInfo;
  }

  public void setResposneInfo(RequestInfo resposneInfo) {
    this.resposneInfo = resposneInfo;
  }

  public AssetRequest assets(Asset assets) {
    this.assets = assets;
    return this;
  }

   /**
   * Get assets
   * @return assets
  **/
  @ApiModelProperty(value = "")
  public Asset getAssets() {
    return assets;
  }

  public void setAssets(Asset assets) {
    this.assets = assets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetRequest assetRequest = (AssetRequest) o;
    return Objects.equals(this.resposneInfo, assetRequest.resposneInfo) &&
        Objects.equals(this.assets, assetRequest.assets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resposneInfo, assets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetRequest {\n");
    
    sb.append("    resposneInfo: ").append(toIndentedString(resposneInfo)).append("\n");
    sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
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

