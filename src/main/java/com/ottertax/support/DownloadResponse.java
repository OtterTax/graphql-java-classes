package com.ottertax.support;

public class DownloadResponse {
  private Data data;

  public Data getData() {
    return(data);
  }
  public void setData(Data data) {
    this.data = data;
  }

  public static class Data {
    private GetStatements getStatements;

    public GetStatements getGetStatements() {
      return(getStatements);
    }
    public void setGetStatements(GetStatements getStatements) {
      this.getStatements = getStatements;
    }

    public static class GetStatements {
      private String[] errors;
      private Statements statements;

      public String[] getErrors() {
        return(errors);
      }
      public void setErrors(String[] errors) {
        this.errors = errors;
      }
      public Statements getStatements() {
        return(statements);
      }
      public void setStatements(Statements statements) {
        this.statements = statements;
      }

      public static class Statements {
        private Node[] nodes;

        public Node[] getNodes() {
          return(nodes);
        }
        public void setNodes(Node[] nodes) {
          this.nodes = nodes;
        }

        public static class Node {
          private String uploaderId;
          private String pdf;

          public String getUploaderId() {
            return(uploaderId);
          }
          public void setUploaderId(String uploaderId) {
            this.uploaderId = uploaderId;
          }
          public String getPdf() {
            return(this.pdf);
          }
          public void setPdf(String pdf) {
            this.pdf = pdf;
          }
        }
      }
    }
  }
}