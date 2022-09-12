package com.ottertax.support;

public class AddF3922StatementsResponse {
  private Data data;

  public Data getData() {
    return(data);
  }
  public void setData(Data data) {
    this.data = data;
  }

  public static class Data {
    private AddF3922Statements addF3922Statements;

    public AddF3922Statements getAddF3922Statements() {
      return(addF3922Statements);
    }
    public void setAddF3922Statements(AddF3922Statements addF3922Statements) {
      this.addF3922Statements = addF3922Statements;
    }

    public static class AddF3922Statements {
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
        private F3922ResponseStatement statement;
        private String[] messages;

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
        public String[] getMessages() {
          return(messages);
        }
        public void setMessages(String[] messages) {
          this.messages = messages;
        }
      } // StatementWithMessages
    } // AddF3922Statements
  } // Data
} // AddF3922StatementsResponse
