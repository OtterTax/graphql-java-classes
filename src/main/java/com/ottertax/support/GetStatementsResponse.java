package com.ottertax.support;

import java.util.Date;

public class GetStatementsResponse {
  private Data data;

  public Data getData() {
    return(data);
  }
  public void setData(Data data) {
    this.data = data;
  }

  public static class Data {
    private GetStatements getStatements;

    public GetStatements getGetStatements() {
      return(getStatements);
    }
    public void setGetStatements(GetStatements getStatements) {
      this.getStatements = getStatements;
    }

    public static class GetStatements {
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
        private Statement[] nodes;

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
        public Statement[] getNodes() {
          return(nodes);
        }
        public void setNodes(Statement[] nodes) {
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
          private Statement statement;

          public String getCursor() {
            return(cursor);
          }
          public void setCursor(String cursor) {
            this.cursor = cursor;
          }
          public Statement getStatement() {
            return(statement);
          }
          public void setStatement(Statement statement) {
            this.statement = statement;
          }
        } // Edge
      } // Statements
    } // GetStatements
  } // Data
} // GetStatementsResponse
