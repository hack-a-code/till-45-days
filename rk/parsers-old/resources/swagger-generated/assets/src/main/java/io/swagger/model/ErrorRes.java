package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Error;
import io.swagger.model.ResponseInfo;




/**
 * ErrorRes
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-27T11:12:03.168+05:30")

public class ErrorRes   {
  private ResponseInfo resposneInfo = null;

  private Error error = null;

  public ErrorRes resposneInfo(ResponseInfo resposneInfo) {
    this.resposneInfo = resposneInfo;
    return this;
  }

   /**
   * Get resposneInfo
   * @return resposneInfo
  **/
  @ApiModelProperty(value = "")
  public ResponseInfo getResposneInfo() {
    return resposneInfo;
  }

  public void setResposneInfo(ResponseInfo resposneInfo) {
    this.resposneInfo = resposneInfo;
  }

  public ErrorRes error(Error error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @ApiModelProperty(value = "")
  public Error getError() {
    return error;
  }

  public void setError(Error error) {
    this.error = error;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorRes errorRes = (ErrorRes) o;
    return Objects.equals(this.resposneInfo, errorRes.resposneInfo) &&
        Objects.equals(this.error, errorRes.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resposneInfo, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorRes {\n");
    
    sb.append("    resposneInfo: ").append(toIndentedString(resposneInfo)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

