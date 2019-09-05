package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductionRetrieveOutputModelProductionInstanceAnalysis
 */
public class BQProductionRetrieveOutputModelProductionInstanceAnalysis   {
  private Object productionInstanceAnalysisRecord = null;

  private String productionInstanceAnalysisReportType = null;

  private String productionInstanceAnalysisParameters = null;

  private Object productionInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return productionInstanceAnalysisRecord
  **/

  public Object getProductionInstanceAnalysisRecord() {
    return productionInstanceAnalysisRecord;
  }

  public void setProductionInstanceAnalysisRecord(Object productionInstanceAnalysisRecord) {
    this.productionInstanceAnalysisRecord = productionInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return productionInstanceAnalysisReportType
  **/

  public String getProductionInstanceAnalysisReportType() {
    return productionInstanceAnalysisReportType;
  }

  public void setProductionInstanceAnalysisReportType(String productionInstanceAnalysisReportType) {
    this.productionInstanceAnalysisReportType = productionInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return productionInstanceAnalysisParameters
  **/

  public String getProductionInstanceAnalysisParameters() {
    return productionInstanceAnalysisParameters;
  }

  public void setProductionInstanceAnalysisParameters(String productionInstanceAnalysisParameters) {
    this.productionInstanceAnalysisParameters = productionInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return productionInstanceAnalysisReport
  **/

  public Object getProductionInstanceAnalysisReport() {
    return productionInstanceAnalysisReport;
  }

  public void setProductionInstanceAnalysisReport(Object productionInstanceAnalysisReport) {
    this.productionInstanceAnalysisReport = productionInstanceAnalysisReport;
  }


}

