package com.ottertax.support;

public class AddF3921StatementsResponse {
  private Data data;

  public Data getData() {
    return(data);
  }
  public void setData(Data data) {
    this.data = data;
  }

  public static class Data {
    private AddF3921Statements addF3921Statements;

    public AddF3921Statements getAddF3921Statements() {
      return(addF3921Statements);
    }
    public void setAddF3921Statements(AddF3921Statements addF3921Statements) {
      this.addF3921Statements = addF3921Statements;
    }

    public static class AddF3921Statements {
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
        private F3921ResponseStatement statement;
        private String[] messages;

        public Integer getRecordNumber() {
          return(recordNumber);
        }
        public void setRecordNumber(Integer recordNumber) {
          this.recordNumber = recordNumber;
        }
        public F3921ResponseStatement getStatement() {
          return(statement);
        }
        public void setStatement(F3921ResponseStatement statement) {
          this.statement = statement;
        }
        public String[] getMessages() {
          return(messages);
        }
        public void setMessages(String[] messages) {
          this.messages = messages;
        }
      } // StatementWithMessages
    } // AddF3921Statements
  } // Data
} // AddF3921StatementsResponse
