package com.ottertax.support;

public class AddFw2StatementsResponse {
  private Data data;

  public Data getData() {
    return(data);
  }
  public void setData(Data data) {
    this.data = data;
  }

  public static class Data {
    private AddFw2Statements addFw2Statements;

    public AddFw2Statements getAddFw2Statements() {
      return(addFw2Statements);
    }
    public void setAddFw2Statements(AddFw2Statements addFw2Statements) {
      this.addFw2Statements = addFw2Statements;
    }

    public static class AddFw2Statements {
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
        private Fw2ResponseStatement statement;
        private String[] messages;

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
        public String[] getMessages() {
          return(messages);
        }
        public void setMessages(String[] messages) {
          this.messages = messages;
        }
      } // StatementWithMessages
    } // AddFw2Statements
  } // Data
} // AddFw2StatementsResponse
