package com.ottertax.support;

public class UpdateF1098StatementsResponse {
  private Data data;

  public Data getData() {
    return(data);
  }
  public void setData(Data data) {
    this.data = data;
  }

  public static class Data {
    private UpdateF1098Statements updateF1098Statements;

    public UpdateF1098Statements getUpdateF1098Statements() {
      return(updateF1098Statements);
    }
    public void setUpdateF1098Statements(UpdateF1098Statements updateF1098Statements) {
      this.updateF1098Statements = updateF1098Statements;
    }

    public static class UpdateF1098Statements {
      private StatementWithRecordNumber[] statements;

      public StatementWithRecordNumber[] getStatements() {
        return(statements);
      }
      public void setStatements(StatementWithRecordNumber[] statements) {
        this.statements = statements;
      }

      public static class StatementWithRecordNumber {
        private Integer recordNumber;
        private F1098ResponseStatement statement;

        public Integer getRecordNumber() {
          return(recordNumber);
        }
        public void setRecordNumber(Integer recordNumber) {
          this.recordNumber = recordNumber;
        }
        public F1098ResponseStatement getStatement() {
          return(statement);
        }
        public void setStatement(F1098ResponseStatement statement) {
          this.statement = statement;
        }
      } // StatementWithRecordNumber
    } // UpdateF1098Statements
  } // Data
} // UpdateF1098StatementsResponse
