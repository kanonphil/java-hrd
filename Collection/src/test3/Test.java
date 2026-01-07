package test3;

public class Test {
  public static void main(String[] args) {
    School school = new School();

    school.printStudentsByTeacher("김선생");
    school.printAllAverage();
    school.printTopStudent();
    System.out.println("2반 평균: " + school.classAverage("2"));
  }
}
