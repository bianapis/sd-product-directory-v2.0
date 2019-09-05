package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductDirectoryEntryRegisterInputModelProductDirectoryEntryInstanceRecord;
import org.bian.dto.CRProductDirectoryEntryRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRProductDirectoryEntryRequestInputModel
 */
public class CRProductDirectoryEntryRequestInputModel   {
  private String productDirectoryServicingSessionReference = null;

  private String productDirectoryEntryInstanceReference = null;

  private CRProductDirectoryEntryRegisterInputModelProductDirectoryEntryInstanceRecord productDirectoryEntryInstanceRecord = null;

  private Object productDirectoryEntryRequestActionTaskRecord = null;

  private CRProductDirectoryEntryRequestInputModelRequestRecordType requestRecordType = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return productDirectoryEntryRequestActionTaskRecord
  **/

  public Object getProductDirectoryEntryRequestActionTaskRecord() {
    return productDirectoryEntryRequestActionTaskRecord;
  }

  public void setProductDirectoryEntryRequestActionTaskRecord(Object productDirectoryEntryRequestActionTaskRecord) {
    this.productDirectoryEntryRequestActionTaskRecord = productDirectoryEntryRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRProductDirectoryEntryRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRProductDirectoryEntryRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

