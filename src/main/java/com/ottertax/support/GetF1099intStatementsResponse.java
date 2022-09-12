package com.ottertax.support;

public class GetF1099intStatementsResponse {
  private Data data;

  public Data getData() {
    return(data);
  }
  public void setData(Data data) {
    this.data = data;
  }

  public static class Data {
    private GetF1099intStatements getF1099intStatements;

    public GetF1099intStatements getGetF1099intStatements() {
      return(getF1099intStatements);
    }
    public void setGetF1099intStatements(GetF1099intStatements getF1099intStatements) {
      this.getF1099intStatements = getF1099intStatements;
    }

    public static class GetF1099intStatements {
      private String[] errors;
      private Statements statements;

      public String[] getErrors() {
        return(errors);
      }
      public void setErrors(String[] errors) {
        this.errors = errors;
      }
      public Statements getStatements() {
        return(statements);
      }
      public void setStatements(Statements statements) {
        this.statements = statements;
      }

      public static class Statements {
        private PageInfo pageInfo;
        private Edge[] edges;
        private F1099intResponseStatement[] nodes;

        public PageInfo getPageInfo() {
          return(pageInfo);
        }
        public void setPageInfo(PageInfo pageInfo) {
          this.pageInfo = pageInfo;
        }
        public Edge[] getEdges() {
          return(edges);
        }
        public void setEdges(Edge[] edges) {
          this.edges = edges;
        }
        public F1099intResponseStatement[] getNodes() {
          return(nodes);
        }
        public void setNodes(F1099intResponseStatement[] nodes) {
          this.nodes = nodes;
        }

        public static class PageInfo {
          private Boolean hasNextPage;
          private String endCursor;
          private Boolean hasPreviousPage;
          private String startCursor;

          public Boolean getHasNextPage() {
            return(hasNextPage);
          }
          public void setHasNextPage(Boolean hasNextPage) {
            this.hasNextPage = hasNextPage;
          }
          public String getEndCursor() {
            return(endCursor);
          }
          public void setEndCursor(String endCursor) {
            this.endCursor = endCursor;
          }
          public Boolean getHasPreviousPage() {
            return(hasPreviousPage);
          }
          public void setHasPreviousPage(Boolean hasPreviousPage) {
            this.hasPreviousPage = hasPreviousPage;
          }
          public String getStartCursor() {
            return(startCursor);
          }
          public void setStartCursor(String startCursor) {
            this.startCursor = startCursor;
          }
        } // PageInfo

        public static class Edge {
          private String cursor;
          private F1099intResponseStatement statement;

          public String getCursor() {
            return(cursor);
          }
          public void setCursor(String cursor) {
            this.cursor = cursor;
          }
          public F1099intResponseStatement getStatement() {
            return(statement);
          }
          public void setStatement(F1099intResponseStatement statement) {
            this.statement = statement;
          }
        } // Edge
      } // Statements
    } // GetF1099intStatements
  } // Data
} // GetF1099intStatementsResponse
