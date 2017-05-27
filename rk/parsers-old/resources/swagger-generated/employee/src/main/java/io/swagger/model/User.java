package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Role;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;




/**
 * User
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-01T18:46:10.220+05:30")

public class User   {
  private Long id = null;

  private String userName = null;

  private String password = null;

  private String salutation = null;

  private String name = null;

  /**
   * Gets or Sets gender
   */
  public enum GenderEnum {
    MALE("MALE"),
    
    FEMALE("FEMALE"),
    
    OTHERS("OTHERS");

    private String value;

    GenderEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  private List<GenderEnum> gender = new ArrayList<GenderEnum>();

  private String mobileNumber = null;

  private String emailId = null;

  private String altContactNumber = null;

  private String pan = null;

  private String aadhaarNumber = null;

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

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    EMPLOYEE("EMPLOYEE"),
    
    CITIZEN("CITIZEN"),
    
    SYSTEM("SYSTEM");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  private List<TypeEnum> type = new ArrayList<TypeEnum>();

  private byte[] signature = null;

  private Boolean accountLocked = null;

  private List<Role> roles = new ArrayList<Role>();

  private String fatherOrHusbandName = null;

  private String bloodGroup = null;

  private String identificationMark = null;

  private byte[] photo = null;

  private Long createdBy = null;

  private LocalDate createdDate = null;

  private Long lastModifiedBy = null;

  private LocalDate lastModifiedDate = null;

  public User id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * The unique id an user.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The unique id an user.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public User userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * The unique username used for user login.
   * @return userName
  **/
  @ApiModelProperty(required = true, value = "The unique username used for user login.")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public User password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Password for user login.
   * @return password
  **/
  @ApiModelProperty(value = "Password for user login.")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public User salutation(String salutation) {
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

  public User name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The full name of the user.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The full name of the user.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public User gender(List<GenderEnum> gender) {
    this.gender = gender;
    return this;
  }

  public User addGenderItem(GenderEnum genderItem) {
    this.gender.add(genderItem);
    return this;
  }

   /**
   * Gender of the user.
   * @return gender
  **/
  @ApiModelProperty(required = true, value = "Gender of the user.")
  public List<GenderEnum> getGender() {
    return gender;
  }

  public void setGender(List<GenderEnum> gender) {
    this.gender = gender;
  }

  public User mobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
    return this;
  }

   /**
   * Mobile number ofuser the user
   * @return mobileNumber
  **/
  @ApiModelProperty(required = true, value = "Mobile number ofuser the user")
  public String getMobileNumber() {
    return mobileNumber;
  }

  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }

  public User emailId(String emailId) {
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

  public User altContactNumber(String altContactNumber) {
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

  public User pan(String pan) {
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

  public User aadhaarNumber(String aadhaarNumber) {
    this.aadhaarNumber = aadhaarNumber;
    return this;
  }

   /**
   * Aadhaar number of the user
   * @return aadhaarNumber
  **/
  @ApiModelProperty(value = "Aadhaar number of the user")
  public String getAadhaarNumber() {
    return aadhaarNumber;
  }

  public void setAadhaarNumber(String aadhaarNumber) {
    this.aadhaarNumber = aadhaarNumber;
  }

  public User permanentAddress(String permanentAddress) {
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

  public User permanentCity(String permanentCity) {
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

  public User permanentPincode(String permanentPincode) {
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

  public User correspondenceCity(String correspondenceCity) {
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

  public User correspondencePincode(String correspondencePincode) {
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

  public User correspondenceAddress(String correspondenceAddress) {
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

  public User active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * True if the user is active and False if the user is inactive.
   * @return active
  **/
  @ApiModelProperty(required = true, value = "True if the user is active and False if the user is inactive.")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public User dob(LocalDate dob) {
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

  public User pwdExpiryDate(LocalDate pwdExpiryDate) {
    this.pwdExpiryDate = pwdExpiryDate;
    return this;
  }

   /**
   * Date on which the password registered will expire.
   * @return pwdExpiryDate
  **/
  @ApiModelProperty(required = true, value = "Date on which the password registered will expire.")
  public LocalDate getPwdExpiryDate() {
    return pwdExpiryDate;
  }

  public void setPwdExpiryDate(LocalDate pwdExpiryDate) {
    this.pwdExpiryDate = pwdExpiryDate;
  }

  public User locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * Value will be set to \"en_IN\".
   * @return locale
  **/
  @ApiModelProperty(required = true, value = "Value will be set to \"en_IN\".")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public User type(List<TypeEnum> type) {
    this.type = type;
    return this;
  }

  public User addTypeItem(TypeEnum typeItem) {
    this.type.add(typeItem);
    return this;
  }

   /**
   * System set value internally. For employee value will be always \"EMPLOYEE\". For citizen value will be \"CITIZEN\".
   * @return type
  **/
  @ApiModelProperty(required = true, value = "System set value internally. For employee value will be always \"EMPLOYEE\". For citizen value will be \"CITIZEN\".")
  public List<TypeEnum> getType() {
    return type;
  }

  public void setType(List<TypeEnum> type) {
    this.type = type;
  }

  public User signature(byte[] signature) {
    this.signature = signature;
    return this;
  }

   /**
   * Image to be loaded for the signature of the employee
   * @return signature
  **/
  @ApiModelProperty(value = "Image to be loaded for the signature of the employee")
  public byte[] getSignature() {
    return signature;
  }

  public void setSignature(byte[] signature) {
    this.signature = signature;
  }

  public User accountLocked(Boolean accountLocked) {
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

  public User roles(List<Role> roles) {
    this.roles = roles;
    return this;
  }

  public User addRolesItem(Role rolesItem) {
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * List of roles that are attached to the user.
   * @return roles
  **/
  @ApiModelProperty(value = "List of roles that are attached to the user.")
  public List<Role> getRoles() {
    return roles;
  }

  public void setRoles(List<Role> roles) {
    this.roles = roles;
  }

  public User fatherOrHusbandName(String fatherOrHusbandName) {
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

  public User bloodGroup(String bloodGroup) {
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

  public User identificationMark(String identificationMark) {
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

  public User photo(byte[] photo) {
    this.photo = photo;
    return this;
  }

   /**
   * Image to be loaded for the photo of the user
   * @return photo
  **/
  @ApiModelProperty(value = "Image to be loaded for the photo of the user")
  public byte[] getPhoto() {
    return photo;
  }

  public void setPhoto(byte[] photo) {
    this.photo = photo;
  }

  public User createdBy(Long createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Id of the user who created the record.
   * @return createdBy
  **/
  @ApiModelProperty(required = true, value = "Id of the user who created the record.")
  public Long getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(Long createdBy) {
    this.createdBy = createdBy;
  }

  public User createdDate(LocalDate createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Date on which the user master data was added into the system.
   * @return createdDate
  **/
  @ApiModelProperty(required = true, value = "Date on which the user master data was added into the system.")
  public LocalDate getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(LocalDate createdDate) {
    this.createdDate = createdDate;
  }

  public User lastModifiedBy(Long lastModifiedBy) {
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

  public User lastModifiedDate(LocalDate lastModifiedDate) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.id, user.id) &&
        Objects.equals(this.userName, user.userName) &&
        Objects.equals(this.password, user.password) &&
        Objects.equals(this.salutation, user.salutation) &&
        Objects.equals(this.name, user.name) &&
        Objects.equals(this.gender, user.gender) &&
        Objects.equals(this.mobileNumber, user.mobileNumber) &&
        Objects.equals(this.emailId, user.emailId) &&
        Objects.equals(this.altContactNumber, user.altContactNumber) &&
        Objects.equals(this.pan, user.pan) &&
        Objects.equals(this.aadhaarNumber, user.aadhaarNumber) &&
        Objects.equals(this.permanentAddress, user.permanentAddress) &&
        Objects.equals(this.permanentCity, user.permanentCity) &&
        Objects.equals(this.permanentPincode, user.permanentPincode) &&
        Objects.equals(this.correspondenceCity, user.correspondenceCity) &&
        Objects.equals(this.correspondencePincode, user.correspondencePincode) &&
        Objects.equals(this.correspondenceAddress, user.correspondenceAddress) &&
        Objects.equals(this.active, user.active) &&
        Objects.equals(this.dob, user.dob) &&
        Objects.equals(this.pwdExpiryDate, user.pwdExpiryDate) &&
        Objects.equals(this.locale, user.locale) &&
        Objects.equals(this.type, user.type) &&
        Objects.equals(this.signature, user.signature) &&
        Objects.equals(this.accountLocked, user.accountLocked) &&
        Objects.equals(this.roles, user.roles) &&
        Objects.equals(this.fatherOrHusbandName, user.fatherOrHusbandName) &&
        Objects.equals(this.bloodGroup, user.bloodGroup) &&
        Objects.equals(this.identificationMark, user.identificationMark) &&
        Objects.equals(this.photo, user.photo) &&
        Objects.equals(this.createdBy, user.createdBy) &&
        Objects.equals(this.createdDate, user.createdDate) &&
        Objects.equals(this.lastModifiedBy, user.lastModifiedBy) &&
        Objects.equals(this.lastModifiedDate, user.lastModifiedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userName, password, salutation, name, gender, mobileNumber, emailId, altContactNumber, pan, aadhaarNumber, permanentAddress, permanentCity, permanentPincode, correspondenceCity, correspondencePincode, correspondenceAddress, active, dob, pwdExpiryDate, locale, type, signature, accountLocked, roles, fatherOrHusbandName, bloodGroup, identificationMark, photo, createdBy, createdDate, lastModifiedBy, lastModifiedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

