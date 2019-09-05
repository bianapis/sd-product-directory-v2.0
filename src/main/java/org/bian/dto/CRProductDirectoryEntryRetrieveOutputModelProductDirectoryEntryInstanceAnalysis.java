package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductDirectoryEntryRetrieveOutputModelProductDirectoryEntryInstanceAnalysis
 */
public class CRProductDirectoryEntryRetrieveOutputModelProductDirectoryEntryInstanceAnalysis   {
  private String productDirectoryEntryInstanceAnalysisData = null;

  private String productDirectoryEntryInstanceAnalysisReportType = null;

  private Object productDirectoryEntryInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return productDirectoryEntryInstanceAnalysisData
  **/

  public String getProductDirectoryEntryInstanceAnalysisData() {
    return productDirectoryEntryInstanceAnalysisData;
  }

  public void setProductDirectoryEntryInstanceAnalysisData(String productDirectoryEntryInstanceAnalysisData) {
    this.productDirectoryEntryInstanceAnalysisData = productDirectoryEntryInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return productDirectoryEntryInstanceAnalysisReportType
  **/

  public String getProductDirectoryEntryInstanceAnalysisReportType() {
    return productDirectoryEntryInstanceAnalysisReportType;
  }

  public void setProductDirectoryEntryInstanceAnalysisReportType(String productDirectoryEntryInstanceAnalysisReportType) {
    this.productDirectoryEntryInstanceAnalysisReportType = productDirectoryEntryInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return productDirectoryEntryInstanceAnalysisReport
  **/

  public Object getProductDirectoryEntryInstanceAnalysisReport() {
    return productDirectoryEntryInstanceAnalysisReport;
  }

  public void setProductDirectoryEntryInstanceAnalysisReport(Object productDirectoryEntryInstanceAnalysisReport) {
    this.productDirectoryEntryInstanceAnalysisReport = productDirectoryEntryInstanceAnalysisReport;
  }


}

