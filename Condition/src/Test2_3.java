/*
369게임을 간단히 작성해보자. 1~99까지의 정수를 키보드로부터 입력받고 정수에 3, 6, 9 중 하나가 있는 경우는 "박수짝"을
출력하고 두 개 있는 경우는 "박수짝짝"을 출력하는 프로그램을 작성하라. 예를 들면, 키보드로 입력된 수가 13인 경우 "박수짝"을,
36인 경우 "박수짝짝"을 출력하면 된다.
* */
import java.util.Scanner;

public class Test2_3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    System.out.print("1~99 사이의 정수를 입력하시오>>");
    num = sc.nextInt();

    int count = 0;
    int temp = num;

    while (temp > 0) {
      int d = temp % 10;
      if (d == 3 || d == 6 || d == 9) {
        count++;
      }
      temp /= 10;
    }

    if (count == 1) {
      System.out.println("박수짝");
    }
    else if (count == 2) {
      System.out.println("박수짝짝");
    }
  }
}
