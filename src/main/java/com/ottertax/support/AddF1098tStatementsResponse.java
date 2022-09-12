package com.ottertax.support;

public class AddF1098tStatementsResponse {
  private Data data;

  public Data getData() {
    return(data);
  }
  public void setData(Data data) {
    this.data = data;
  }

  public static class Data {
    private AddF1098tStatements addF1098tStatements;

    public AddF1098tStatements getAddF1098tStatements() {
      return(addF1098tStatements);
    }
    public void setAddF1098tStatements(AddF1098tStatements addF1098tStatements) {
      this.addF1098tStatements = addF1098tStatements;
    }

    public static class AddF1098tStatements {
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
        private F1098tResponseStatement statement;
        private String[] messages;

        public Integer getRecordNumber() {
          return(recordNumber);
        }
        public void setRecordNumber(Integer recordNumber) {
          this.recordNumber = recordNumber;
        }
        public F1098tResponseStatement getStatement() {
          return(statement);
        }
        public void setStatement(F1098tResponseStatement statement) {
          this.statement = statement;
        }
        public String[] getMessages() {
          return(messages);
        }
        public void setMessages(String[] messages) {
          this.messages = messages;
        }
      } // StatementWithMessages
    } // AddF1098tStatements
  } // Data
} // AddF1098tStatementsResponse
