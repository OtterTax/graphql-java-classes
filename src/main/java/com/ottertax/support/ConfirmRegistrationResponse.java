package com.ottertax.support;

public class ConfirmRegistrationResponse {
  private Data data;

  public Data getData() {
    return(data);
  }
  public void setData(Data data) {
    this.data = data;
  }

  public static class Data {
    private ConfirmRegistration confirmRegistration;

    public ConfirmRegistration getConfirmRegistration() {
      return(confirmRegistration);
    }
    public void setConfirmRegistration(ConfirmRegistration confirmRegistration) {
      this.confirmRegistration = confirmRegistration;
    }

    public static class ConfirmRegistration {
      private String message;

      public String getMessage() {
        return(message);
      }
      public void setMessage(String message) {
        this.message = message;
      }
    }
  }
}