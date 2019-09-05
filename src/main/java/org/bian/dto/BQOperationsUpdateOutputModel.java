package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOperationsRegisterInputModelOperationsInstanceRecord;
import org.bian.dto.CRProductDirectoryEntryRegisterInputModelProductDirectoryEntryInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQOperationsUpdateOutputModel
 */
public class BQOperationsUpdateOutputModel   {
  private CRProductDirectoryEntryRegisterInputModelProductDirectoryEntryInstanceRecord productDirectoryEntryInstanceRecord = null;

  private BQOperationsRegisterInputModelOperationsInstanceRecord operationsInstanceRecord = null;

  private String operationsUpdateActionTaskReference = null;

  private Object operationsUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return operationsUpdateActionTaskReference
  **/

  public String getOperationsUpdateActionTaskReference() {
    return operationsUpdateActionTaskReference;
  }

  public void setOperationsUpdateActionTaskReference(String operationsUpdateActionTaskReference) {
    this.operationsUpdateActionTaskReference = operationsUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

