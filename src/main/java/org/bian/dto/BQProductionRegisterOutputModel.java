package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductionRegisterOutputModel
 */
public class BQProductionRegisterOutputModel   {
  private String productionInstanceReference = null;

  private String productionInitiateActionReference = null;

  private Object productionInitiateActionRecord = null;

  private String productionInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Production instance 
   * @return productionInstanceReference
  **/

  public String getProductionInstanceReference() {
    return productionInstanceReference;
  }

  public void setProductionInstanceReference(String productionInstanceReference) {
    this.productionInstanceReference = productionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return productionInitiateActionReference
  **/

  public String getProductionInitiateActionReference() {
    return productionInitiateActionReference;
  }

  public void setProductionInitiateActionReference(String productionInitiateActionReference) {
    this.productionInitiateActionReference = productionInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return productionInitiateActionRecord
  **/

  public Object getProductionInitiateActionRecord() {
    return productionInitiateActionRecord;
  }

  public void setProductionInitiateActionRecord(Object productionInitiateActionRecord) {
    this.productionInitiateActionRecord = productionInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Production instance (e.g. initialised, pending, active) 
   * @return productionInstanceStatus
  **/

  public String getProductionInstanceStatus() {
    return productionInstanceStatus;
  }

  public void setProductionInstanceStatus(String productionInstanceStatus) {
    this.productionInstanceStatus = productionInstanceStatus;
  }


}

