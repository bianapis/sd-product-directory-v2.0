package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOperationsRegisterInputModelOperationsInstanceRecord;
import org.bian.dto.CRProductDirectoryEntryRegisterInputModelProductDirectoryEntryInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQOperationsUpdateInputModel
 */
public class BQOperationsUpdateInputModel   {
  private CRProductDirectoryEntryRegisterInputModelProductDirectoryEntryInstanceRecord productDirectoryEntryInstanceRecord = null;

  private String productDirectoryEntryInstanceReference = null;

  private String operationsInstanceReference = null;

  private BQOperationsRegisterInputModelOperationsInstanceRecord operationsInstanceRecord = null;

  private Object operationsUpdateActionTaskRecord = null;

  private String operationsUpdateActionRequest = null;


  /**
   * Get productDirectoryEntryInstanceRecord
   * @return productDirectoryEntryInstanceRecord
  **/

  public CRProductDirectoryEntryRegisterInputModelProductDirectoryEntryInstanceRecord getProductDirectoryEntryInstanceRecord() {
    return productDirectoryEntryInstanceRecord;
  }

  public void setProductDirectoryEntryInstanceRecord(CRProductDirectoryEntryRegisterInputModelProductDirectoryEntryInstanceRecord productDirectoryEntryInstanceRecord) {
    this.productDirectoryEntryInstanceRecord = productDirectoryEntryInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Product Directory Entry instance 
   * @return productDirectoryEntryInstanceReference
  **/

  public String getProductDirectoryEntryInstanceReference() {
    return productDirectoryEntryInstanceReference;
  }

  public void setProductDirectoryEntryInstanceReference(String productDirectoryEntryInstanceReference) {
    this.productDirectoryEntryInstanceReference = productDirectoryEntryInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Operations instance 
   * @return operationsInstanceReference
  **/

  public String getOperationsInstanceReference() {
    return operationsInstanceReference;
  }

  public void setOperationsInstanceReference(String operationsInstanceReference) {
    this.operationsInstanceReference = operationsInstanceReference;
  }


  /**
   * Get operationsInstanceRecord
   * @return operationsInstanceRecord
  **/

  public BQOperationsRegisterInputModelOperationsInstanceRecord getOperationsInstanceRecord() {
    return operationsInstanceRecord;
  }

  public void setOperationsInstanceRecord(BQOperationsRegisterInputModelOperationsInstanceRecord operationsInstanceRecord) {
    this.operationsInstanceRecord = operationsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return operationsUpdateActionTaskRecord
  **/

  public Object getOperationsUpdateActionTaskRecord() {
    return operationsUpdateActionTaskRecord;
  }

  public void setOperationsUpdateActionTaskRecord(Object operationsUpdateActionTaskRecord) {
    this.operationsUpdateActionTaskRecord = operationsUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return operationsUpdateActionRequest
  **/

  public String getOperationsUpdateActionRequest() {
    return operationsUpdateActionRequest;
  }

  public void setOperationsUpdateActionRequest(String operationsUpdateActionRequest) {
    this.operationsUpdateActionRequest = operationsUpdateActionRequest;
  }


}

