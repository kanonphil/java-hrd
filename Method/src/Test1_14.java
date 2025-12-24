import java.util.Scanner;
import java.util.stream.IntStream;

public class Test1_14 {
  public static void main(String[] args) {
    /*Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    printMultiple(num1, num2);*/
    printMultiple(3, 42);
  }

  public static void printMultiple(int a, int b) {
    int max = Math.max(a, b);
    int min = Math.min(a, b);
    IntStream.rangeClosed(min, max).filter(i -> i % 5 == 0).forEach(i -> System.out.print(i + " "));
  }

  /*public static void printMultiple(int a, int b) {
    int max = Math.max(a, b);
    int min = Math.min(a, b);
    for (int i = min + 1; i < max; i++) {
      if (i % 5 == 0) {
        System.out.print(i + " ");
      }
    }
  }*/
}
