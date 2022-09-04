package com.ottertax.support;

import com.google.gson.annotations.SerializedName;
import java.util.Date;

public class UpdateF1099divStatementsResponse {
  private Data data;

  public Data getData() {
    return(data);
  }
  public void setData(Data data) {
    this.data = data;
  }

  public static class Data {
    private UpdateF1099divStatements updateF1099divStatements;

    public UpdateF1099divStatements getUpdateF1099divStatements() {
      return(updateF1099divStatements);
    }
    public void setUpdateF1099divStatements(UpdateF1099divStatements updateF1099divStatements) {
      this.updateF1099divStatements = updateF1099divStatements;
    }

    public static class UpdateF1099divStatements {
      @SerializedName("statements")
      private StatementWithRecordNumber[] statements;

      public StatementWithRecordNumber[] getStatements() {
        return(statements);
      }
      public void setStatements(StatementWithRecordNumber[] statements) {
        this.statements = statements;
      }

      public static class StatementWithRecordNumber {
        private Integer recordNumber;
        private Statement statement;

        public Integer getRecordNumber() {
          return(recordNumber);
        }
        public void setRecordNumber(Integer recordNumber) {
          this.recordNumber = recordNumber;
        }
        public Statement getStatement() {
          return(statement);
        }
        public void setStatement(Statement statement) {
          this.statement = statement;
        }

        public static class Statement {
          private String accountNumber;
          private String capitalGainDistributions;
          private String cashLiquidationDistributions;
          private String collectiblesGain;
          private Boolean corrected;
          private String exemptInterestDividends;
          private Boolean fatcaRequirement;
          private String federalTaxWithheld;
          private String foreignCountryOrPoss;
          private String foreignTaxPaid;
          private String investmentExpenses;
          private String noncashLiquidationDistributions;
          private String nondividendDistributions;
          private String ordinaryDividends;
          private String otxId;
          private String otxSubmissionId;
          private String privateActivityBondDividends;
          private String qualifiedDividends;
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
          private String section1202Gain;
          private String section199aDividends;
          private String section897CapitalGain;
          private String section897OrdinaryDividends;
          private String senderAddress1;
          private String senderAddress2;
          private String senderCity;
          private String senderName;
          private String senderPhoneNumber;
          private String senderState;
          private String senderTin;
          private String senderZipCode;
          private String stateAbbreviation1;
          private String stateAbbreviation2;
          private String stateId1;
          private String stateId2;
          private String stateTaxWithheld1;
          private String stateTaxWithheld2;
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
          private String unrecapturedSec1250Gain;
          private String uploaderId;
          private String[] validationMessages;

          public String getAccountNumber() {
            return(accountNumber);
          }
          public void setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
          }
          public String getCapitalGainDistributions() {
            return(capitalGainDistributions);
          }
          public void setCapitalGainDistributions(String capitalGainDistributions) {
            this.capitalGainDistributions = capitalGainDistributions;
          }
          public String getCashLiquidationDistributions() {
            return(cashLiquidationDistributions);
          }
          public void setCashLiquidationDistributions(String cashLiquidationDistributions) {
            this.cashLiquidationDistributions = cashLiquidationDistributions;
          }
          public String getCollectiblesGain() {
            return(collectiblesGain);
          }
          public void setCollectiblesGain(String collectiblesGain) {
            this.collectiblesGain = collectiblesGain;
          }
          public Boolean getCorrected() {
            return(corrected);
          }
          public void setCorrected(Boolean corrected) {
            this.corrected = corrected;
          }
          public String getExemptInterestDividends() {
            return(exemptInterestDividends);
          }
          public void setExemptInterestDividends(String exemptInterestDividends) {
            this.exemptInterestDividends = exemptInterestDividends;
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
          public String getForeignCountryOrPoss() {
            return(foreignCountryOrPoss);
          }
          public void setForeignCountryOrPoss(String foreignCountryOrPoss) {
            this.foreignCountryOrPoss = foreignCountryOrPoss;
          }
          public String getForeignTaxPaid() {
            return(foreignTaxPaid);
          }
          public void setForeignTaxPaid(String foreignTaxPaid) {
            this.foreignTaxPaid = foreignTaxPaid;
          }
          public String getInvestmentExpenses() {
            return(investmentExpenses);
          }
          public void setInvestmentExpenses(String investmentExpenses) {
            this.investmentExpenses = investmentExpenses;
          }
          public String getNoncashLiquidationDistributions() {
            return(noncashLiquidationDistributions);
          }
          public void setNoncashLiquidationDistributions(String noncashLiquidationDistributions) {
            this.noncashLiquidationDistributions = noncashLiquidationDistributions;
          }
          public String getNondividendDistributions() {
            return(nondividendDistributions);
          }
          public void setNondividendDistributions(String nondividendDistributions) {
            this.nondividendDistributions = nondividendDistributions;
          }
          public String getOrdinaryDividends() {
            return(ordinaryDividends);
          }
          public void setOrdinaryDividends(String ordinaryDividends) {
            this.ordinaryDividends = ordinaryDividends;
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
          public String getPrivateActivityBondDividends() {
            return(privateActivityBondDividends);
          }
          public void setPrivateActivityBondDividends(String privateActivityBondDividends) {
            this.privateActivityBondDividends = privateActivityBondDividends;
          }
          public String getQualifiedDividends() {
            return(qualifiedDividends);
          }
          public void setQualifiedDividends(String qualifiedDividends) {
            this.qualifiedDividends = qualifiedDividends;
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
          public String getSection1202Gain() {
            return(section1202Gain);
          }
          public void setSection1202Gain(String section1202Gain) {
            this.section1202Gain = section1202Gain;
          }
          public String getSection199aDividends() {
            return(section199aDividends);
          }
          public void setSection199aDividends(String section199aDividends) {
            this.section199aDividends = section199aDividends;
          }
          public String getSection897CapitalGain() {
            return(section897CapitalGain);
          }
          public void setSection897CapitalGain(String section897CapitalGain) {
            this.section897CapitalGain = section897CapitalGain;
          }
          public String getSection897OrdinaryDividends() {
            return(section897OrdinaryDividends);
          }
          public void setSection897OrdinaryDividends(String section897OrdinaryDividends) {
            this.section897OrdinaryDividends = section897OrdinaryDividends;
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
          public String getUnrecapturedSec1250Gain() {
            return(unrecapturedSec1250Gain);
          }
          public void setUnrecapturedSec1250Gain(String unrecapturedSec1250Gain) {
            this.unrecapturedSec1250Gain = unrecapturedSec1250Gain;
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
        } // Statement
      } // StatementWithRecordNumber
    } // UpdateF1099divStatements
  } // Data
} // UpdateF1099divStatementsResponse
