package test1_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1_2 {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    System.out.println("5개의 정수를 입력하세요.");

    for (int i = 0; i < 5; i++) {
      System.out.print((i + 1) + "번째 정수: ");
      int num = sc.nextInt();
      numbers.add(num);
    }

    int sum = 0;
    for (Integer number : numbers) {
      sum += number;
    }
    System.out.println(sum);
  }
}
