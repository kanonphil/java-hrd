package Test1_6_8;

public class PhoneTest {
  public static void main(String[] args) {
    Phone phone = new Phone("삼성전자", "Galaxy S20 Ultra", "Black", 100000, "010-0000-0000");

    System.out.println("초기 휴대폰 정보");
    phone.printAllData();

    System.out.println("정보 변경");

    phone.setManufacturer("애플");
    phone.setModelName("iPhone 17 Pro");
    phone.setColor("White");
    phone.setPrice(200000);
    phone.setPhoneNumber("111-1111-1111");

    System.out.println("변경된 휴대폰 정보");
    phone.printAllData();
  }
}
