package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOperationsRetrieveOutputModelOperationsInstanceReport
 */
public class BQOperationsRetrieveOutputModelOperationsInstanceReport   {
  private Object operationsInstanceReportRecord = null;

  private String operationsInstanceReportType = null;

  private String operationsInstanceReportParameters = null;

  private Object operationsInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return operationsInstanceReportRecord
  **/

  public Object getOperationsInstanceReportRecord() {
    return operationsInstanceReportRecord;
  }

  public void setOperationsInstanceReportRecord(Object operationsInstanceReportRecord) {
    this.operationsInstanceReportRecord = operationsInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return operationsInstanceReportType
  **/

  public String getOperationsInstanceReportType() {
    return operationsInstanceReportType;
  }

  public void setOperationsInstanceReportType(String operationsInstanceReportType) {
    this.operationsInstanceReportType = operationsInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return operationsInstanceReportParameters
  **/

  public String getOperationsInstanceReportParameters() {
    return operationsInstanceReportParameters;
  }

  public void setOperationsInstanceReportParameters(String operationsInstanceReportParameters) {
    this.operationsInstanceReportParameters = operationsInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return operationsInstanceReport
  **/

  public Object getOperationsInstanceReport() {
    return operationsInstanceReport;
  }

  public void setOperationsInstanceReport(Object operationsInstanceReport) {
    this.operationsInstanceReport = operationsInstanceReport;
  }


}

