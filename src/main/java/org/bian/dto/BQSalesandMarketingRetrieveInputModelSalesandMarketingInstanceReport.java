package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSalesandMarketingRetrieveInputModelSalesandMarketingInstanceReport
 */
public class BQSalesandMarketingRetrieveInputModelSalesandMarketingInstanceReport   {
  private String salesandMarketingInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return salesandMarketingInstanceReportReference
  **/

  public String getSalesandMarketingInstanceReportReference() {
    return salesandMarketingInstanceReportReference;
  }

  public void setSalesandMarketingInstanceReportReference(String salesandMarketingInstanceReportReference) {
    this.salesandMarketingInstanceReportReference = salesandMarketingInstanceReportReference;
  }


}

