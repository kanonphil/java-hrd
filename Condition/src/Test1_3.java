import java.util.Scanner;

public class Test1_3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b;

    System.out.println("두 정수를 입력하세요.");
    System.out.print("a = ");
    a = sc.nextInt();
    System.out.print("b = ");
    b = sc.nextInt();

    if (a > b) {
      System.out.println("a가 큽니다.");
    }
    else if (a < b) {
      System.out.println("b가 큽니다.");
    }
  }
}
