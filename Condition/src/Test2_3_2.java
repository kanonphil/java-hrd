import java.util.Scanner;

public class Test2_3_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("1~99 사이의 정수를 입력하시오 >> ");
    int num = sc.nextInt();
    int m = num % 10;

    switch (m) {
      case 0:
        int s = num / 10;
        switch (s % 10){
          case 3:
            System.out.println("박수짝");
            break;
          case 6:
            System.out.println("박수짝");
            break;
          case 9:
            System.out.println("박수짝");
            break;
          default:
            break;
        }
    }
  }
}
