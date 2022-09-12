package com.ottertax.support;

public class UpdateF3922StatementsResponse {
  private Data data;

  public Data getData() {
    return(data);
  }
  public void setData(Data data) {
    this.data = data;
  }

  public static class Data {
    private UpdateF3922Statements updateF3922Statements;

    public UpdateF3922Statements getUpdateF3922Statements() {
      return(updateF3922Statements);
    }
    public void setUpdateF3922Statements(UpdateF3922Statements updateF3922Statements) {
      this.updateF3922Statements = updateF3922Statements;
    }

    public static class UpdateF3922Statements {
      private StatementWithRecordNumber[] statements;

      public StatementWithRecordNumber[] getStatements() {
        return(statements);
      }
      public void setStatements(StatementWithRecordNumber[] statements) {
        this.statements = statements;
      }

      public static class StatementWithRecordNumber {
        private Integer recordNumber;
        private F3922ResponseStatement statement;

        public Integer getRecordNumber() {
          return(recordNumber);
        }
        public void setRecordNumber(Integer recordNumber) {
          this.recordNumber = recordNumber;
        }
        public F3922ResponseStatement getStatement() {
          return(statement);
        }
        public void setStatement(F3922ResponseStatement statement) {
          this.statement = statement;
        }
      } // StatementWithRecordNumber
    } // UpdateF3922Statements
  } // Data
} // UpdateF3922StatementsResponse
