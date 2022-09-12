package com.ottertax.support;

public class GetFw2StatementsResponse {
  private Data data;

  public Data getData() {
    return(data);
  }
  public void setData(Data data) {
    this.data = data;
  }

  public static class Data {
    private GetFw2Statements getFw2Statements;

    public GetFw2Statements getGetFw2Statements() {
      return(getFw2Statements);
    }
    public void setGetFw2Statements(GetFw2Statements getFw2Statements) {
      this.getFw2Statements = getFw2Statements;
    }

    public static class GetFw2Statements {
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
        private Fw2ResponseStatement[] nodes;

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
        public Fw2ResponseStatement[] getNodes() {
          return(nodes);
        }
        public void setNodes(Fw2ResponseStatement[] nodes) {
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
          private Fw2ResponseStatement statement;

          public String getCursor() {
            return(cursor);
          }
          public void setCursor(String cursor) {
            this.cursor = cursor;
          }
          public Fw2ResponseStatement getStatement() {
            return(statement);
          }
          public void setStatement(Fw2ResponseStatement statement) {
            this.statement = statement;
          }
        } // Edge
      } // Statements
    } // GetFw2Statements
  } // Data
} // GetFw2StatementsResponse
