package array;

public class Acc {
  private String owner;
  private String accNumber;
  private int balance;

  public Acc() {

  }

  public Acc(String owner, String accNumber, int balance) {
    this.owner = owner;
    this.accNumber = accNumber;
    this.balance = balance;
  }

  public String getOwner() {
    return owner;
  }

  public String getAccNumber() {
    return accNumber;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  @Override
  public String toString() {
    return "array.Acc{" +
            "owner='" + owner + '\'' +
            ", accNumber='" + accNumber + '\'' +
            ", balance=" + balance +
            '}';
  }
}
