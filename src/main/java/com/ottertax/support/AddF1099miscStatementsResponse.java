package com.ottertax.support;

public class AddF1099miscStatementsResponse {
  private Data data;

  public Data getData() {
    return(data);
  }
  public void setData(Data data) {
    this.data = data;
  }

  public static class Data {
    private AddF1099miscStatements addF1099miscStatements;

    public AddF1099miscStatements getAddF1099miscStatements() {
      return(addF1099miscStatements);
    }
    public void setAddF1099miscStatements(AddF1099miscStatements addF1099miscStatements) {
      this.addF1099miscStatements = addF1099miscStatements;
    }

    public static class AddF1099miscStatements {
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
        private F1099miscResponseStatement statement;
        private String[] messages;

        public Integer getRecordNumber() {
          return(recordNumber);
        }
        public void setRecordNumber(Integer recordNumber) {
          this.recordNumber = recordNumber;
        }
        public F1099miscResponseStatement getStatement() {
          return(statement);
        }
        public void setStatement(F1099miscResponseStatement statement) {
          this.statement = statement;
        }
        public String[] getMessages() {
          return(messages);
        }
        public void setMessages(String[] messages) {
          this.messages = messages;
        }
      } // StatementWithMessages
    } // AddF1099miscStatements
  } // Data
} // AddF1099miscStatementsResponse
