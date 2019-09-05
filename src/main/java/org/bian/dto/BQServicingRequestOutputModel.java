package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQServicingRegisterInputModelServicingInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQServicingRequestOutputModel
 */
public class BQServicingRequestOutputModel   {
  private BQServicingRegisterInputModelServicingInstanceRecord servicingInstanceRecord = null;

  private String servicingRequestActionTaskReference = null;

  private Object servicingRequestActionTaskRecord = null;

  private String servicingRequestRecordReference = null;

  private Object requestResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Servicing instance request service call 
   * @return servicingRequestActionTaskReference
  **/

  public String getServicingRequestActionTaskReference() {
    return servicingRequestActionTaskReference;
  }

  public void setServicingRequestActionTaskReference(String servicingRequestActionTaskReference) {
    this.servicingRequestActionTaskReference = servicingRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return servicingRequestActionTaskRecord
  **/

  public Object getServicingRequestActionTaskRecord() {
    return servicingRequestActionTaskRecord;
  }

  public void setServicingRequestActionTaskRecord(Object servicingRequestActionTaskRecord) {
    this.servicingRequestActionTaskRecord = servicingRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Servicing service request record 
   * @return servicingRequestRecordReference
  **/

  public String getServicingRequestRecordReference() {
    return servicingRequestRecordReference;
  }

  public void setServicingRequestRecordReference(String servicingRequestRecordReference) {
    this.servicingRequestRecordReference = servicingRequestRecordReference;
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

