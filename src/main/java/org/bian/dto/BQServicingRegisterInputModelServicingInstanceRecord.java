package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQServicingRegisterInputModelServicingInstanceRecord
 */
public class BQServicingRegisterInputModelServicingInstanceRecord   {
  private String productServiceFeature = null;

  private String productServiceFeatureGuideline = null;

  private String productServiceFeatureProblemDiagnosis = null;

  private String productServiceFeatureProblemResolution = null;


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FY1e9cTGEeChad0JzLk7QA_-1288627304/elements/_FY_P8MTGEeChad0JzLk7QA_-1890335916  bian-reference: ProductFeature `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Selectable product or service feature associated with servicing a product or service 
   * @return productServiceFeature
  **/

  public String getProductServiceFeature() {
    return productServiceFeature;
  }

  public void setProductServiceFeature(String productServiceFeature) {
    this.productServiceFeature = productServiceFeature;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Explanation/guidelines for the product or service feature (can be assisted or self serve) 
   * @return productServiceFeatureGuideline
  **/

  public String getProductServiceFeatureGuideline() {
    return productServiceFeatureGuideline;
  }

  public void setProductServiceFeatureGuideline(String productServiceFeatureGuideline) {
    this.productServiceFeatureGuideline = productServiceFeatureGuideline;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Diagnosis guide for addressing reported issues with a product or service feature 
   * @return productServiceFeatureProblemDiagnosis
  **/

  public String getProductServiceFeatureProblemDiagnosis() {
    return productServiceFeatureProblemDiagnosis;
  }

  public void setProductServiceFeatureProblemDiagnosis(String productServiceFeatureProblemDiagnosis) {
    this.productServiceFeatureProblemDiagnosis = productServiceFeatureProblemDiagnosis;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Resolution guide for resolving reported issue with a product or service feature 
   * @return productServiceFeatureProblemResolution
  **/

  public String getProductServiceFeatureProblemResolution() {
    return productServiceFeatureProblemResolution;
  }

  public void setProductServiceFeatureProblemResolution(String productServiceFeatureProblemResolution) {
    this.productServiceFeatureProblemResolution = productServiceFeatureProblemResolution;
  }


}

