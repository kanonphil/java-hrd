package test1_9;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {
  public static void main(String[] args) {
    List<Student> studentList = new ArrayList<>();

    studentList.add(new Student("a", 90, 80, 170));
    studentList.add(new Student("b", 80, 60, 140));
    studentList.add(new Student("c", 65, 95, 160));

    System.out.println(studentList);

    for (Student student : studentList) {
      if (student.getTotal() >= 150) {
        System.out.println(student);
      }
    }
    System.out.println();

    for (Student student : studentList) {
      System.out.println(student.getName() + ": " + student.getAverage() + "점");
    }
    System.out.println();

    Student topStudent = studentList.get(0);
    for (Student student : studentList) {
      if (student.getTotal() > topStudent.getTotal()) {
        topStudent = student;
      }
    }

    System.out.println(topStudent);
  }
}
