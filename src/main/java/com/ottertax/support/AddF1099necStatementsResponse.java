package com.ottertax.support;

public class AddF1099necStatementsResponse {
  private Data data;

  public Data getData() {
    return(data);
  }
  public void setData(Data data) {
    this.data = data;
  }

  public static class Data {
    private AddF1099necStatements addF1099necStatements;

    public AddF1099necStatements getAddF1099necStatements() {
      return(addF1099necStatements);
    }
    public void setAddF1099necStatements(AddF1099necStatements addF1099necStatements) {
      this.addF1099necStatements = addF1099necStatements;
    }

    public static class AddF1099necStatements {
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
        private F1099necResponseStatement statement;
        private String[] messages;

        public Integer getRecordNumber() {
          return(recordNumber);
        }
        public void setRecordNumber(Integer recordNumber) {
          this.recordNumber = recordNumber;
        }
        public F1099necResponseStatement getStatement() {
          return(statement);
        }
        public void setStatement(F1099necResponseStatement statement) {
          this.statement = statement;
        }
        public String[] getMessages() {
          return(messages);
        }
        public void setMessages(String[] messages) {
          this.messages = messages;
        }
      } // StatementWithMessages
    } // AddF1099necStatements
  } // Data
} // AddF1099necStatementsResponse
