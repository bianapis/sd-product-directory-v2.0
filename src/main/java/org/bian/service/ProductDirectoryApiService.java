/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface ProductDirectoryApiService {

	SDProductDirectoryActivateOutputModel activate(SDProductDirectoryActivateInputModel request);
	
	SDProductDirectoryConfigureOutputModel configure(String sdReferenceId, SDProductDirectoryConfigureInputModel request);
	
	SDProductDirectoryFeedbackOutputModel feedback(String sdReferenceId, SDProductDirectoryFeedbackInputModel request);
	
	CRProductDirectoryEntryRegisterOutputModel register(String sdReferenceId, CRProductDirectoryEntryRegisterInputModel request);
	
	BQOperationsRegisterOutputModel registerOperations(String sdReferenceId, String crReferenceId, BQOperationsRegisterInputModel request);
	
	BQProductionRegisterOutputModel registerProduction(String sdReferenceId, String crReferenceId, BQProductionRegisterInputModel request);
	
	BQSalesandMarketingRegisterOutputModel registerSalesandmarketing(String sdReferenceId, String crReferenceId, BQSalesandMarketingRegisterInputModel request);
	
	BQServicingRegisterOutputModel registerServicing(String sdReferenceId, String crReferenceId, BQServicingRegisterInputModel request);
	
	BQOperationsRequestOutputModel requestOperations(String sdReferenceId, String crReferenceId, String bqReferenceId, BQOperationsRequestInputModel request);
	
	BQProductionRequestOutputModel requestProduction(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductionRequestInputModel request);
	
	BQSalesandMarketingRequestOutputModel requestSalesandmarketing(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSalesandMarketingRequestInputModel request);
	
	BQServicingRequestOutputModel requestServicing(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServicingRequestInputModel request);
	
	CRProductDirectoryEntryRequestOutputModel request(String sdReferenceId, String crReferenceId, CRProductDirectoryEntryRequestInputModel request);
	
	CRProductDirectoryEntryRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	BQOperationsRetrieveOutputModel retrieveOperations(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQProductionRetrieveOutputModel retrieveProduction(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQSalesandMarketingRetrieveOutputModel retrieveSalesandmarketing(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQServicingRetrieveOutputModel retrieveServicing(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDProductDirectoryRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRProductDirectoryEntryUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRProductDirectoryEntryUpdateInputModel request);
	
	BQOperationsUpdateOutputModel updateOperations(String sdReferenceId, String crReferenceId, String bqReferenceId, BQOperationsUpdateInputModel request);
	
	BQProductionUpdateOutputModel updateProduction(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductionUpdateInputModel request);
	
	BQSalesandMarketingUpdateOutputModel updateSalesandmarketing(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSalesandMarketingUpdateInputModel request);
	
	BQServicingUpdateOutputModel updateServicing(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServicingUpdateInputModel request);
	
}
