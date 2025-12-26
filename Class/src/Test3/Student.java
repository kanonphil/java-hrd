package Test3;

public class Student {
  private final String name;
  private final int age;
  private final String phoneNumber;
  private final String grade;

  public Student(String name, int age, String phoneNumber, String grade) {
    this.name = name;
    this.age = age;
    this.phoneNumber = phoneNumber;
    this.grade = grade;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getGrade() {
    return grade;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }
}
