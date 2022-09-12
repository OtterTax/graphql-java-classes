package com.ottertax.support;

import com.google.gson.Gson;

public class F3921Update {
  private String otxId;
  private String uploaderId;
  private F3921InputStatement statement;

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
  public F3921InputStatement getStatement() {
    return(statement);
  }
  public void setStatement(F3921InputStatement statement) {
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
} // F3921Update
