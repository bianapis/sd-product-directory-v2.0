package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOperationsRegisterInputModelOperationsInstanceRecord;
import org.bian.dto.CRProductDirectoryEntryRegisterInputModelProductDirectoryEntryInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQOperationsRequestOutputModel
 */
public class BQOperationsRequestOutputModel   {
  private CRProductDirectoryEntryRegisterInputModelProductDirectoryEntryInstanceRecord productDirectoryEntryInstanceRecord = null;

  private BQOperationsRegisterInputModelOperationsInstanceRecord operationsInstanceRecord = null;

  private String operationsRequestActionTaskReference = null;

  private Object operationsRequestActionTaskRecord = null;

  private String operationsRequestRecordReference = null;

  private Object requestResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Operations instance request service call 
   * @return operationsRequestActionTaskReference
  **/

  public String getOperationsRequestActionTaskReference() {
    return operationsRequestActionTaskReference;
  }

  public void setOperationsRequestActionTaskReference(String operationsRequestActionTaskReference) {
    this.operationsRequestActionTaskReference = operationsRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return operationsRequestActionTaskRecord
  **/

  public Object getOperationsRequestActionTaskRecord() {
    return operationsRequestActionTaskRecord;
  }

  public void setOperationsRequestActionTaskRecord(Object operationsRequestActionTaskRecord) {
    this.operationsRequestActionTaskRecord = operationsRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Operations service request record 
   * @return operationsRequestRecordReference
  **/

  public String getOperationsRequestRecordReference() {
    return operationsRequestRecordReference;
  }

  public void setOperationsRequestRecordReference(String operationsRequestRecordReference) {
    this.operationsRequestRecordReference = operationsRequestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

