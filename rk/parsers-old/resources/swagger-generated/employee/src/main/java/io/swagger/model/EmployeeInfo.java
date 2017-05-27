package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Assignment;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;



/**
 * This object will have only the main or most frequently queried info.
 **/

/**
 * This object will have only the main or most frequently queried info.
 */
@ApiModel(description = "This object will have only the main or most frequently queried info.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-09T19:48:07.703+05:30")

public class EmployeeInfo   {
  private String code = null;

  private Long employeeStatus = null;

  private Long employeeType = null;

  private List<Assignment> assignments = new ArrayList<Assignment>();

  private List<Integer> jurisdictions = new ArrayList<Integer>();

  private String bank = null;

  private String bankBranch = null;

  private String bankAccount = null;

  private String documents = null;

  private Long id = null;

  private String userName = null;

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

  private String pan = null;

  private BigDecimal aadhaarNumber = null;

  private Boolean active = null;

  private String type = null;

  public EmployeeInfo code(String code) {
    this.code = code;
    return this;
  }

   /**
   * The unique code for an employee.
   * @return code
  **/
  @ApiModelProperty(value = "The unique code for an employee.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public EmployeeInfo employeeStatus(Long employeeStatus) {
    this.employeeStatus = employeeStatus;
    return this;
  }

   /**
   * Status of the employee from the status master where object type is \"Employee Master\". Default value will be \"EMPLOYED\". Possible status list for employee are - EMPLOYED,RETIRED,SUSPENDED and DECEASED
   * @return employeeStatus
  **/
  @ApiModelProperty(value = "Status of the employee from the status master where object type is \"Employee Master\". Default value will be \"EMPLOYED\". Possible status list for employee are - EMPLOYED,RETIRED,SUSPENDED and DECEASED")
  public Long getEmployeeStatus() {
    return employeeStatus;
  }

  public void setEmployeeStatus(Long employeeStatus) {
    this.employeeStatus = employeeStatus;
  }

  public EmployeeInfo employeeType(Long employeeType) {
    this.employeeType = employeeType;
    return this;
  }

   /**
   * Type of employment of the employee from the EmployeeType.
   * @return employeeType
  **/
  @ApiModelProperty(value = "Type of employment of the employee from the EmployeeType.")
  public Long getEmployeeType() {
    return employeeType;
  }

  public void setEmployeeType(Long employeeType) {
    this.employeeType = employeeType;
  }

  public EmployeeInfo assignments(List<Assignment> assignments) {
    this.assignments = assignments;
    return this;
  }

  public EmployeeInfo addAssignmentsItem(Assignment assignmentsItem) {
    this.assignments.add(assignmentsItem);
    return this;
  }

   /**
   * List of assignments for the employee.
   * @return assignments
  **/
  @ApiModelProperty(value = "List of assignments for the employee.")
  public List<Assignment> getAssignments() {
    return assignments;
  }

  public void setAssignments(List<Assignment> assignments) {
    this.assignments = assignments;
  }

  public EmployeeInfo jurisdictions(List<Integer> jurisdictions) {
    this.jurisdictions = jurisdictions;
    return this;
  }

  public EmployeeInfo addJurisdictionsItem(Integer jurisdictionsItem) {
    this.jurisdictions.add(jurisdictionsItem);
    return this;
  }

   /**
   * List of Jurisdictions (boundary codes) for which this employee has access to.
   * @return jurisdictions
  **/
  @ApiModelProperty(value = "List of Jurisdictions (boundary codes) for which this employee has access to.")
  public List<Integer> getJurisdictions() {
    return jurisdictions;
  }

  public void setJurisdictions(List<Integer> jurisdictions) {
    this.jurisdictions = jurisdictions;
  }

  public EmployeeInfo bank(String bank) {
    this.bank = bank;
    return this;
  }

   /**
   * which bank does the employee has account.
   * @return bank
  **/
  @ApiModelProperty(value = "which bank does the employee has account.")
  public String getBank() {
    return bank;
  }

  public void setBank(String bank) {
    this.bank = bank;
  }

  public EmployeeInfo bankBranch(String bankBranch) {
    this.bankBranch = bankBranch;
    return this;
  }

   /**
   * which bank branch does the employee has account.
   * @return bankBranch
  **/
  @ApiModelProperty(value = "which bank branch does the employee has account.")
  public String getBankBranch() {
    return bankBranch;
  }

  public void setBankBranch(String bankBranch) {
    this.bankBranch = bankBranch;
  }

  public EmployeeInfo bankAccount(String bankAccount) {
    this.bankAccount = bankAccount;
    return this;
  }

   /**
   * The unique bank account Number of an employee has account.
   * @return bankAccount
  **/
  @ApiModelProperty(value = "The unique bank account Number of an employee has account.")
  public String getBankAccount() {
    return bankAccount;
  }

  public void setBankAccount(String bankAccount) {
    this.bankAccount = bankAccount;
  }

  public EmployeeInfo documents(String documents) {
    this.documents = documents;
    return this;
  }

   /**
   * Documents related to employee any general stuff.
   * @return documents
  **/
  @ApiModelProperty(value = "Documents related to employee any general stuff.")
  public String getDocuments() {
    return documents;
  }

  public void setDocuments(String documents) {
    this.documents = documents;
  }

  public EmployeeInfo id(Long id) {
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

  public EmployeeInfo userName(String userName) {
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

  public EmployeeInfo salutation(String salutation) {
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

  public EmployeeInfo name(String name) {
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

  public EmployeeInfo gender(List<GenderEnum> gender) {
    this.gender = gender;
    return this;
  }

  public EmployeeInfo addGenderItem(GenderEnum genderItem) {
    this.gender.add(genderItem);
    return this;
  }

   /**
   * Gender of the user.
   * @return gender
  **/
  @ApiModelProperty(value = "Gender of the user.")
  public List<GenderEnum> getGender() {
    return gender;
  }

  public void setGender(List<GenderEnum> gender) {
    this.gender = gender;
  }

  public EmployeeInfo mobileNumber(String mobileNumber) {
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

  public EmployeeInfo emailId(String emailId) {
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

  public EmployeeInfo pan(String pan) {
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

  public EmployeeInfo aadhaarNumber(BigDecimal aadhaarNumber) {
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

  public EmployeeInfo active(Boolean active) {
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

  public EmployeeInfo type(String type) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeeInfo employeeInfo = (EmployeeInfo) o;
    return Objects.equals(this.code, employeeInfo.code) &&
        Objects.equals(this.employeeStatus, employeeInfo.employeeStatus) &&
        Objects.equals(this.employeeType, employeeInfo.employeeType) &&
        Objects.equals(this.assignments, employeeInfo.assignments) &&
        Objects.equals(this.jurisdictions, employeeInfo.jurisdictions) &&
        Objects.equals(this.bank, employeeInfo.bank) &&
        Objects.equals(this.bankBranch, employeeInfo.bankBranch) &&
        Objects.equals(this.bankAccount, employeeInfo.bankAccount) &&
        Objects.equals(this.documents, employeeInfo.documents) &&
        Objects.equals(this.id, employeeInfo.id) &&
        Objects.equals(this.userName, employeeInfo.userName) &&
        Objects.equals(this.salutation, employeeInfo.salutation) &&
        Objects.equals(this.name, employeeInfo.name) &&
        Objects.equals(this.gender, employeeInfo.gender) &&
        Objects.equals(this.mobileNumber, employeeInfo.mobileNumber) &&
        Objects.equals(this.emailId, employeeInfo.emailId) &&
        Objects.equals(this.pan, employeeInfo.pan) &&
        Objects.equals(this.aadhaarNumber, employeeInfo.aadhaarNumber) &&
        Objects.equals(this.active, employeeInfo.active) &&
        Objects.equals(this.type, employeeInfo.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, employeeStatus, employeeType, assignments, jurisdictions, bank, bankBranch, bankAccount, documents, id, userName, salutation, name, gender, mobileNumber, emailId, pan, aadhaarNumber, active, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeInfo {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    employeeStatus: ").append(toIndentedString(employeeStatus)).append("\n");
    sb.append("    employeeType: ").append(toIndentedString(employeeType)).append("\n");
    sb.append("    assignments: ").append(toIndentedString(assignments)).append("\n");
    sb.append("    jurisdictions: ").append(toIndentedString(jurisdictions)).append("\n");
    sb.append("    bank: ").append(toIndentedString(bank)).append("\n");
    sb.append("    bankBranch: ").append(toIndentedString(bankBranch)).append("\n");
    sb.append("    bankAccount: ").append(toIndentedString(bankAccount)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    salutation: ").append(toIndentedString(salutation)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    mobileNumber: ").append(toIndentedString(mobileNumber)).append("\n");
    sb.append("    emailId: ").append(toIndentedString(emailId)).append("\n");
    sb.append("    pan: ").append(toIndentedString(pan)).append("\n");
    sb.append("    aadhaarNumber: ").append(toIndentedString(aadhaarNumber)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

