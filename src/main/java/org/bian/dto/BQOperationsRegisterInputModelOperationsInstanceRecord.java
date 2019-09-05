package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOperationsRegisterInputModelOperationsInstanceRecord
 */
public class BQOperationsRegisterInputModelOperationsInstanceRecord   {
  private String productServiceOperatingSchedule = null;

  private String productServiceConfigurationParameterType = null;

  private String productServiceConfigurationParameterDescription = null;

  private String productServiceConfigurationParameterSetting = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  The intended schedule of operational tasks and product service availability 
   * @return productServiceOperatingSchedule
  **/

  public String getProductServiceOperatingSchedule() {
    return productServiceOperatingSchedule;
  }

  public void setProductServiceOperatingSchedule(String productServiceOperatingSchedule) {
    this.productServiceOperatingSchedule = productServiceOperatingSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Parameter used to configuring operations 
   * @return productServiceConfigurationParameterType
  **/

  public String getProductServiceConfigurationParameterType() {
    return productServiceConfigurationParameterType;
  }

  public void setProductServiceConfigurationParameterType(String productServiceConfigurationParameterType) {
    this.productServiceConfigurationParameterType = productServiceConfigurationParameterType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description describing the purpose, options and impact of the parameter 
   * @return productServiceConfigurationParameterDescription
  **/

  public String getProductServiceConfigurationParameterDescription() {
    return productServiceConfigurationParameterDescription;
  }

  public void setProductServiceConfigurationParameterDescription(String productServiceConfigurationParameterDescription) {
    this.productServiceConfigurationParameterDescription = productServiceConfigurationParameterDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  The default parameter setting and possible value range 
   * @return productServiceConfigurationParameterSetting
  **/

  public String getProductServiceConfigurationParameterSetting() {
    return productServiceConfigurationParameterSetting;
  }

  public void setProductServiceConfigurationParameterSetting(String productServiceConfigurationParameterSetting) {
    this.productServiceConfigurationParameterSetting = productServiceConfigurationParameterSetting;
  }


}

