package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSalesandMarketingRegisterOutputModel
 */
public class BQSalesandMarketingRegisterOutputModel   {
  private String salesandMarketingInstanceReference = null;

  private String salesandMarketingInitiateActionReference = null;

  private Object salesandMarketingInitiateActionRecord = null;

  private String salesandMarketingInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Sales and Marketing instance 
   * @return salesandMarketingInstanceReference
  **/

  public String getSalesandMarketingInstanceReference() {
    return salesandMarketingInstanceReference;
  }

  public void setSalesandMarketingInstanceReference(String salesandMarketingInstanceReference) {
    this.salesandMarketingInstanceReference = salesandMarketingInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return salesandMarketingInitiateActionReference
  **/

  public String getSalesandMarketingInitiateActionReference() {
    return salesandMarketingInitiateActionReference;
  }

  public void setSalesandMarketingInitiateActionReference(String salesandMarketingInitiateActionReference) {
    this.salesandMarketingInitiateActionReference = salesandMarketingInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return salesandMarketingInitiateActionRecord
  **/

  public Object getSalesandMarketingInitiateActionRecord() {
    return salesandMarketingInitiateActionRecord;
  }

  public void setSalesandMarketingInitiateActionRecord(Object salesandMarketingInitiateActionRecord) {
    this.salesandMarketingInitiateActionRecord = salesandMarketingInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Sales and Marketing instance (e.g. initialised, pending, active) 
   * @return salesandMarketingInstanceStatus
  **/

  public String getSalesandMarketingInstanceStatus() {
    return salesandMarketingInstanceStatus;
  }

  public void setSalesandMarketingInstanceStatus(String salesandMarketingInstanceStatus) {
    this.salesandMarketingInstanceStatus = salesandMarketingInstanceStatus;
  }


}

