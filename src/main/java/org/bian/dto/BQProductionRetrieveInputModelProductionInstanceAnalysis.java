package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductionRetrieveInputModelProductionInstanceAnalysis
 */
public class BQProductionRetrieveInputModelProductionInstanceAnalysis   {
  private String productionInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return productionInstanceAnalysisReference
  **/

  public String getProductionInstanceAnalysisReference() {
    return productionInstanceAnalysisReference;
  }

  public void setProductionInstanceAnalysisReference(String productionInstanceAnalysisReference) {
    this.productionInstanceAnalysisReference = productionInstanceAnalysisReference;
  }


}

