public class Student {
  String name;
  int age;

  public Student() {
    name = "김자바";
    age = 20;
  }

  public void setInfo(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void displayInfo() {
    System.out.println("이름: " + this.name);
    System.out.println("나이: " + this.age);
  }
}
