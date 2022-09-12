package com.ottertax.support;

public class UpdateF1099necStatementsResponse {
  private Data data;

  public Data getData() {
    return(data);
  }
  public void setData(Data data) {
    this.data = data;
  }

  public static class Data {
    private UpdateF1099necStatements updateF1099necStatements;

    public UpdateF1099necStatements getUpdateF1099necStatements() {
      return(updateF1099necStatements);
    }
    public void setUpdateF1099necStatements(UpdateF1099necStatements updateF1099necStatements) {
      this.updateF1099necStatements = updateF1099necStatements;
    }

    public static class UpdateF1099necStatements {
      private StatementWithRecordNumber[] statements;

      public StatementWithRecordNumber[] getStatements() {
        return(statements);
      }
      public void setStatements(StatementWithRecordNumber[] statements) {
        this.statements = statements;
      }

      public static class StatementWithRecordNumber {
        private Integer recordNumber;
        private F1099necResponseStatement statement;

        public Integer getRecordNumber() {
          return(recordNumber);
        }
        public void setRecordNumber(Integer recordNumber) {
          this.recordNumber = recordNumber;
        }
        public F1099necResponseStatement getStatement() {
          return(statement);
        }
        public void setStatement(F1099necResponseStatement statement) {
          this.statement = statement;
        }
      } // StatementWithRecordNumber
    } // UpdateF1099necStatements
  } // Data
} // UpdateF1099necStatementsResponse
