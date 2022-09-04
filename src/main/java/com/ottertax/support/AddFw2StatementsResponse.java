package com.ottertax.support;

import com.google.gson.annotations.SerializedName;
import java.util.Date;

public class AddFw2StatementsResponse {
  private Data data;

  public Data getData() {
    return(data);
  }
  public void setData(Data data) {
    this.data = data;
  }

  public static class Data {
    private AddFw2Statements addFw2Statements;

    public AddFw2Statements getAddFw2Statements() {
      return(addFw2Statements);
    }
    public void setAddFw2Statements(AddFw2Statements addFw2Statements) {
      this.addFw2Statements = addFw2Statements;
    }

    public static class AddFw2Statements {
      private String[] errors;
      @SerializedName("statements")
      private StatementWithMessages[] statements;

      public String[] getErrors() {
        return(errors);
      }
      public void setErrors(String[] errors) {
        this.errors = errors;
      }
      public StatementWithMessages[] getStatements() {
        return(statements);
      }
      public void setStatements(StatementWithMessages[] statements) {
        this.statements = statements;
      }

      public static class StatementWithMessages {
        private Integer recordNumber;
        private Statement statement;
        private String[] messages;

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
        public String[] getMessages() {
          return(messages);
        }
        public void setMessages(String[] messages) {
          this.messages = messages;
        }

        public static class Statement {
          private String allocatedTips;
          private String box12Amount1;
          private String box12Amount2;
          private String box12Amount3;
          private String box12Amount4;
          private String box12Code1;
          private String box12Code2;
          private String box12Code3;
          private String box12Code4;
          private String controlNumber;
          private String dependentCareBenefits;
          private String federalTaxWithheld;
          private String localIncomeTax;
          private String localWages;
          private String localityName;
          private String medicareTaxWithheld;
          private String medicareWages;
          private String nonqualifiedPlans;
          private String nonqualifiedPlansNonSec457;
          private String otherAmount1;
          private String otherAmount2;
          private String otherAmount3;
          private String otherAmount4;
          private String otherCode1;
          private String otherCode2;
          private String otherCode3;
          private String otherCode4;
          private String otxId;
          private String otxSubmissionId;
          private String recipientAddress1;
          private String recipientAddress2;
          private String recipientAddress3;
          private String recipientCity;
          private String recipientFirstName;
          private String recipientLastName;
          private String recipientMiddleName;
          private String recipientNameSuffix;
          private String recipientState;
          private String recipientTin;
          private String recipientZipCode;
          private Boolean retirementPlan;
          private String senderAddress1;
          private String senderAddress2;
          private String senderCity;
          private String senderName;
          private String senderState;
          private String senderTin;
          private String senderZipCode;
          private String socialSecurityTaxWithheld;
          private String socialSecurityTips;
          private String socialSecurityWages;
          private String stateAbbreviation;
          private String stateId;
          private String stateIncomeTax;
          private String stateWages;
          private Boolean statementValid;
          private Integer status;
          private String statusDescription;
          private Boolean statutoryEmployee;
          private Integer submissionStatus;
          private String submissionStatusDescription;
          private Date taFileDate;
          private Date taResponseDate;
          private String[] tags;
          private String taxAuthority;
          private Integer taxYear;
          private Boolean thirdPartySickPay;
          private String uploaderId;
          private String[] validationMessages;
          private String verificationCode;
          private String wagesTipsOtherComp;

          public String getAllocatedTips() {
            return(allocatedTips);
          }
          public void setAllocatedTips(String allocatedTips) {
            this.allocatedTips = allocatedTips;
          }
          public String getBox12Amount1() {
            return(box12Amount1);
          }
          public void setBox12Amount1(String box12Amount1) {
            this.box12Amount1 = box12Amount1;
          }
          public String getBox12Amount2() {
            return(box12Amount2);
          }
          public void setBox12Amount2(String box12Amount2) {
            this.box12Amount2 = box12Amount2;
          }
          public String getBox12Amount3() {
            return(box12Amount3);
          }
          public void setBox12Amount3(String box12Amount3) {
            this.box12Amount3 = box12Amount3;
          }
          public String getBox12Amount4() {
            return(box12Amount4);
          }
          public void setBox12Amount4(String box12Amount4) {
            this.box12Amount4 = box12Amount4;
          }
          public String getBox12Code1() {
            return(box12Code1);
          }
          public void setBox12Code1(String box12Code1) {
            this.box12Code1 = box12Code1;
          }
          public String getBox12Code2() {
            return(box12Code2);
          }
          public void setBox12Code2(String box12Code2) {
            this.box12Code2 = box12Code2;
          }
          public String getBox12Code3() {
            return(box12Code3);
          }
          public void setBox12Code3(String box12Code3) {
            this.box12Code3 = box12Code3;
          }
          public String getBox12Code4() {
            return(box12Code4);
          }
          public void setBox12Code4(String box12Code4) {
            this.box12Code4 = box12Code4;
          }
          public String getControlNumber() {
            return(controlNumber);
          }
          public void setControlNumber(String controlNumber) {
            this.controlNumber = controlNumber;
          }
          public String getDependentCareBenefits() {
            return(dependentCareBenefits);
          }
          public void setDependentCareBenefits(String dependentCareBenefits) {
            this.dependentCareBenefits = dependentCareBenefits;
          }
          public String getFederalTaxWithheld() {
            return(federalTaxWithheld);
          }
          public void setFederalTaxWithheld(String federalTaxWithheld) {
            this.federalTaxWithheld = federalTaxWithheld;
          }
          public String getLocalIncomeTax() {
            return(localIncomeTax);
          }
          public void setLocalIncomeTax(String localIncomeTax) {
            this.localIncomeTax = localIncomeTax;
          }
          public String getLocalWages() {
            return(localWages);
          }
          public void setLocalWages(String localWages) {
            this.localWages = localWages;
          }
          public String getLocalityName() {
            return(localityName);
          }
          public void setLocalityName(String localityName) {
            this.localityName = localityName;
          }
          public String getMedicareTaxWithheld() {
            return(medicareTaxWithheld);
          }
          public void setMedicareTaxWithheld(String medicareTaxWithheld) {
            this.medicareTaxWithheld = medicareTaxWithheld;
          }
          public String getMedicareWages() {
            return(medicareWages);
          }
          public void setMedicareWages(String medicareWages) {
            this.medicareWages = medicareWages;
          }
          public String getNonqualifiedPlans() {
            return(nonqualifiedPlans);
          }
          public void setNonqualifiedPlans(String nonqualifiedPlans) {
            this.nonqualifiedPlans = nonqualifiedPlans;
          }
          public String getNonqualifiedPlansNonSec457() {
            return(nonqualifiedPlansNonSec457);
          }
          public void setNonqualifiedPlansNonSec457(String nonqualifiedPlansNonSec457) {
            this.nonqualifiedPlansNonSec457 = nonqualifiedPlansNonSec457;
          }
          public String getOtherAmount1() {
            return(otherAmount1);
          }
          public void setOtherAmount1(String otherAmount1) {
            this.otherAmount1 = otherAmount1;
          }
          public String getOtherAmount2() {
            return(otherAmount2);
          }
          public void setOtherAmount2(String otherAmount2) {
            this.otherAmount2 = otherAmount2;
          }
          public String getOtherAmount3() {
            return(otherAmount3);
          }
          public void setOtherAmount3(String otherAmount3) {
            this.otherAmount3 = otherAmount3;
          }
          public String getOtherAmount4() {
            return(otherAmount4);
          }
          public void setOtherAmount4(String otherAmount4) {
            this.otherAmount4 = otherAmount4;
          }
          public String getOtherCode1() {
            return(otherCode1);
          }
          public void setOtherCode1(String otherCode1) {
            this.otherCode1 = otherCode1;
          }
          public String getOtherCode2() {
            return(otherCode2);
          }
          public void setOtherCode2(String otherCode2) {
            this.otherCode2 = otherCode2;
          }
          public String getOtherCode3() {
            return(otherCode3);
          }
          public void setOtherCode3(String otherCode3) {
            this.otherCode3 = otherCode3;
          }
          public String getOtherCode4() {
            return(otherCode4);
          }
          public void setOtherCode4(String otherCode4) {
            this.otherCode4 = otherCode4;
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
          public String getRecipientZipCode() {
            return(recipientZipCode);
          }
          public void setRecipientZipCode(String recipientZipCode) {
            this.recipientZipCode = recipientZipCode;
          }
          public Boolean getRetirementPlan() {
            return(retirementPlan);
          }
          public void setRetirementPlan(Boolean retirementPlan) {
            this.retirementPlan = retirementPlan;
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
          public String getSocialSecurityTaxWithheld() {
            return(socialSecurityTaxWithheld);
          }
          public void setSocialSecurityTaxWithheld(String socialSecurityTaxWithheld) {
            this.socialSecurityTaxWithheld = socialSecurityTaxWithheld;
          }
          public String getSocialSecurityTips() {
            return(socialSecurityTips);
          }
          public void setSocialSecurityTips(String socialSecurityTips) {
            this.socialSecurityTips = socialSecurityTips;
          }
          public String getSocialSecurityWages() {
            return(socialSecurityWages);
          }
          public void setSocialSecurityWages(String socialSecurityWages) {
            this.socialSecurityWages = socialSecurityWages;
          }
          public String getStateAbbreviation() {
            return(stateAbbreviation);
          }
          public void setStateAbbreviation(String stateAbbreviation) {
            this.stateAbbreviation = stateAbbreviation;
          }
          public String getStateId() {
            return(stateId);
          }
          public void setStateId(String stateId) {
            this.stateId = stateId;
          }
          public String getStateIncomeTax() {
            return(stateIncomeTax);
          }
          public void setStateIncomeTax(String stateIncomeTax) {
            this.stateIncomeTax = stateIncomeTax;
          }
          public String getStateWages() {
            return(stateWages);
          }
          public void setStateWages(String stateWages) {
            this.stateWages = stateWages;
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
          public Boolean getStatutoryEmployee() {
            return(statutoryEmployee);
          }
          public void setStatutoryEmployee(Boolean statutoryEmployee) {
            this.statutoryEmployee = statutoryEmployee;
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
          public Boolean getThirdPartySickPay() {
            return(thirdPartySickPay);
          }
          public void setThirdPartySickPay(Boolean thirdPartySickPay) {
            this.thirdPartySickPay = thirdPartySickPay;
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
          public String getVerificationCode() {
            return(verificationCode);
          }
          public void setVerificationCode(String verificationCode) {
            this.verificationCode = verificationCode;
          }
          public String getWagesTipsOtherComp() {
            return(wagesTipsOtherComp);
          }
          public void setWagesTipsOtherComp(String wagesTipsOtherComp) {
            this.wagesTipsOtherComp = wagesTipsOtherComp;
          }
        } // Statement
      } // StatementWithMessages
    } // AddFw2Statements
  } // Data
} // AddFw2StatementsResponse
