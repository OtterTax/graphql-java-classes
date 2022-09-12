package com.ottertax.support;

public class StatementDefinitionsResponse {
  private Data data;

  public Data getData() {
    return(data);
  }
  public void setData(Data data) {
    this.data = data;
  }

  public static class Data {
    private StatementDefinitions statementDefinitions;

    public StatementDefinitions getStatementDefinitions() {
      return(statementDefinitions);
    }
    public void setStatementDefinitions(StatementDefinitions statementDefinitions) {
      this.statementDefinitions = statementDefinitions;
    }

    public static class StatementDefinitions {
      private Definition[] definitions;

      public Definition[] getDefinitions() {
        return(definitions);
      }
      public void setDefinitions(Definition[] definitions) {
        this.definitions = definitions;
      }

      public static class Definition {
        private String identifier;
        private String name;
        private String title;
        private String description;
        private String recipientName;
        private String senderName;
        private String blankForm;
        private Field[] fields;

        public String getIdentifier() {
          return(identifier);
        }
        public void setIdentifier(String identifier) {
          this.identifier = identifier;
        }
        public String getName() {
          return(name);
        }
        public void setName(String name) {
          this.name = name;
        }
        public String getTitle() {
          return(title);
        }
        public void setTitle(String title) {
          this.title = title;
        }
        public String getDescription() {
          return(description);
        }
        public void setDescription(String description) {
          this.description = description;
        }
        public String getRecipientName() {
          return(recipientName);
        }
        public void setRecipientName(String recipientName) {
          this.recipientName = recipientName;
        }
        public String getSenderName() {
          return(senderName);
        }
        public void setSenderName(String senderName) {
          this.senderName = senderName;
        }
        public String getBlankForm() {
          return(blankForm);
        }
        public void setBlankForm(String blankForm) {
          this.blankForm = blankForm;
        }
        public Field[] getFields() {
          return(fields);
        }
        public void setFields(Field[] fields) {
          this.fields = fields;
        }

        public static class Field {
          private String identifier;
          private String arrayType;
          private String boxLabel;
          private String boxNumber;
          private String dataType;
          private String description;
          private Integer fixedArrayLength;
          private Boolean frequentUse;
          private Integer maxArrayLength;
          private Integer maxStringLength;
          private String sampleValue;
          private Integer sortOrder;
          private Integer[] yearsUsed;

          public String getIdentifier() {
            return(identifier);
          }
          public void setIdentifier(String identifier) {
            this.identifier = identifier;
          }
          public String getArrayType() {
            return(arrayType);
          }
          public void setArrayType(String arrayType) {
            this.arrayType = arrayType;
          }
          public String getBoxLabel() {
            return(boxLabel);
          }
          public void setBoxLabel(String boxLabel) {
            this.boxLabel = boxLabel;
          }
          public String getBoxNumber() {
            return(boxNumber);
          }
          public void setBoxNumber(String boxNumber) {
            this.boxNumber = boxNumber;
          }
          public String getDataType() {
            return(dataType);
          }
          public void setDataType(String dataType) {
            this.dataType = dataType;
          }
          public String getDescription() {
            return(description);
          }
          public void setDescription(String description) {
            this.description = description;
          }
          public Integer getFixedArrayLength() {
            return(fixedArrayLength);
          }
          public void setFixedArrayLength(Integer fixedArrayLength) {
            this.fixedArrayLength = fixedArrayLength;
          }
          public Boolean getFrequentUse() {
            return(frequentUse);
          }
          public void setFrequentUse(Boolean frequentUse) {
            this.frequentUse = frequentUse;
          }
          public Integer getMaxArrayLength() {
            return(maxArrayLength);
          }
          public void setMaxArrayLength(Integer maxArrayLength) {
            this.maxArrayLength = maxArrayLength;
          }
          public Integer getMaxStringLength() {
            return(maxStringLength);
          }
          public void setMaxStringLength(Integer maxStringLength) {
            this.maxStringLength = maxStringLength;
          }
          public String getSampleValue() {
            return(sampleValue);
          }
          public void setSampleValue(String sampleValue) {
            this.sampleValue = sampleValue;
          }
          public Integer getSortOrder() {
            return(sortOrder);
          }
          public void setSortOrder(Integer sortOrder) {
            this.sortOrder = sortOrder;
          }
          public Integer[] getYearsUsed() {
            return(yearsUsed);
          }
          public void setYearsUsed(Integer[] yearsUsed) {
            this.yearsUsed = yearsUsed;
          }
        } // Field
      } // Definition
    } // StatementDefinitions
  } // Data
} // StatementDefinitionsResponse
