package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOperationsRegisterInputModelOperationsInstanceRecord;
import org.bian.dto.BQOperationsRetrieveOutputModelOperationsInstanceAnalysis;
import org.bian.dto.BQOperationsRetrieveOutputModelOperationsInstanceReport;
import org.bian.dto.CRProductDirectoryEntryRegisterInputModelProductDirectoryEntryInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQOperationsRetrieveOutputModel
 */
public class BQOperationsRetrieveOutputModel   {
  private CRProductDirectoryEntryRegisterInputModelProductDirectoryEntryInstanceRecord productDirectoryEntryInstanceRecord = null;

  private BQOperationsRegisterInputModelOperationsInstanceRecord operationsInstanceRecord = null;

  private String operationsRetrieveActionTaskReference = null;

  private Object operationsRetrieveActionTaskRecord = null;

  private String operationsRetrieveActionResponse = null;

  private BQOperationsRetrieveOutputModelOperationsInstanceReport operationsInstanceReport = null;

  private BQOperationsRetrieveOutputModelOperationsInstanceAnalysis operationsInstanceAnalysis = null;


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
   * Get operationsInstanceRecord
   * @return operationsInstanceRecord
  **/

  public BQOperationsRegisterInputModelOperationsInstanceRecord getOperationsInstanceRecord() {
    return operationsInstanceRecord;
  }

  public void setOperationsInstanceRecord(BQOperationsRegisterInputModelOperationsInstanceRecord operationsInstanceRecord) {
    this.operationsInstanceRecord = operationsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Operations instance retrieve service call 
   * @return operationsRetrieveActionTaskReference
  **/

  public String getOperationsRetrieveActionTaskReference() {
    return operationsRetrieveActionTaskReference;
  }

  public void setOperationsRetrieveActionTaskReference(String operationsRetrieveActionTaskReference) {
    this.operationsRetrieveActionTaskReference = operationsRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return operationsRetrieveActionTaskRecord
  **/

  public Object getOperationsRetrieveActionTaskRecord() {
    return operationsRetrieveActionTaskRecord;
  }

  public void setOperationsRetrieveActionTaskRecord(Object operationsRetrieveActionTaskRecord) {
    this.operationsRetrieveActionTaskRecord = operationsRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return operationsRetrieveActionResponse
  **/

  public String getOperationsRetrieveActionResponse() {
    return operationsRetrieveActionResponse;
  }

  public void setOperationsRetrieveActionResponse(String operationsRetrieveActionResponse) {
    this.operationsRetrieveActionResponse = operationsRetrieveActionResponse;
  }


  /**
   * Get operationsInstanceReport
   * @return operationsInstanceReport
  **/

  public BQOperationsRetrieveOutputModelOperationsInstanceReport getOperationsInstanceReport() {
    return operationsInstanceReport;
  }

  public void setOperationsInstanceReport(BQOperationsRetrieveOutputModelOperationsInstanceReport operationsInstanceReport) {
    this.operationsInstanceReport = operationsInstanceReport;
  }


  /**
   * Get operationsInstanceAnalysis
   * @return operationsInstanceAnalysis
  **/

  public BQOperationsRetrieveOutputModelOperationsInstanceAnalysis getOperationsInstanceAnalysis() {
    return operationsInstanceAnalysis;
  }

  public void setOperationsInstanceAnalysis(BQOperationsRetrieveOutputModelOperationsInstanceAnalysis operationsInstanceAnalysis) {
    this.operationsInstanceAnalysis = operationsInstanceAnalysis;
  }


}

