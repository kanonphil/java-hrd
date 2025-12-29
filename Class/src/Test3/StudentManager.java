package Test3;

import java.util.Scanner;

public class StudentManager {
  private Student[] students;
  private int studentCount;
  private Scanner sc;

  public StudentManager() {
    students = new Student[3];
    studentCount = 0;
    sc = new Scanner(System.in);
  }

  // 학생등록
  public void addStudent() {
    if (studentCount >= 3) {
      System.out.println("더 이상 학생을 등록할 수 없습니다.");
      return;
    }

    System.out.println("학생 등록을 시작합니다. 학생 정보를 입력하세요.");
    System.out.print("이름 : ");
    String name = sc.nextLine();
    System.out.print("나이 : ");
    String age = sc.nextLine();
    System.out.print("연락처 : ");
    String phoneNumber = sc.nextLine();
    System.out.print("학점 : ");
    String grade = sc.nextLine();

    // 이름 중복 확인
    for (int i = 0; i < studentCount; i++) {
      // 덮어쓰기
      if (students[i].getName().equals(name)) {
        students[i] = new Student(name, age, phoneNumber, grade);
        System.out.println();
        return;
      }
    }

    Student student = new Student(name, age, phoneNumber, grade);
    students[studentCount++] = student;
    System.out.println();
  }

  // 학생정보변경(연락처)
  public void changePhoneNumber() {
    System.out.println("학생의 연락처를 변경합니다.");
    System.out.print("변경 학생 : ");
    String name = sc.nextLine();

    // 입력된 이름의 학생 찾기
    Student targetStudent = null;
    for (int i = 0; i < studentCount; i++) {
      if (students[i].getName().equals(name)) {
        targetStudent = students[i];
        break;
      }
    }

    // 없다면
    if (targetStudent == null) {
      System.out.println("해당 학생을 찾을 수 없습니다.");
      return;
    }

    // 연락처 변경
    System.out.print("연락처 : ");
    String newPhoneNumber = sc.nextLine();

    targetStudent.setPhoneNumber(newPhoneNumber);
    System.out.println("변경 완료 되었습니다.");
    System.out.println();
  }

  // 학생 정보 출력
  public void printStudent() {
    System.out.print("정보를 열람할 학생 : ");
    String name = sc.nextLine();

    Student targetStudent = null;
    for (int i = 0; i < studentCount; i++) {
      if (students[i].getName().equals(name)) {
        targetStudent = students[i];
        break;
      }
    }

    if (targetStudent == null) {
      System.out.println("해당 학생을 찾을 수 없습니다.");
      return;
    }

    System.out.println("요청하신 학생의 정보입니다.");
    System.out.print("이름 : " + targetStudent.getName());
    System.out.print(", 나이 : " + targetStudent.getAge());
    System.out.print(", 연락처 : " + targetStudent.getPhoneNumber());
    System.out.println(", 학점 : " + targetStudent.getGrade());
    System.out.println();
  }

  // 모든 학생 정보 출력
  public void printAllStudent() {
    System.out.println("모든 학생의 정보입니다. 현재 총 학생 수는 " + studentCount + "명입니다.");
    for (int i = 0; i < studentCount; i++) {
      Student s = students[i];
      System.out.print("이름 : " + s.getName());
      System.out.print(", 나이 : " + s.getAge());
      System.out.println(", 학점 : " + s.getGrade());
    }
    System.out.println();
  }

  public void run() {
    while (true) {
      System.out.print("1)학생등록  2)학생정보변경(연락처)  3)학생정보출력  4)모든학생정보출력  5)프로그램 종료 : ");
      String choice = sc.nextLine();

      switch (choice) {
        case "1":
          addStudent();
          break;
        case "2":
          changePhoneNumber();
          break;
        case "3":
          printStudent();
          break;
        case "4":
          printAllStudent();
          break;
        case "5":
          System.out.println("프로그램을 종료합니다.");
          return;
        default:
          System.out.println("잘못된 입력입니다.");
      }
    }
  }
}
