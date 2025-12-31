package stu;

import java.util.Scanner;

public class StudentService {
  private Student[] students;
  private int studentCount;
  private Scanner sc;

  public StudentService() {
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
    System.out.print("학번 : ");
    String id = sc.nextLine();

    // 학번 중복 확인
    for (int i = 0; i < studentCount; i++) {
      if (students[i].getId().equals(id)) {
        System.out.println("이미 등록된 학생입니다.");
        return;
      }
    }

    System.out.print("이름 : ");
    String name = sc.nextLine();

    System.out.print("나이 : ");
    String age = sc.nextLine();

    System.out.print("연락처 : ");
    String phoneNumber = sc.nextLine();

    //연락처 중복 확인
    for (int i = 0; i < studentCount; i++) {
      if (students[i].getPhoneNumber().equals(phoneNumber)) {
        System.out.println("동일한 연락처가 존재합니다.");
        return;
      }
    }

    System.out.print("학점 : ");
    String grade = sc.nextLine();

    Student student = new Student(id, name, age, phoneNumber, grade);
    students[studentCount++] = student;
    System.out.println();
  }

  // 이름으로 학생 찾기 (여러 명 가능)
  private Student[] findStudentsByName(String name) {
    Student[] foundStudents = new Student[studentCount];
    int foundCount = 0;

    for (int i = 0; i < studentCount; i++) {
      if (students[i].getName().equals(name)) {
        foundStudents[foundCount++] = students[i];
      }
    }

    // 찾은 학생들만 담은 배열 반환
    Student[] result = new Student[foundCount];
    System.arraycopy(foundStudents, 0, result, 0, foundCount);
    return result;

    //return Arrays.copyOf(foundStudents, foundCount);
    //Arrays.copyOf: 새로운 배열 생성 가능, 전부 복사하거나 복사 대상의 객체를 유지시킬 필요가 없을 때 사용 추천.
    //System.arraycopy(): 복사 길이를 명시해야 하거나, 객체를 유지하고자 할 때 사용 추천.

    /*
    Student[] result = new Student[foundCount];
    for (int i = 0; i < foundCount; i++) {
      result[i] = foundStudents[i];
    }
    return result;
    */
  }

  // 동명이인 중 학번으로 선택
  private Student selectStudentById(Student[] candidates) {
    System.out.println("동명이인이 " + candidates.length + "명 있습니다.");
    for (int i = 0; i < candidates.length; i++) {
      System.out.println((i + 1) + ") 학번: " + candidates[i].getId() +
              ", 나이: " + candidates[i].getAge() +
              ", 학점: " + candidates[i].getGrade());
    }

    System.out.print("학번을 입력하세요 : ");
    String id = sc.nextLine();

    for (Student candidate : candidates) {
      if (candidate.getId().equals(id)) {
        return candidate;
      }
    }

    System.out.println("입력한 학번이 목록에 없습니다.");
    return null;
  }

  // 학생정보변경(연락처)
  public void changePhoneNumber() {
    System.out.println("학생의 연락처를 변경합니다.");
    for (int i = 0; i < studentCount; i++) {
      System.out.println(i + 1 + ") " + students[i].getName());
    }
    System.out.print("변경 학생 이름 : ");
//    String id = sc.nextLine();
    String name = sc.nextLine();

    // 이름으로 학생 찾기
    Student[] foundStudents = findStudentsByName(name);

    if (foundStudents.length == 0) {
      System.out.println("해당 학생을 찾을 수 없습니다.");
      return;
    }

    Student targetStudent;
    if (foundStudents.length == 1) {
      // 한 명만 있으면 바로 선택
      targetStudent = foundStudents[0];
    }
    else {
      // 여러 명이면 학번으로 선택
      targetStudent = selectStudentById(foundStudents);
      if (targetStudent == null) {
        return;
      }
    }

    System.out.println("기존 연락처 : " + targetStudent.getPhoneNumber());
    // 연락처 변경
    System.out.print("변경 연락처 : ");
    String newPhoneNumber = sc.nextLine();

    for (int i = 0; i < studentCount; i++) {
      if (students[i].getPhoneNumber().equals(newPhoneNumber)) {
        System.out.println("동일한 연락처가 존재합니다.");
        return;
      }
    }

    targetStudent.setPhoneNumber(newPhoneNumber);
    System.out.println("변경 완료 되었습니다.");
    System.out.println();

    /*// 입력된 학번의 학생 찾기
    Student targetStudent = null;
    for (int i = 0; i < studentCount; i++) {
      if (students[i].getId().equals(id)) {
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
    System.out.println();*/
  }

  // 학생 정보 출력
  public void printStudent() {
    System.out.print("정보를 열람할 학생의 이름 : ");
    String name = sc.nextLine();

    // 이름으로 학생 찾기
    Student[] foundStudents = findStudentsByName(name);

    if (foundStudents.length == 0) {
      System.out.println("해당 학생을 찾을 수 없습니다.");
      return;
    }

    Student targetStudent;
    if (foundStudents.length == 1) {
      targetStudent = foundStudents[0];
    }
    else {
      targetStudent = selectStudentById(foundStudents);
      if (targetStudent == null) {
        return;
      }
    }


    /*Student targetStudent = null;
    for (int i = 0; i < studentCount; i++) {
      if (students[i].getId().equals(id)) {
        targetStudent = students[i];
        break;
      }
    }

    if (targetStudent == null) {
      System.out.println("해당 학생을 찾을 수 없습니다.");
      return;
    }*/

    System.out.println("요청하신 학생의 정보입니다.");
    System.out.print("학번 : " + targetStudent.getId());
    System.out.print(", 이름 : " + targetStudent.getName());
    System.out.print(", 나이 : " + targetStudent.getAge());
    System.out.print(", 연락처 : " + targetStudent.getPhoneNumber());
    System.out.println(", 학점 : " + targetStudent.getGrade());
    System.out.println();
  }

  // 모든 학생 정보 출력
  public void printAllStudent() {
    if (studentCount == 0) {
      System.out.println("등록된 학생이 없습니다.");
      System.out.println();
      return;
    }

    System.out.println("모든 학생의 정보입니다. 현재 총 학생 수는 " + studentCount + "명입니다.");
    for (int i = 0; i < studentCount; i++) {
      Student s = students[i];
      System.out.print("학번 : " + s.getId());
      System.out.print(", 이름 : " + s.getName());
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
          sc.close();
          return;
        default:
          System.out.println("잘못된 입력입니다.");
      }
    }
  }
}
