public class Customer {
  private String name;
  private String residentNumber;
  private String phoneNumber;
  private Account account;

  public Customer(String name, String residentNumber, String phoneNumber, Account account) {
    this.name = name;
    this.residentNumber = residentNumber;
    this.phoneNumber = phoneNumber;
    this.account = account;
  }

  public String getName() {
    return name;
  }

  public String getResidentNumber() {
    return residentNumber;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public Account getAccount() {
    return account;
  }
}
