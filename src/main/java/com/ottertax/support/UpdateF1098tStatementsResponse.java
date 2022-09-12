package com.ottertax.support;

public class UpdateF1098tStatementsResponse {
  private Data data;

  public Data getData() {
    return(data);
  }
  public void setData(Data data) {
    this.data = data;
  }

  public static class Data {
    private UpdateF1098tStatements updateF1098tStatements;

    public UpdateF1098tStatements getUpdateF1098tStatements() {
      return(updateF1098tStatements);
    }
    public void setUpdateF1098tStatements(UpdateF1098tStatements updateF1098tStatements) {
      this.updateF1098tStatements = updateF1098tStatements;
    }

    public static class UpdateF1098tStatements {
      private StatementWithRecordNumber[] statements;

      public StatementWithRecordNumber[] getStatements() {
        return(statements);
      }
      public void setStatements(StatementWithRecordNumber[] statements) {
        this.statements = statements;
      }

      public static class StatementWithRecordNumber {
        private Integer recordNumber;
        private F1098tResponseStatement statement;

        public Integer getRecordNumber() {
          return(recordNumber);
        }
        public void setRecordNumber(Integer recordNumber) {
          this.recordNumber = recordNumber;
        }
        public F1098tResponseStatement getStatement() {
          return(statement);
        }
        public void setStatement(F1098tResponseStatement statement) {
          this.statement = statement;
        }
      } // StatementWithRecordNumber
    } // UpdateF1098tStatements
  } // Data
} // UpdateF1098tStatementsResponse
