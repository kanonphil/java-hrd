package test4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BankService {
  private List<Customer> customers;
  private Scanner sc;

  public BankService() {
    customers = new ArrayList<>();
    sc = new Scanner(System.in);
  }

  //계좌개설
  public void createAccount() {
    System.out.println("계좌개설을 시작합니다.");
    System.out.print("이름 : ");
    String name = sc.nextLine();
    System.out.print("주민등록번호 : ");
    String rrn = sc.nextLine();
    System.out.print("연락처 : ");
    String phone = sc.nextLine();
    System.out.print("계좌번호 : ");
    String accNum = sc.nextLine();

    Customer customer = new Customer(name, rrn, phone, accNum);
    customers.add(customer);
    System.out.println();
  }

  //입금
  public void deposit() {
    System.out.print("입금계좌번호 : ");
    String accNum = sc.nextLine();

    boolean found = false;

    for (Customer customer : customers) {
      if (customer.getAccount().getAccountNumber().equals(accNum)) {
        found = true;
        System.out.print("현재 총 예금액은 " + customer.getAccount().getBalance() + "원입니다. 예금액을 입력하세요 : ");
        int amount = sc.nextInt();
        sc.nextLine();

        if (amount > 0) {
          customer.getAccount().deposit(amount);
          System.out.println("정상 입금되었습니다. 현재 총 예금액은 " + customer.getAccount().getBalance() + "원입니다.");
        }
        else {
          System.out.println("0원 이하는 입금할 수 없습니다.");
        }
        break;
      }
    }

    if (!found) {
      System.out.println("해당 계좌를 찾을 수 없습니다.");
    }
    System.out.println();
  }

  //출금
  public void withdraw() {
    System.out.print("출금계좌번호 : ");
    String accNum = sc.nextLine();

    boolean found = false;

    for (Customer customer : customers) {
      if (customer.getAccount().getAccountNumber().equals(accNum)) {
        found = true;
        System.out.print("현재 총 예금액은 " + customer.getAccount().getBalance() + "원 입니다. 출금액을 입력하세요 : ");
        int amount = sc.nextInt();
        sc.nextLine();

        if (customer.getAccount().withdraw(amount)) {
          System.out.println("정상 출금되었습니다. 현재 총 예금액은 " + customer.getAccount().getBalance() + "원입니다.");
        }
        else {
          System.out.println("잔액이 부족합니다.");
        }
        break;
      }
    }

    if (!found) {
      System.out.println("해당 계좌를 찾을 수 없습니다.");
    }
    System.out.println();
  }

  //예금조회
  public void printBalance() {
    System.out.print("계좌번호 : ");
    String accNum = sc.nextLine();

    boolean found = false;

    for (Customer customer : customers) {
      if (customer.getAccount().getAccountNumber().equals(accNum)) {
        found = true;
        System.out.println("현재 총 예금액은 " + customer.getAccount().getBalance() + "원입니다.");
        break;
      }
    }

    if (!found) {
      System.out.println("해당 계좌를 찾을 수 없습니다.");
    }
    System.out.println();
  }

  //계좌해지
  public void closeAccount() {
    System.out.print("해지계좌번호 : ");
    String accNum = sc.nextLine();

    boolean found = false;

    Iterator<Customer> iterator = customers.iterator();
    while (iterator.hasNext()) {
      Customer customer = iterator.next();
      if (customer.getAccount().getAccountNumber().equals(accNum)) {
        found = true;
        System.out.print(customer.getName() + "님의 계좌를 해지합니다.");
        iterator.remove();
        break;
      }
    }

    if (!found) {
      System.out.println("해당 계좌를 찾을 수 없습니다.");
    }
    System.out.println();
  }

  //전체 정보(고객정보, 계좌정보)
  public void printAll() {
    for (Customer customer : customers) {
      System.out.println("이름 : " + customer.getName() + ", 주번 : " + customer.getRrn() + ", 연락처 : " + customer.getPhoneNumber() + ", 계좌번호 : " + customer.getAccount().getAccountNumber() + ", 예금액 : " + customer.getAccount().getBalance());
    }
  }

  //실행
  public void run() {
    while (true) {
      System.out.print("1.계좌개설, 2.입금, 3.출금, 4.예금조회, 5.계좌해지, 6.전체조회 => ");
      int choice = sc.nextInt();
      sc.nextLine();

      switch (choice) {
        case 1:
          createAccount();
          break;
        case 2:
          deposit();
          break;
        case 3:
          withdraw();
          break;
        case 4:
          printBalance();
          break;
        case 5:
          closeAccount();
          break;
        case 6:
          printAll();
          break;
        case 0:
          System.out.println("프로그램을 종료합니다.");
          return;
        default:
          System.out.println("잘못된 입력입니다.");
      }
    }
  }
}
