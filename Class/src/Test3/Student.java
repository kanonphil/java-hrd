package Test3;

public class Student {
  private String name;
  private String age;
  private String phoneNumber;
  private String grade;

  public Student(String name, String age, String phoneNumber, String grade) {
    this.name = name;
    this.age = age;
    this.phoneNumber = phoneNumber;
    this.grade = grade;
  }

  public String getName() {
    return name;
  }

  public String getAge() {
    return age;
  }

  public String getGrade() {
    return grade;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
}
