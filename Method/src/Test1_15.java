import java.util.Scanner;

public class Test1_15 {
  public static void main(String[] args) {
    /*Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int num = sc.nextInt();
    printStrNum(str, num);*/
    printStrNum("안녕", 5);
  }

  public static void printStrNum(String str, int a) {
    for (int i = 0; i < a; i++) {
      System.out.println(str);
    }
  }
}
