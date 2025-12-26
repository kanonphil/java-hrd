package Test1_15;

public class Man {
  String name;
  int age;
  String address;

  public void initMan(String name, int age, String address) {
    this.name = name;
    this.age = age;
    this.address = address;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getAddress() {
    return address;
  }

  public void printAllData() {
    System.out.println("이름: " + name);
    System.out.println("나이: " + age);
    System.out.println("주소: " + address);
    System.out.println();
  }
}
