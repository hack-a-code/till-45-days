package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * EmployeeDocuments
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-09T19:48:07.703+05:30")

public class EmployeeDocuments   {
  private Long id = null;

  private Long employeeId = null;

  private String document = null;

  private String referenceType = null;

  private Long referenceId = null;

  public EmployeeDocuments id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * The unique id of this object.
   * @return id
  **/
  @ApiModelProperty(value = "The unique id of this object.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public EmployeeDocuments employeeId(Long employeeId) {
    this.employeeId = employeeId;
    return this;
  }

   /**
   * The unique id of employee.
   * @return employeeId
  **/
  @ApiModelProperty(required = true, value = "The unique id of employee.")
  public Long getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(Long employeeId) {
    this.employeeId = employeeId;
  }

  public EmployeeDocuments document(String document) {
    this.document = document;
    return this;
  }

   /**
   * The unique url for the document attached.
   * @return document
  **/
  @ApiModelProperty(required = true, value = "The unique url for the document attached.")
  public String getDocument() {
    return document;
  }

  public void setDocument(String document) {
    this.document = document;
  }

  public EmployeeDocuments referenceType(String referenceType) {
    this.referenceType = referenceType;
    return this;
  }

   /**
   * Each details in Employee can have multiple documents attached. Based on the reference type we are differentiate which document is relevant from which details.
   * @return referenceType
  **/
  @ApiModelProperty(value = "Each details in Employee can have multiple documents attached. Based on the reference type we are differentiate which document is relevant from which details.")
  public String getReferenceType() {
    return referenceType;
  }

  public void setReferenceType(String referenceType) {
    this.referenceType = referenceType;
  }

  public EmployeeDocuments referenceId(Long referenceId) {
    this.referenceId = referenceId;
    return this;
  }

   /**
   * The unique id of reference type. For instance if its a document for the first row in employee assignment, then it will have the value of assignment id.
   * @return referenceId
  **/
  @ApiModelProperty(value = "The unique id of reference type. For instance if its a document for the first row in employee assignment, then it will have the value of assignment id.")
  public Long getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(Long referenceId) {
    this.referenceId = referenceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeeDocuments employeeDocuments = (EmployeeDocuments) o;
    return Objects.equals(this.id, employeeDocuments.id) &&
        Objects.equals(this.employeeId, employeeDocuments.employeeId) &&
        Objects.equals(this.document, employeeDocuments.document) &&
        Objects.equals(this.referenceType, employeeDocuments.referenceType) &&
        Objects.equals(this.referenceId, employeeDocuments.referenceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, employeeId, document, referenceType, referenceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeDocuments {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    referenceType: ").append(toIndentedString(referenceType)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
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

