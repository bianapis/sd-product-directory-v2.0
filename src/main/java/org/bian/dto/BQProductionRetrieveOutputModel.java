package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductionRegisterInputModelProductionInstanceRecord;
import org.bian.dto.BQProductionRetrieveOutputModelProductionInstanceAnalysis;
import org.bian.dto.BQProductionRetrieveOutputModelProductionInstanceReport;
import org.bian.dto.CRProductDirectoryEntryRegisterInputModelProductDirectoryEntryInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQProductionRetrieveOutputModel
 */
public class BQProductionRetrieveOutputModel   {
  private CRProductDirectoryEntryRegisterInputModelProductDirectoryEntryInstanceRecord productDirectoryEntryInstanceRecord = null;

  private BQProductionRegisterInputModelProductionInstanceRecord productionInstanceRecord = null;

  private String productionRetrieveActionTaskReference = null;

  private Object productionRetrieveActionTaskRecord = null;

  private String productionRetrieveActionResponse = null;

  private BQProductionRetrieveOutputModelProductionInstanceReport productionInstanceReport = null;

  private BQProductionRetrieveOutputModelProductionInstanceAnalysis productionInstanceAnalysis = null;


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
   * Get productionInstanceRecord
   * @return productionInstanceRecord
  **/

  public BQProductionRegisterInputModelProductionInstanceRecord getProductionInstanceRecord() {
    return productionInstanceRecord;
  }

  public void setProductionInstanceRecord(BQProductionRegisterInputModelProductionInstanceRecord productionInstanceRecord) {
    this.productionInstanceRecord = productionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Production instance retrieve service call 
   * @return productionRetrieveActionTaskReference
  **/

  public String getProductionRetrieveActionTaskReference() {
    return productionRetrieveActionTaskReference;
  }

  public void setProductionRetrieveActionTaskReference(String productionRetrieveActionTaskReference) {
    this.productionRetrieveActionTaskReference = productionRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return productionRetrieveActionTaskRecord
  **/

  public Object getProductionRetrieveActionTaskRecord() {
    return productionRetrieveActionTaskRecord;
  }

  public void setProductionRetrieveActionTaskRecord(Object productionRetrieveActionTaskRecord) {
    this.productionRetrieveActionTaskRecord = productionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return productionRetrieveActionResponse
  **/

  public String getProductionRetrieveActionResponse() {
    return productionRetrieveActionResponse;
  }

  public void setProductionRetrieveActionResponse(String productionRetrieveActionResponse) {
    this.productionRetrieveActionResponse = productionRetrieveActionResponse;
  }


  /**
   * Get productionInstanceReport
   * @return productionInstanceReport
  **/

  public BQProductionRetrieveOutputModelProductionInstanceReport getProductionInstanceReport() {
    return productionInstanceReport;
  }

  public void setProductionInstanceReport(BQProductionRetrieveOutputModelProductionInstanceReport productionInstanceReport) {
    this.productionInstanceReport = productionInstanceReport;
  }


  /**
   * Get productionInstanceAnalysis
   * @return productionInstanceAnalysis
  **/

  public BQProductionRetrieveOutputModelProductionInstanceAnalysis getProductionInstanceAnalysis() {
    return productionInstanceAnalysis;
  }

  public void setProductionInstanceAnalysis(BQProductionRetrieveOutputModelProductionInstanceAnalysis productionInstanceAnalysis) {
    this.productionInstanceAnalysis = productionInstanceAnalysis;
  }


}

