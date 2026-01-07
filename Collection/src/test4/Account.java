package test4;

public class Account {
  private String rrn;
  private String accountNumber;
  private int balance;

  public Account(String rrn, String accountNumber) {
    this.rrn = rrn;
    this.accountNumber = accountNumber;
    this.balance = 10000;
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public int getBalance() {
    return balance;
  }

  //예금
  public void deposit(int amount) {
    balance += amount;
  }

  //출금
  public boolean withdraw(int amount) {
    if (balance >= amount) {
      balance -= amount;
      return true;
    }
    return false;
  }
}
