package test3;

public class Student {
  private String id;
  private String name;
  private String age;
  private String phoneNumber;
  private String grade;

  public Student(String id, String name, String age, String phoneNumber, String grade) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.phoneNumber = phoneNumber;
    this.grade = grade;
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getAge() {
    return age;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public String getGrade() {
    return grade;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
}
