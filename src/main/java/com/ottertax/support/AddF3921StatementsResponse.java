package com.ottertax.support;

import com.google.gson.annotations.SerializedName;
import java.util.Date;

public class AddF3921StatementsResponse {
  private Data data;

  public Data getData() {
    return(data);
  }
  public void setData(Data data) {
    this.data = data;
  }

  public static class Data {
    private AddF3921Statements addF3921Statements;

    public AddF3921Statements getAddF3921Statements() {
      return(addF3921Statements);
    }
    public void setAddF3921Statements(AddF3921Statements addF3921Statements) {
      this.addF3921Statements = addF3921Statements;
    }

    public static class AddF3921Statements {
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
          private String accountNumber;
          private String[] corporationInfo;
          private Boolean corrected;
          private Date dateOptionExercised;
          private Date dateOptionGranted;
          private String exercisePricePerShare;
          private String fmvPerShare;
          private Integer numberSharesTransferred;
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
          private String senderState;
          private String senderTin;
          private String senderZipCode;
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

          public String getAccountNumber() {
            return(accountNumber);
          }
          public void setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
          }
          public String[] getCorporationInfo() {
            return(corporationInfo);
          }
          public void setCorporationInfo(String[] corporationInfo) {
            this.corporationInfo = corporationInfo;
          }
          public Boolean getCorrected() {
            return(corrected);
          }
          public void setCorrected(Boolean corrected) {
            this.corrected = corrected;
          }
          public Date getDateOptionExercised() {
            return(dateOptionExercised);
          }
          public void setDateOptionExercised(Date dateOptionExercised) {
            this.dateOptionExercised = dateOptionExercised;
          }
          public Date getDateOptionGranted() {
            return(dateOptionGranted);
          }
          public void setDateOptionGranted(Date dateOptionGranted) {
            this.dateOptionGranted = dateOptionGranted;
          }
          public String getExercisePricePerShare() {
            return(exercisePricePerShare);
          }
          public void setExercisePricePerShare(String exercisePricePerShare) {
            this.exercisePricePerShare = exercisePricePerShare;
          }
          public String getFmvPerShare() {
            return(fmvPerShare);
          }
          public void setFmvPerShare(String fmvPerShare) {
            this.fmvPerShare = fmvPerShare;
          }
          public Integer getNumberSharesTransferred() {
            return(numberSharesTransferred);
          }
          public void setNumberSharesTransferred(Integer numberSharesTransferred) {
            this.numberSharesTransferred = numberSharesTransferred;
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
        } // Statement
      } // StatementWithMessages
    } // AddF3921Statements
  } // Data
} // AddF3921StatementsResponse
