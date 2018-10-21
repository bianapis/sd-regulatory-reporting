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
import org.bian.annotation.functionalpattern.Administer;

@BianRestController
public class RegulatoryReportingApiController {

	@Autowired
	RegulatoryReportingApiService service;
	
	@Administer.Record
	public BianResponse<RegulatoryReportingRecordResponse> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<RegulatoryReportingRecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}
	
	@Administer.RequestPost
	public BianResponse<RegulatoryReportingRequisitionResponse> requestPost(@RequestBody BianRequest<RegulatoryReportingRequisitionRequest> bianRequest) {
		return BianResponse.forSuccess(service.requestPost(bianRequest.getData()));
	}
	
	@Administer.RequestPut
	public BianResponse<RegulatoryReportingRequisitionResponse> requestPut(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<RegulatoryReportingRequisitionRequest> bianRequest) {
		return BianResponse.forSuccess(service.requestPut(crReferenceId, bianRequest.getData()));
	}
	
	@Administer.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@Administer.Retrieve
	public BianResponse<RegulatoryReportingRetrieve> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@BQ("authorings")
	@Administer.Retrieve
	public BianResponse<RegulatoryReportingRetrieveAuthorings> retrieveAuthorings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAuthorings(crReferenceId, bqReferenceId));
	}
	
	@BQ("consolidations")
	@Administer.Retrieve
	public BianResponse<RegulatoryReportingRetrieveConsolidation> retrieveConsolidations(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveConsolidations(crReferenceId, bqReferenceId));
	}
	
	@BQ("enquiries")
	@Administer.Retrieve
	public BianResponse<RegulatoryReportingRetrieveEnquiries> retrieveEnquiries(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveEnquiries(crReferenceId, bqReferenceId));
	}
	
	@Administer.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Administer.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@Administer.Update
	public BianResponse<RegulatoryReportingUpdationResponse> update(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<RegulatoryReportingUpdationRequest> bianRequest) {
		return BianResponse.forSuccess(service.update(crReferenceId, bianRequest.getData()));
	}
	
}
