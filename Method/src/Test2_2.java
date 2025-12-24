import java.util.Scanner;

public class Test2_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int result = getMul(num1, num2);
    System.out.println(result);
  }

  public static int getMul(int num1, int num2) {
    int mul = num1 * num2;
    return mul;
  }
}
