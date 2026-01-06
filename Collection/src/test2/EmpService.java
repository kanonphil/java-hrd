package test2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpService {
  private List<Emp> empList;
  private Scanner sc;

  public EmpService() {
    empList = new ArrayList<>();
    sc = new Scanner(System.in);

    empList.add(new Emp(1001, "홍길동", "개발부", "010-1111-2222", 3500000));
    empList.add(new Emp(1002, "김철수", "영업부", "010-2222-3333", 3000000));
    empList.add(new Emp(1003, "이영희", "인사부", "010-3333-4444", 3200000));
    empList.add(new Emp(1004, "박민수", "개발부", "010-4444-5555", 4000000));
    empList.add(new Emp(1005, "최지영", "마케팅부", "010-5555-6666", 3300000));
    empList.add(new Emp(1006, "정수현", "개발부", "010-6666-7777", 3800000));
    empList.add(new Emp(1007, "강민호", "영업부", "010-7777-8888", 2900000));
    empList.add(new Emp(1008, "윤서연", "인사부", "010-8888-9999", 3100000));
  }

  //login
  public void login() {
    while (true) {
      System.out.print("사번 : ");
      int empNo = sc.nextInt();
      sc.nextLine();
      System.out.print("비밀번호(연락처의 마지막 4자리) : ");
      String password = sc.nextLine();

      //사번으로 직원 찾기
      Emp foundEmp = null;
      for (Emp emp : empList) {
        if (emp.getEmpNo() == empNo) {
          foundEmp = emp;
          break;
        }
      }

      //사원이 없거나 비밀번호가 틀린 경우
      if (foundEmp == null) {
        System.out.println("사번 혹은 비밀번호가 일치하지 않습니다.");
        continue;
      }

      //연락처의 마지막 4자리 추출
      String phone = foundEmp.getPhone();
      String last4Digits = phone.substring(phone.length() - 4);

      //비밀번호 확인
      if (password.equals(last4Digits)) {
        System.out.println("로그인 하였습니다.");
        System.out.println("'" + foundEmp.getName() + "'님 반갑습니다.");
        break;
      }
      else {
        System.out.println("사번 혹은 비밀번호가 일치하지 않습니다.");
        continue;
      }
    }
  }

  //부서별 월급 정보
  public void printDeptSalary() {
    System.out.print("부서명 : ");
    String dept = sc.nextLine();

    System.out.println("==" + dept + " 월급 현황==");

    int totalSalary = 0;
    int count = 0;

    for (Emp emp : empList) {
      if (emp.getDept().equals(dept)) {
        System.out.println("이름 : " + emp.getName() + ", 월급 : " + emp.getSalary());
        totalSalary += emp.getSalary();
        count++;
      }
    }

    if (count > 0) {
      int avg = totalSalary / count;
      System.out.println(dept + "서의 월급 총액은 " + totalSalary + "원이며, 평균 급여는 " + avg + "입니다.");
    }
    else {
      System.out.println("해당 부서의 사원이 없습니다.");
    }
  }

  //부서별 월급 인상
  public void raiseDeptSalary() {
    System.out.print("부서명 : ");
    String dept = sc.nextLine();
    System.out.print("인상급여 : ");
    int raise = sc.nextInt();
    sc.nextLine();

    System.out.println(dept + " 각 사원의 급여가 각각 " + raise + "원씩 인상됩니다.");

    //월급 인상
    for (Emp emp : empList) {
      if (emp.getDept().equals(dept)) {
        emp.setSalary(emp.getSalary() + raise);
      }
    }

    //인상 후 출력
    System.out.println("==월급 인상 후 " + dept + " 월급 현황==");
    for (Emp emp : empList) {
      if (emp.getDept().equals(dept)) {
        System.out.println("이름 : " + emp.getName() + ", 월급 : " + emp.getSalary());
      }
    }
  }

  public void run() {
    while (true) {
      System.out.println("\n==== 사원 관리 시스템 ====");
      System.out.println("1. 로그인, 2. 부서별 월급 조회, 3. 부서별 월급 인상 , 4. 프로그램 종료");
      System.out.print("메뉴 입력: ");
      int choice = sc.nextInt();
      sc.nextLine();

      switch (choice) {
        case 1:
          login();
          break;
        case 2:
          printDeptSalary();
          break;
        case 3:
          raiseDeptSalary();
          break;
        case 4:
          System.out.println("프로그램 종료");
          return;
        default:
          System.out.println("잘못된 입력입니다.");
      }
    }
  }
}
