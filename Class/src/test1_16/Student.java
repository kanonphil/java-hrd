package test1_16;

public class Student {
  String name;
  int age;
  String address;
  int studentNumber;
  String phoneNumber;

  public void initStudent(String name, int age, String address, int studentNumber, String phoneNumber) {
    this.name = name;
    this.age = age;
    this.address = address;
    this.studentNumber = studentNumber;
    this.phoneNumber = phoneNumber;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getAddress() {
    return address;
  }

  public void setStudentNumber(int studentNumber) {
    this.studentNumber = studentNumber;
  }

  public int getStudentNumber() {
    return studentNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void print() {
    System.out.println("학생 정보");
    System.out.println("이름: " + name);
    System.out.println("나이: " + age);
    System.out.println("주소: " + address);
    System.out.println("학번: " + studentNumber);
    System.out.println("연락처: " + phoneNumber);
    System.out.println();
  }
}
