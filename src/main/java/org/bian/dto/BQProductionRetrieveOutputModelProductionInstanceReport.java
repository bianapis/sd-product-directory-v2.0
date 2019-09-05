package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductionRetrieveOutputModelProductionInstanceReport
 */
public class BQProductionRetrieveOutputModelProductionInstanceReport   {
  private Object productionInstanceReportRecord = null;

  private String productionInstanceReportType = null;

  private String productionInstanceReportParameters = null;

  private Object productionInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return productionInstanceReportRecord
  **/

  public Object getProductionInstanceReportRecord() {
    return productionInstanceReportRecord;
  }

  public void setProductionInstanceReportRecord(Object productionInstanceReportRecord) {
    this.productionInstanceReportRecord = productionInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return productionInstanceReportType
  **/

  public String getProductionInstanceReportType() {
    return productionInstanceReportType;
  }

  public void setProductionInstanceReportType(String productionInstanceReportType) {
    this.productionInstanceReportType = productionInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return productionInstanceReportParameters
  **/

  public String getProductionInstanceReportParameters() {
    return productionInstanceReportParameters;
  }

  public void setProductionInstanceReportParameters(String productionInstanceReportParameters) {
    this.productionInstanceReportParameters = productionInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return productionInstanceReport
  **/

  public Object getProductionInstanceReport() {
    return productionInstanceReport;
  }

  public void setProductionInstanceReport(Object productionInstanceReport) {
    this.productionInstanceReport = productionInstanceReport;
  }


}

