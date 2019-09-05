package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOperationsRetrieveInputModelOperationsInstanceAnalysis;
import org.bian.dto.BQOperationsRetrieveInputModelOperationsInstanceReport;

import javax.validation.Valid;
  
/**
 * BQOperationsRetrieveInputModel
 */
public class BQOperationsRetrieveInputModel   {
  private Object operationsRetrieveActionTaskRecord = null;

  private String operationsRetrieveActionRequest = null;

  private BQOperationsRetrieveInputModelOperationsInstanceReport operationsInstanceReport = null;

  private BQOperationsRetrieveInputModelOperationsInstanceAnalysis operationsInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return operationsRetrieveActionRequest
  **/

  public String getOperationsRetrieveActionRequest() {
    return operationsRetrieveActionRequest;
  }

  public void setOperationsRetrieveActionRequest(String operationsRetrieveActionRequest) {
    this.operationsRetrieveActionRequest = operationsRetrieveActionRequest;
  }


  /**
   * Get operationsInstanceReport
   * @return operationsInstanceReport
  **/

  public BQOperationsRetrieveInputModelOperationsInstanceReport getOperationsInstanceReport() {
    return operationsInstanceReport;
  }

  public void setOperationsInstanceReport(BQOperationsRetrieveInputModelOperationsInstanceReport operationsInstanceReport) {
    this.operationsInstanceReport = operationsInstanceReport;
  }


  /**
   * Get operationsInstanceAnalysis
   * @return operationsInstanceAnalysis
  **/

  public BQOperationsRetrieveInputModelOperationsInstanceAnalysis getOperationsInstanceAnalysis() {
    return operationsInstanceAnalysis;
  }

  public void setOperationsInstanceAnalysis(BQOperationsRetrieveInputModelOperationsInstanceAnalysis operationsInstanceAnalysis) {
    this.operationsInstanceAnalysis = operationsInstanceAnalysis;
  }


}

