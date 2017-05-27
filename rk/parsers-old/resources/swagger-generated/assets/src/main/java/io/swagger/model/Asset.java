package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AssetCategory;
import io.swagger.model.Department;
import io.swagger.model.Location;




/**
 * Asset
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-27T11:12:03.168+05:30")

public class Asset   {
  private Long id = null;

  private String name = null;

  private String code = null;

  private Department department = null;

  private AssetCategory assetCategory = null;

  private String assetDetails = null;

  /**
   * enumeration.
   */
  public enum ModeOfAcquisitionEnum {
    ACQUIRED("ACQUIRED"),
    
    CONSTRUCTION("CONSTRUCTION"),
    
    PURCHASE("PURCHASE"),
    
    TENDER("TENDER");

    private String value;

    ModeOfAcquisitionEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  private ModeOfAcquisitionEnum modeOfAcquisition = null;

  /**
   * enumeration.
   */
  public enum StatusEnum {
    ACTIVE("ACTIVE"),
    
    REJECTED("REJECTED"),
    
    APPROVED("APPROVED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  private StatusEnum status = null;

  private String description = null;

  private String dateOfCreation = null;

  private Location locationDetails = null;

  private String remarks = null;

  private String length = null;

  private String width = null;

  private String totalArea = null;

  private String properties = null;

  public Asset id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Asset information
   * @return id
  **/
  @ApiModelProperty(value = "Asset information")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Asset name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the Asset.
   * @return name
  **/
  @ApiModelProperty(value = "Name of the Asset.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Asset code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Code of the Asset.
   * @return code
  **/
  @ApiModelProperty(value = "Code of the Asset.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Asset department(Department department) {
    this.department = department;
    return this;
  }

   /**
   * Get department
   * @return department
  **/
  @ApiModelProperty(value = "")
  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

  public Asset assetCategory(AssetCategory assetCategory) {
    this.assetCategory = assetCategory;
    return this;
  }

   /**
   * Get assetCategory
   * @return assetCategory
  **/
  @ApiModelProperty(value = "")
  public AssetCategory getAssetCategory() {
    return assetCategory;
  }

  public void setAssetCategory(AssetCategory assetCategory) {
    this.assetCategory = assetCategory;
  }

  public Asset assetDetails(String assetDetails) {
    this.assetDetails = assetDetails;
    return this;
  }

   /**
   * Asset details.
   * @return assetDetails
  **/
  @ApiModelProperty(value = "Asset details.")
  public String getAssetDetails() {
    return assetDetails;
  }

  public void setAssetDetails(String assetDetails) {
    this.assetDetails = assetDetails;
  }

  public Asset modeOfAcquisition(ModeOfAcquisitionEnum modeOfAcquisition) {
    this.modeOfAcquisition = modeOfAcquisition;
    return this;
  }

   /**
   * enumeration.
   * @return modeOfAcquisition
  **/
  @ApiModelProperty(value = "enumeration.")
  public ModeOfAcquisitionEnum getModeOfAcquisition() {
    return modeOfAcquisition;
  }

  public void setModeOfAcquisition(ModeOfAcquisitionEnum modeOfAcquisition) {
    this.modeOfAcquisition = modeOfAcquisition;
  }

  public Asset status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * enumeration.
   * @return status
  **/
  @ApiModelProperty(value = "enumeration.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Asset description(String description) {
    this.description = description;
    return this;
  }

   /**
   * description of asset
   * @return description
  **/
  @ApiModelProperty(value = "description of asset")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Asset dateOfCreation(String dateOfCreation) {
    this.dateOfCreation = dateOfCreation;
    return this;
  }

   /**
   * timestamp.
   * @return dateOfCreation
  **/
  @ApiModelProperty(value = "timestamp.")
  public String getDateOfCreation() {
    return dateOfCreation;
  }

  public void setDateOfCreation(String dateOfCreation) {
    this.dateOfCreation = dateOfCreation;
  }

  public Asset locationDetails(Location locationDetails) {
    this.locationDetails = locationDetails;
    return this;
  }

   /**
   * Get locationDetails
   * @return locationDetails
  **/
  @ApiModelProperty(value = "")
  public Location getLocationDetails() {
    return locationDetails;
  }

  public void setLocationDetails(Location locationDetails) {
    this.locationDetails = locationDetails;
  }

  public Asset remarks(String remarks) {
    this.remarks = remarks;
    return this;
  }

   /**
   * asset remarks
   * @return remarks
  **/
  @ApiModelProperty(value = "asset remarks")
  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }

  public Asset length(String length) {
    this.length = length;
    return this;
  }

   /**
   * Length of the Land and Shop assets.
   * @return length
  **/
  @ApiModelProperty(value = "Length of the Land and Shop assets.")
  public String getLength() {
    return length;
  }

  public void setLength(String length) {
    this.length = length;
  }

  public Asset width(String width) {
    this.width = width;
    return this;
  }

   /**
   * Width of the Land and Shop assets.
   * @return width
  **/
  @ApiModelProperty(value = "Width of the Land and Shop assets.")
  public String getWidth() {
    return width;
  }

  public void setWidth(String width) {
    this.width = width;
  }

  public Asset totalArea(String totalArea) {
    this.totalArea = totalArea;
    return this;
  }

   /**
   * Total area of Land and Shop assets.
   * @return totalArea
  **/
  @ApiModelProperty(value = "Total area of Land and Shop assets.")
  public String getTotalArea() {
    return totalArea;
  }

  public void setTotalArea(String totalArea) {
    this.totalArea = totalArea;
  }

  public Asset properties(String properties) {
    this.properties = properties;
    return this;
  }

   /**
   * Additional information of the asset.
   * @return properties
  **/
  @ApiModelProperty(value = "Additional information of the asset.")
  public String getProperties() {
    return properties;
  }

  public void setProperties(String properties) {
    this.properties = properties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Asset asset = (Asset) o;
    return Objects.equals(this.id, asset.id) &&
        Objects.equals(this.name, asset.name) &&
        Objects.equals(this.code, asset.code) &&
        Objects.equals(this.department, asset.department) &&
        Objects.equals(this.assetCategory, asset.assetCategory) &&
        Objects.equals(this.assetDetails, asset.assetDetails) &&
        Objects.equals(this.modeOfAcquisition, asset.modeOfAcquisition) &&
        Objects.equals(this.status, asset.status) &&
        Objects.equals(this.description, asset.description) &&
        Objects.equals(this.dateOfCreation, asset.dateOfCreation) &&
        Objects.equals(this.locationDetails, asset.locationDetails) &&
        Objects.equals(this.remarks, asset.remarks) &&
        Objects.equals(this.length, asset.length) &&
        Objects.equals(this.width, asset.width) &&
        Objects.equals(this.totalArea, asset.totalArea) &&
        Objects.equals(this.properties, asset.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, code, department, assetCategory, assetDetails, modeOfAcquisition, status, description, dateOfCreation, locationDetails, remarks, length, width, totalArea, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Asset {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    assetCategory: ").append(toIndentedString(assetCategory)).append("\n");
    sb.append("    assetDetails: ").append(toIndentedString(assetDetails)).append("\n");
    sb.append("    modeOfAcquisition: ").append(toIndentedString(modeOfAcquisition)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dateOfCreation: ").append(toIndentedString(dateOfCreation)).append("\n");
    sb.append("    locationDetails: ").append(toIndentedString(locationDetails)).append("\n");
    sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    totalArea: ").append(toIndentedString(totalArea)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

