package test;

import java.util.Scanner;

public class Test3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("1~999까지의 수 중 하나를 입력하세요: ");
    int num = sc.nextInt();

    if (num < 1 || num > 999) {
      System.out.println("잘못 입력하였습니다.");
      sc.close();
      return;
    }

    int temp = num;
    int clapCount = 0;

    while (temp > 0) {
      int digit = temp % 10;
      if (digit == 3 || digit == 6 || digit == 9) {
        clapCount++;
      }
      temp /= 10;
    }

    if (clapCount == 0) {
      System.out.println(num);
    } else {
      System.out.println("박수 " + clapCount + "번");
      System.out.println();
    }

    sc.close();
  }
}
