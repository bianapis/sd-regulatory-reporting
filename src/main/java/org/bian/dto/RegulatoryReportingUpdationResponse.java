package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * RegulatoryReportingUpdationResponse
 */
public class RegulatoryReportingUpdationResponse   {
  private String regulatoryReportingConsolidationTaskReference = null;

  private String regulatoryReportType = null;

  private String regulationReference = null;

  private String regulationComplianceReportingRequirements = null;

  private String businessUnitEmployeeReference = null;

  private String productServiceReference = null;

  private String customerReference = null;

  private String regulatoryReportingTaskRecord = null;

  private String reportingPeriod = null;

  private String transactionRecords = null;


  /**
   * Get regulatoryReportingConsolidationTaskReference
   * @return regulatoryReportingConsolidationTaskReference
  **/

  public String getRegulatoryReportingConsolidationTaskReference() {
    return regulatoryReportingConsolidationTaskReference;
  }

  public void setRegulatoryReportingConsolidationTaskReference(String regulatoryReportingConsolidationTaskReference) {
    this.regulatoryReportingConsolidationTaskReference = regulatoryReportingConsolidationTaskReference;
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
   * Get regulationReference
   * @return regulationReference
  **/

  public String getRegulationReference() {
    return regulationReference;
  }

  public void setRegulationReference(String regulationReference) {
    this.regulationReference = regulationReference;
  }


  /**
   * Get regulationComplianceReportingRequirements
   * @return regulationComplianceReportingRequirements
  **/

  public String getRegulationComplianceReportingRequirements() {
    return regulationComplianceReportingRequirements;
  }

  public void setRegulationComplianceReportingRequirements(String regulationComplianceReportingRequirements) {
    this.regulationComplianceReportingRequirements = regulationComplianceReportingRequirements;
  }


  /**
   * Get businessUnitEmployeeReference
   * @return businessUnitEmployeeReference
  **/

  public String getBusinessUnitEmployeeReference() {
    return businessUnitEmployeeReference;
  }

  public void setBusinessUnitEmployeeReference(String businessUnitEmployeeReference) {
    this.businessUnitEmployeeReference = businessUnitEmployeeReference;
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


}

