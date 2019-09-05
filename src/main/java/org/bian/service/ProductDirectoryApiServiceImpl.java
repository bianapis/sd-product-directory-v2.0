/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class ProductDirectoryApiServiceImpl implements ProductDirectoryApiService {

	public SDProductDirectoryActivateOutputModel activate(SDProductDirectoryActivateInputModel request){
		return JsonReader.read("activate-SDProductDirectoryActivateOutputModel.json",new TypeReference<SDProductDirectoryActivateOutputModel>(){});
	}
	
	public SDProductDirectoryConfigureOutputModel configure(String sdReferenceId, SDProductDirectoryConfigureInputModel request){
		return JsonReader.read("configure-SDProductDirectoryConfigureOutputModel.json",new TypeReference<SDProductDirectoryConfigureOutputModel>(){});
	}
	
	public SDProductDirectoryFeedbackOutputModel feedback(String sdReferenceId, SDProductDirectoryFeedbackInputModel request){
		return JsonReader.read("feedback-SDProductDirectoryFeedbackOutputModel.json",new TypeReference<SDProductDirectoryFeedbackOutputModel>(){});
	}
	
	public CRProductDirectoryEntryRegisterOutputModel register(String sdReferenceId, CRProductDirectoryEntryRegisterInputModel request){
		return JsonReader.read("register-CRProductDirectoryEntryRegisterOutputModel.json",new TypeReference<CRProductDirectoryEntryRegisterOutputModel>(){});
	}
	
	public BQOperationsRegisterOutputModel registerOperations(String sdReferenceId, String crReferenceId, BQOperationsRegisterInputModel request){
		return JsonReader.read("register-BQOperationsRegisterOutputModel.json",new TypeReference<BQOperationsRegisterOutputModel>(){});
	}
	
	public BQProductionRegisterOutputModel registerProduction(String sdReferenceId, String crReferenceId, BQProductionRegisterInputModel request){
		return JsonReader.read("register-BQProductionRegisterOutputModel.json",new TypeReference<BQProductionRegisterOutputModel>(){});
	}
	
	public BQSalesandMarketingRegisterOutputModel registerSalesandmarketing(String sdReferenceId, String crReferenceId, BQSalesandMarketingRegisterInputModel request){
		return JsonReader.read("register-BQSalesandMarketingRegisterOutputModel.json",new TypeReference<BQSalesandMarketingRegisterOutputModel>(){});
	}
	
	public BQServicingRegisterOutputModel registerServicing(String sdReferenceId, String crReferenceId, BQServicingRegisterInputModel request){
		return JsonReader.read("register-BQServicingRegisterOutputModel.json",new TypeReference<BQServicingRegisterOutputModel>(){});
	}
	
	public BQOperationsRequestOutputModel requestOperations(String sdReferenceId, String crReferenceId, String bqReferenceId, BQOperationsRequestInputModel request){
		return JsonReader.read("request-BQOperationsRequestOutputModel.json",new TypeReference<BQOperationsRequestOutputModel>(){});
	}
	
	public BQProductionRequestOutputModel requestProduction(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductionRequestInputModel request){
		return JsonReader.read("request-BQProductionRequestOutputModel.json",new TypeReference<BQProductionRequestOutputModel>(){});
	}
	
	public BQSalesandMarketingRequestOutputModel requestSalesandmarketing(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSalesandMarketingRequestInputModel request){
		return JsonReader.read("request-BQSalesandMarketingRequestOutputModel.json",new TypeReference<BQSalesandMarketingRequestOutputModel>(){});
	}
	
	public BQServicingRequestOutputModel requestServicing(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServicingRequestInputModel request){
		return JsonReader.read("request-BQServicingRequestOutputModel.json",new TypeReference<BQServicingRequestOutputModel>(){});
	}
	
	public CRProductDirectoryEntryRequestOutputModel request(String sdReferenceId, String crReferenceId, CRProductDirectoryEntryRequestInputModel request){
		return JsonReader.read("request-CRProductDirectoryEntryRequestOutputModel.json",new TypeReference<CRProductDirectoryEntryRequestOutputModel>(){});
	}
	
	public CRProductDirectoryEntryRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRProductDirectoryEntryRetrieveOutputModel.json",new TypeReference<CRProductDirectoryEntryRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQOperationsRetrieveOutputModel retrieveOperations(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQOperationsRetrieveOutputModel.json",new TypeReference<BQOperationsRetrieveOutputModel>(){});
	}
	
	public BQProductionRetrieveOutputModel retrieveProduction(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQProductionRetrieveOutputModel.json",new TypeReference<BQProductionRetrieveOutputModel>(){});
	}
	
	public BQSalesandMarketingRetrieveOutputModel retrieveSalesandmarketing(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQSalesandMarketingRetrieveOutputModel.json",new TypeReference<BQSalesandMarketingRetrieveOutputModel>(){});
	}
	
	public BQServicingRetrieveOutputModel retrieveServicing(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQServicingRetrieveOutputModel.json",new TypeReference<BQServicingRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDProductDirectoryRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDProductDirectoryRetrieveOutputModel.json",new TypeReference<SDProductDirectoryRetrieveOutputModel>(){});
	}
	
	public CRProductDirectoryEntryUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRProductDirectoryEntryUpdateInputModel request){
		return JsonReader.read("update-CRProductDirectoryEntryUpdateOutputModel.json",new TypeReference<CRProductDirectoryEntryUpdateOutputModel>(){});
	}
	
	public BQOperationsUpdateOutputModel updateOperations(String sdReferenceId, String crReferenceId, String bqReferenceId, BQOperationsUpdateInputModel request){
		return JsonReader.read("update-BQOperationsUpdateOutputModel.json",new TypeReference<BQOperationsUpdateOutputModel>(){});
	}
	
	public BQProductionUpdateOutputModel updateProduction(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductionUpdateInputModel request){
		return JsonReader.read("update-BQProductionUpdateOutputModel.json",new TypeReference<BQProductionUpdateOutputModel>(){});
	}
	
	public BQSalesandMarketingUpdateOutputModel updateSalesandmarketing(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSalesandMarketingUpdateInputModel request){
		return JsonReader.read("update-BQSalesandMarketingUpdateOutputModel.json",new TypeReference<BQSalesandMarketingUpdateOutputModel>(){});
	}
	
	public BQServicingUpdateOutputModel updateServicing(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServicingUpdateInputModel request){
		return JsonReader.read("update-BQServicingUpdateOutputModel.json",new TypeReference<BQServicingUpdateOutputModel>(){});
	}
	
}
