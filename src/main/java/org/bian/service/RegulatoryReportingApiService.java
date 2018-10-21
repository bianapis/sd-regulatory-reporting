/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface RegulatoryReportingApiService {

	RegulatoryReportingRecordResponse record(String crReferenceId, RegulatoryReportingRecordRequest request);
	
	RegulatoryReportingRequisitionResponse requestPost(RegulatoryReportingRequisitionRequest request);
	
	RegulatoryReportingRequisitionResponse requestPut(String crReferenceId, RegulatoryReportingRequisitionRequest request);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	RegulatoryReportingRetrieve retrieve(String crReferenceId);
	
	RegulatoryReportingRetrieveAuthorings retrieveAuthorings(String crReferenceId, String bqReferenceId);
	
	RegulatoryReportingRetrieveConsolidation retrieveConsolidations(String crReferenceId, String bqReferenceId);
	
	RegulatoryReportingRetrieveEnquiries retrieveEnquiries(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds();
	
	RegulatoryReportingUpdationResponse update(String crReferenceId, RegulatoryReportingUpdationRequest request);
	
}
