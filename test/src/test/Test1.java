package test;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] nums = new int[3];

    for (int i = 0; i < 3; i++) {
      System.out.print((i+1) + "번째 정수 입력: ");
      nums[i] = sc.nextInt();
    }

    Arrays.sort(nums);

    for (int i = 2; i >= 0; i--) {
      System.out.print(nums[i] + " ");
    }
//    System.out.println("큰 수부터: " + nums[2] + " " + nums[1] + " " + nums[0]);

    sc.close();
  }
}
