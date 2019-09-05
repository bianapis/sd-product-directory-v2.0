package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOperationsRegisterInputModelOperationsInstanceRecord;
import org.bian.dto.CRProductDirectoryEntryRegisterInputModelProductDirectoryEntryInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQOperationsRegisterInputModel
 */
public class BQOperationsRegisterInputModel   {
  private CRProductDirectoryEntryRegisterInputModelProductDirectoryEntryInstanceRecord productDirectoryEntryInstanceRecord = null;

  private String productDirectoryEntryInstanceReference = null;

  private Object operationsInitiateActionRecord = null;

  private BQOperationsRegisterInputModelOperationsInstanceRecord operationsInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return operationsInitiateActionRecord
  **/

  public Object getOperationsInitiateActionRecord() {
    return operationsInitiateActionRecord;
  }

  public void setOperationsInitiateActionRecord(Object operationsInitiateActionRecord) {
    this.operationsInitiateActionRecord = operationsInitiateActionRecord;
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


}

