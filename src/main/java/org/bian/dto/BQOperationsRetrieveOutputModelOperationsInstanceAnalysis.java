package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOperationsRetrieveOutputModelOperationsInstanceAnalysis
 */
public class BQOperationsRetrieveOutputModelOperationsInstanceAnalysis   {
  private Object operationsInstanceAnalysisRecord = null;

  private String operationsInstanceAnalysisReportType = null;

  private String operationsInstanceAnalysisParameters = null;

  private Object operationsInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return operationsInstanceAnalysisRecord
  **/

  public Object getOperationsInstanceAnalysisRecord() {
    return operationsInstanceAnalysisRecord;
  }

  public void setOperationsInstanceAnalysisRecord(Object operationsInstanceAnalysisRecord) {
    this.operationsInstanceAnalysisRecord = operationsInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return operationsInstanceAnalysisReportType
  **/

  public String getOperationsInstanceAnalysisReportType() {
    return operationsInstanceAnalysisReportType;
  }

  public void setOperationsInstanceAnalysisReportType(String operationsInstanceAnalysisReportType) {
    this.operationsInstanceAnalysisReportType = operationsInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return operationsInstanceAnalysisParameters
  **/

  public String getOperationsInstanceAnalysisParameters() {
    return operationsInstanceAnalysisParameters;
  }

  public void setOperationsInstanceAnalysisParameters(String operationsInstanceAnalysisParameters) {
    this.operationsInstanceAnalysisParameters = operationsInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return operationsInstanceAnalysisReport
  **/

  public Object getOperationsInstanceAnalysisReport() {
    return operationsInstanceAnalysisReport;
  }

  public void setOperationsInstanceAnalysisReport(Object operationsInstanceAnalysisReport) {
    this.operationsInstanceAnalysisReport = operationsInstanceAnalysisReport;
  }


}

