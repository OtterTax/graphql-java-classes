package com.ottertax.support;

public class UpdateFw2StatementsResponse {
  private Data data;

  public Data getData() {
    return(data);
  }
  public void setData(Data data) {
    this.data = data;
  }

  public static class Data {
    private UpdateFw2Statements updateFw2Statements;

    public UpdateFw2Statements getUpdateFw2Statements() {
      return(updateFw2Statements);
    }
    public void setUpdateFw2Statements(UpdateFw2Statements updateFw2Statements) {
      this.updateFw2Statements = updateFw2Statements;
    }

    public static class UpdateFw2Statements {
      private StatementWithRecordNumber[] statements;

      public StatementWithRecordNumber[] getStatements() {
        return(statements);
      }
      public void setStatements(StatementWithRecordNumber[] statements) {
        this.statements = statements;
      }

      public static class StatementWithRecordNumber {
        private Integer recordNumber;
        private Fw2ResponseStatement statement;

        public Integer getRecordNumber() {
          return(recordNumber);
        }
        public void setRecordNumber(Integer recordNumber) {
          this.recordNumber = recordNumber;
        }
        public Fw2ResponseStatement getStatement() {
          return(statement);
        }
        public void setStatement(Fw2ResponseStatement statement) {
          this.statement = statement;
        }
      } // StatementWithRecordNumber
    } // UpdateFw2Statements
  } // Data
} // UpdateFw2StatementsResponse
