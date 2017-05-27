package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * RequestInfo
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-01T18:46:10.220+05:30")

public class RequestInfo   {
  private String apiId = null;

  private String ver = null;

  private String ts = null;

  private String action = null;

  private String did = null;

  private String key = null;

  private String msgId = null;

  private String requesterId = null;

  private String authToken = null;

  public RequestInfo apiId(String apiId) {
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

  public RequestInfo ver(String ver) {
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

  public RequestInfo ts(String ts) {
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

  public RequestInfo action(String action) {
    this.action = action;
    return this;
  }

   /**
   * api action like GET/POST/PUT/DELETE in case of http calls
   * @return action
  **/
  @ApiModelProperty(value = "api action like GET/POST/PUT/DELETE in case of http calls")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public RequestInfo did(String did) {
    this.did = did;
    return this;
  }

   /**
   * device UUID from which API is called
   * @return did
  **/
  @ApiModelProperty(value = "device UUID from which API is called")
  public String getDid() {
    return did;
  }

  public void setDid(String did) {
    this.did = did;
  }

  public RequestInfo key(String key) {
    this.key = key;
    return this;
  }

   /**
   * API key (dynamic)
   * @return key
  **/
  @ApiModelProperty(value = "API key (dynamic)")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public RequestInfo msgId(String msgId) {
    this.msgId = msgId;
    return this;
  }

   /**
   * unique request message id, UUID, for handling API idempotency
   * @return msgId
  **/
  @ApiModelProperty(value = "unique request message id, UUID, for handling API idempotency")
  public String getMsgId() {
    return msgId;
  }

  public void setMsgId(String msgId) {
    this.msgId = msgId;
  }

  public RequestInfo requesterId(String requesterId) {
    this.requesterId = requesterId;
    return this;
  }

   /**
   * UserId of the user calling
   * @return requesterId
  **/
  @ApiModelProperty(value = "UserId of the user calling")
  public String getRequesterId() {
    return requesterId;
  }

  public void setRequesterId(String requesterId) {
    this.requesterId = requesterId;
  }

  public RequestInfo authToken(String authToken) {
    this.authToken = authToken;
    return this;
  }

   /**
   * //session/jwt/saml token/oauth token
   * @return authToken
  **/
  @ApiModelProperty(value = "//session/jwt/saml token/oauth token")
  public String getAuthToken() {
    return authToken;
  }

  public void setAuthToken(String authToken) {
    this.authToken = authToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestInfo requestInfo = (RequestInfo) o;
    return Objects.equals(this.apiId, requestInfo.apiId) &&
        Objects.equals(this.ver, requestInfo.ver) &&
        Objects.equals(this.ts, requestInfo.ts) &&
        Objects.equals(this.action, requestInfo.action) &&
        Objects.equals(this.did, requestInfo.did) &&
        Objects.equals(this.key, requestInfo.key) &&
        Objects.equals(this.msgId, requestInfo.msgId) &&
        Objects.equals(this.requesterId, requestInfo.requesterId) &&
        Objects.equals(this.authToken, requestInfo.authToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiId, ver, ts, action, did, key, msgId, requesterId, authToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestInfo {\n");
    
    sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
    sb.append("    ver: ").append(toIndentedString(ver)).append("\n");
    sb.append("    ts: ").append(toIndentedString(ts)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    did: ").append(toIndentedString(did)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    msgId: ").append(toIndentedString(msgId)).append("\n");
    sb.append("    requesterId: ").append(toIndentedString(requesterId)).append("\n");
    sb.append("    authToken: ").append(toIndentedString(authToken)).append("\n");
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

