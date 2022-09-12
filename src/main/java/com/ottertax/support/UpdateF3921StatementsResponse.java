package com.ottertax.support;

public class UpdateF3921StatementsResponse {
  private Data data;

  public Data getData() {
    return(data);
  }
  public void setData(Data data) {
    this.data = data;
  }

  public static class Data {
    private UpdateF3921Statements updateF3921Statements;

    public UpdateF3921Statements getUpdateF3921Statements() {
      return(updateF3921Statements);
    }
    public void setUpdateF3921Statements(UpdateF3921Statements updateF3921Statements) {
      this.updateF3921Statements = updateF3921Statements;
    }

    public static class UpdateF3921Statements {
      private StatementWithRecordNumber[] statements;

      public StatementWithRecordNumber[] getStatements() {
        return(statements);
      }
      public void setStatements(StatementWithRecordNumber[] statements) {
        this.statements = statements;
      }

      public static class StatementWithRecordNumber {
        private Integer recordNumber;
        private F3921ResponseStatement statement;

        public Integer getRecordNumber() {
          return(recordNumber);
        }
        public void setRecordNumber(Integer recordNumber) {
          this.recordNumber = recordNumber;
        }
        public F3921ResponseStatement getStatement() {
          return(statement);
        }
        public void setStatement(F3921ResponseStatement statement) {
          this.statement = statement;
        }
      } // StatementWithRecordNumber
    } // UpdateF3921Statements
  } // Data
} // UpdateF3921StatementsResponse
