package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOperationsRegisterOutputModel
 */
public class BQOperationsRegisterOutputModel   {
  private String operationsInstanceReference = null;

  private String operationsInitiateActionReference = null;

  private Object operationsInitiateActionRecord = null;

  private String operationsInstanceStatus = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return operationsInitiateActionReference
  **/

  public String getOperationsInitiateActionReference() {
    return operationsInitiateActionReference;
  }

  public void setOperationsInitiateActionReference(String operationsInitiateActionReference) {
    this.operationsInitiateActionReference = operationsInitiateActionReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Operations instance (e.g. initialised, pending, active) 
   * @return operationsInstanceStatus
  **/

  public String getOperationsInstanceStatus() {
    return operationsInstanceStatus;
  }

  public void setOperationsInstanceStatus(String operationsInstanceStatus) {
    this.operationsInstanceStatus = operationsInstanceStatus;
  }


}

