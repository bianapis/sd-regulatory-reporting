package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * RegulatoryReportingRetrieve
 */
public class RegulatoryReportingRetrieve   {
  private String regulatoryReportingSchedule = null;

  private String regulatoryAuthorityReference = null;

  private String regulatoryReportType = null;

  private String regulatoryReportingTaskReference = null;

  private String reportingPeriod = null;

  private String businessLegalEntityReference = null;

  private String businessUnitReference = null;

  private String regulatoryReportReference = null;

  private String regulatoryReport = null;

  private String documentReference = null;


  /**
   * Get regulatoryReportingSchedule
   * @return regulatoryReportingSchedule
  **/

  public String getRegulatoryReportingSchedule() {
    return regulatoryReportingSchedule;
  }

  public void setRegulatoryReportingSchedule(String regulatoryReportingSchedule) {
    this.regulatoryReportingSchedule = regulatoryReportingSchedule;
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
   * Get regulatoryReportingTaskReference
   * @return regulatoryReportingTaskReference
  **/

  public String getRegulatoryReportingTaskReference() {
    return regulatoryReportingTaskReference;
  }

  public void setRegulatoryReportingTaskReference(String regulatoryReportingTaskReference) {
    this.regulatoryReportingTaskReference = regulatoryReportingTaskReference;
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
   * Get businessLegalEntityReference
   * @return businessLegalEntityReference
  **/

  public String getBusinessLegalEntityReference() {
    return businessLegalEntityReference;
  }

  public void setBusinessLegalEntityReference(String businessLegalEntityReference) {
    this.businessLegalEntityReference = businessLegalEntityReference;
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

