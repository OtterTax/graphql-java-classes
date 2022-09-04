package com.ottertax.support;

public class SubmitResponse {
  private Data data;

  public Data getData() {
    return(data);
  }
  public void setData(Data data) {
    this.data = data;
  }

  public static class Data {
    private SubmitStatements submitStatements;

    public SubmitStatements getSubmitStatements() {
      return(submitStatements);
    }
    public void setSubmitStatements(SubmitStatements submitStatements) {
      this.submitStatements = submitStatements;
    }

    public static class SubmitStatements {
      private Message[] messages;
      private String[] errors;
      private Integer successCount;

      public Message[] getMessages() {
        return(messages);
      }
      public void setMessages(Message[] messages) {
        this.messages = messages;
      }
      public String[] getErrors() {
        return(errors);
      }
      public void setErrors(String[] errors) {
        this.errors = errors;
      }
      public Integer getSuccessCount() {
        return(successCount);
      }
      public void setSuccessCount(Integer successCount) {
        this.successCount = successCount;
      }

      public static class Message {
        private String[] messages;
        private String uploaderId;

        public String[] getMessages() {
          return(messages);
        }
        public void setMessages(String[] messages) {
          this.messages = messages;
        }
        public String getUploaderId() {
          return(uploaderId);
        }
        public void setUploaderId(String uploaderId) {
          this.uploaderId = uploaderId;
        }
      }
    }
  }
}