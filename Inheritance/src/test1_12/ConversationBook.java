package test1_12;

public class ConversationBook extends Book {
  private String language;

  public ConversationBook(int productId, String description, String manufacturer, int price,
                          String isbn, String author, String title, String language) {
    super(productId, description, manufacturer, price, isbn, author, title);
    this.language = language;
  }

  @Override
  public void printInfo() {
    super.printInfo();
    System.out.println("언어 >> " + language);
  }

  public String getLanguage() {
    return language;
  }
}
