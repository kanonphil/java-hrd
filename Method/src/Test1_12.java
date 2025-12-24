import java.util.Scanner;
import java.util.stream.IntStream;

public class Test1_12 {
  public static void main(String[] args) {
    /*Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    printInt(num);*/
    printInt(5);
  }

  //rangeClosed 0 이상 a 이하
  public static void printInt(int a) {
    IntStream.rangeClosed(0, a).forEach(i -> System.out.print(i + " "));
  }

  /*public static void printInt(int a) {
    for (int i = 0; i <= a; i++) {
      System.out.print(i + " ");
    }
  }*/
}
