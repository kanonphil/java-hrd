public class Test3_1 {
  public static void main(String[] args) {
    printMultiplicationTable(3);
  }

  public static void printMultiplicationTable(int num) {
    for (int i = 1; i <= 9; i++) {
      int result = num * i;
      System.out.println(num + " * " + i + " = " + result);
    }
  }
}
