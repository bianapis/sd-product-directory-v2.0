package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSalesandMarketingRetrieveInputModelSalesandMarketingInstanceAnalysis
 */
public class BQSalesandMarketingRetrieveInputModelSalesandMarketingInstanceAnalysis   {
  private String salesandMarketingInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return salesandMarketingInstanceAnalysisReference
  **/

  public String getSalesandMarketingInstanceAnalysisReference() {
    return salesandMarketingInstanceAnalysisReference;
  }

  public void setSalesandMarketingInstanceAnalysisReference(String salesandMarketingInstanceAnalysisReference) {
    this.salesandMarketingInstanceAnalysisReference = salesandMarketingInstanceAnalysisReference;
  }


}

