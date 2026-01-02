package practice_11;

public class Book extends Product {
  private String isbn;
  private String bookAuthor;
  private String bookTitle;

  public Book(int productId, String description, String producer, int price, String isbn, String bookAuthor, String bookTitle) {
    super(productId, description, producer, price);
    this.isbn = isbn;
    this.bookAuthor = bookAuthor;
    this.bookTitle = bookTitle;
  }

  @Override
  public void printInfo() {
    super.printInfo();
    System.out.println("ISBN: " + isbn);
    System.out.println("책 제목: " + bookTitle);
    System.out.println("저자: " + bookAuthor);
  }
}
