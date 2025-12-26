public class Test2_10 {
  public static void main(String[] args) {
    boolean result = isEven("ja va");
    System.out.println(result);
  }

  public static boolean isEven(String str) {
    return str.length() % 2 == 0;
  }
}
