import java.util.Scanner;

public class BankService {
  private final Customer[] customers;
  private int customerCount;
  private final Scanner sc;

  public BankService() {
    customers = new Customer[5];
    customerCount = 0;
    sc = new Scanner(System.in);
  }

  public void openAccount() {
    if (customerCount >= 5) {
      System.out.println("더 이상 고객을 등록할 수 없습니다.");
      return;
    }

    System.out.println("개좌개설을 시작합니다.");
    System.out.print("이름 : ");
    String name = sc.nextLine();

    System.out.print("주민등록번호 : ");
    String residentNumber = sc.nextLine();

    System.out.print("전화번호 : ");
    String phoneNumber = sc.nextLine();

    System.out.print("계좌번호 : ");
    String accountNumber = sc.nextLine();

    Account account = new Account(accountNumber);
    Customer customer = new Customer(name, residentNumber, phoneNumber, account);
    customers[customerCount++] = customer;
  }

  private Customer findCustomerByAccount(String accountNumber) {
    for (int i = 0; i < customerCount; i++) {
      if (customers[i].getAccount().getAccountNumber().equals(accountNumber)) {
        return customers[i];
      }
    }
    return null;
  }

  public void deposit() {
    System.out.print("입금계좌번호 : ");
    String accountNumber = sc.nextLine();

    Customer customer = findCustomerByAccount(accountNumber);
    if (customer == null) {
      System.out.println("계좌를 찾을 수 없습니다.");
      return;
    }

    Account account = customer.getAccount();
    System.out.print("현재 총 예금액은 " + account.getBalance() + "원입니다. 예금액을 입력하세요 : ");
    int amount = Integer.parseInt(sc.nextLine());

    account.deposit(amount);
    System.out.println("정상 입금되었습니다. 현재 총 예금액은 " + account.getBalance() + "원입니다.");
  }

  public void withdraw() {
    System.out.print("출금계좌번호 : ");
    String accountNumber = sc.nextLine();

    Customer customer = findCustomerByAccount(accountNumber);
    if (customer == null) {
      System.out.println("계좌를 찾을 수 없습니다.");
      return;
    }

    Account account = customer.getAccount();
    System.out.print("현재 총 예금액은 " + account.getBalance() + "원입니다. 출금액을 입력하세요 : ");
    int amount = Integer.parseInt(sc.nextLine());

    if (account.withdraw(amount)) {
      System.out.println("정상 출금되었습니다. 현재 총 예금액은 " + account.getBalance() + "원입니다.");
    }
    else {
      System.out.println("잔액이 부족합니다.");
    }
  }

  public void checkBalance() {
    System.out.print("계좌번호 : ");
    String accountNumber = sc.nextLine();

    Customer customer = findCustomerByAccount(accountNumber);
    if (customer == null) {
      System.out.println("계좌를 찾을 수 없습니다.");
      return;
    }

    System.out.println("현재 총 예금액은 " + customer.getAccount().getBalance() + "원입니다.");
  }

  public void showAllCustomers() {
    for (int i = 0; i < customerCount; i++) {
      Customer c = customers[i];
      Account a = c.getAccount();
      System.out.println("이름:" + c.getName() + " 주번:" + c.getResidentNumber() + " 연락처:" + c.getPhoneNumber() + " 계좌번호:" + c.getAccount().getAccountNumber() + " 예금액:" + c.getAccount().getBalance());
    }
  }

  public void run() {
    while (true) {
      System.out.print("1.계좌개설 2.입금 3.출금 4.예금조회 5.전체조회 6.은행업무종료 => ");
      String choice = sc.nextLine();

      switch (choice) {
        case "1":
          openAccount();
          break;
        case "2":
          deposit();
          break;
        case "3":
          withdraw();
          break;
        case "4":
          checkBalance();
          break;
        case "5":
          showAllCustomers();
          break;
        case "6":
          System.out.println("은행업무를 종료합니다.");
          return;
        default:
          System.out.println("잘못된 입력입니다.");
      }
    }
  }
}