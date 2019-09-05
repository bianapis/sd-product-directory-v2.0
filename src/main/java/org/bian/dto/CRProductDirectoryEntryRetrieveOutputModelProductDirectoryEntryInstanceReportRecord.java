package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductDirectoryEntryRetrieveOutputModelProductDirectoryEntryInstanceReportRecord
 */
public class CRProductDirectoryEntryRetrieveOutputModelProductDirectoryEntryInstanceReportRecord   {
  private String productDirectoryEntryInstanceReportData = null;

  private String productDirectoryEntryInstanceReportType = null;

  private Object productDirectoryEntryInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return productDirectoryEntryInstanceReportData
  **/

  public String getProductDirectoryEntryInstanceReportData() {
    return productDirectoryEntryInstanceReportData;
  }

  public void setProductDirectoryEntryInstanceReportData(String productDirectoryEntryInstanceReportData) {
    this.productDirectoryEntryInstanceReportData = productDirectoryEntryInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return productDirectoryEntryInstanceReport
  **/

  public Object getProductDirectoryEntryInstanceReport() {
    return productDirectoryEntryInstanceReport;
  }

  public void setProductDirectoryEntryInstanceReport(Object productDirectoryEntryInstanceReport) {
    this.productDirectoryEntryInstanceReport = productDirectoryEntryInstanceReport;
  }


}

