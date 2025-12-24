import java.util.Scanner;

public class Test1_9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    getSum(num1, num2);
  }

  public static void getSum(int a, int b) {
    int sum = a + b;
    System.out.println(sum);
  }
}
