package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * AssetCategory
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-27T11:12:03.168+05:30")

public class AssetCategory   {
  private Long id = null;

  private String name = null;

  private String code = null;

  private String parentId = null;

  private String depreciationMethod = null;

  private String assetAccount = null;

  private String accumulatedDepreciationAccount = null;

  private String revaluationReserveAccount = null;

  private String depreciationExpenseAccount = null;

  private String unitOfMeasurement = null;

  private String customFields = null;

  public AssetCategory id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of Category
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier of Category")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public AssetCategory name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Category name.
   * @return name
  **/
  @ApiModelProperty(value = "Category name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AssetCategory code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Category code.
   * @return code
  **/
  @ApiModelProperty(value = "Category code.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public AssetCategory parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Parentid of the asset Category.
   * @return parentId
  **/
  @ApiModelProperty(value = "Parentid of the asset Category.")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public AssetCategory depreciationMethod(String depreciationMethod) {
    this.depreciationMethod = depreciationMethod;
    return this;
  }

   /**
   * Depreciation Method id.
   * @return depreciationMethod
  **/
  @ApiModelProperty(value = "Depreciation Method id.")
  public String getDepreciationMethod() {
    return depreciationMethod;
  }

  public void setDepreciationMethod(String depreciationMethod) {
    this.depreciationMethod = depreciationMethod;
  }

  public AssetCategory assetAccount(String assetAccount) {
    this.assetAccount = assetAccount;
    return this;
  }

   /**
   * Asset account.
   * @return assetAccount
  **/
  @ApiModelProperty(value = "Asset account.")
  public String getAssetAccount() {
    return assetAccount;
  }

  public void setAssetAccount(String assetAccount) {
    this.assetAccount = assetAccount;
  }

  public AssetCategory accumulatedDepreciationAccount(String accumulatedDepreciationAccount) {
    this.accumulatedDepreciationAccount = accumulatedDepreciationAccount;
    return this;
  }

   /**
   * Accumulated Depreciation Account.
   * @return accumulatedDepreciationAccount
  **/
  @ApiModelProperty(value = "Accumulated Depreciation Account.")
  public String getAccumulatedDepreciationAccount() {
    return accumulatedDepreciationAccount;
  }

  public void setAccumulatedDepreciationAccount(String accumulatedDepreciationAccount) {
    this.accumulatedDepreciationAccount = accumulatedDepreciationAccount;
  }

  public AssetCategory revaluationReserveAccount(String revaluationReserveAccount) {
    this.revaluationReserveAccount = revaluationReserveAccount;
    return this;
  }

   /**
   * Revaluation Reserve Account.
   * @return revaluationReserveAccount
  **/
  @ApiModelProperty(value = "Revaluation Reserve Account.")
  public String getRevaluationReserveAccount() {
    return revaluationReserveAccount;
  }

  public void setRevaluationReserveAccount(String revaluationReserveAccount) {
    this.revaluationReserveAccount = revaluationReserveAccount;
  }

  public AssetCategory depreciationExpenseAccount(String depreciationExpenseAccount) {
    this.depreciationExpenseAccount = depreciationExpenseAccount;
    return this;
  }

   /**
   * Depreciation Expense Account.
   * @return depreciationExpenseAccount
  **/
  @ApiModelProperty(value = "Depreciation Expense Account.")
  public String getDepreciationExpenseAccount() {
    return depreciationExpenseAccount;
  }

  public void setDepreciationExpenseAccount(String depreciationExpenseAccount) {
    this.depreciationExpenseAccount = depreciationExpenseAccount;
  }

  public AssetCategory unitOfMeasurement(String unitOfMeasurement) {
    this.unitOfMeasurement = unitOfMeasurement;
    return this;
  }

   /**
   * Unit Of Measurement.
   * @return unitOfMeasurement
  **/
  @ApiModelProperty(value = "Unit Of Measurement.")
  public String getUnitOfMeasurement() {
    return unitOfMeasurement;
  }

  public void setUnitOfMeasurement(String unitOfMeasurement) {
    this.unitOfMeasurement = unitOfMeasurement;
  }

  public AssetCategory customFields(String customFields) {
    this.customFields = customFields;
    return this;
  }

   /**
   * Custom Fields.
   * @return customFields
  **/
  @ApiModelProperty(value = "Custom Fields.")
  public String getCustomFields() {
    return customFields;
  }

  public void setCustomFields(String customFields) {
    this.customFields = customFields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetCategory assetCategory = (AssetCategory) o;
    return Objects.equals(this.id, assetCategory.id) &&
        Objects.equals(this.name, assetCategory.name) &&
        Objects.equals(this.code, assetCategory.code) &&
        Objects.equals(this.parentId, assetCategory.parentId) &&
        Objects.equals(this.depreciationMethod, assetCategory.depreciationMethod) &&
        Objects.equals(this.assetAccount, assetCategory.assetAccount) &&
        Objects.equals(this.accumulatedDepreciationAccount, assetCategory.accumulatedDepreciationAccount) &&
        Objects.equals(this.revaluationReserveAccount, assetCategory.revaluationReserveAccount) &&
        Objects.equals(this.depreciationExpenseAccount, assetCategory.depreciationExpenseAccount) &&
        Objects.equals(this.unitOfMeasurement, assetCategory.unitOfMeasurement) &&
        Objects.equals(this.customFields, assetCategory.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, code, parentId, depreciationMethod, assetAccount, accumulatedDepreciationAccount, revaluationReserveAccount, depreciationExpenseAccount, unitOfMeasurement, customFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetCategory {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    depreciationMethod: ").append(toIndentedString(depreciationMethod)).append("\n");
    sb.append("    assetAccount: ").append(toIndentedString(assetAccount)).append("\n");
    sb.append("    accumulatedDepreciationAccount: ").append(toIndentedString(accumulatedDepreciationAccount)).append("\n");
    sb.append("    revaluationReserveAccount: ").append(toIndentedString(revaluationReserveAccount)).append("\n");
    sb.append("    depreciationExpenseAccount: ").append(toIndentedString(depreciationExpenseAccount)).append("\n");
    sb.append("    unitOfMeasurement: ").append(toIndentedString(unitOfMeasurement)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
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

