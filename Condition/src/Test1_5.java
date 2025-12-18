import java.util.Scanner;

public class Test1_5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;

    System.out.print("0 ~ 100까지의(0, 100 포함) 숫자 중 임의의 값을 입력하세요 : ");
    num = sc.nextInt();
    if (num > 90 && num <= 100) {
      System.out.println("학점은 A입니다.");
    }
    else if (num > 80 && num <= 90) {
      System.out.println("학점은 B입니다.");
    }
    else {
      System.out.println("학점은 C입니다.");
    }
  }
}
