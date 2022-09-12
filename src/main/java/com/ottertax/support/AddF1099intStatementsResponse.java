package com.ottertax.support;

public class AddF1099intStatementsResponse {
  private Data data;

  public Data getData() {
    return(data);
  }
  public void setData(Data data) {
    this.data = data;
  }

  public static class Data {
    private AddF1099intStatements addF1099intStatements;

    public AddF1099intStatements getAddF1099intStatements() {
      return(addF1099intStatements);
    }
    public void setAddF1099intStatements(AddF1099intStatements addF1099intStatements) {
      this.addF1099intStatements = addF1099intStatements;
    }

    public static class AddF1099intStatements {
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
        private F1099intResponseStatement statement;
        private String[] messages;

        public Integer getRecordNumber() {
          return(recordNumber);
        }
        public void setRecordNumber(Integer recordNumber) {
          this.recordNumber = recordNumber;
        }
        public F1099intResponseStatement getStatement() {
          return(statement);
        }
        public void setStatement(F1099intResponseStatement statement) {
          this.statement = statement;
        }
        public String[] getMessages() {
          return(messages);
        }
        public void setMessages(String[] messages) {
          this.messages = messages;
        }
      } // StatementWithMessages
    } // AddF1099intStatements
  } // Data
} // AddF1099intStatementsResponse
