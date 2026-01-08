package test3;

import java.util.ArrayList;
import java.util.List;

public class Test {
  public static void main(String[] args) {
    List<Student> students1 = new ArrayList<>();
    students1.add(new Student("aaa", 20, 90));
    students1.add(new Student("bbb", 22, 70));
    students1.add(new Student("ccc", 25, 80));

    List<Student> students2 = new ArrayList<>();
    students2.add(new Student("ddd", 21, 85));
    students2.add(new Student("eee", 23, 75));
    students2.add(new Student("fff", 24, 95));

    List<Student> students3 = new ArrayList<>();
    students3.add(new Student("ggg", 22, 88));
    students3.add(new Student("hhh", 20, 92));
    students3.add(new Student("iii", 21, 78));

    List<StudyClass> classList = new ArrayList<>();
    classList.add(new StudyClass("1", "김선생", students1));
    classList.add(new StudyClass("2", "이선생", students2));
    classList.add(new StudyClass("3", "김선생", students3));

    School school = new School(classList);

    school.printStudentsByTeacher("김선생");
    school.printAllAverage();
    school.printTopStudent();
    System.out.println("2반 평균: " + school.classAverage("2"));




  }
}
