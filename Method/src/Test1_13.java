import java.util.Scanner;
import java.util.stream.IntStream;

public class Test1_13 {
  public static void main(String[] args) {
    /*Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    printNum(num1, num2);*/
    printNum(3, 10);
  }

  public static void printNum(int a, int b) {
    IntStream.rangeClosed(a, b).forEach(i -> System.out.print(i + " "));
  }

  /*public static void printNum(int a, int b) {
    for (int i = a; i <= b; i++) {
      System.out.print(i + " ");
    }
  }*/
}
