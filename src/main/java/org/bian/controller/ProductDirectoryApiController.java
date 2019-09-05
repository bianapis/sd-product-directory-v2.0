/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Catalog;

@BianRestController
public class ProductDirectoryApiController {

	@Autowired
	ProductDirectoryApiService service;
	
	@Catalog.Activate
	public BianResponse<SDProductDirectoryActivateOutputModel> activate(@RequestBody BianRequest<SDProductDirectoryActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Catalog.Configure
	public BianResponse<SDProductDirectoryConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDProductDirectoryConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Catalog.Feedback
	public BianResponse<SDProductDirectoryFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDProductDirectoryFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Catalog.Register
	public BianResponse<CRProductDirectoryEntryRegisterOutputModel> register(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRProductDirectoryEntryRegisterInputModel> bianRequest) {
		return BianResponse.forSuccess(service.register(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("operations")
	@Catalog.Register
	public BianResponse<BQOperationsRegisterOutputModel> registerOperations(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQOperationsRegisterInputModel> bianRequest) {
		return BianResponse.forSuccess(service.registerOperations(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("production")
	@Catalog.Register
	public BianResponse<BQProductionRegisterOutputModel> registerProduction(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQProductionRegisterInputModel> bianRequest) {
		return BianResponse.forSuccess(service.registerProduction(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("salesandmarketing")
	@Catalog.Register
	public BianResponse<BQSalesandMarketingRegisterOutputModel> registerSalesandmarketing(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQSalesandMarketingRegisterInputModel> bianRequest) {
		return BianResponse.forSuccess(service.registerSalesandmarketing(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("servicing")
	@Catalog.Register
	public BianResponse<BQServicingRegisterOutputModel> registerServicing(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQServicingRegisterInputModel> bianRequest) {
		return BianResponse.forSuccess(service.registerServicing(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("operations")
	@Catalog.Request
	public BianResponse<BQOperationsRequestOutputModel> requestOperations(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQOperationsRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestOperations(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("production")
	@Catalog.Request
	public BianResponse<BQProductionRequestOutputModel> requestProduction(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQProductionRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestProduction(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("salesandmarketing")
	@Catalog.Request
	public BianResponse<BQSalesandMarketingRequestOutputModel> requestSalesandmarketing(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQSalesandMarketingRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestSalesandmarketing(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("servicing")
	@Catalog.Request
	public BianResponse<BQServicingRequestOutputModel> requestServicing(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQServicingRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestServicing(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Catalog.Request
	public BianResponse<CRProductDirectoryEntryRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRProductDirectoryEntryRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Catalog.Retrieve
	public BianResponse<CRProductDirectoryEntryRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Catalog.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Catalog.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("operations")
	@Catalog.Retrieve
	public BianResponse<BQOperationsRetrieveOutputModel> retrieveOperations(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveOperations(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("production")
	@Catalog.Retrieve
	public BianResponse<BQProductionRetrieveOutputModel> retrieveProduction(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveProduction(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("salesandmarketing")
	@Catalog.Retrieve
	public BianResponse<BQSalesandMarketingRetrieveOutputModel> retrieveSalesandmarketing(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveSalesandmarketing(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("servicing")
	@Catalog.Retrieve
	public BianResponse<BQServicingRetrieveOutputModel> retrieveServicing(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveServicing(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Catalog.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Catalog.RetrieveSD
	public BianResponse<SDProductDirectoryRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Catalog.Update
	public BianResponse<CRProductDirectoryEntryUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRProductDirectoryEntryUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("operations")
	@Catalog.Update
	public BianResponse<BQOperationsUpdateOutputModel> updateOperations(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQOperationsUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateOperations(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("production")
	@Catalog.Update
	public BianResponse<BQProductionUpdateOutputModel> updateProduction(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQProductionUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateProduction(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("salesandmarketing")
	@Catalog.Update
	public BianResponse<BQSalesandMarketingUpdateOutputModel> updateSalesandmarketing(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQSalesandMarketingUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateSalesandmarketing(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("servicing")
	@Catalog.Update
	public BianResponse<BQServicingUpdateOutputModel> updateServicing(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQServicingUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateServicing(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
