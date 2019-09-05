package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductionRetrieveInputModelProductionInstanceAnalysis;
import org.bian.dto.BQProductionRetrieveInputModelProductionInstanceReport;

import javax.validation.Valid;
  
/**
 * BQProductionRetrieveInputModel
 */
public class BQProductionRetrieveInputModel   {
  private Object productionRetrieveActionTaskRecord = null;

  private String productionRetrieveActionRequest = null;

  private BQProductionRetrieveInputModelProductionInstanceReport productionInstanceReport = null;

  private BQProductionRetrieveInputModelProductionInstanceAnalysis productionInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return productionRetrieveActionRequest
  **/

  public String getProductionRetrieveActionRequest() {
    return productionRetrieveActionRequest;
  }

  public void setProductionRetrieveActionRequest(String productionRetrieveActionRequest) {
    this.productionRetrieveActionRequest = productionRetrieveActionRequest;
  }


  /**
   * Get productionInstanceReport
   * @return productionInstanceReport
  **/

  public BQProductionRetrieveInputModelProductionInstanceReport getProductionInstanceReport() {
    return productionInstanceReport;
  }

  public void setProductionInstanceReport(BQProductionRetrieveInputModelProductionInstanceReport productionInstanceReport) {
    this.productionInstanceReport = productionInstanceReport;
  }


  /**
   * Get productionInstanceAnalysis
   * @return productionInstanceAnalysis
  **/

  public BQProductionRetrieveInputModelProductionInstanceAnalysis getProductionInstanceAnalysis() {
    return productionInstanceAnalysis;
  }

  public void setProductionInstanceAnalysis(BQProductionRetrieveInputModelProductionInstanceAnalysis productionInstanceAnalysis) {
    this.productionInstanceAnalysis = productionInstanceAnalysis;
  }


}

