package com.ottertax.support;

import java.util.Date;

public class GetF1099rStatementsResponse {
  private Data data;

  public Data getData() {
    return(data);
  }
  public void setData(Data data) {
    this.data = data;
  }

  public static class Data {
    private GetF1099rStatements getF1099rStatements;

    public GetF1099rStatements getGetF1099rStatements() {
      return(getF1099rStatements);
    }
    public void setGetF1099rStatements(GetF1099rStatements getF1099rStatements) {
      this.getF1099rStatements = getF1099rStatements;
    }

    public static class GetF1099rStatements {
      private String[] errors;
      private Statements statements;

      public String[] getErrors() {
        return(errors);
      }
      public void setErrors(String[] errors) {
        this.errors = errors;
      }
      public Statements getStatements() {
        return(statements);
      }
      public void setStatements(Statements statements) {
        this.statements = statements;
      }

      public static class Statements {
        private PageInfo pageInfo;
        private Node[] nodes;

        public PageInfo getPageInfo() {
          return(pageInfo);
        }
        public void setPageInfo(PageInfo pageInfo) {
          this.pageInfo = pageInfo;
        }
        public Node[] getNodes() {
          return(nodes);
        }
        public void setNodes(Node[] nodes) {
          this.nodes = nodes;
        }

        public static class PageInfo {
          private Boolean hasNextPage;

          public Boolean getHasNextPage() {
            return(hasNextPage);
          }
          public void setHasNextPage(Boolean hasNextPage) {
            this.hasNextPage = hasNextPage;
          }
        } // PageInfo

        public static class Node {
          private String accountNumber;
          private String amountAllocableIrr;
          private String capitalGain;
          private Boolean corrected;
          private Date dateOfPayment;
          private String distributionCodes;
          private String employeeContributions;
          private Boolean fatcaRequirement;
          private String federalTaxWithheld;
          private Integer firstYearDesignatedRoth;
          private String grossDistribution;
          private Boolean iraSepSimple;
          private String localDistribution;
          private String localTaxWithheld;
          private String localityName;
          private String netUnrealizedAppreciation;
          private String other;
          private Float otherPercent;
          private String otxId;
          private String otxSubmissionId;
          private String recipientAddress1;
          private String recipientAddress2;
          private String recipientAddress3;
          private String recipientCity;
          private String recipientEntityName;
          private String recipientFirstName;
          private String recipientLastName;
          private String recipientMiddleName;
          private String recipientNameSuffix;
          private String recipientState;
          private String recipientTin;
          private String recipientTinType;
          private String recipientZipCode;
          private String senderAddress1;
          private String senderAddress2;
          private String senderCity;
          private String senderName;
          private String senderPhoneNumber;
          private String senderState;
          private String senderTin;
          private String senderZipCode;
          private String stateAbbreviation;
          private String stateDistribution;
          private String stateId;
          private String stateTaxWithheld;
          private Boolean statementValid;
          private Integer status;
          private String statusDescription;
          private Integer submissionStatus;
          private String submissionStatusDescription;
          private Date taFileDate;
          private Date taResponseDate;
          private String[] tags;
          private String taxAuthority;
          private Integer taxYear;
          private String taxableAmount;
          private Boolean taxableAmountNotDetermined;
          private Boolean totalDistribution;
          private String totalEmployeeContributions;
          private String uploaderId;
          private String[] validationMessages;
          private Float yourPercentageTotal;

          public String getAccountNumber() {
            return(accountNumber);
          }
          public void setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
          }
          public String getAmountAllocableIrr() {
            return(amountAllocableIrr);
          }
          public void setAmountAllocableIrr(String amountAllocableIrr) {
            this.amountAllocableIrr = amountAllocableIrr;
          }
          public String getCapitalGain() {
            return(capitalGain);
          }
          public void setCapitalGain(String capitalGain) {
            this.capitalGain = capitalGain;
          }
          public Boolean getCorrected() {
            return(corrected);
          }
          public void setCorrected(Boolean corrected) {
            this.corrected = corrected;
          }
          public Date getDateOfPayment() {
            return(dateOfPayment);
          }
          public void setDateOfPayment(Date dateOfPayment) {
            this.dateOfPayment = dateOfPayment;
          }
          public String getDistributionCodes() {
            return(distributionCodes);
          }
          public void setDistributionCodes(String distributionCodes) {
            this.distributionCodes = distributionCodes;
          }
          public String getEmployeeContributions() {
            return(employeeContributions);
          }
          public void setEmployeeContributions(String employeeContributions) {
            this.employeeContributions = employeeContributions;
          }
          public Boolean getFatcaRequirement() {
            return(fatcaRequirement);
          }
          public void setFatcaRequirement(Boolean fatcaRequirement) {
            this.fatcaRequirement = fatcaRequirement;
          }
          public String getFederalTaxWithheld() {
            return(federalTaxWithheld);
          }
          public void setFederalTaxWithheld(String federalTaxWithheld) {
            this.federalTaxWithheld = federalTaxWithheld;
          }
          public Integer getFirstYearDesignatedRoth() {
            return(firstYearDesignatedRoth);
          }
          public void setFirstYearDesignatedRoth(Integer firstYearDesignatedRoth) {
            this.firstYearDesignatedRoth = firstYearDesignatedRoth;
          }
          public String getGrossDistribution() {
            return(grossDistribution);
          }
          public void setGrossDistribution(String grossDistribution) {
            this.grossDistribution = grossDistribution;
          }
          public Boolean getIraSepSimple() {
            return(iraSepSimple);
          }
          public void setIraSepSimple(Boolean iraSepSimple) {
            this.iraSepSimple = iraSepSimple;
          }
          public String getLocalDistribution() {
            return(localDistribution);
          }
          public void setLocalDistribution(String localDistribution) {
            this.localDistribution = localDistribution;
          }
          public String getLocalTaxWithheld() {
            return(localTaxWithheld);
          }
          public void setLocalTaxWithheld(String localTaxWithheld) {
            this.localTaxWithheld = localTaxWithheld;
          }
          public String getLocalityName() {
            return(localityName);
          }
          public void setLocalityName(String localityName) {
            this.localityName = localityName;
          }
          public String getNetUnrealizedAppreciation() {
            return(netUnrealizedAppreciation);
          }
          public void setNetUnrealizedAppreciation(String netUnrealizedAppreciation) {
            this.netUnrealizedAppreciation = netUnrealizedAppreciation;
          }
          public String getOther() {
            return(other);
          }
          public void setOther(String other) {
            this.other = other;
          }
          public Float getOtherPercent() {
            return(otherPercent);
          }
          public void setOtherPercent(Float otherPercent) {
            this.otherPercent = otherPercent;
          }
          public String getOtxId() {
            return(otxId);
          }
          public void setOtxId(String otxId) {
            this.otxId = otxId;
          }
          public String getOtxSubmissionId() {
            return(otxSubmissionId);
          }
          public void setOtxSubmissionId(String otxSubmissionId) {
            this.otxSubmissionId = otxSubmissionId;
          }
          public String getRecipientAddress1() {
            return(recipientAddress1);
          }
          public void setRecipientAddress1(String recipientAddress1) {
            this.recipientAddress1 = recipientAddress1;
          }
          public String getRecipientAddress2() {
            return(recipientAddress2);
          }
          public void setRecipientAddress2(String recipientAddress2) {
            this.recipientAddress2 = recipientAddress2;
          }
          public String getRecipientAddress3() {
            return(recipientAddress3);
          }
          public void setRecipientAddress3(String recipientAddress3) {
            this.recipientAddress3 = recipientAddress3;
          }
          public String getRecipientCity() {
            return(recipientCity);
          }
          public void setRecipientCity(String recipientCity) {
            this.recipientCity = recipientCity;
          }
          public String getRecipientEntityName() {
            return(recipientEntityName);
          }
          public void setRecipientEntityName(String recipientEntityName) {
            this.recipientEntityName = recipientEntityName;
          }
          public String getRecipientFirstName() {
            return(recipientFirstName);
          }
          public void setRecipientFirstName(String recipientFirstName) {
            this.recipientFirstName = recipientFirstName;
          }
          public String getRecipientLastName() {
            return(recipientLastName);
          }
          public void setRecipientLastName(String recipientLastName) {
            this.recipientLastName = recipientLastName;
          }
          public String getRecipientMiddleName() {
            return(recipientMiddleName);
          }
          public void setRecipientMiddleName(String recipientMiddleName) {
            this.recipientMiddleName = recipientMiddleName;
          }
          public String getRecipientNameSuffix() {
            return(recipientNameSuffix);
          }
          public void setRecipientNameSuffix(String recipientNameSuffix) {
            this.recipientNameSuffix = recipientNameSuffix;
          }
          public String getRecipientState() {
            return(recipientState);
          }
          public void setRecipientState(String recipientState) {
            this.recipientState = recipientState;
          }
          public String getRecipientTin() {
            return(recipientTin);
          }
          public void setRecipientTin(String recipientTin) {
            this.recipientTin = recipientTin;
          }
          public String getRecipientTinType() {
            return(recipientTinType);
          }
          public void setRecipientTinType(String recipientTinType) {
            this.recipientTinType = recipientTinType;
          }
          public String getRecipientZipCode() {
            return(recipientZipCode);
          }
          public void setRecipientZipCode(String recipientZipCode) {
            this.recipientZipCode = recipientZipCode;
          }
          public String getSenderAddress1() {
            return(senderAddress1);
          }
          public void setSenderAddress1(String senderAddress1) {
            this.senderAddress1 = senderAddress1;
          }
          public String getSenderAddress2() {
            return(senderAddress2);
          }
          public void setSenderAddress2(String senderAddress2) {
            this.senderAddress2 = senderAddress2;
          }
          public String getSenderCity() {
            return(senderCity);
          }
          public void setSenderCity(String senderCity) {
            this.senderCity = senderCity;
          }
          public String getSenderName() {
            return(senderName);
          }
          public void setSenderName(String senderName) {
            this.senderName = senderName;
          }
          public String getSenderPhoneNumber() {
            return(senderPhoneNumber);
          }
          public void setSenderPhoneNumber(String senderPhoneNumber) {
            this.senderPhoneNumber = senderPhoneNumber;
          }
          public String getSenderState() {
            return(senderState);
          }
          public void setSenderState(String senderState) {
            this.senderState = senderState;
          }
          public String getSenderTin() {
            return(senderTin);
          }
          public void setSenderTin(String senderTin) {
            this.senderTin = senderTin;
          }
          public String getSenderZipCode() {
            return(senderZipCode);
          }
          public void setSenderZipCode(String senderZipCode) {
            this.senderZipCode = senderZipCode;
          }
          public String getStateAbbreviation() {
            return(stateAbbreviation);
          }
          public void setStateAbbreviation(String stateAbbreviation) {
            this.stateAbbreviation = stateAbbreviation;
          }
          public String getStateDistribution() {
            return(stateDistribution);
          }
          public void setStateDistribution(String stateDistribution) {
            this.stateDistribution = stateDistribution;
          }
          public String getStateId() {
            return(stateId);
          }
          public void setStateId(String stateId) {
            this.stateId = stateId;
          }
          public String getStateTaxWithheld() {
            return(stateTaxWithheld);
          }
          public void setStateTaxWithheld(String stateTaxWithheld) {
            this.stateTaxWithheld = stateTaxWithheld;
          }
          public Boolean getStatementValid() {
            return(statementValid);
          }
          public void setStatementValid(Boolean statementValid) {
            this.statementValid = statementValid;
          }
          public Integer getStatus() {
            return(status);
          }
          public void setStatus(Integer status) {
            this.status = status;
          }
          public String getStatusDescription() {
            return(statusDescription);
          }
          public void setStatusDescription(String statusDescription) {
            this.statusDescription = statusDescription;
          }
          public Integer getSubmissionStatus() {
            return(submissionStatus);
          }
          public void setSubmissionStatus(Integer submissionStatus) {
            this.submissionStatus = submissionStatus;
          }
          public String getSubmissionStatusDescription() {
            return(submissionStatusDescription);
          }
          public void setSubmissionStatusDescription(String submissionStatusDescription) {
            this.submissionStatusDescription = submissionStatusDescription;
          }
          public Date getTaFileDate() {
            return(taFileDate);
          }
          public void setTaFileDate(Date taFileDate) {
            this.taFileDate = taFileDate;
          }
          public Date getTaResponseDate() {
            return(taResponseDate);
          }
          public void setTaResponseDate(Date taResponseDate) {
            this.taResponseDate = taResponseDate;
          }
          public String[] getTags() {
            return(tags);
          }
          public void setTags(String[] tags) {
            this.tags = tags;
          }
          public String getTaxAuthority() {
            return(taxAuthority);
          }
          public void setTaxAuthority(String taxAuthority) {
            this.taxAuthority = taxAuthority;
          }
          public Integer getTaxYear() {
            return(taxYear);
          }
          public void setTaxYear(Integer taxYear) {
            this.taxYear = taxYear;
          }
          public String getTaxableAmount() {
            return(taxableAmount);
          }
          public void setTaxableAmount(String taxableAmount) {
            this.taxableAmount = taxableAmount;
          }
          public Boolean getTaxableAmountNotDetermined() {
            return(taxableAmountNotDetermined);
          }
          public void setTaxableAmountNotDetermined(Boolean taxableAmountNotDetermined) {
            this.taxableAmountNotDetermined = taxableAmountNotDetermined;
          }
          public Boolean getTotalDistribution() {
            return(totalDistribution);
          }
          public void setTotalDistribution(Boolean totalDistribution) {
            this.totalDistribution = totalDistribution;
          }
          public String getTotalEmployeeContributions() {
            return(totalEmployeeContributions);
          }
          public void setTotalEmployeeContributions(String totalEmployeeContributions) {
            this.totalEmployeeContributions = totalEmployeeContributions;
          }
          public String getUploaderId() {
            return(uploaderId);
          }
          public void setUploaderId(String uploaderId) {
            this.uploaderId = uploaderId;
          }
          public String[] getValidationMessages() {
            return(validationMessages);
          }
          public void setValidationMessages(String[] validationMessages) {
            this.validationMessages = validationMessages;
          }
          public Float getYourPercentageTotal() {
            return(yourPercentageTotal);
          }
          public void setYourPercentageTotal(Float yourPercentageTotal) {
            this.yourPercentageTotal = yourPercentageTotal;
          }
        } // Node
      } // Statements
    } // GetF1099rStatements
  } // Data
} // GetF1099rStatementsResponse
