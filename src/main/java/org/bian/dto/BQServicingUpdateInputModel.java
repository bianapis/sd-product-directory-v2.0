package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQServicingRegisterInputModelServicingInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQServicingUpdateInputModel
 */
public class BQServicingUpdateInputModel   {
  private String productDirectoryEntryInstanceReference = null;

  private String servicingInstanceReference = null;

  private BQServicingRegisterInputModelServicingInstanceRecord servicingInstanceRecord = null;

  private Object servicingUpdateActionTaskRecord = null;

  private String servicingUpdateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Servicing instance 
   * @return servicingInstanceReference
  **/

  public String getServicingInstanceReference() {
    return servicingInstanceReference;
  }

  public void setServicingInstanceReference(String servicingInstanceReference) {
    this.servicingInstanceReference = servicingInstanceReference;
  }


  /**
   * Get servicingInstanceRecord
   * @return servicingInstanceRecord
  **/

  public BQServicingRegisterInputModelServicingInstanceRecord getServicingInstanceRecord() {
    return servicingInstanceRecord;
  }

  public void setServicingInstanceRecord(BQServicingRegisterInputModelServicingInstanceRecord servicingInstanceRecord) {
    this.servicingInstanceRecord = servicingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return servicingUpdateActionTaskRecord
  **/

  public Object getServicingUpdateActionTaskRecord() {
    return servicingUpdateActionTaskRecord;
  }

  public void setServicingUpdateActionTaskRecord(Object servicingUpdateActionTaskRecord) {
    this.servicingUpdateActionTaskRecord = servicingUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return servicingUpdateActionRequest
  **/

  public String getServicingUpdateActionRequest() {
    return servicingUpdateActionRequest;
  }

  public void setServicingUpdateActionRequest(String servicingUpdateActionRequest) {
    this.servicingUpdateActionRequest = servicingUpdateActionRequest;
  }


}

