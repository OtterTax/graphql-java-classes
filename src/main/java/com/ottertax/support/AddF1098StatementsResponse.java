package com.ottertax.support;

public class AddF1098StatementsResponse {
  private Data data;

  public Data getData() {
    return(data);
  }
  public void setData(Data data) {
    this.data = data;
  }

  public static class Data {
    private AddF1098Statements addF1098Statements;

    public AddF1098Statements getAddF1098Statements() {
      return(addF1098Statements);
    }
    public void setAddF1098Statements(AddF1098Statements addF1098Statements) {
      this.addF1098Statements = addF1098Statements;
    }

    public static class AddF1098Statements {
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
        private F1098ResponseStatement statement;
        private String[] messages;

        public Integer getRecordNumber() {
          return(recordNumber);
        }
        public void setRecordNumber(Integer recordNumber) {
          this.recordNumber = recordNumber;
        }
        public F1098ResponseStatement getStatement() {
          return(statement);
        }
        public void setStatement(F1098ResponseStatement statement) {
          this.statement = statement;
        }
        public String[] getMessages() {
          return(messages);
        }
        public void setMessages(String[] messages) {
          this.messages = messages;
        }
      } // StatementWithMessages
    } // AddF1098Statements
  } // Data
} // AddF1098StatementsResponse
