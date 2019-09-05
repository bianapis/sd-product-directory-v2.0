package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQServicingRegisterOutputModel
 */
public class BQServicingRegisterOutputModel   {
  private String servicingInstanceReference = null;

  private String servicingInitiateActionReference = null;

  private Object servicingInitiateActionRecord = null;

  private String servicingInstanceStatus = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return servicingInitiateActionReference
  **/

  public String getServicingInitiateActionReference() {
    return servicingInitiateActionReference;
  }

  public void setServicingInitiateActionReference(String servicingInitiateActionReference) {
    this.servicingInitiateActionReference = servicingInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return servicingInitiateActionRecord
  **/

  public Object getServicingInitiateActionRecord() {
    return servicingInitiateActionRecord;
  }

  public void setServicingInitiateActionRecord(Object servicingInitiateActionRecord) {
    this.servicingInitiateActionRecord = servicingInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Servicing instance (e.g. initialised, pending, active) 
   * @return servicingInstanceStatus
  **/

  public String getServicingInstanceStatus() {
    return servicingInstanceStatus;
  }

  public void setServicingInstanceStatus(String servicingInstanceStatus) {
    this.servicingInstanceStatus = servicingInstanceStatus;
  }


}

