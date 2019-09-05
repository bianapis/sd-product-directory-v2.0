package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSalesandMarketingRegisterInputModelSalesandMarketingInstanceRecord;
import org.bian.dto.CRProductDirectoryEntryRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQSalesandMarketingRequestInputModel
 */
public class BQSalesandMarketingRequestInputModel   {
  private String productDirectoryEntryInstanceReference = null;

  private String salesandMarketingInstanceReference = null;

  private BQSalesandMarketingRegisterInputModelSalesandMarketingInstanceRecord salesandMarketingInstanceRecord = null;

  private Object salesandMarketingRequestActionTaskRecord = null;

  private CRProductDirectoryEntryRequestInputModelRequestRecordType requestRecordType = null;


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
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRProductDirectoryEntryRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRProductDirectoryEntryRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

