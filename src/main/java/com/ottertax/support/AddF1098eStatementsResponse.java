package com.ottertax.support;

public class AddF1098eStatementsResponse {
  private Data data;

  public Data getData() {
    return(data);
  }
  public void setData(Data data) {
    this.data = data;
  }

  public static class Data {
    private AddF1098eStatements addF1098eStatements;

    public AddF1098eStatements getAddF1098eStatements() {
      return(addF1098eStatements);
    }
    public void setAddF1098eStatements(AddF1098eStatements addF1098eStatements) {
      this.addF1098eStatements = addF1098eStatements;
    }

    public static class AddF1098eStatements {
      private String[] errors;
      private StatementWithMessages[] statements;

      public String[] getErrors() {
        return(errors);
      }
      public void setErrors(String[] errors) {
        this.errors = errors;
      }
      public StatementWithMessages[] getStatements() {
        return(statements);
      }
      public void setStatements(StatementWithMessages[] statements) {
        this.statements = statements;
      }

      public static class StatementWithMessages {
        private Integer recordNumber;
        private F1098eResponseStatement statement;
        private String[] messages;

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
        public String[] getMessages() {
          return(messages);
        }
        public void setMessages(String[] messages) {
          this.messages = messages;
        }
      } // StatementWithMessages
    } // AddF1098eStatements
  } // Data
} // AddF1098eStatementsResponse
