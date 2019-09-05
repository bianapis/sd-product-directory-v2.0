package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSalesandMarketingRegisterInputModelSalesandMarketingInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQSalesandMarketingUpdateInputModel
 */
public class BQSalesandMarketingUpdateInputModel   {
  private String productDirectoryEntryInstanceReference = null;

  private String salesandMarketingInstanceReference = null;

  private BQSalesandMarketingRegisterInputModelSalesandMarketingInstanceRecord salesandMarketingInstanceRecord = null;

  private Object salesandMarketingUpdateActionTaskRecord = null;

  private String salesandMarketingUpdateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Product Directory Entry instance 
   * @return productDirectoryEntryInstanceReference
  **/

  public String getProductDirectoryEntryInstanceReference() {
    return productDirectoryEntryInstanceReference;
  }

  public void setProductDirectoryEntryInstanceReference(String productDirectoryEntryInstanceReference) {
    this.productDirectoryEntryInstanceReference = productDirectoryEntryInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Sales and Marketing instance 
   * @return salesandMarketingInstanceReference
  **/

  public String getSalesandMarketingInstanceReference() {
    return salesandMarketingInstanceReference;
  }

  public void setSalesandMarketingInstanceReference(String salesandMarketingInstanceReference) {
    this.salesandMarketingInstanceReference = salesandMarketingInstanceReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return salesandMarketingUpdateActionTaskRecord
  **/

  public Object getSalesandMarketingUpdateActionTaskRecord() {
    return salesandMarketingUpdateActionTaskRecord;
  }

  public void setSalesandMarketingUpdateActionTaskRecord(Object salesandMarketingUpdateActionTaskRecord) {
    this.salesandMarketingUpdateActionTaskRecord = salesandMarketingUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return salesandMarketingUpdateActionRequest
  **/

  public String getSalesandMarketingUpdateActionRequest() {
    return salesandMarketingUpdateActionRequest;
  }

  public void setSalesandMarketingUpdateActionRequest(String salesandMarketingUpdateActionRequest) {
    this.salesandMarketingUpdateActionRequest = salesandMarketingUpdateActionRequest;
  }


}

