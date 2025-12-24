import java.util.Scanner;

public class Test1_11 {
  public static void main(String[] args) {
    /*Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    checkEvenOdd(num1, num2);*/
    checkEvenOdd(5, 5);
  }

  public static void checkEvenOdd(int a, int b) {
    if (a % 2 == 0 && b % 2 == 0) {
      System.out.println("두 수는 짝수입니다");
    }
    else if (a % 2 == 0 || b % 2 == 0) {
      System.out.println("한 수만 짝수입니다");
    }
    else {
      System.out.println("두 수는 홀수입니다");
    }
  }
}
