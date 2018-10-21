package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * RegulatoryReportingRetrieveAuthorings
 */
public class RegulatoryReportingRetrieveAuthorings   {
  private String regulatoryReportingAuthoringTaskReference = null;

  private String regulatoryReportType = null;

  private String regulatoryReportingTaskRecord = null;

  private String reportingPeriod = null;

  private String transactionRecords = null;

  private String regulatoryReportReference = null;

  private String regulatoryReport = null;

  private String businessUnitReference = null;

  private String documentReference = null;


  /**
   * Get regulatoryReportingAuthoringTaskReference
   * @return regulatoryReportingAuthoringTaskReference
  **/

  public String getRegulatoryReportingAuthoringTaskReference() {
    return regulatoryReportingAuthoringTaskReference;
  }

  public void setRegulatoryReportingAuthoringTaskReference(String regulatoryReportingAuthoringTaskReference) {
    this.regulatoryReportingAuthoringTaskReference = regulatoryReportingAuthoringTaskReference;
  }


  /**
   * Get regulatoryReportType
   * @return regulatoryReportType
  **/

  public String getRegulatoryReportType() {
    return regulatoryReportType;
  }

  public void setRegulatoryReportType(String regulatoryReportType) {
    this.regulatoryReportType = regulatoryReportType;
  }


  /**
   * Get regulatoryReportingTaskRecord
   * @return regulatoryReportingTaskRecord
  **/

  public String getRegulatoryReportingTaskRecord() {
    return regulatoryReportingTaskRecord;
  }

  public void setRegulatoryReportingTaskRecord(String regulatoryReportingTaskRecord) {
    this.regulatoryReportingTaskRecord = regulatoryReportingTaskRecord;
  }


  /**
   * Get reportingPeriod
   * @return reportingPeriod
  **/

  public String getReportingPeriod() {
    return reportingPeriod;
  }

  public void setReportingPeriod(String reportingPeriod) {
    this.reportingPeriod = reportingPeriod;
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
   * Get regulatoryReportReference
   * @return regulatoryReportReference
  **/

  public String getRegulatoryReportReference() {
    return regulatoryReportReference;
  }

  public void setRegulatoryReportReference(String regulatoryReportReference) {
    this.regulatoryReportReference = regulatoryReportReference;
  }


  /**
   * Get regulatoryReport
   * @return regulatoryReport
  **/

  public String getRegulatoryReport() {
    return regulatoryReport;
  }

  public void setRegulatoryReport(String regulatoryReport) {
    this.regulatoryReport = regulatoryReport;
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

