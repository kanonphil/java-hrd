package Test1_12;

public class Book extends Product {
  private String isbn;
  private String author;
  private String title;

  public Book(String productId, String description, String manufacturer, int price,
              String isbn, String author, String title) {
    super(productId, description, manufacturer, price);
    this.isbn = isbn;
    this.author = author;
    this.title = title;
  }

  @Override
  public void printInfo() {
    super.printInfo();
    System.out.println("ISBN >> " + isbn);
    System.out.println("저자 >> " + author);
    System.out.println("책 제목 >> " + title);
  }

  public String getIsbn() {
    return isbn;
  }

  public String getAuthor() {
    return author;
  }

  public String getTitle() {
    return title;
  }
}
