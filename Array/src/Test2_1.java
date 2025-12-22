import java.util.Scanner;

public class Test2_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    int sum = 0;
    for (int i = 0; i < n; i++) {
      arr[i] = i + 1;
      sum += arr[i];
    }
    int average = sum / n;
    System.out.println("평균: " + average);
  }
}
