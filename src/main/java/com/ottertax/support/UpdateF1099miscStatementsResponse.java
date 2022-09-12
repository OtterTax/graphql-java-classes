package com.ottertax.support;

public class UpdateF1099miscStatementsResponse {
  private Data data;

  public Data getData() {
    return(data);
  }
  public void setData(Data data) {
    this.data = data;
  }

  public static class Data {
    private UpdateF1099miscStatements updateF1099miscStatements;

    public UpdateF1099miscStatements getUpdateF1099miscStatements() {
      return(updateF1099miscStatements);
    }
    public void setUpdateF1099miscStatements(UpdateF1099miscStatements updateF1099miscStatements) {
      this.updateF1099miscStatements = updateF1099miscStatements;
    }

    public static class UpdateF1099miscStatements {
      private StatementWithRecordNumber[] statements;

      public StatementWithRecordNumber[] getStatements() {
        return(statements);
      }
      public void setStatements(StatementWithRecordNumber[] statements) {
        this.statements = statements;
      }

      public static class StatementWithRecordNumber {
        private Integer recordNumber;
        private F1099miscResponseStatement statement;

        public Integer getRecordNumber() {
          return(recordNumber);
        }
        public void setRecordNumber(Integer recordNumber) {
          this.recordNumber = recordNumber;
        }
        public F1099miscResponseStatement getStatement() {
          return(statement);
        }
        public void setStatement(F1099miscResponseStatement statement) {
          this.statement = statement;
        }
      } // StatementWithRecordNumber
    } // UpdateF1099miscStatements
  } // Data
} // UpdateF1099miscStatementsResponse
