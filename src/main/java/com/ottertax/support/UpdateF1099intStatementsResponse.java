package com.ottertax.support;

public class UpdateF1099intStatementsResponse {
  private Data data;

  public Data getData() {
    return(data);
  }
  public void setData(Data data) {
    this.data = data;
  }

  public static class Data {
    private UpdateF1099intStatements updateF1099intStatements;

    public UpdateF1099intStatements getUpdateF1099intStatements() {
      return(updateF1099intStatements);
    }
    public void setUpdateF1099intStatements(UpdateF1099intStatements updateF1099intStatements) {
      this.updateF1099intStatements = updateF1099intStatements;
    }

    public static class UpdateF1099intStatements {
      private StatementWithRecordNumber[] statements;

      public StatementWithRecordNumber[] getStatements() {
        return(statements);
      }
      public void setStatements(StatementWithRecordNumber[] statements) {
        this.statements = statements;
      }

      public static class StatementWithRecordNumber {
        private Integer recordNumber;
        private F1099intResponseStatement statement;

        public Integer getRecordNumber() {
          return(recordNumber);
        }
        public void setRecordNumber(Integer recordNumber) {
          this.recordNumber = recordNumber;
        }
        public F1099intResponseStatement getStatement() {
          return(statement);
        }
        public void setStatement(F1099intResponseStatement statement) {
          this.statement = statement;
        }
      } // StatementWithRecordNumber
    } // UpdateF1099intStatements
  } // Data
} // UpdateF1099intStatementsResponse
