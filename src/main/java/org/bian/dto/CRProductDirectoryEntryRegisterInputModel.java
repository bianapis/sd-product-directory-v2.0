package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductDirectoryEntryRegisterInputModelProductDirectoryEntryInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRProductDirectoryEntryRegisterInputModel
 */
public class CRProductDirectoryEntryRegisterInputModel   {
  private String productDirectoryServicingSessionReference = null;

  private Object productDirectoryEntryRegisterActionRecord = null;

  private String productDirectoryEntryInstanceStatus = null;

  private CRProductDirectoryEntryRegisterInputModelProductDirectoryEntryInstanceRecord productDirectoryEntryInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return productDirectoryServicingSessionReference
  **/

  public String getProductDirectoryServicingSessionReference() {
    return productDirectoryServicingSessionReference;
  }

  public void setProductDirectoryServicingSessionReference(String productDirectoryServicingSessionReference) {
    this.productDirectoryServicingSessionReference = productDirectoryServicingSessionReference;
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

