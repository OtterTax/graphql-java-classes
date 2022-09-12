package com.ottertax.support;

public class UpdateF1099rStatementsResponse {
  private Data data;

  public Data getData() {
    return(data);
  }
  public void setData(Data data) {
    this.data = data;
  }

  public static class Data {
    private UpdateF1099rStatements updateF1099rStatements;

    public UpdateF1099rStatements getUpdateF1099rStatements() {
      return(updateF1099rStatements);
    }
    public void setUpdateF1099rStatements(UpdateF1099rStatements updateF1099rStatements) {
      this.updateF1099rStatements = updateF1099rStatements;
    }

    public static class UpdateF1099rStatements {
      private StatementWithRecordNumber[] statements;

      public StatementWithRecordNumber[] getStatements() {
        return(statements);
      }
      public void setStatements(StatementWithRecordNumber[] statements) {
        this.statements = statements;
      }

      public static class StatementWithRecordNumber {
        private Integer recordNumber;
        private F1099rResponseStatement statement;

        public Integer getRecordNumber() {
          return(recordNumber);
        }
        public void setRecordNumber(Integer recordNumber) {
          this.recordNumber = recordNumber;
        }
        public F1099rResponseStatement getStatement() {
          return(statement);
        }
        public void setStatement(F1099rResponseStatement statement) {
          this.statement = statement;
        }
      } // StatementWithRecordNumber
    } // UpdateF1099rStatements
  } // Data
} // UpdateF1099rStatementsResponse
