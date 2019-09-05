package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductDirectoryEntryRetrieveInputModelProductDirectoryEntryInstanceAnalysis
 */
public class CRProductDirectoryEntryRetrieveInputModelProductDirectoryEntryInstanceAnalysis   {
  private String productDirectoryEntryInstanceAnalysisReference = null;

  private String productDirectoryEntryInstanceAnalysisReportType = null;

  private String productDirectoryEntryInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return productDirectoryEntryInstanceAnalysisReference
  **/

  public String getProductDirectoryEntryInstanceAnalysisReference() {
    return productDirectoryEntryInstanceAnalysisReference;
  }

  public void setProductDirectoryEntryInstanceAnalysisReference(String productDirectoryEntryInstanceAnalysisReference) {
    this.productDirectoryEntryInstanceAnalysisReference = productDirectoryEntryInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return productDirectoryEntryInstanceAnalysisParameters
  **/

  public String getProductDirectoryEntryInstanceAnalysisParameters() {
    return productDirectoryEntryInstanceAnalysisParameters;
  }

  public void setProductDirectoryEntryInstanceAnalysisParameters(String productDirectoryEntryInstanceAnalysisParameters) {
    this.productDirectoryEntryInstanceAnalysisParameters = productDirectoryEntryInstanceAnalysisParameters;
  }


}

