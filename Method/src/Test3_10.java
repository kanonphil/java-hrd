public class Test3_10 {
  public static void main(String[] args) {
    swap(10, 20);
  }

  public static void swap(int a, int b) {
    int t = a;
    a = b;
    b = t;
    System.out.println(a + " " + b);
  }
}
