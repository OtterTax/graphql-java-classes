package com.ottertax.support;

public class FinalizeResponse {
  private Data data;

  public Data getData() {
    return(data);
  }
  public void setData(Data data) {
    this.data = data;
  }

  public static class Data {
    private FinalizeStatements finalizeStatements;

    public FinalizeStatements getFinalizeStatements() {
      return(finalizeStatements);
    }
    public void setFinalizeStatements(FinalizeStatements finalizeStatements) {
      this.finalizeStatements = finalizeStatements;
    }

    public static class FinalizeStatements {
      private String[] errors;
      private Message[] messages;
      private Integer successCount;

      public String[] getErrors() {
        return(errors);
      }
      public void setErrors(String[] errors) {
        this.errors = errors;
      }
      public Message[] getMessages() {
        return(messages);
      }
      public void setMessages(Message[] messages) {
        this.messages = messages;
      }
      public Integer getSuccessCount() {
        return(successCount);
      }
      public void setSuccessCount(Integer successCount) {
        this.successCount = successCount;
      }

      public static class Message {
        private String messages[];
        private String otxId;
        private String uploaderId;

        public String[] getMessages() {
          return(messages);
        }
        public void setMessages(String[] messages) {
          this.messages = messages;
        }
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
      }
    }
  }
}