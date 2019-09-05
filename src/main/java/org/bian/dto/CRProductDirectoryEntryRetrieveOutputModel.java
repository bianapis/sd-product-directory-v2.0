package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductDirectoryEntryRegisterInputModelProductDirectoryEntryInstanceRecord;
import org.bian.dto.CRProductDirectoryEntryRetrieveOutputModelProductDirectoryEntryInstanceAnalysis;
import org.bian.dto.CRProductDirectoryEntryRetrieveOutputModelProductDirectoryEntryInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRProductDirectoryEntryRetrieveOutputModel
 */
public class CRProductDirectoryEntryRetrieveOutputModel   {
  private CRProductDirectoryEntryRegisterInputModelProductDirectoryEntryInstanceRecord productDirectoryEntryInstanceRecord = null;

  private String productDirectoryEntryRetrieveActionTaskReference = null;

  private Object productDirectoryEntryRetrieveActionTaskRecord = null;

  private String productDirectoryEntryRetrieveActionResponse = null;

  private CRProductDirectoryEntryRetrieveOutputModelProductDirectoryEntryInstanceReportRecord productDirectoryEntryInstanceReportRecord = null;

  private CRProductDirectoryEntryRetrieveOutputModelProductDirectoryEntryInstanceAnalysis productDirectoryEntryInstanceAnalysis = null;


  /**
   * Get productDirectoryEntryInstanceRecord
   * @return productDirectoryEntryInstanceRecord
  **/

  public CRProductDirectoryEntryRegisterInputModelProductDirectoryEntryInstanceRecord getProductDirectoryEntryInstanceRecord() {
    return productDirectoryEntryInstanceRecord;
  }

  public void setProductDirectoryEntryInstanceRecord(CRProductDirectoryEntryRegisterInputModelProductDirectoryEntryInstanceRecord productDirectoryEntryInstanceRecord) {
    this.productDirectoryEntryInstanceRecord = productDirectoryEntryInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Product Directory Entry instance retrieve service call 
   * @return productDirectoryEntryRetrieveActionTaskReference
  **/

  public String getProductDirectoryEntryRetrieveActionTaskReference() {
    return productDirectoryEntryRetrieveActionTaskReference;
  }

  public void setProductDirectoryEntryRetrieveActionTaskReference(String productDirectoryEntryRetrieveActionTaskReference) {
    this.productDirectoryEntryRetrieveActionTaskReference = productDirectoryEntryRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return productDirectoryEntryRetrieveActionResponse
  **/

  public String getProductDirectoryEntryRetrieveActionResponse() {
    return productDirectoryEntryRetrieveActionResponse;
  }

  public void setProductDirectoryEntryRetrieveActionResponse(String productDirectoryEntryRetrieveActionResponse) {
    this.productDirectoryEntryRetrieveActionResponse = productDirectoryEntryRetrieveActionResponse;
  }


  /**
   * Get productDirectoryEntryInstanceReportRecord
   * @return productDirectoryEntryInstanceReportRecord
  **/

  public CRProductDirectoryEntryRetrieveOutputModelProductDirectoryEntryInstanceReportRecord getProductDirectoryEntryInstanceReportRecord() {
    return productDirectoryEntryInstanceReportRecord;
  }

  public void setProductDirectoryEntryInstanceReportRecord(CRProductDirectoryEntryRetrieveOutputModelProductDirectoryEntryInstanceReportRecord productDirectoryEntryInstanceReportRecord) {
    this.productDirectoryEntryInstanceReportRecord = productDirectoryEntryInstanceReportRecord;
  }


  /**
   * Get productDirectoryEntryInstanceAnalysis
   * @return productDirectoryEntryInstanceAnalysis
  **/

  public CRProductDirectoryEntryRetrieveOutputModelProductDirectoryEntryInstanceAnalysis getProductDirectoryEntryInstanceAnalysis() {
    return productDirectoryEntryInstanceAnalysis;
  }

  public void setProductDirectoryEntryInstanceAnalysis(CRProductDirectoryEntryRetrieveOutputModelProductDirectoryEntryInstanceAnalysis productDirectoryEntryInstanceAnalysis) {
    this.productDirectoryEntryInstanceAnalysis = productDirectoryEntryInstanceAnalysis;
  }


}

