import java.util.Scanner;

public class Test1_10 {
  public static void main(String[] args) {
    /*Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    checkEvenOdd(num);*/
    checkEvenOdd(4);
  }

  public static void checkEvenOdd(int a) {
    if (a % 2 == 0) {
      System.out.println("짝수입니다");
    }
    else {
      System.out.println("홀수입니다");
    }
  }
}
