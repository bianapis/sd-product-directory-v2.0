package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductDirectoryEntryRegisterInputModelProductDirectoryEntryInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRProductDirectoryEntryRegisterOutputModel
 */
public class CRProductDirectoryEntryRegisterOutputModel   {
  private String productDirectoryEntryInstanceReference = null;

  private String productDirectoryEntryRegisterActionReference = null;

  private Object productDirectoryEntryRegisterActionRecord = null;

  private String productDirectoryEntryInstanceStatus = null;

  private CRProductDirectoryEntryRegisterInputModelProductDirectoryEntryInstanceRecord productDirectoryEntryInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Product Directory Entry instance 
   * @return productDirectoryEntryInstanceReference
  **/

  public String getProductDirectoryEntryInstanceReference() {
    return productDirectoryEntryInstanceReference;
  }

  public void setProductDirectoryEntryInstanceReference(String productDirectoryEntryInstanceReference) {
    this.productDirectoryEntryInstanceReference = productDirectoryEntryInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Register service call 
   * @return productDirectoryEntryRegisterActionReference
  **/

  public String getProductDirectoryEntryRegisterActionReference() {
    return productDirectoryEntryRegisterActionReference;
  }

  public void setProductDirectoryEntryRegisterActionReference(String productDirectoryEntryRegisterActionReference) {
    this.productDirectoryEntryRegisterActionReference = productDirectoryEntryRegisterActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Register service call input and output record 
   * @return productDirectoryEntryRegisterActionRecord
  **/

  public Object getProductDirectoryEntryRegisterActionRecord() {
    return productDirectoryEntryRegisterActionRecord;
  }

  public void setProductDirectoryEntryRegisterActionRecord(Object productDirectoryEntryRegisterActionRecord) {
    this.productDirectoryEntryRegisterActionRecord = productDirectoryEntryRegisterActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Product Directory Entry instance (e.g. initialised, pending, active) 
   * @return productDirectoryEntryInstanceStatus
  **/

  public String getProductDirectoryEntryInstanceStatus() {
    return productDirectoryEntryInstanceStatus;
  }

  public void setProductDirectoryEntryInstanceStatus(String productDirectoryEntryInstanceStatus) {
    this.productDirectoryEntryInstanceStatus = productDirectoryEntryInstanceStatus;
  }


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


}

