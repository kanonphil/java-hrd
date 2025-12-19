import java.util.Scanner;

public class Test1_11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = 0;
    while (a <= b) {
      sum += a;
      a++;
    }
    System.out.println(sum);


    System.out.println("===================================");

    int c = sc.nextInt();
    int d = sc.nextInt();
    int sum2 = 0;
    for (int j = c; j <= d; j++){
      sum2 += j;
    }
    System.out.println(sum2);
  }
}
