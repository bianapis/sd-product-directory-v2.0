package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductDirectoryEntryRetrieveInputModelProductDirectoryEntryInstanceReportRecord
 */
public class CRProductDirectoryEntryRetrieveInputModelProductDirectoryEntryInstanceReportRecord   {
  private String productDirectoryEntryInstanceReportReference = null;

  private String productDirectoryEntryInstanceReportType = null;

  private String productDirectoryEntryInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return productDirectoryEntryInstanceReportReference
  **/

  public String getProductDirectoryEntryInstanceReportReference() {
    return productDirectoryEntryInstanceReportReference;
  }

  public void setProductDirectoryEntryInstanceReportReference(String productDirectoryEntryInstanceReportReference) {
    this.productDirectoryEntryInstanceReportReference = productDirectoryEntryInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return productDirectoryEntryInstanceReportType
  **/

  public String getProductDirectoryEntryInstanceReportType() {
    return productDirectoryEntryInstanceReportType;
  }

  public void setProductDirectoryEntryInstanceReportType(String productDirectoryEntryInstanceReportType) {
    this.productDirectoryEntryInstanceReportType = productDirectoryEntryInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return productDirectoryEntryInstanceReportParameters
  **/

  public String getProductDirectoryEntryInstanceReportParameters() {
    return productDirectoryEntryInstanceReportParameters;
  }

  public void setProductDirectoryEntryInstanceReportParameters(String productDirectoryEntryInstanceReportParameters) {
    this.productDirectoryEntryInstanceReportParameters = productDirectoryEntryInstanceReportParameters;
  }


}

