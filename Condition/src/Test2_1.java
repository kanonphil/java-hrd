import java.util.Scanner;

public class Test2_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b, c;

    System.out.print("세 정수 입력 : ");
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();

    if (a + b > c || b + c > a || c + a > b) {
      System.out.println("삼각형 O");
    }
    else {
      System.out.println("삼각형 X");
    }
  }
}
