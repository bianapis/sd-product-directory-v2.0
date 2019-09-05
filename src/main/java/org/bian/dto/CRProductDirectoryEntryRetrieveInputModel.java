package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductDirectoryEntryRetrieveInputModelProductDirectoryEntryInstanceAnalysis;
import org.bian.dto.CRProductDirectoryEntryRetrieveInputModelProductDirectoryEntryInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRProductDirectoryEntryRetrieveInputModel
 */
public class CRProductDirectoryEntryRetrieveInputModel   {
  private Object productDirectoryEntryRetrieveActionTaskRecord = null;

  private String productDirectoryEntryRetrieveActionRequest = null;

  private CRProductDirectoryEntryRetrieveInputModelProductDirectoryEntryInstanceReportRecord productDirectoryEntryInstanceReportRecord = null;

  private CRProductDirectoryEntryRetrieveInputModelProductDirectoryEntryInstanceAnalysis productDirectoryEntryInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return productDirectoryEntryRetrieveActionTaskRecord
  **/

  public Object getProductDirectoryEntryRetrieveActionTaskRecord() {
    return productDirectoryEntryRetrieveActionTaskRecord;
  }

  public void setProductDirectoryEntryRetrieveActionTaskRecord(Object productDirectoryEntryRetrieveActionTaskRecord) {
    this.productDirectoryEntryRetrieveActionTaskRecord = productDirectoryEntryRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return productDirectoryEntryRetrieveActionRequest
  **/

  public String getProductDirectoryEntryRetrieveActionRequest() {
    return productDirectoryEntryRetrieveActionRequest;
  }

  public void setProductDirectoryEntryRetrieveActionRequest(String productDirectoryEntryRetrieveActionRequest) {
    this.productDirectoryEntryRetrieveActionRequest = productDirectoryEntryRetrieveActionRequest;
  }


  /**
   * Get productDirectoryEntryInstanceReportRecord
   * @return productDirectoryEntryInstanceReportRecord
  **/

  public CRProductDirectoryEntryRetrieveInputModelProductDirectoryEntryInstanceReportRecord getProductDirectoryEntryInstanceReportRecord() {
    return productDirectoryEntryInstanceReportRecord;
  }

  public void setProductDirectoryEntryInstanceReportRecord(CRProductDirectoryEntryRetrieveInputModelProductDirectoryEntryInstanceReportRecord productDirectoryEntryInstanceReportRecord) {
    this.productDirectoryEntryInstanceReportRecord = productDirectoryEntryInstanceReportRecord;
  }


  /**
   * Get productDirectoryEntryInstanceAnalysis
   * @return productDirectoryEntryInstanceAnalysis
  **/

  public CRProductDirectoryEntryRetrieveInputModelProductDirectoryEntryInstanceAnalysis getProductDirectoryEntryInstanceAnalysis() {
    return productDirectoryEntryInstanceAnalysis;
  }

  public void setProductDirectoryEntryInstanceAnalysis(CRProductDirectoryEntryRetrieveInputModelProductDirectoryEntryInstanceAnalysis productDirectoryEntryInstanceAnalysis) {
    this.productDirectoryEntryInstanceAnalysis = productDirectoryEntryInstanceAnalysis;
  }


}

