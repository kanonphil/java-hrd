package Test1_6_8;

public class PhoneTest {
  public static void main(String[] args) {
    Phone p1 = new Phone();

    p1.manufacturer = "SAMSUNG";
    p1.modelName = "Galaxy S25";
    p1.color = "Black";
    p1.price = 100000;
    p1.phoneNumber = "000-0000-0000";

    System.out.println(p1.manufacturer);
    System.out.println(p1.modelName);
    System.out.println(p1.color);
    System.out.println(p1.price);
    System.out.println(p1.phoneNumber);

    Phone p2 = new Phone();
    p2.printAllData();
    p2.setManufacturer("Apple");
    p2.setModelName("iPhone 17 Pro");
    p2.setColor("White");
    p2.setPrice(10000);
    p2.setPhoneNumber("111-1111-1111");
    p2.printAllData();
  }
}
