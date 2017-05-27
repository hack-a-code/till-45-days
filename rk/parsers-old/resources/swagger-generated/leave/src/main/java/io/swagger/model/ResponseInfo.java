package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * ResponseInfo
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-22T11:21:39.340+05:30")

public class ResponseInfo   {
  private String apiId = null;

  private String ver = null;

  private String ts = null;

  private String resMsgId = null;

  private String msgId = null;

  private String status = null;

  public ResponseInfo apiId(String apiId) {
    this.apiId = apiId;
    return this;
  }

   /**
   * unique API ID
   * @return apiId
  **/
  @ApiModelProperty(required = true, value = "unique API ID")
  public String getApiId() {
    return apiId;
  }

  public void setApiId(String apiId) {
    this.apiId = apiId;
  }

  public ResponseInfo ver(String ver) {
    this.ver = ver;
    return this;
  }

   /**
   * API version
   * @return ver
  **/
  @ApiModelProperty(required = true, value = "API version")
  public String getVer() {
    return ver;
  }

  public void setVer(String ver) {
    this.ver = ver;
  }

  public ResponseInfo ts(String ts) {
    this.ts = ts;
    return this;
  }

   /**
   * response timestamp YYYY-MM-DDThh:mm:ss+/-nn:nn (timezone defaulted to +5.30)
   * @return ts
  **/
  @ApiModelProperty(required = true, value = "response timestamp YYYY-MM-DDThh:mm:ss+/-nn:nn (timezone defaulted to +5.30)")
  public String getTs() {
    return ts;
  }

  public void setTs(String ts) {
    this.ts = ts;
  }

  public ResponseInfo resMsgId(String resMsgId) {
    this.resMsgId = resMsgId;
    return this;
  }

   /**
   * unique response message id (UUID)
   * @return resMsgId
  **/
  @ApiModelProperty(value = "unique response message id (UUID)")
  public String getResMsgId() {
    return resMsgId;
  }

  public void setResMsgId(String resMsgId) {
    this.resMsgId = resMsgId;
  }

  public ResponseInfo msgId(String msgId) {
    this.msgId = msgId;
    return this;
  }

   /**
   * message id of the request
   * @return msgId
  **/
  @ApiModelProperty(value = "message id of the request")
  public String getMsgId() {
    return msgId;
  }

  public void setMsgId(String msgId) {
    this.msgId = msgId;
  }

  public ResponseInfo status(String status) {
    this.status = status;
    return this;
  }

   /**
   * status of request e.g. successful, failed etc
   * @return status
  **/
  @ApiModelProperty(required = true, value = "status of request e.g. successful, failed etc")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseInfo responseInfo = (ResponseInfo) o;
    return Objects.equals(this.apiId, responseInfo.apiId) &&
        Objects.equals(this.ver, responseInfo.ver) &&
        Objects.equals(this.ts, responseInfo.ts) &&
        Objects.equals(this.resMsgId, responseInfo.resMsgId) &&
        Objects.equals(this.msgId, responseInfo.msgId) &&
        Objects.equals(this.status, responseInfo.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiId, ver, ts, resMsgId, msgId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseInfo {\n");
    
    sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
    sb.append("    ver: ").append(toIndentedString(ver)).append("\n");
    sb.append("    ts: ").append(toIndentedString(ts)).append("\n");
    sb.append("    resMsgId: ").append(toIndentedString(resMsgId)).append("\n");
    sb.append("    msgId: ").append(toIndentedString(msgId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

