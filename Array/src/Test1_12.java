import java.util.Scanner;

public class Test1_12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[3];
    int total = 0;
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
      total += arr[i];
    }
    int average = total / 3;
    System.out.println("총 점: " + total);
    System.out.println("평균: " + average);
  }
}
