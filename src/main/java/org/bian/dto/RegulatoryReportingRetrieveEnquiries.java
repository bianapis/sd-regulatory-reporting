package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * RegulatoryReportingRetrieveEnquiries
 */
public class RegulatoryReportingRetrieveEnquiries   {
  private String regulatoryReportingEnquiryTaskReference = null;

  private String regulatoryAuthorityReference = null;

  private String regulatoryEnquiry = null;

  private String businessUnitReference = null;

  private String productServiceReference = null;

  private String customerReference = null;

  private String transactionRecords = null;

  private String regulatoryEnquiryTaskRecord = null;

  private String regulatoryEnquiryTaskResult = null;

  private String documentReference = null;


  /**
   * Get regulatoryReportingEnquiryTaskReference
   * @return regulatoryReportingEnquiryTaskReference
  **/

  public String getRegulatoryReportingEnquiryTaskReference() {
    return regulatoryReportingEnquiryTaskReference;
  }

  public void setRegulatoryReportingEnquiryTaskReference(String regulatoryReportingEnquiryTaskReference) {
    this.regulatoryReportingEnquiryTaskReference = regulatoryReportingEnquiryTaskReference;
  }


  /**
   * Get regulatoryAuthorityReference
   * @return regulatoryAuthorityReference
  **/

  public String getRegulatoryAuthorityReference() {
    return regulatoryAuthorityReference;
  }

  public void setRegulatoryAuthorityReference(String regulatoryAuthorityReference) {
    this.regulatoryAuthorityReference = regulatoryAuthorityReference;
  }


  /**
   * Get regulatoryEnquiry
   * @return regulatoryEnquiry
  **/

  public String getRegulatoryEnquiry() {
    return regulatoryEnquiry;
  }

  public void setRegulatoryEnquiry(String regulatoryEnquiry) {
    this.regulatoryEnquiry = regulatoryEnquiry;
  }


  /**
   * Get businessUnitReference
   * @return businessUnitReference
  **/

  public String getBusinessUnitReference() {
    return businessUnitReference;
  }

  public void setBusinessUnitReference(String businessUnitReference) {
    this.businessUnitReference = businessUnitReference;
  }


  /**
   * Get productServiceReference
   * @return productServiceReference
  **/

  public String getProductServiceReference() {
    return productServiceReference;
  }

  public void setProductServiceReference(String productServiceReference) {
    this.productServiceReference = productServiceReference;
  }


  /**
   * Get customerReference
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * Get transactionRecords
   * @return transactionRecords
  **/

  public String getTransactionRecords() {
    return transactionRecords;
  }

  public void setTransactionRecords(String transactionRecords) {
    this.transactionRecords = transactionRecords;
  }


  /**
   * Get regulatoryEnquiryTaskRecord
   * @return regulatoryEnquiryTaskRecord
  **/

  public String getRegulatoryEnquiryTaskRecord() {
    return regulatoryEnquiryTaskRecord;
  }

  public void setRegulatoryEnquiryTaskRecord(String regulatoryEnquiryTaskRecord) {
    this.regulatoryEnquiryTaskRecord = regulatoryEnquiryTaskRecord;
  }


  /**
   * Get regulatoryEnquiryTaskResult
   * @return regulatoryEnquiryTaskResult
  **/

  public String getRegulatoryEnquiryTaskResult() {
    return regulatoryEnquiryTaskResult;
  }

  public void setRegulatoryEnquiryTaskResult(String regulatoryEnquiryTaskResult) {
    this.regulatoryEnquiryTaskResult = regulatoryEnquiryTaskResult;
  }


  /**
   * Get documentReference
   * @return documentReference
  **/

  public String getDocumentReference() {
    return documentReference;
  }

  public void setDocumentReference(String documentReference) {
    this.documentReference = documentReference;
  }


}

