package test4;

public class Customer {
  private String name;
  private String rrn;
  private String phoneNumber;
  private Account account;

  public Customer(String name, String rrn, String phoneNumber, String accountNumber) {
    this.name = name;
    this.rrn = rrn;
    this.phoneNumber = phoneNumber;
    this.account = new Account(rrn, accountNumber);
  }

  public String getName() {
    return name;
  }

  public String getRrn() {
    return rrn;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public Account getAccount() {
    return account;
  }
}
