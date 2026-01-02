package practice_11;

public class Product {
  private int productId;
  private String description;
  private String producer;
  private int price;

  public Product(int productId, String description, String producer, int price) {
    this.productId = productId;
    this.description = description;
    this.producer = producer;
    this.price = price;
  }

  public void printInfo() {
    System.out.println("=== 상품 정보 ===");
    System.out.println("상품ID: " + productId);
    System.out.println("상품 설명: " + description);
    System.out.println("생산자: " + producer);
    System.out.println("가격: " + price);
  }
}
