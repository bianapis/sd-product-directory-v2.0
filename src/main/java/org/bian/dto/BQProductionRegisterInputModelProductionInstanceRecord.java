package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductionRegisterInputModelProductionInstanceRecord
 */
public class BQProductionRegisterInputModelProductionInstanceRecord   {
  private String productServiceLocationAvailability = null;

  private String productServiceTimeAvailability = null;

  private String productServiceAccessAvailability = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: List and description of locations where the product or service is supported 
   * @return productServiceLocationAvailability
  **/

  public String getProductServiceLocationAvailability() {
    return productServiceLocationAvailability;
  }

  public void setProductServiceLocationAvailability(String productServiceLocationAvailability) {
    this.productServiceLocationAvailability = productServiceLocationAvailability;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule for when the product or service can be accessed 
   * @return productServiceTimeAvailability
  **/

  public String getProductServiceTimeAvailability() {
    return productServiceTimeAvailability;
  }

  public void setProductServiceTimeAvailability(String productServiceTimeAvailability) {
    this.productServiceTimeAvailability = productServiceTimeAvailability;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The access channels and devices that are supported by the product or service 
   * @return productServiceAccessAvailability
  **/

  public String getProductServiceAccessAvailability() {
    return productServiceAccessAvailability;
  }

  public void setProductServiceAccessAvailability(String productServiceAccessAvailability) {
    this.productServiceAccessAvailability = productServiceAccessAvailability;
  }


}

