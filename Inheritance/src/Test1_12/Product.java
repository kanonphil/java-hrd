package Test1_12;

public class Product {
  private String productId;
  private String description;
  private String manufacturer;
  private int price;

  public Product(String productId, String description, String manufacturer, int price) {
    this.productId = productId;
    this.description = description;
    this.manufacturer = manufacturer;
    this.price = price;
  }

  public void printInfo() {
    System.out.println("상품ID >> " + productId);
    System.out.println("상품 설명 >> " + description);
    System.out.println("생산자 >> " + manufacturer);
    System.out.println("가격 >> " + price);
  }

  public String getProductId() {
    return productId;
  }

  public String getDescription() {
    return description;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public int getPrice() {
    return price;
  }
}
