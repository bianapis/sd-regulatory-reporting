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
public class RegulatoryReportingApiServiceImpl implements RegulatoryReportingApiService {

	public RegulatoryReportingRecordResponse record(String crReferenceId, RegulatoryReportingRecordRequest request){
		return JsonReader.read("record-RegulatoryReportingRecordResponse.json",new TypeReference<RegulatoryReportingRecordResponse>(){});
	}
	
	public RegulatoryReportingRequisitionResponse requestPost(RegulatoryReportingRequisitionRequest request){
		return JsonReader.read("requestPost-RegulatoryReportingRequisitionResponse.json",new TypeReference<RegulatoryReportingRequisitionResponse>(){});
	}
	
	public RegulatoryReportingRequisitionResponse requestPut(String crReferenceId, RegulatoryReportingRequisitionRequest request){
		return JsonReader.read("requestPut-RegulatoryReportingRequisitionResponse.json",new TypeReference<RegulatoryReportingRequisitionResponse>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public RegulatoryReportingRetrieve retrieve(String crReferenceId){
		return JsonReader.read("retrieve-RegulatoryReportingRetrieve.json",new TypeReference<RegulatoryReportingRetrieve>(){});
	}
	
	public RegulatoryReportingRetrieveAuthorings retrieveAuthorings(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-RegulatoryReportingRetrieveAuthorings.json",new TypeReference<RegulatoryReportingRetrieveAuthorings>(){});
	}
	
	public RegulatoryReportingRetrieveConsolidation retrieveConsolidations(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-RegulatoryReportingRetrieveConsolidation.json",new TypeReference<RegulatoryReportingRetrieveConsolidation>(){});
	}
	
	public RegulatoryReportingRetrieveEnquiries retrieveEnquiries(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-RegulatoryReportingRetrieveEnquiries.json",new TypeReference<RegulatoryReportingRetrieveEnquiries>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public RegulatoryReportingUpdationResponse update(String crReferenceId, RegulatoryReportingUpdationRequest request){
		return JsonReader.read("update-RegulatoryReportingUpdationResponse.json",new TypeReference<RegulatoryReportingUpdationResponse>(){});
	}
	
}
