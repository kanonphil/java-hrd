package test3;

import java.util.ArrayList;
import java.util.List;

public class StudyClass {
  private List<Student> students;
  private String className;
  private String tName;

  public StudyClass(String className, String tName, List<Student> students) {
    this.className = className;
    this.tName = tName;
    this.students = students;
  }

  //해당 반의 모든 학생의 모든 정보를 출력
  public void printAllStudent() {
    System.out.println(className + "반의 모든 학생의 정보를 출력합니다.");
    for (Student student : students) {
      System.out.println("이름: " + student.getStuName() + ", 나이: " + student.getAge() + ", 점수: " + student.getScore());
    }
    System.out.println();
  }

  //해당 반의 평균 성적을 리턴하는 기능
  public double scoreAvg() {
    return students.stream()
            .mapToInt(Student::getScore)
            .average()
            .orElse(0.0);
  }

  //해당 반에서 최고 성적을 지닌 학생을 리턴하는 기능
  public Student topScoreStu() {
    if (students.isEmpty()) {
      return null;
    }

    Student topStudent = students.get(0);

    for (Student student : students) {
      if (topStudent.getScore() < student.getScore()) {
        topStudent = student;
      }
    }

    return topStudent;
  }

  public String getClassName() {
    return className;
  }

  public String getTName() {
    return tName;
  }
}
