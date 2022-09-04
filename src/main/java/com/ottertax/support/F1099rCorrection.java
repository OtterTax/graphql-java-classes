package com.ottertax.support;

import com.google.gson.Gson;
import java.util.Date;

public class F1099rCorrection {
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
    private String[] tags;
    private Integer taxYear;
    private String taxableAmount;
    private Boolean taxableAmountNotDetermined;
    private Boolean totalDistribution;
    private String totalEmployeeContributions;
    private String uploaderId;
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
    public Float getYourPercentageTotal() {
      return(yourPercentageTotal);
    }
    public void setYourPercentageTotal(Float yourPercentageTotal) {
      this.yourPercentageTotal = yourPercentageTotal;
    }

    public String toGraphql() {
      Gson gson = new Gson();
      StringBuilder sb = new StringBuilder();
      sb.append("{\n");
      if(accountNumber != null) {
        sb.append("  accountNumber: " + gson.toJson(accountNumber) + "\n");
      }
      if(amountAllocableIrr != null) {
        sb.append("  amountAllocableIrr: " + gson.toJson(amountAllocableIrr) + "\n");
      }
      if(capitalGain != null) {
        sb.append("  capitalGain: " + gson.toJson(capitalGain) + "\n");
      }
      if(corrected != null) {
        sb.append("  corrected: " + gson.toJson(corrected) + "\n");
      }
      if(dateOfPayment != null) {
        sb.append("  dateOfPayment: " + gson.toJson(dateOfPayment) + "\n");
      }
      if(distributionCodes != null) {
        sb.append("  distributionCodes: " + gson.toJson(distributionCodes) + "\n");
      }
      if(employeeContributions != null) {
        sb.append("  employeeContributions: " + gson.toJson(employeeContributions) + "\n");
      }
      if(fatcaRequirement != null) {
        sb.append("  fatcaRequirement: " + gson.toJson(fatcaRequirement) + "\n");
      }
      if(federalTaxWithheld != null) {
        sb.append("  federalTaxWithheld: " + gson.toJson(federalTaxWithheld) + "\n");
      }
      if(firstYearDesignatedRoth != null) {
        sb.append("  firstYearDesignatedRoth: " + gson.toJson(firstYearDesignatedRoth) + "\n");
      }
      if(grossDistribution != null) {
        sb.append("  grossDistribution: " + gson.toJson(grossDistribution) + "\n");
      }
      if(iraSepSimple != null) {
        sb.append("  iraSepSimple: " + gson.toJson(iraSepSimple) + "\n");
      }
      if(localDistribution != null) {
        sb.append("  localDistribution: " + gson.toJson(localDistribution) + "\n");
      }
      if(localTaxWithheld != null) {
        sb.append("  localTaxWithheld: " + gson.toJson(localTaxWithheld) + "\n");
      }
      if(localityName != null) {
        sb.append("  localityName: " + gson.toJson(localityName) + "\n");
      }
      if(netUnrealizedAppreciation != null) {
        sb.append("  netUnrealizedAppreciation: " + gson.toJson(netUnrealizedAppreciation) + "\n");
      }
      if(other != null) {
        sb.append("  other: " + gson.toJson(other) + "\n");
      }
      if(otherPercent != null) {
        sb.append("  otherPercent: " + gson.toJson(otherPercent) + "\n");
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
      if(senderState != null) {
        sb.append("  senderState: " + gson.toJson(senderState) + "\n");
      }
      if(senderTin != null) {
        sb.append("  senderTin: " + gson.toJson(senderTin) + "\n");
      }
      if(senderZipCode != null) {
        sb.append("  senderZipCode: " + gson.toJson(senderZipCode) + "\n");
      }
      if(stateAbbreviation != null) {
        sb.append("  stateAbbreviation: " + gson.toJson(stateAbbreviation) + "\n");
      }
      if(stateDistribution != null) {
        sb.append("  stateDistribution: " + gson.toJson(stateDistribution) + "\n");
      }
      if(stateId != null) {
        sb.append("  stateId: " + gson.toJson(stateId) + "\n");
      }
      if(stateTaxWithheld != null) {
        sb.append("  stateTaxWithheld: " + gson.toJson(stateTaxWithheld) + "\n");
      }
      if(tags != null) {
        sb.append("  tags: " + gson.toJson(tags) + "\n");
      }
      if(taxYear != null) {
        sb.append("  taxYear: " + gson.toJson(taxYear) + "\n");
      }
      if(taxableAmount != null) {
        sb.append("  taxableAmount: " + gson.toJson(taxableAmount) + "\n");
      }
      if(taxableAmountNotDetermined != null) {
        sb.append("  taxableAmountNotDetermined: " + gson.toJson(taxableAmountNotDetermined) + "\n");
      }
      if(totalDistribution != null) {
        sb.append("  totalDistribution: " + gson.toJson(totalDistribution) + "\n");
      }
      if(totalEmployeeContributions != null) {
        sb.append("  totalEmployeeContributions: " + gson.toJson(totalEmployeeContributions) + "\n");
      }
      if(uploaderId != null) {
        sb.append("  uploaderId: " + gson.toJson(uploaderId) + "\n");
      }
      if(yourPercentageTotal != null) {
        sb.append("  yourPercentageTotal: " + gson.toJson(yourPercentageTotal) + "\n");
      }
      sb.append("}\n");
      return(sb.toString());
    }
  } // Statement
} // F1099rCorrection
