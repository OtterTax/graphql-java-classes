package com.ottertax.support;

public class GetF5498StatementsResponse {
  private Data data;

  public Data getData() {
    return(data);
  }
  public void setData(Data data) {
    this.data = data;
  }

  public static class Data {
    private GetF5498Statements getF5498Statements;

    public GetF5498Statements getGetF5498Statements() {
      return(getF5498Statements);
    }
    public void setGetF5498Statements(GetF5498Statements getF5498Statements) {
      this.getF5498Statements = getF5498Statements;
    }

    public static class GetF5498Statements {
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
        private F5498ResponseStatement[] nodes;

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
        public F5498ResponseStatement[] getNodes() {
          return(nodes);
        }
        public void setNodes(F5498ResponseStatement[] nodes) {
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
          private F5498ResponseStatement statement;

          public String getCursor() {
            return(cursor);
          }
          public void setCursor(String cursor) {
            this.cursor = cursor;
          }
          public F5498ResponseStatement getStatement() {
            return(statement);
          }
          public void setStatement(F5498ResponseStatement statement) {
            this.statement = statement;
          }
        } // Edge
      } // Statements
    } // GetF5498Statements
  } // Data
} // GetF5498StatementsResponse
