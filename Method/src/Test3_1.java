import java.util.stream.IntStream;

public class Test3_1 {
  public static void main(String[] args) {
    printMultiplicationTable(3);
  }

  public static void printMultiplicationTable(int num) {
    IntStream.rangeClosed(1, 9)
             .forEach(i -> System.out.println(num + " * " + i + " = " + num * i));
  }

  /*public static void printMultiplicationTable(int num) {
    for (int i = 1; i <= 9; i++) {
      int result = num * i;
      System.out.println(num + " * " + i + " = " + result);
    }
  }*/
}
