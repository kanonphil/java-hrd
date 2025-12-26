public class Customer {
  private final String name;
  private final String residentNumber;
  private final String phoneNumber;
  private final Account account;

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
