package com.ottertax.support;

public class AddF5498StatementsResponse {
  private Data data;

  public Data getData() {
    return(data);
  }
  public void setData(Data data) {
    this.data = data;
  }

  public static class Data {
    private AddF5498Statements addF5498Statements;

    public AddF5498Statements getAddF5498Statements() {
      return(addF5498Statements);
    }
    public void setAddF5498Statements(AddF5498Statements addF5498Statements) {
      this.addF5498Statements = addF5498Statements;
    }

    public static class AddF5498Statements {
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
        private F5498ResponseStatement statement;
        private String[] messages;

        public Integer getRecordNumber() {
          return(recordNumber);
        }
        public void setRecordNumber(Integer recordNumber) {
          this.recordNumber = recordNumber;
        }
        public F5498ResponseStatement getStatement() {
          return(statement);
        }
        public void setStatement(F5498ResponseStatement statement) {
          this.statement = statement;
        }
        public String[] getMessages() {
          return(messages);
        }
        public void setMessages(String[] messages) {
          this.messages = messages;
        }
      } // StatementWithMessages
    } // AddF5498Statements
  } // Data
} // AddF5498StatementsResponse
