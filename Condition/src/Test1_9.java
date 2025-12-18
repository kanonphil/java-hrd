import java.util.Scanner;

public class Test1_9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1, num2;

    System.out.print("첫번째 수 : ");
    num1 = sc.nextInt();
    System.out.print("두번째 수 : ");
    num2 = sc.nextInt();

    if (num1 > num2) {
      System.out.println(num1 + " > " + num2);
    }
    else if (num1 < num2) {
      System.out.println(num2 + " > " + num1);
    }

    //간략화
    int max = num1 > num2 ? num1 : num2;
    int min = num1 > num2 ? num2 : num1;

    System.out.println(max + " > " + min);
  }
}
