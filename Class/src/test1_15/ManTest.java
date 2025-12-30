package test1_15;

public class ManTest {
  public static void main(String[] args) {
    Man m1 = new Man();
    m1.initMan("name1", 20, "address1");
    m1.printAllData();

    Man m2 = new Man();
    m2.setName("name2");
    m2.setAge(30);
    m2.setAddress("address2");
    System.out.println("이름: " + m2.getName());
    System.out.println("나이: " + m2.getAge());
    System.out.println("주소: " + m2.getAddress());
    System.out.println();
  }
}
