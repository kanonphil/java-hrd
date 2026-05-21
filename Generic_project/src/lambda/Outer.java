package lambda;

public class Outer {
  private int num = 0;

  class Member {
    public void add() {
      num = num + 10;
    }
  }
}
