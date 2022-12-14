package com.ottertax.support;

import com.google.gson.Gson;
import java.util.Date;

public class F1098InputStatement {
  private String accountNumber;
  private Boolean corrected;
  private Date mortgageAcqDate;
  private String mortgageInsurancePremiums;
  private String mortgageInterest;
  private Integer numberProperties;
  private Date originationDate;
  private String other;
  private String outstandingPrincipal;
  private String points;
  private String[] propertyAddress;
  private Boolean propertyAddressSameAsBorrower;
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
  private String refundOverpaidInterest;
  private String senderAddress1;
  private String senderAddress2;
  private String senderCity;
  private String senderName;
  private String senderPhoneNumber;
  private String senderState;
  private String senderTin;
  private String senderZipCode;
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
  public Date getMortgageAcqDate() {
    return(mortgageAcqDate);
  }
  public void setMortgageAcqDate(Date mortgageAcqDate) {
    this.mortgageAcqDate = mortgageAcqDate;
  }
  public String getMortgageInsurancePremiums() {
    return(mortgageInsurancePremiums);
  }
  public void setMortgageInsurancePremiums(String mortgageInsurancePremiums) {
    this.mortgageInsurancePremiums = mortgageInsurancePremiums;
  }
  public String getMortgageInterest() {
    return(mortgageInterest);
  }
  public void setMortgageInterest(String mortgageInterest) {
    this.mortgageInterest = mortgageInterest;
  }
  public Integer getNumberProperties() {
    return(numberProperties);
  }
  public void setNumberProperties(Integer numberProperties) {
    this.numberProperties = numberProperties;
  }
  public Date getOriginationDate() {
    return(originationDate);
  }
  public void setOriginationDate(Date originationDate) {
    this.originationDate = originationDate;
  }
  public String getOther() {
    return(other);
  }
  public void setOther(String other) {
    this.other = other;
  }
  public String getOutstandingPrincipal() {
    return(outstandingPrincipal);
  }
  public void setOutstandingPrincipal(String outstandingPrincipal) {
    this.outstandingPrincipal = outstandingPrincipal;
  }
  public String getPoints() {
    return(points);
  }
  public void setPoints(String points) {
    this.points = points;
  }
  public String[] getPropertyAddress() {
    return(propertyAddress);
  }
  public void setPropertyAddress(String[] propertyAddress) {
    this.propertyAddress = propertyAddress;
  }
  public Boolean getPropertyAddressSameAsBorrower() {
    return(propertyAddressSameAsBorrower);
  }
  public void setPropertyAddressSameAsBorrower(Boolean propertyAddressSameAsBorrower) {
    this.propertyAddressSameAsBorrower = propertyAddressSameAsBorrower;
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
  public String getRefundOverpaidInterest() {
    return(refundOverpaidInterest);
  }
  public void setRefundOverpaidInterest(String refundOverpaidInterest) {
    this.refundOverpaidInterest = refundOverpaidInterest;
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
    if(mortgageAcqDate != null) {
      sb.append("  mortgageAcqDate: " + gson.toJson(mortgageAcqDate) + "\n");
    }
    if(mortgageInsurancePremiums != null) {
      sb.append("  mortgageInsurancePremiums: " + gson.toJson(mortgageInsurancePremiums) + "\n");
    }
    if(mortgageInterest != null) {
      sb.append("  mortgageInterest: " + gson.toJson(mortgageInterest) + "\n");
    }
    if(numberProperties != null) {
      sb.append("  numberProperties: " + gson.toJson(numberProperties) + "\n");
    }
    if(originationDate != null) {
      sb.append("  originationDate: " + gson.toJson(originationDate) + "\n");
    }
    if(other != null) {
      sb.append("  other: " + gson.toJson(other) + "\n");
    }
    if(outstandingPrincipal != null) {
      sb.append("  outstandingPrincipal: " + gson.toJson(outstandingPrincipal) + "\n");
    }
    if(points != null) {
      sb.append("  points: " + gson.toJson(points) + "\n");
    }
    if(propertyAddress != null) {
      sb.append("  propertyAddress: " + gson.toJson(propertyAddress) + "\n");
    }
    if(propertyAddressSameAsBorrower != null) {
      sb.append("  propertyAddressSameAsBorrower: " + gson.toJson(propertyAddressSameAsBorrower) + "\n");
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
    if(refundOverpaidInterest != null) {
      sb.append("  refundOverpaidInterest: " + gson.toJson(refundOverpaidInterest) + "\n");
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
} // F1098InputStatement
