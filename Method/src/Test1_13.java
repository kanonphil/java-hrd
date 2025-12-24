import java.util.Scanner;
import java.util.stream.IntStream;

public class Test1_13 {
  public static void main(String[] args) {
    /*Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    printNum(num1, num2);*/
    printNum(30, 10);
  }

  public static void printNum(int a, int b) {
    int max = Math.max(a, b);
    int min = Math.min(a, b);
    IntStream.range(min + 1, max).forEach(i -> System.out.print(i + " "));
  }

  /*public static void printNum(int a, int b) {
    int max = Math.max(a, b);
    int min = Math.min(a, b);
    for (int i = min + 1; i < max; i++) {
      System.out.print(i + " ");
    }
  }*/
}
