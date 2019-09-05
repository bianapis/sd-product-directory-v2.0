package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductionRetrieveInputModelProductionInstanceReport
 */
public class BQProductionRetrieveInputModelProductionInstanceReport   {
  private String productionInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return productionInstanceReportReference
  **/

  public String getProductionInstanceReportReference() {
    return productionInstanceReportReference;
  }

  public void setProductionInstanceReportReference(String productionInstanceReportReference) {
    this.productionInstanceReportReference = productionInstanceReportReference;
  }


}

