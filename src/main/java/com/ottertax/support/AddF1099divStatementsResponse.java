package com.ottertax.support;

public class AddF1099divStatementsResponse {
  private Data data;

  public Data getData() {
    return(data);
  }
  public void setData(Data data) {
    this.data = data;
  }

  public static class Data {
    private AddF1099divStatements addF1099divStatements;

    public AddF1099divStatements getAddF1099divStatements() {
      return(addF1099divStatements);
    }
    public void setAddF1099divStatements(AddF1099divStatements addF1099divStatements) {
      this.addF1099divStatements = addF1099divStatements;
    }

    public static class AddF1099divStatements {
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
        private F1099divResponseStatement statement;
        private String[] messages;

        public Integer getRecordNumber() {
          return(recordNumber);
        }
        public void setRecordNumber(Integer recordNumber) {
          this.recordNumber = recordNumber;
        }
        public F1099divResponseStatement getStatement() {
          return(statement);
        }
        public void setStatement(F1099divResponseStatement statement) {
          this.statement = statement;
        }
        public String[] getMessages() {
          return(messages);
        }
        public void setMessages(String[] messages) {
          this.messages = messages;
        }
      } // StatementWithMessages
    } // AddF1099divStatements
  } // Data
} // AddF1099divStatementsResponse
