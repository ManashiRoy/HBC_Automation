package hbc.locator;


public class PageElement {
      
      private String value;
      private String description;
      
      public PageElement(String value, String description) {
              this.value = value;
              this.description = description;
              }
      
      public String getValue() {
            return value;
      }
      public String getDescription() {
            return description;
      }

}
