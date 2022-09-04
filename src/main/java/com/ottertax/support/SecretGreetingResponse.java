package com.ottertax.support;

public class SecretGreetingResponse {
  private Data data;

  public Data getData() {
    return(data);
  }
  public void setData(Data data) {
    this.data = data;
  }
  @Override
  public String toString() {
    return("[data: " + data.toString() + "]");
  }

  public static class Data {
    private SecretGreeting secretGreeting;

    public SecretGreeting getSecretGreeting() {
      return(secretGreeting);
    }
    public void setSecretGreeting(SecretGreeting secretGreeting) {
      this.secretGreeting = secretGreeting;
    }
    @Override
    public String toString() {
      return("[secretGreeting: " + secretGreeting.toString() + "]");
    }

    public static class SecretGreeting {
      private String response;
      private String[] errors;

      public String getResponse() {
        return(response);
      }
      public void setResponse(String response) {
        this.response = response;
      }
      public String[] getErrors() {
        return(errors);
      }
      public void SetErrors(String[] errors) {
        this.errors = errors;
      }
      @Override
      public String toString() {
        String errs = String.join(", ", errors);
        return("[response: " + response + " errors: " + errs + "]");
      }
    } // SecretGreeting
  } // Data
}
