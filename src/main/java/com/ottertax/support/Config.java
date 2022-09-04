package com.ottertax.support;

public class Config {
  private String baseUrl;
  private LoginData loginData;

  public String getBaseUrl() {
    return(baseUrl);
  }
  public void setBaseUrl(String baseUrl) {
    this.baseUrl = baseUrl;
  }
  public LoginData getLoginData() {
    return(loginData);
  }
  public void setLoginData(LoginData loginData) {
    this.loginData = loginData;
  }

  public static class LoginData {
    private String email;
    private String password;

    public String getEmail() {
      return(email);
    }
    public void setEmail(String email) {
      this.email = email;
    }
    public String getPassword() {
      return(password);
    }
    public void setPassword(String password) {
      this.password = password;
    }
  }
}