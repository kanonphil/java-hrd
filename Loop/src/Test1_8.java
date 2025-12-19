import java.util.Scanner;

public class Test1_8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i = 1;
    int count = 0;
    int num = sc.nextInt();

    while (i < num+1){
      if (i % 2 == 0){
        count++;
      }
      i++;
    }
    System.out.println(count);

    System.out.println("================================");

    int cnt = 0;
    for (int j = 1; j <= num; j++){
      if (j % 2 == 0){
        cnt++;
      }
    }
    System.out.println(cnt);
  }
}
