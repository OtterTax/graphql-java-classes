package com.ottertax.support;

public class UpdateF1099divStatementsResponse {
  private Data data;

  public Data getData() {
    return(data);
  }
  public void setData(Data data) {
    this.data = data;
  }

  public static class Data {
    private UpdateF1099divStatements updateF1099divStatements;

    public UpdateF1099divStatements getUpdateF1099divStatements() {
      return(updateF1099divStatements);
    }
    public void setUpdateF1099divStatements(UpdateF1099divStatements updateF1099divStatements) {
      this.updateF1099divStatements = updateF1099divStatements;
    }

    public static class UpdateF1099divStatements {
      private StatementWithRecordNumber[] statements;

      public StatementWithRecordNumber[] getStatements() {
        return(statements);
      }
      public void setStatements(StatementWithRecordNumber[] statements) {
        this.statements = statements;
      }

      public static class StatementWithRecordNumber {
        private Integer recordNumber;
        private F1099divResponseStatement statement;

        public Integer getRecordNumber() {
          return(recordNumber);
        }
        public void setRecordNumber(Integer recordNumber) {
          this.recordNumber = recordNumber;
        }
        public F1099divResponseStatement getStatement() {
          return(statement);
        }
        public void setStatement(F1099divResponseStatement statement) {
          this.statement = statement;
        }
      } // StatementWithRecordNumber
    } // UpdateF1099divStatements
  } // Data
} // UpdateF1099divStatementsResponse
