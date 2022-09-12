package com.ottertax.support;

public class UpdateF5498StatementsResponse {
  private Data data;

  public Data getData() {
    return(data);
  }
  public void setData(Data data) {
    this.data = data;
  }

  public static class Data {
    private UpdateF5498Statements updateF5498Statements;

    public UpdateF5498Statements getUpdateF5498Statements() {
      return(updateF5498Statements);
    }
    public void setUpdateF5498Statements(UpdateF5498Statements updateF5498Statements) {
      this.updateF5498Statements = updateF5498Statements;
    }

    public static class UpdateF5498Statements {
      private StatementWithRecordNumber[] statements;

      public StatementWithRecordNumber[] getStatements() {
        return(statements);
      }
      public void setStatements(StatementWithRecordNumber[] statements) {
        this.statements = statements;
      }

      public static class StatementWithRecordNumber {
        private Integer recordNumber;
        private F5498ResponseStatement statement;

        public Integer getRecordNumber() {
          return(recordNumber);
        }
        public void setRecordNumber(Integer recordNumber) {
          this.recordNumber = recordNumber;
        }
        public F5498ResponseStatement getStatement() {
          return(statement);
        }
        public void setStatement(F5498ResponseStatement statement) {
          this.statement = statement;
        }
      } // StatementWithRecordNumber
    } // UpdateF5498Statements
  } // Data
} // UpdateF5498StatementsResponse
