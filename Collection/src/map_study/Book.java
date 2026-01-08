package map_study;

public class Book {
  private String title;
  private int price;
  private String author;

  public Book(String title, int price, String author) {
    this.title = title;
    this.price = price;
    this.author = author;
  }

  public String getTitle() {
    return title;
  }

  public int getPrice() {
    return price;
  }

  public String getAuthor() {
    return author;
  }
}
