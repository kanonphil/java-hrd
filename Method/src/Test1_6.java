public class Test1_6 {
  public static void main(String[] args) {
    getDivMod(3, 10);
  }

  public static void getDivMod(int a, int b) {
    int div, mod;
    if (a > b) {
      div = a / b;
      mod = a % b;
    }
    else {
      div = b / a;
      mod = b % a;
    }
    System.out.println("몫 = " + div);
    System.out.println("나머지 = " + mod);
  }
}
