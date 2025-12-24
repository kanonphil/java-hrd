public class Test3_10 {
  public static void main(String[] args) {
    switchingNum(10, 20);
  }

  public static void switchingNum(int a, int b) {
    int t = a;
    a = b;
    b = t;
    System.out.println(a + " " + b);
  }
}
