package com.ottertax.support;

public class AddF1099rStatementsResponse {
  private Data data;

  public Data getData() {
    return(data);
  }
  public void setData(Data data) {
    this.data = data;
  }

  public static class Data {
    private AddF1099rStatements addF1099rStatements;

    public AddF1099rStatements getAddF1099rStatements() {
      return(addF1099rStatements);
    }
    public void setAddF1099rStatements(AddF1099rStatements addF1099rStatements) {
      this.addF1099rStatements = addF1099rStatements;
    }

    public static class AddF1099rStatements {
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
        private F1099rResponseStatement statement;
        private String[] messages;

        public Integer getRecordNumber() {
          return(recordNumber);
        }
        public void setRecordNumber(Integer recordNumber) {
          this.recordNumber = recordNumber;
        }
        public F1099rResponseStatement getStatement() {
          return(statement);
        }
        public void setStatement(F1099rResponseStatement statement) {
          this.statement = statement;
        }
        public String[] getMessages() {
          return(messages);
        }
        public void setMessages(String[] messages) {
          this.messages = messages;
        }
      } // StatementWithMessages
    } // AddF1099rStatements
  } // Data
} // AddF1099rStatementsResponse
