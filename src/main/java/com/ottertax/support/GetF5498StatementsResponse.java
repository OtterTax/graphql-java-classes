package com.ottertax.support;

import java.util.Date;

public class GetF5498StatementsResponse {
  private Data data;

  public Data getData() {
    return(data);
  }
  public void setData(Data data) {
    this.data = data;
  }

  public static class Data {
    private GetF5498Statements getF5498Statements;

    public GetF5498Statements getGetF5498Statements() {
      return(getF5498Statements);
    }
    public void setGetF5498Statements(GetF5498Statements getF5498Statements) {
      this.getF5498Statements = getF5498Statements;
    }

    public static class GetF5498Statements {
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
          private String accountFmv;
          private String accountNumber;
          private String assetAmount;
          private String assetCode;
          private Boolean corrected;
          private Boolean ira;
          private String iraContributions;
          private String lateContributionAmount;
          private String lateContributionCode;
          private Integer lateContributionYear;
          private String lifeInsuranceCost;
          private String otxId;
          private String otxSubmissionId;
          private String recharacterizedContributions;
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
          private String repaymentAmount;
          private String repaymentCode;
          private String rmdAmount;
          private Date rmdDate;
          private Boolean rmdNextYear;
          private String rolloverContributions;
          private Boolean roth;
          private String rothContributions;
          private String rothConversion;
          private String senderAddress1;
          private String senderAddress2;
          private String senderCity;
          private String senderName;
          private String senderState;
          private String senderTin;
          private String senderZipCode;
          private Boolean sep;
          private String sepContributions;
          private Boolean simple;
          private String simpleContributions;
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
          private String uploaderId;
          private String[] validationMessages;

          public String getAccountFmv() {
            return(accountFmv);
          }
          public void setAccountFmv(String accountFmv) {
            this.accountFmv = accountFmv;
          }
          public String getAccountNumber() {
            return(accountNumber);
          }
          public void setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
          }
          public String getAssetAmount() {
            return(assetAmount);
          }
          public void setAssetAmount(String assetAmount) {
            this.assetAmount = assetAmount;
          }
          public String getAssetCode() {
            return(assetCode);
          }
          public void setAssetCode(String assetCode) {
            this.assetCode = assetCode;
          }
          public Boolean getCorrected() {
            return(corrected);
          }
          public void setCorrected(Boolean corrected) {
            this.corrected = corrected;
          }
          public Boolean getIra() {
            return(ira);
          }
          public void setIra(Boolean ira) {
            this.ira = ira;
          }
          public String getIraContributions() {
            return(iraContributions);
          }
          public void setIraContributions(String iraContributions) {
            this.iraContributions = iraContributions;
          }
          public String getLateContributionAmount() {
            return(lateContributionAmount);
          }
          public void setLateContributionAmount(String lateContributionAmount) {
            this.lateContributionAmount = lateContributionAmount;
          }
          public String getLateContributionCode() {
            return(lateContributionCode);
          }
          public void setLateContributionCode(String lateContributionCode) {
            this.lateContributionCode = lateContributionCode;
          }
          public Integer getLateContributionYear() {
            return(lateContributionYear);
          }
          public void setLateContributionYear(Integer lateContributionYear) {
            this.lateContributionYear = lateContributionYear;
          }
          public String getLifeInsuranceCost() {
            return(lifeInsuranceCost);
          }
          public void setLifeInsuranceCost(String lifeInsuranceCost) {
            this.lifeInsuranceCost = lifeInsuranceCost;
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
          public String getRecharacterizedContributions() {
            return(recharacterizedContributions);
          }
          public void setRecharacterizedContributions(String recharacterizedContributions) {
            this.recharacterizedContributions = recharacterizedContributions;
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
          public String getRepaymentAmount() {
            return(repaymentAmount);
          }
          public void setRepaymentAmount(String repaymentAmount) {
            this.repaymentAmount = repaymentAmount;
          }
          public String getRepaymentCode() {
            return(repaymentCode);
          }
          public void setRepaymentCode(String repaymentCode) {
            this.repaymentCode = repaymentCode;
          }
          public String getRmdAmount() {
            return(rmdAmount);
          }
          public void setRmdAmount(String rmdAmount) {
            this.rmdAmount = rmdAmount;
          }
          public Date getRmdDate() {
            return(rmdDate);
          }
          public void setRmdDate(Date rmdDate) {
            this.rmdDate = rmdDate;
          }
          public Boolean getRmdNextYear() {
            return(rmdNextYear);
          }
          public void setRmdNextYear(Boolean rmdNextYear) {
            this.rmdNextYear = rmdNextYear;
          }
          public String getRolloverContributions() {
            return(rolloverContributions);
          }
          public void setRolloverContributions(String rolloverContributions) {
            this.rolloverContributions = rolloverContributions;
          }
          public Boolean getRoth() {
            return(roth);
          }
          public void setRoth(Boolean roth) {
            this.roth = roth;
          }
          public String getRothContributions() {
            return(rothContributions);
          }
          public void setRothContributions(String rothContributions) {
            this.rothContributions = rothContributions;
          }
          public String getRothConversion() {
            return(rothConversion);
          }
          public void setRothConversion(String rothConversion) {
            this.rothConversion = rothConversion;
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
          public Boolean getSep() {
            return(sep);
          }
          public void setSep(Boolean sep) {
            this.sep = sep;
          }
          public String getSepContributions() {
            return(sepContributions);
          }
          public void setSepContributions(String sepContributions) {
            this.sepContributions = sepContributions;
          }
          public Boolean getSimple() {
            return(simple);
          }
          public void setSimple(Boolean simple) {
            this.simple = simple;
          }
          public String getSimpleContributions() {
            return(simpleContributions);
          }
          public void setSimpleContributions(String simpleContributions) {
            this.simpleContributions = simpleContributions;
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
    } // GetF5498Statements
  } // Data
} // GetF5498StatementsResponse
