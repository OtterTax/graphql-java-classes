package com.ottertax.support;

public class Credential {
  private String accessToken;
  private String client;
  private String uid;

  public Credential() { }

  public Credential(String accessToken, String client, String uid) {
    this.accessToken = accessToken;
    this.client = client;
    this.uid = uid;
  }

  public String getAccessToken() {
    return(accessToken);
  }
  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }
  public String getClient() {
    return(client);
  }
  public void setClient(String client) {
    this.client = client;
  }
  public String getUid() {
    return(uid);
  }
  public void setUid(String uid) {
    this.uid = uid;
  }
}