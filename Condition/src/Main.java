import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int result = 0;
    for (int i = 1; i <= n; i++){
      result += i;
    }
    System.out.println(result);
  }
}



/*Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int arr[] = new int[t];
    for (int i = 0; i < t; i++){
      int a = sc.nextInt();
      int b = sc.nextInt();
      arr[i] = a + b;
    }
    sc.close();

    for (int k : arr) {
      System.out.println(k);
    }*/