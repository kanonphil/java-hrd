import java.util.Scanner;
import java.util.stream.IntStream;

public class Test1_15 {
  public static void main(String[] args) {
    /*Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int num = sc.nextInt();
    printStrNum(str, num);*/
    printStrNum("kim", 5);
  }

  //range 0 이상 a 미만
  public static void printStrNum(String str, int a) {
    IntStream.range(0, a).forEach(i -> System.out.print(str));
  }

  /*public static void printStrNum(String str, int a) {
    for (int i = 0; i < a; i++) {
      System.out.println(str);
    }
  }*/
}
