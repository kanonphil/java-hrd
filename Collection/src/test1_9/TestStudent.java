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
  }
}
