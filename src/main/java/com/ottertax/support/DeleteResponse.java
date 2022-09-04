package com.ottertax.support;

public class DeleteResponse {
  private Data data;

  public Data getData() {
    return(data);
  }
  public void setData(Data data) {
    this.data = data;
  }

  public static class Data {
    private DeleteStatements deleteStatements;

    public DeleteStatements getDeleteStatements() {
      return(deleteStatements);
    }
    public void setDeleteStatements(DeleteStatements deleteStatements) {
      this.deleteStatements = deleteStatements;
    }

    public static class DeleteStatements {
      private String[] errors;
      private Integer deleteCount;

      public String[] getErrors() {
        return(errors);
      }
      public void setErrors(String[] errors) {
        this.errors = errors;
      }
      public Integer getDeleteCount() {
        return(deleteCount);
      }
      public void setDeleteCount(Integer deleteCount) {
        this.deleteCount = deleteCount;
      }

    }
  }
}