package practice_11;

public class ConversationBook extends Book {
  private String language;

  public ConversationBook(int productId, String description, String producer, int price, String isbn, String bookAuthor, String bookTitle, String language) {
    super(productId, description, producer, price, isbn, bookAuthor, bookTitle);
    this.language = language;
  }

  @Override
  public void printInfo() {
    super.printInfo();
    System.out.println("언어: " + language);
  }
}
