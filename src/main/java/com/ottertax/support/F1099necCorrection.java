package com.ottertax.support;

import com.google.gson.Gson;

public class F1099necCorrection {
  private String otxId;
  private String uploaderId;
  private Statement statement;

  public String getOtxId() {
    return(otxId);
  }
  public void setOtxId(String otxId) {
    this.otxId = otxId;
  }
  public String getUploaderId() {
    return(uploaderId);
  }
  public void setUploaderId(String uploaderId) {
    this.uploaderId = uploaderId;
  }
  public Statement getStatement() {
    return(statement);
  }
  public void setStatement(Statement statement) {
    this.statement = statement;
  }

  public String toGraphql(String idType) {
    checkGraphqlData(idType);
    Gson gson = new Gson();
    StringBuilder sb = new StringBuilder();
    if(idType.equals("uploaderId")) {
      sb.append("{ uploaderId: " + gson.toJson(uploaderId) + ",\n");
    } else {
      sb.append("{ otxId: " + gson.toJson(otxId) + ",\n");
    }
    sb.append("  statement: " + statement.toGraphql());
    sb.append("}\n");
    return(sb.toString());
  }

  private void checkGraphqlData(String idType) {
    if(!(idType.equals("otxId") || idType.equals("uploaderId"))) {
      throw new RuntimeException("ID type for creating corrections must be either 'otxID' or 'uploaderId'.");
    }
    if(idType.equals("uploaderId") && uploaderId == null) {
      throw new RuntimeException("Uploader ID cannot be null when creating corrections using uploaderId as key.");
    }
    if(idType.equals("otxId") && otxId == null) {
      throw new RuntimeException("OtterTax ID cannot be null when creating corrections using otxId as key.");
    }
  }

  public static class Statement {
    private String accountNumber;
    private Boolean corrected;
    private Boolean fatcaRequirement;
    private String federalTaxWithheld;
    private String nonemployeeComp;
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
    private String[] tags;
    private Integer taxYear;
    private String uploaderId;

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
    public String getNonemployeeComp() {
      return(nonemployeeComp);
    }
    public void setNonemployeeComp(String nonemployeeComp) {
      this.nonemployeeComp = nonemployeeComp;
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
    public String[] getTags() {
      return(tags);
    }
    public void setTags(String[] tags) {
      this.tags = tags;
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

    public String toGraphql() {
      Gson gson = new Gson();
      StringBuilder sb = new StringBuilder();
      sb.append("{\n");
      if(accountNumber != null) {
        sb.append("  accountNumber: " + gson.toJson(accountNumber) + "\n");
      }
      if(corrected != null) {
        sb.append("  corrected: " + gson.toJson(corrected) + "\n");
      }
      if(fatcaRequirement != null) {
        sb.append("  fatcaRequirement: " + gson.toJson(fatcaRequirement) + "\n");
      }
      if(federalTaxWithheld != null) {
        sb.append("  federalTaxWithheld: " + gson.toJson(federalTaxWithheld) + "\n");
      }
      if(nonemployeeComp != null) {
        sb.append("  nonemployeeComp: " + gson.toJson(nonemployeeComp) + "\n");
      }
      if(recipientAddress1 != null) {
        sb.append("  recipientAddress1: " + gson.toJson(recipientAddress1) + "\n");
      }
      if(recipientAddress2 != null) {
        sb.append("  recipientAddress2: " + gson.toJson(recipientAddress2) + "\n");
      }
      if(recipientAddress3 != null) {
        sb.append("  recipientAddress3: " + gson.toJson(recipientAddress3) + "\n");
      }
      if(recipientBusinessName != null) {
        sb.append("  recipientBusinessName: " + gson.toJson(recipientBusinessName) + "\n");
      }
      if(recipientCity != null) {
        sb.append("  recipientCity: " + gson.toJson(recipientCity) + "\n");
      }
      if(recipientEntityName != null) {
        sb.append("  recipientEntityName: " + gson.toJson(recipientEntityName) + "\n");
      }
      if(recipientFirstName != null) {
        sb.append("  recipientFirstName: " + gson.toJson(recipientFirstName) + "\n");
      }
      if(recipientLastName != null) {
        sb.append("  recipientLastName: " + gson.toJson(recipientLastName) + "\n");
      }
      if(recipientMiddleName != null) {
        sb.append("  recipientMiddleName: " + gson.toJson(recipientMiddleName) + "\n");
      }
      if(recipientNameSuffix != null) {
        sb.append("  recipientNameSuffix: " + gson.toJson(recipientNameSuffix) + "\n");
      }
      if(recipientState != null) {
        sb.append("  recipientState: " + gson.toJson(recipientState) + "\n");
      }
      if(recipientTin != null) {
        sb.append("  recipientTin: " + gson.toJson(recipientTin) + "\n");
      }
      if(recipientTinType != null) {
        sb.append("  recipientTinType: " + gson.toJson(recipientTinType) + "\n");
      }
      if(recipientZipCode != null) {
        sb.append("  recipientZipCode: " + gson.toJson(recipientZipCode) + "\n");
      }
      if(senderAddress1 != null) {
        sb.append("  senderAddress1: " + gson.toJson(senderAddress1) + "\n");
      }
      if(senderAddress2 != null) {
        sb.append("  senderAddress2: " + gson.toJson(senderAddress2) + "\n");
      }
      if(senderCity != null) {
        sb.append("  senderCity: " + gson.toJson(senderCity) + "\n");
      }
      if(senderMadeDirectSales != null) {
        sb.append("  senderMadeDirectSales: " + gson.toJson(senderMadeDirectSales) + "\n");
      }
      if(senderName != null) {
        sb.append("  senderName: " + gson.toJson(senderName) + "\n");
      }
      if(senderPhoneNumber != null) {
        sb.append("  senderPhoneNumber: " + gson.toJson(senderPhoneNumber) + "\n");
      }
      if(senderState != null) {
        sb.append("  senderState: " + gson.toJson(senderState) + "\n");
      }
      if(senderTin != null) {
        sb.append("  senderTin: " + gson.toJson(senderTin) + "\n");
      }
      if(senderZipCode != null) {
        sb.append("  senderZipCode: " + gson.toJson(senderZipCode) + "\n");
      }
      if(stateAbbreviation1 != null) {
        sb.append("  stateAbbreviation1: " + gson.toJson(stateAbbreviation1) + "\n");
      }
      if(stateAbbreviation2 != null) {
        sb.append("  stateAbbreviation2: " + gson.toJson(stateAbbreviation2) + "\n");
      }
      if(stateId1 != null) {
        sb.append("  stateId1: " + gson.toJson(stateId1) + "\n");
      }
      if(stateId2 != null) {
        sb.append("  stateId2: " + gson.toJson(stateId2) + "\n");
      }
      if(stateIncome1 != null) {
        sb.append("  stateIncome1: " + gson.toJson(stateIncome1) + "\n");
      }
      if(stateIncome2 != null) {
        sb.append("  stateIncome2: " + gson.toJson(stateIncome2) + "\n");
      }
      if(stateTaxWithheld1 != null) {
        sb.append("  stateTaxWithheld1: " + gson.toJson(stateTaxWithheld1) + "\n");
      }
      if(stateTaxWithheld2 != null) {
        sb.append("  stateTaxWithheld2: " + gson.toJson(stateTaxWithheld2) + "\n");
      }
      if(tags != null) {
        sb.append("  tags: " + gson.toJson(tags) + "\n");
      }
      if(taxYear != null) {
        sb.append("  taxYear: " + gson.toJson(taxYear) + "\n");
      }
      if(uploaderId != null) {
        sb.append("  uploaderId: " + gson.toJson(uploaderId) + "\n");
      }
      sb.append("}\n");
      return(sb.toString());
    }
  } // Statement
} // F1099necCorrection
