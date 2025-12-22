import java.util.Scanner;

public class Test1_11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int max = a > b ? a : b;
    int min = a > b ? b : a;
    int sum = 0;

    for (int i = min + 1; i < max; i++){
      sum += i;
    }
    System.out.println(sum);
  }
}
