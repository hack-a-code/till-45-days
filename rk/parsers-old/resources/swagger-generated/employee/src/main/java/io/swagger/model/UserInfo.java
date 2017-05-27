package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;




/**
 * UserInfo
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-09T19:48:07.703+05:30")

public class UserInfo   {
  private Long id = null;

  private String userName = null;

  private String salutation = null;

  private String name = null;

  private String gender = null;

  private String mobileNumber = null;

  private String emailId = null;

  private String altContactNumber = null;

  private String pan = null;

  private BigDecimal aadhaarNumber = null;

  private String permanentAddress = null;

  private String permanentCity = null;

  private String permanentPincode = null;

  private String correspondenceCity = null;

  private String correspondencePincode = null;

  private String correspondenceAddress = null;

  private Boolean active = null;

  private LocalDate dob = null;

  private LocalDate pwdExpiryDate = null;

  private String locale = null;

  private String type = null;

  private String signature = null;

  private Boolean accountLocked = null;

  private List<Integer> roles = new ArrayList<Integer>();

  private String fatherOrHusbandName = null;

  private String bloodGroup = null;

  private String identificationMark = null;

  private String photo = null;

  private Long createdBy = null;

  private LocalDate createdDate = null;

  private Long lastModifiedBy = null;

  private LocalDate lastModifiedDate = null;

  private String tenantId = null;

  public UserInfo id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * The unique id of an user.
   * @return id
  **/
  @ApiModelProperty(value = "The unique id of an user.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public UserInfo userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * The unique username used for user login.
   * @return userName
  **/
  @ApiModelProperty(value = "The unique username used for user login.")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public UserInfo salutation(String salutation) {
    this.salutation = salutation;
    return this;
  }

   /**
   * The salutation of user name. Example- Mr, Miss, Mrs
   * @return salutation
  **/
  @ApiModelProperty(value = "The salutation of user name. Example- Mr, Miss, Mrs")
  public String getSalutation() {
    return salutation;
  }

  public void setSalutation(String salutation) {
    this.salutation = salutation;
  }

  public UserInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The full name of the user.
   * @return name
  **/
  @ApiModelProperty(value = "The full name of the user.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserInfo gender(String gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Gender of the user.
   * @return gender
  **/
  @ApiModelProperty(value = "Gender of the user.")
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public UserInfo mobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
    return this;
  }

   /**
   * Mobile number ofuser the user
   * @return mobileNumber
  **/
  @ApiModelProperty(value = "Mobile number ofuser the user")
  public String getMobileNumber() {
    return mobileNumber;
  }

  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }

  public UserInfo emailId(String emailId) {
    this.emailId = emailId;
    return this;
  }

   /**
   * Email address of the user
   * @return emailId
  **/
  @ApiModelProperty(value = "Email address of the user")
  public String getEmailId() {
    return emailId;
  }

  public void setEmailId(String emailId) {
    this.emailId = emailId;
  }

  public UserInfo altContactNumber(String altContactNumber) {
    this.altContactNumber = altContactNumber;
    return this;
  }

   /**
   * Alternate contact number of the user
   * @return altContactNumber
  **/
  @ApiModelProperty(value = "Alternate contact number of the user")
  public String getAltContactNumber() {
    return altContactNumber;
  }

  public void setAltContactNumber(String altContactNumber) {
    this.altContactNumber = altContactNumber;
  }

  public UserInfo pan(String pan) {
    this.pan = pan;
    return this;
  }

   /**
   * PAN number of the user
   * @return pan
  **/
  @ApiModelProperty(value = "PAN number of the user")
  public String getPan() {
    return pan;
  }

  public void setPan(String pan) {
    this.pan = pan;
  }

  public UserInfo aadhaarNumber(BigDecimal aadhaarNumber) {
    this.aadhaarNumber = aadhaarNumber;
    return this;
  }

   /**
   * Aadhaar number of the user
   * @return aadhaarNumber
  **/
  @ApiModelProperty(value = "Aadhaar number of the user")
  public BigDecimal getAadhaarNumber() {
    return aadhaarNumber;
  }

  public void setAadhaarNumber(BigDecimal aadhaarNumber) {
    this.aadhaarNumber = aadhaarNumber;
  }

  public UserInfo permanentAddress(String permanentAddress) {
    this.permanentAddress = permanentAddress;
    return this;
  }

   /**
   * Permanent address of the user.
   * @return permanentAddress
  **/
  @ApiModelProperty(value = "Permanent address of the user.")
  public String getPermanentAddress() {
    return permanentAddress;
  }

  public void setPermanentAddress(String permanentAddress) {
    this.permanentAddress = permanentAddress;
  }

  public UserInfo permanentCity(String permanentCity) {
    this.permanentCity = permanentCity;
    return this;
  }

   /**
   * City of the permanent address.
   * @return permanentCity
  **/
  @ApiModelProperty(value = "City of the permanent address.")
  public String getPermanentCity() {
    return permanentCity;
  }

  public void setPermanentCity(String permanentCity) {
    this.permanentCity = permanentCity;
  }

  public UserInfo permanentPincode(String permanentPincode) {
    this.permanentPincode = permanentPincode;
    return this;
  }

   /**
   * Permanent address pincode.
   * @return permanentPincode
  **/
  @ApiModelProperty(value = "Permanent address pincode.")
  public String getPermanentPincode() {
    return permanentPincode;
  }

  public void setPermanentPincode(String permanentPincode) {
    this.permanentPincode = permanentPincode;
  }

  public UserInfo correspondenceCity(String correspondenceCity) {
    this.correspondenceCity = correspondenceCity;
    return this;
  }

   /**
   * City of the correspondence address.
   * @return correspondenceCity
  **/
  @ApiModelProperty(value = "City of the correspondence address.")
  public String getCorrespondenceCity() {
    return correspondenceCity;
  }

  public void setCorrespondenceCity(String correspondenceCity) {
    this.correspondenceCity = correspondenceCity;
  }

  public UserInfo correspondencePincode(String correspondencePincode) {
    this.correspondencePincode = correspondencePincode;
    return this;
  }

   /**
   * Permanent address pincode.
   * @return correspondencePincode
  **/
  @ApiModelProperty(value = "Permanent address pincode.")
  public String getCorrespondencePincode() {
    return correspondencePincode;
  }

  public void setCorrespondencePincode(String correspondencePincode) {
    this.correspondencePincode = correspondencePincode;
  }

  public UserInfo correspondenceAddress(String correspondenceAddress) {
    this.correspondenceAddress = correspondenceAddress;
    return this;
  }

   /**
   * Correspondence address of the user.
   * @return correspondenceAddress
  **/
  @ApiModelProperty(value = "Correspondence address of the user.")
  public String getCorrespondenceAddress() {
    return correspondenceAddress;
  }

  public void setCorrespondenceAddress(String correspondenceAddress) {
    this.correspondenceAddress = correspondenceAddress;
  }

  public UserInfo active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * True if the user is active and False if the user is inactive.
   * @return active
  **/
  @ApiModelProperty(value = "True if the user is active and False if the user is inactive.")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public UserInfo dob(LocalDate dob) {
    this.dob = dob;
    return this;
  }

   /**
   * Data of bith of the user in mm/dd/yyyy format.
   * @return dob
  **/
  @ApiModelProperty(value = "Data of bith of the user in mm/dd/yyyy format.")
  public LocalDate getDob() {
    return dob;
  }

  public void setDob(LocalDate dob) {
    this.dob = dob;
  }

  public UserInfo pwdExpiryDate(LocalDate pwdExpiryDate) {
    this.pwdExpiryDate = pwdExpiryDate;
    return this;
  }

   /**
   * Date on which the password registered will expire.
   * @return pwdExpiryDate
  **/
  @ApiModelProperty(value = "Date on which the password registered will expire.")
  public LocalDate getPwdExpiryDate() {
    return pwdExpiryDate;
  }

  public void setPwdExpiryDate(LocalDate pwdExpiryDate) {
    this.pwdExpiryDate = pwdExpiryDate;
  }

  public UserInfo locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * Value will be set to \"en_IN\".
   * @return locale
  **/
  @ApiModelProperty(value = "Value will be set to \"en_IN\".")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public UserInfo type(String type) {
    this.type = type;
    return this;
  }

   /**
   * System set value internally. For employee value will be always \"EMPLOYEE\". For citizen value will be \"CITIZEN\".
   * @return type
  **/
  @ApiModelProperty(value = "System set value internally. For employee value will be always \"EMPLOYEE\". For citizen value will be \"CITIZEN\".")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public UserInfo signature(String signature) {
    this.signature = signature;
    return this;
  }

   /**
   * Image to be loaded for the signature of the employee
   * @return signature
  **/
  @ApiModelProperty(value = "Image to be loaded for the signature of the employee")
  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }

  public UserInfo accountLocked(Boolean accountLocked) {
    this.accountLocked = accountLocked;
    return this;
  }

   /**
   * Set to True if account is locked after several incorrect password attempt. False if account is not locked.
   * @return accountLocked
  **/
  @ApiModelProperty(value = "Set to True if account is locked after several incorrect password attempt. False if account is not locked.")
  public Boolean getAccountLocked() {
    return accountLocked;
  }

  public void setAccountLocked(Boolean accountLocked) {
    this.accountLocked = accountLocked;
  }

  public UserInfo roles(List<Integer> roles) {
    this.roles = roles;
    return this;
  }

  public UserInfo addRolesItem(Integer rolesItem) {
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * List of roles ids that are attached to the user.
   * @return roles
  **/
  @ApiModelProperty(value = "List of roles ids that are attached to the user.")
  public List<Integer> getRoles() {
    return roles;
  }

  public void setRoles(List<Integer> roles) {
    this.roles = roles;
  }

  public UserInfo fatherOrHusbandName(String fatherOrHusbandName) {
    this.fatherOrHusbandName = fatherOrHusbandName;
    return this;
  }

   /**
   * Name of user's father or husband.
   * @return fatherOrHusbandName
  **/
  @ApiModelProperty(value = "Name of user's father or husband.")
  public String getFatherOrHusbandName() {
    return fatherOrHusbandName;
  }

  public void setFatherOrHusbandName(String fatherOrHusbandName) {
    this.fatherOrHusbandName = fatherOrHusbandName;
  }

  public UserInfo bloodGroup(String bloodGroup) {
    this.bloodGroup = bloodGroup;
    return this;
  }

   /**
   * Blood group of the user.
   * @return bloodGroup
  **/
  @ApiModelProperty(value = "Blood group of the user.")
  public String getBloodGroup() {
    return bloodGroup;
  }

  public void setBloodGroup(String bloodGroup) {
    this.bloodGroup = bloodGroup;
  }

  public UserInfo identificationMark(String identificationMark) {
    this.identificationMark = identificationMark;
    return this;
  }

   /**
   * Any identification mark of the person.
   * @return identificationMark
  **/
  @ApiModelProperty(value = "Any identification mark of the person.")
  public String getIdentificationMark() {
    return identificationMark;
  }

  public void setIdentificationMark(String identificationMark) {
    this.identificationMark = identificationMark;
  }

  public UserInfo photo(String photo) {
    this.photo = photo;
    return this;
  }

   /**
   * Image to be loaded for the photo of the user
   * @return photo
  **/
  @ApiModelProperty(value = "Image to be loaded for the photo of the user")
  public String getPhoto() {
    return photo;
  }

  public void setPhoto(String photo) {
    this.photo = photo;
  }

  public UserInfo createdBy(Long createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Id of the user who created the record.
   * @return createdBy
  **/
  @ApiModelProperty(value = "Id of the user who created the record.")
  public Long getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(Long createdBy) {
    this.createdBy = createdBy;
  }

  public UserInfo createdDate(LocalDate createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Date on which the user master data was added into the system.
   * @return createdDate
  **/
  @ApiModelProperty(value = "Date on which the user master data was added into the system.")
  public LocalDate getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(LocalDate createdDate) {
    this.createdDate = createdDate;
  }

  public UserInfo lastModifiedBy(Long lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

   /**
   * Id of the user who last modified the record.
   * @return lastModifiedBy
  **/
  @ApiModelProperty(value = "Id of the user who last modified the record.")
  public Long getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(Long lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }

  public UserInfo lastModifiedDate(LocalDate lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
    return this;
  }

   /**
   * Date on which the user master data was last modified.
   * @return lastModifiedDate
  **/
  @ApiModelProperty(value = "Date on which the user master data was last modified.")
  public LocalDate getLastModifiedDate() {
    return lastModifiedDate;
  }

  public void setLastModifiedDate(LocalDate lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }

  public UserInfo tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Unique Identifier of which tenant this data is defined. For example, AP, AP-Kurnool etc.
   * @return tenantId
  **/
  @ApiModelProperty(value = "Unique Identifier of which tenant this data is defined. For example, AP, AP-Kurnool etc.")
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserInfo userInfo = (UserInfo) o;
    return Objects.equals(this.id, userInfo.id) &&
        Objects.equals(this.userName, userInfo.userName) &&
        Objects.equals(this.salutation, userInfo.salutation) &&
        Objects.equals(this.name, userInfo.name) &&
        Objects.equals(this.gender, userInfo.gender) &&
        Objects.equals(this.mobileNumber, userInfo.mobileNumber) &&
        Objects.equals(this.emailId, userInfo.emailId) &&
        Objects.equals(this.altContactNumber, userInfo.altContactNumber) &&
        Objects.equals(this.pan, userInfo.pan) &&
        Objects.equals(this.aadhaarNumber, userInfo.aadhaarNumber) &&
        Objects.equals(this.permanentAddress, userInfo.permanentAddress) &&
        Objects.equals(this.permanentCity, userInfo.permanentCity) &&
        Objects.equals(this.permanentPincode, userInfo.permanentPincode) &&
        Objects.equals(this.correspondenceCity, userInfo.correspondenceCity) &&
        Objects.equals(this.correspondencePincode, userInfo.correspondencePincode) &&
        Objects.equals(this.correspondenceAddress, userInfo.correspondenceAddress) &&
        Objects.equals(this.active, userInfo.active) &&
        Objects.equals(this.dob, userInfo.dob) &&
        Objects.equals(this.pwdExpiryDate, userInfo.pwdExpiryDate) &&
        Objects.equals(this.locale, userInfo.locale) &&
        Objects.equals(this.type, userInfo.type) &&
        Objects.equals(this.signature, userInfo.signature) &&
        Objects.equals(this.accountLocked, userInfo.accountLocked) &&
        Objects.equals(this.roles, userInfo.roles) &&
        Objects.equals(this.fatherOrHusbandName, userInfo.fatherOrHusbandName) &&
        Objects.equals(this.bloodGroup, userInfo.bloodGroup) &&
        Objects.equals(this.identificationMark, userInfo.identificationMark) &&
        Objects.equals(this.photo, userInfo.photo) &&
        Objects.equals(this.createdBy, userInfo.createdBy) &&
        Objects.equals(this.createdDate, userInfo.createdDate) &&
        Objects.equals(this.lastModifiedBy, userInfo.lastModifiedBy) &&
        Objects.equals(this.lastModifiedDate, userInfo.lastModifiedDate) &&
        Objects.equals(this.tenantId, userInfo.tenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userName, salutation, name, gender, mobileNumber, emailId, altContactNumber, pan, aadhaarNumber, permanentAddress, permanentCity, permanentPincode, correspondenceCity, correspondencePincode, correspondenceAddress, active, dob, pwdExpiryDate, locale, type, signature, accountLocked, roles, fatherOrHusbandName, bloodGroup, identificationMark, photo, createdBy, createdDate, lastModifiedBy, lastModifiedDate, tenantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    salutation: ").append(toIndentedString(salutation)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    mobileNumber: ").append(toIndentedString(mobileNumber)).append("\n");
    sb.append("    emailId: ").append(toIndentedString(emailId)).append("\n");
    sb.append("    altContactNumber: ").append(toIndentedString(altContactNumber)).append("\n");
    sb.append("    pan: ").append(toIndentedString(pan)).append("\n");
    sb.append("    aadhaarNumber: ").append(toIndentedString(aadhaarNumber)).append("\n");
    sb.append("    permanentAddress: ").append(toIndentedString(permanentAddress)).append("\n");
    sb.append("    permanentCity: ").append(toIndentedString(permanentCity)).append("\n");
    sb.append("    permanentPincode: ").append(toIndentedString(permanentPincode)).append("\n");
    sb.append("    correspondenceCity: ").append(toIndentedString(correspondenceCity)).append("\n");
    sb.append("    correspondencePincode: ").append(toIndentedString(correspondencePincode)).append("\n");
    sb.append("    correspondenceAddress: ").append(toIndentedString(correspondenceAddress)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
    sb.append("    pwdExpiryDate: ").append(toIndentedString(pwdExpiryDate)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    accountLocked: ").append(toIndentedString(accountLocked)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    fatherOrHusbandName: ").append(toIndentedString(fatherOrHusbandName)).append("\n");
    sb.append("    bloodGroup: ").append(toIndentedString(bloodGroup)).append("\n");
    sb.append("    identificationMark: ").append(toIndentedString(identificationMark)).append("\n");
    sb.append("    photo: ").append(toIndentedString(photo)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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

