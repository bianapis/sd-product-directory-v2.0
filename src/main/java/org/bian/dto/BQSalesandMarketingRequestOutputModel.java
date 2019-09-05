package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSalesandMarketingRegisterInputModelSalesandMarketingInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQSalesandMarketingRequestOutputModel
 */
public class BQSalesandMarketingRequestOutputModel   {
  private BQSalesandMarketingRegisterInputModelSalesandMarketingInstanceRecord salesandMarketingInstanceRecord = null;

  private String salesandMarketingRequestActionTaskReference = null;

  private Object salesandMarketingRequestActionTaskRecord = null;

  private String salesandMarketingRequestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get salesandMarketingInstanceRecord
   * @return salesandMarketingInstanceRecord
  **/

  public BQSalesandMarketingRegisterInputModelSalesandMarketingInstanceRecord getSalesandMarketingInstanceRecord() {
    return salesandMarketingInstanceRecord;
  }

  public void setSalesandMarketingInstanceRecord(BQSalesandMarketingRegisterInputModelSalesandMarketingInstanceRecord salesandMarketingInstanceRecord) {
    this.salesandMarketingInstanceRecord = salesandMarketingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Sales and Marketing instance request service call 
   * @return salesandMarketingRequestActionTaskReference
  **/

  public String getSalesandMarketingRequestActionTaskReference() {
    return salesandMarketingRequestActionTaskReference;
  }

  public void setSalesandMarketingRequestActionTaskReference(String salesandMarketingRequestActionTaskReference) {
    this.salesandMarketingRequestActionTaskReference = salesandMarketingRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return salesandMarketingRequestActionTaskRecord
  **/

  public Object getSalesandMarketingRequestActionTaskRecord() {
    return salesandMarketingRequestActionTaskRecord;
  }

  public void setSalesandMarketingRequestActionTaskRecord(Object salesandMarketingRequestActionTaskRecord) {
    this.salesandMarketingRequestActionTaskRecord = salesandMarketingRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Sales and Marketing service request record 
   * @return salesandMarketingRequestRecordReference
  **/

  public String getSalesandMarketingRequestRecordReference() {
    return salesandMarketingRequestRecordReference;
  }

  public void setSalesandMarketingRequestRecordReference(String salesandMarketingRequestRecordReference) {
    this.salesandMarketingRequestRecordReference = salesandMarketingRequestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

