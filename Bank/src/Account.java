public class Account {
  private final String accountNumber;
  private int balance;

  public Account(String accountNumber) {
    this.accountNumber = accountNumber;
    this.balance = 10000;
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public int getBalance() {
    return balance;
  }

  public void deposit(int amount) {
    balance += amount;
  }

  public boolean withdraw(int amount) {
    if (balance >= amount) {
      balance -= amount;
      return true;
    }
    return false;
  }
}
