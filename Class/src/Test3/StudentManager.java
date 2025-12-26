package Test3;

import java.util.Scanner;

public class StudentManager {
  private final Student[] students;
  private int studentCount;
  private final Scanner sc;

  public StudentManager() {
    students = new Student[3];
    studentCount = 0;
    sc = new Scanner(System.in);
  }

  public void addStudent() {
    if (studentCount >= 3) {
      System.out.println("더 이상 학생을 등록할 수 없습니다.");
      return;
    }

    System.out.println("학생 등록을 시작합니다. 학생 정보를 입력하세요.");
    System.out.print("이름 : ");
    String name = sc.nextLine();
    System.out.print("나이 : ");
    int age = sc.nextInt();
    System.out.print("연락처 : ");
    String phoneNumber = sc.nextLine();
    System.out.print("학점 : ");
    String grade = sc.nextLine();

    Student student = new Student(name, age, phoneNumber, grade);
    students[studentCount++] = student;
  }

  public void fixPhoneNumber() {
    System.out.println("학생의 연락처를 변경합니다.");
    System.out.print("변경 학생 : ");
    String name = sc.nextLine();
    if (name.equals(students.getName()))
    System.out.print("연락처 : ");
  }
}
