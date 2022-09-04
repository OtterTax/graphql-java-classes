package com.ottertax.support;

import java.util.Date;

public class GetF1099miscStatementsResponse {
  private Data data;

  public Data getData() {
    return(data);
  }
  public void setData(Data data) {
    this.data = data;
  }

  public static class Data {
    private GetF1099miscStatements getF1099miscStatements;

    public GetF1099miscStatements getGetF1099miscStatements() {
      return(getF1099miscStatements);
    }
    public void setGetF1099miscStatements(GetF1099miscStatements getF1099miscStatements) {
      this.getF1099miscStatements = getF1099miscStatements;
    }

    public static class GetF1099miscStatements {
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
          private Boolean corrected;
          private String cropInsuranceProceeds;
          private String excessGoldenParachute;
          private Boolean fatcaRequirement;
          private String federalTaxWithheld;
          private String fishPurchasedResale;
          private String fishingBoatProceeds;
          private String grossProceedsAttorney;
          private String medicalPayments;
          private String nonemployeeCompensation;
          private String nonqualDeferredComp;
          private String otherIncome;
          private String otxId;
          private String otxSubmissionId;
          private String recipientAddress1;
          private String recipientAddress2;
          private String recipientAddress3;
          private String recipientBusinessName;
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
          private String rents;
          private String royalties;
          private String section409aDeferrals;
          private String section409aIncome;
          private String senderAddress1;
          private String senderAddress2;
          private String senderCity;
          private Boolean senderMadeDirectSales;
          private String senderName;
          private String senderPhoneNumber;
          private String senderState;
          private String senderTin;
          private String senderZipCode;
          private String stateAbbreviation1;
          private String stateAbbreviation2;
          private String stateId1;
          private String stateId2;
          private String stateIncome1;
          private String stateIncome2;
          private String stateTaxWithheld1;
          private String stateTaxWithheld2;
          private Boolean statementValid;
          private Integer status;
          private String statusDescription;
          private Integer submissionStatus;
          private String submissionStatusDescription;
          private String substitutePayments;
          private Date taFileDate;
          private Date taResponseDate;
          private String[] tags;
          private String taxAuthority;
          private Integer taxYear;
          private String uploaderId;
          private String[] validationMessages;

          public String getAccountNumber() {
            return(accountNumber);
          }
          public void setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
          }
          public Boolean getCorrected() {
            return(corrected);
          }
          public void setCorrected(Boolean corrected) {
            this.corrected = corrected;
          }
          public String getCropInsuranceProceeds() {
            return(cropInsuranceProceeds);
          }
          public void setCropInsuranceProceeds(String cropInsuranceProceeds) {
            this.cropInsuranceProceeds = cropInsuranceProceeds;
          }
          public String getExcessGoldenParachute() {
            return(excessGoldenParachute);
          }
          public void setExcessGoldenParachute(String excessGoldenParachute) {
            this.excessGoldenParachute = excessGoldenParachute;
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
          public String getFishPurchasedResale() {
            return(fishPurchasedResale);
          }
          public void setFishPurchasedResale(String fishPurchasedResale) {
            this.fishPurchasedResale = fishPurchasedResale;
          }
          public String getFishingBoatProceeds() {
            return(fishingBoatProceeds);
          }
          public void setFishingBoatProceeds(String fishingBoatProceeds) {
            this.fishingBoatProceeds = fishingBoatProceeds;
          }
          public String getGrossProceedsAttorney() {
            return(grossProceedsAttorney);
          }
          public void setGrossProceedsAttorney(String grossProceedsAttorney) {
            this.grossProceedsAttorney = grossProceedsAttorney;
          }
          public String getMedicalPayments() {
            return(medicalPayments);
          }
          public void setMedicalPayments(String medicalPayments) {
            this.medicalPayments = medicalPayments;
          }
          public String getNonemployeeCompensation() {
            return(nonemployeeCompensation);
          }
          public void setNonemployeeCompensation(String nonemployeeCompensation) {
            this.nonemployeeCompensation = nonemployeeCompensation;
          }
          public String getNonqualDeferredComp() {
            return(nonqualDeferredComp);
          }
          public void setNonqualDeferredComp(String nonqualDeferredComp) {
            this.nonqualDeferredComp = nonqualDeferredComp;
          }
          public String getOtherIncome() {
            return(otherIncome);
          }
          public void setOtherIncome(String otherIncome) {
            this.otherIncome = otherIncome;
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
          public String getRecipientBusinessName() {
            return(recipientBusinessName);
          }
          public void setRecipientBusinessName(String recipientBusinessName) {
            this.recipientBusinessName = recipientBusinessName;
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
          public String getRents() {
            return(rents);
          }
          public void setRents(String rents) {
            this.rents = rents;
          }
          public String getRoyalties() {
            return(royalties);
          }
          public void setRoyalties(String royalties) {
            this.royalties = royalties;
          }
          public String getSection409aDeferrals() {
            return(section409aDeferrals);
          }
          public void setSection409aDeferrals(String section409aDeferrals) {
            this.section409aDeferrals = section409aDeferrals;
          }
          public String getSection409aIncome() {
            return(section409aIncome);
          }
          public void setSection409aIncome(String section409aIncome) {
            this.section409aIncome = section409aIncome;
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
          public Boolean getSenderMadeDirectSales() {
            return(senderMadeDirectSales);
          }
          public void setSenderMadeDirectSales(Boolean senderMadeDirectSales) {
            this.senderMadeDirectSales = senderMadeDirectSales;
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
          public String getStateAbbreviation1() {
            return(stateAbbreviation1);
          }
          public void setStateAbbreviation1(String stateAbbreviation1) {
            this.stateAbbreviation1 = stateAbbreviation1;
          }
          public String getStateAbbreviation2() {
            return(stateAbbreviation2);
          }
          public void setStateAbbreviation2(String stateAbbreviation2) {
            this.stateAbbreviation2 = stateAbbreviation2;
          }
          public String getStateId1() {
            return(stateId1);
          }
          public void setStateId1(String stateId1) {
            this.stateId1 = stateId1;
          }
          public String getStateId2() {
            return(stateId2);
          }
          public void setStateId2(String stateId2) {
            this.stateId2 = stateId2;
          }
          public String getStateIncome1() {
            return(stateIncome1);
          }
          public void setStateIncome1(String stateIncome1) {
            this.stateIncome1 = stateIncome1;
          }
          public String getStateIncome2() {
            return(stateIncome2);
          }
          public void setStateIncome2(String stateIncome2) {
            this.stateIncome2 = stateIncome2;
          }
          public String getStateTaxWithheld1() {
            return(stateTaxWithheld1);
          }
          public void setStateTaxWithheld1(String stateTaxWithheld1) {
            this.stateTaxWithheld1 = stateTaxWithheld1;
          }
          public String getStateTaxWithheld2() {
            return(stateTaxWithheld2);
          }
          public void setStateTaxWithheld2(String stateTaxWithheld2) {
            this.stateTaxWithheld2 = stateTaxWithheld2;
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
          public String getSubstitutePayments() {
            return(substitutePayments);
          }
          public void setSubstitutePayments(String substitutePayments) {
            this.substitutePayments = substitutePayments;
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
        } // Node
      } // Statements
    } // GetF1099miscStatements
  } // Data
} // GetF1099miscStatementsResponse
