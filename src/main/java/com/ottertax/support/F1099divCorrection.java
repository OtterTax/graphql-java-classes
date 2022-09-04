package com.ottertax.support;

import com.google.gson.Gson;

public class F1099divCorrection {
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
    private String[] tags;
    private Integer taxYear;
    private String unrecapturedSec1250Gain;
    private String uploaderId;

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

    public String toGraphql() {
      Gson gson = new Gson();
      StringBuilder sb = new StringBuilder();
      sb.append("{\n");
      if(accountNumber != null) {
        sb.append("  accountNumber: " + gson.toJson(accountNumber) + "\n");
      }
      if(capitalGainDistributions != null) {
        sb.append("  capitalGainDistributions: " + gson.toJson(capitalGainDistributions) + "\n");
      }
      if(cashLiquidationDistributions != null) {
        sb.append("  cashLiquidationDistributions: " + gson.toJson(cashLiquidationDistributions) + "\n");
      }
      if(collectiblesGain != null) {
        sb.append("  collectiblesGain: " + gson.toJson(collectiblesGain) + "\n");
      }
      if(corrected != null) {
        sb.append("  corrected: " + gson.toJson(corrected) + "\n");
      }
      if(exemptInterestDividends != null) {
        sb.append("  exemptInterestDividends: " + gson.toJson(exemptInterestDividends) + "\n");
      }
      if(fatcaRequirement != null) {
        sb.append("  fatcaRequirement: " + gson.toJson(fatcaRequirement) + "\n");
      }
      if(federalTaxWithheld != null) {
        sb.append("  federalTaxWithheld: " + gson.toJson(federalTaxWithheld) + "\n");
      }
      if(foreignCountryOrPoss != null) {
        sb.append("  foreignCountryOrPoss: " + gson.toJson(foreignCountryOrPoss) + "\n");
      }
      if(foreignTaxPaid != null) {
        sb.append("  foreignTaxPaid: " + gson.toJson(foreignTaxPaid) + "\n");
      }
      if(investmentExpenses != null) {
        sb.append("  investmentExpenses: " + gson.toJson(investmentExpenses) + "\n");
      }
      if(noncashLiquidationDistributions != null) {
        sb.append("  noncashLiquidationDistributions: " + gson.toJson(noncashLiquidationDistributions) + "\n");
      }
      if(nondividendDistributions != null) {
        sb.append("  nondividendDistributions: " + gson.toJson(nondividendDistributions) + "\n");
      }
      if(ordinaryDividends != null) {
        sb.append("  ordinaryDividends: " + gson.toJson(ordinaryDividends) + "\n");
      }
      if(privateActivityBondDividends != null) {
        sb.append("  privateActivityBondDividends: " + gson.toJson(privateActivityBondDividends) + "\n");
      }
      if(qualifiedDividends != null) {
        sb.append("  qualifiedDividends: " + gson.toJson(qualifiedDividends) + "\n");
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
      if(section1202Gain != null) {
        sb.append("  section1202Gain: " + gson.toJson(section1202Gain) + "\n");
      }
      if(section199aDividends != null) {
        sb.append("  section199aDividends: " + gson.toJson(section199aDividends) + "\n");
      }
      if(section897CapitalGain != null) {
        sb.append("  section897CapitalGain: " + gson.toJson(section897CapitalGain) + "\n");
      }
      if(section897OrdinaryDividends != null) {
        sb.append("  section897OrdinaryDividends: " + gson.toJson(section897OrdinaryDividends) + "\n");
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
      if(unrecapturedSec1250Gain != null) {
        sb.append("  unrecapturedSec1250Gain: " + gson.toJson(unrecapturedSec1250Gain) + "\n");
      }
      if(uploaderId != null) {
        sb.append("  uploaderId: " + gson.toJson(uploaderId) + "\n");
      }
      sb.append("}\n");
      return(sb.toString());
    }
  } // Statement
} // F1099divCorrection
