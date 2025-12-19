import java.util.Scanner;

public class Test2_3_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("1~99 사이의 정수를 입력하시오 >> ");
    int num = sc.nextInt();
    int tens = num / 10;
    int ones = num % 10;
    int clapCnt = 0;

    /*if (tens == 3 || tens == 6 || tens == 9) {

    }
    if (ones == 3 || ones == 6 || ones == 9) {

    }*/

    if (tens % 3 == 0 && tens != 0) {
      clapCnt++;
    }

    if (ones % 3 == 0 && ones != 0) {
      clapCnt++;
    }

    switch (clapCnt) {
      case 1:
        System.out.println("박수짝");
        break;
      case 2:
        System.out.println("박수짝짝");
    }
  }
}
