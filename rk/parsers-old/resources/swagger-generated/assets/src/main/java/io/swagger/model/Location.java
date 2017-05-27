package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;




/**
 * Location
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-27T11:12:03.168+05:30")

public class Location   {
  private Long id = null;

  private BigDecimal boundaryLocationId = null;

  private String zoneId = null;

  private String revenueWardId = null;

  private BigDecimal blockId = null;

  private String streetId = null;

  private String electionWardId = null;

  private String doorNo = null;

  private String pinCode = null;

  public Location id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the department
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier of the department")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Location boundaryLocationId(BigDecimal boundaryLocationId) {
    this.boundaryLocationId = boundaryLocationId;
    return this;
  }

   /**
   * Boundary location id.
   * @return boundaryLocationId
  **/
  @ApiModelProperty(value = "Boundary location id.")
  public BigDecimal getBoundaryLocationId() {
    return boundaryLocationId;
  }

  public void setBoundaryLocationId(BigDecimal boundaryLocationId) {
    this.boundaryLocationId = boundaryLocationId;
  }

  public Location zoneId(String zoneId) {
    this.zoneId = zoneId;
    return this;
  }

   /**
   * Boundary zone id.
   * @return zoneId
  **/
  @ApiModelProperty(value = "Boundary zone id.")
  public String getZoneId() {
    return zoneId;
  }

  public void setZoneId(String zoneId) {
    this.zoneId = zoneId;
  }

  public Location revenueWardId(String revenueWardId) {
    this.revenueWardId = revenueWardId;
    return this;
  }

   /**
   * Boundary revenueward id.
   * @return revenueWardId
  **/
  @ApiModelProperty(value = "Boundary revenueward id.")
  public String getRevenueWardId() {
    return revenueWardId;
  }

  public void setRevenueWardId(String revenueWardId) {
    this.revenueWardId = revenueWardId;
  }

  public Location blockId(BigDecimal blockId) {
    this.blockId = blockId;
    return this;
  }

   /**
   * Boundary blick id.
   * @return blockId
  **/
  @ApiModelProperty(value = "Boundary blick id.")
  public BigDecimal getBlockId() {
    return blockId;
  }

  public void setBlockId(BigDecimal blockId) {
    this.blockId = blockId;
  }

  public Location streetId(String streetId) {
    this.streetId = streetId;
    return this;
  }

   /**
   * Boundary street id.
   * @return streetId
  **/
  @ApiModelProperty(value = "Boundary street id.")
  public String getStreetId() {
    return streetId;
  }

  public void setStreetId(String streetId) {
    this.streetId = streetId;
  }

  public Location electionWardId(String electionWardId) {
    this.electionWardId = electionWardId;
    return this;
  }

   /**
   * Boundary election ward id.
   * @return electionWardId
  **/
  @ApiModelProperty(value = "Boundary election ward id.")
  public String getElectionWardId() {
    return electionWardId;
  }

  public void setElectionWardId(String electionWardId) {
    this.electionWardId = electionWardId;
  }

  public Location doorNo(String doorNo) {
    this.doorNo = doorNo;
    return this;
  }

   /**
   * Boundary door number.
   * @return doorNo
  **/
  @ApiModelProperty(value = "Boundary door number.")
  public String getDoorNo() {
    return doorNo;
  }

  public void setDoorNo(String doorNo) {
    this.doorNo = doorNo;
  }

  public Location pinCode(String pinCode) {
    this.pinCode = pinCode;
    return this;
  }

   /**
   * pin code of the location.
   * @return pinCode
  **/
  @ApiModelProperty(value = "pin code of the location.")
  public String getPinCode() {
    return pinCode;
  }

  public void setPinCode(String pinCode) {
    this.pinCode = pinCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Location location = (Location) o;
    return Objects.equals(this.id, location.id) &&
        Objects.equals(this.boundaryLocationId, location.boundaryLocationId) &&
        Objects.equals(this.zoneId, location.zoneId) &&
        Objects.equals(this.revenueWardId, location.revenueWardId) &&
        Objects.equals(this.blockId, location.blockId) &&
        Objects.equals(this.streetId, location.streetId) &&
        Objects.equals(this.electionWardId, location.electionWardId) &&
        Objects.equals(this.doorNo, location.doorNo) &&
        Objects.equals(this.pinCode, location.pinCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, boundaryLocationId, zoneId, revenueWardId, blockId, streetId, electionWardId, doorNo, pinCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    boundaryLocationId: ").append(toIndentedString(boundaryLocationId)).append("\n");
    sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
    sb.append("    revenueWardId: ").append(toIndentedString(revenueWardId)).append("\n");
    sb.append("    blockId: ").append(toIndentedString(blockId)).append("\n");
    sb.append("    streetId: ").append(toIndentedString(streetId)).append("\n");
    sb.append("    electionWardId: ").append(toIndentedString(electionWardId)).append("\n");
    sb.append("    doorNo: ").append(toIndentedString(doorNo)).append("\n");
    sb.append("    pinCode: ").append(toIndentedString(pinCode)).append("\n");
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

