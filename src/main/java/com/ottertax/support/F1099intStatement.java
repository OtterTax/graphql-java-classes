package com.ottertax.support;

import com.google.gson.Gson;

public class F1099intStatement {
  private String accountNumber;
  private String bondPremium;
  private String bondPremiumTaxExempt;
  private String bondPremiumTreasury;
  private Boolean corrected;
  private String earlyWithdrawalPenalty;
  private Boolean fatcaRequirement;
  private String federalTaxWithheld;
  private String foreignCountryOrPoss;
  private String foreignTaxPaid;
  private String interestIncome;
  private String interestSavingsBonds;
  private String investmentExpenses;
  private String marketDiscount;
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
  private String senderRtn;
  private String senderState;
  private String senderTin;
  private String senderZipCode;
  private String specifiedBondInterest;
  private String stateAbbreviation1;
  private String stateAbbreviation2;
  private String stateId1;
  private String stateId2;
  private String stateTaxWithheld1;
  private String stateTaxWithheld2;
  private String[] tags;
  private String taxExemptCusipNo;
  private String taxExemptInterest;
  private Integer taxYear;
  private String uploaderId;

  public String getAccountNumber() {
    return(accountNumber);
  }
  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }
  public String getBondPremium() {
    return(bondPremium);
  }
  public void setBondPremium(String bondPremium) {
    this.bondPremium = bondPremium;
  }
  public String getBondPremiumTaxExempt() {
    return(bondPremiumTaxExempt);
  }
  public void setBondPremiumTaxExempt(String bondPremiumTaxExempt) {
    this.bondPremiumTaxExempt = bondPremiumTaxExempt;
  }
  public String getBondPremiumTreasury() {
    return(bondPremiumTreasury);
  }
  public void setBondPremiumTreasury(String bondPremiumTreasury) {
    this.bondPremiumTreasury = bondPremiumTreasury;
  }
  public Boolean getCorrected() {
    return(corrected);
  }
  public void setCorrected(Boolean corrected) {
    this.corrected = corrected;
  }
  public String getEarlyWithdrawalPenalty() {
    return(earlyWithdrawalPenalty);
  }
  public void setEarlyWithdrawalPenalty(String earlyWithdrawalPenalty) {
    this.earlyWithdrawalPenalty = earlyWithdrawalPenalty;
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
  public String getInterestIncome() {
    return(interestIncome);
  }
  public void setInterestIncome(String interestIncome) {
    this.interestIncome = interestIncome;
  }
  public String getInterestSavingsBonds() {
    return(interestSavingsBonds);
  }
  public void setInterestSavingsBonds(String interestSavingsBonds) {
    this.interestSavingsBonds = interestSavingsBonds;
  }
  public String getInvestmentExpenses() {
    return(investmentExpenses);
  }
  public void setInvestmentExpenses(String investmentExpenses) {
    this.investmentExpenses = investmentExpenses;
  }
  public String getMarketDiscount() {
    return(marketDiscount);
  }
  public void setMarketDiscount(String marketDiscount) {
    this.marketDiscount = marketDiscount;
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
  public String getSenderRtn() {
    return(senderRtn);
  }
  public void setSenderRtn(String senderRtn) {
    this.senderRtn = senderRtn;
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
  public String getSpecifiedBondInterest() {
    return(specifiedBondInterest);
  }
  public void setSpecifiedBondInterest(String specifiedBondInterest) {
    this.specifiedBondInterest = specifiedBondInterest;
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
  public String getTaxExemptCusipNo() {
    return(taxExemptCusipNo);
  }
  public void setTaxExemptCusipNo(String taxExemptCusipNo) {
    this.taxExemptCusipNo = taxExemptCusipNo;
  }
  public String getTaxExemptInterest() {
    return(taxExemptInterest);
  }
  public void setTaxExemptInterest(String taxExemptInterest) {
    this.taxExemptInterest = taxExemptInterest;
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
    if(bondPremium != null) {
      sb.append("  bondPremium: " + gson.toJson(bondPremium) + "\n");
    }
    if(bondPremiumTaxExempt != null) {
      sb.append("  bondPremiumTaxExempt: " + gson.toJson(bondPremiumTaxExempt) + "\n");
    }
    if(bondPremiumTreasury != null) {
      sb.append("  bondPremiumTreasury: " + gson.toJson(bondPremiumTreasury) + "\n");
    }
    if(corrected != null) {
      sb.append("  corrected: " + gson.toJson(corrected) + "\n");
    }
    if(earlyWithdrawalPenalty != null) {
      sb.append("  earlyWithdrawalPenalty: " + gson.toJson(earlyWithdrawalPenalty) + "\n");
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
    if(interestIncome != null) {
      sb.append("  interestIncome: " + gson.toJson(interestIncome) + "\n");
    }
    if(interestSavingsBonds != null) {
      sb.append("  interestSavingsBonds: " + gson.toJson(interestSavingsBonds) + "\n");
    }
    if(investmentExpenses != null) {
      sb.append("  investmentExpenses: " + gson.toJson(investmentExpenses) + "\n");
    }
    if(marketDiscount != null) {
      sb.append("  marketDiscount: " + gson.toJson(marketDiscount) + "\n");
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
    if(senderRtn != null) {
      sb.append("  senderRtn: " + gson.toJson(senderRtn) + "\n");
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
    if(specifiedBondInterest != null) {
      sb.append("  specifiedBondInterest: " + gson.toJson(specifiedBondInterest) + "\n");
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
    if(taxExemptCusipNo != null) {
      sb.append("  taxExemptCusipNo: " + gson.toJson(taxExemptCusipNo) + "\n");
    }
    if(taxExemptInterest != null) {
      sb.append("  taxExemptInterest: " + gson.toJson(taxExemptInterest) + "\n");
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
} // F1099intStatement
