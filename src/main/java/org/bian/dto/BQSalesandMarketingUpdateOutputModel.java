package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSalesandMarketingRegisterInputModelSalesandMarketingInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQSalesandMarketingUpdateOutputModel
 */
public class BQSalesandMarketingUpdateOutputModel   {
  private BQSalesandMarketingRegisterInputModelSalesandMarketingInstanceRecord salesandMarketingInstanceRecord = null;

  private String salesandMarketingUpdateActionTaskReference = null;

  private Object salesandMarketingUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return salesandMarketingUpdateActionTaskReference
  **/

  public String getSalesandMarketingUpdateActionTaskReference() {
    return salesandMarketingUpdateActionTaskReference;
  }

  public void setSalesandMarketingUpdateActionTaskReference(String salesandMarketingUpdateActionTaskReference) {
    this.salesandMarketingUpdateActionTaskReference = salesandMarketingUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

