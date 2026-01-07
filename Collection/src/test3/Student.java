package test3;

public class Student {
  private String stuName;
  private int age;
  private int score;

  public Student(String name, int age, int score) {
    this.stuName = name;
    this.age = age;
    this.score = score;
  }

  public String getStuName() {
    return stuName;
  }

  public void setStuName(String stuName) {
    this.stuName = stuName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  @Override
  public String toString() {
    return "Student{" +
            "name='" + stuName + '\'' +
            ", age=" + age +
            ", score=" + score +
            '}';
  }
}
