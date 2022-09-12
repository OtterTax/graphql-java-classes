package com.ottertax.support;

public class UpdateF1098eStatementsResponse {
  private Data data;

  public Data getData() {
    return(data);
  }
  public void setData(Data data) {
    this.data = data;
  }

  public static class Data {
    private UpdateF1098eStatements updateF1098eStatements;

    public UpdateF1098eStatements getUpdateF1098eStatements() {
      return(updateF1098eStatements);
    }
    public void setUpdateF1098eStatements(UpdateF1098eStatements updateF1098eStatements) {
      this.updateF1098eStatements = updateF1098eStatements;
    }

    public static class UpdateF1098eStatements {
      private StatementWithRecordNumber[] statements;

      public StatementWithRecordNumber[] getStatements() {
        return(statements);
      }
      public void setStatements(StatementWithRecordNumber[] statements) {
        this.statements = statements;
      }

      public static class StatementWithRecordNumber {
        private Integer recordNumber;
        private F1098eResponseStatement statement;

        public Integer getRecordNumber() {
          return(recordNumber);
        }
        public void setRecordNumber(Integer recordNumber) {
          this.recordNumber = recordNumber;
        }
        public F1098eResponseStatement getStatement() {
          return(statement);
        }
        public void setStatement(F1098eResponseStatement statement) {
          this.statement = statement;
        }
      } // StatementWithRecordNumber
    } // UpdateF1098eStatements
  } // Data
} // UpdateF1098eStatementsResponse
