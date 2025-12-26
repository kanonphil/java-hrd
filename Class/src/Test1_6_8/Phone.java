package Test1_6_8;

public class Phone {
  String manufacturer;
  String modelName;
  String color;
  int price;
  String phoneNumber;

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public void setModelName(String modelName) {
    this.modelName = modelName;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public void printAllData() {
    System.out.println("========== 휴대폰 정보 ===========");
    System.out.println("제조사: " + manufacturer);
    System.out.println("모델명: " + modelName);
    System.out.println("색상: " + color);
    System.out.println("가격: " + price);
    System.out.println("휴대폰 번호: " + phoneNumber);
  }
}
