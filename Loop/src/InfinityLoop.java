import java.util.Scanner;

public class InfinityLoop {
  public static void main(String[] args) {
    //무한루프 : 반복을 끝내지 않고 무한으로 진행하는 문법
    //무한루프는 반복횟수를 모를 때 사용함.
    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.print("점수입력(0~100) : ");
      int score = sc.nextInt();
      if (score >= 0 && score <= 100) {
        System.out.println("입력받은 점수 = " + score);
        break;
      }
    }
    System.out.println("종료");

    /* for 무한루프 **잘 사용 안함
    for (;;) {
      System.out.print("점수입력(0~100) : ");
      Scanner sc = new Scanner(System.in);
      int score = sc.nextInt();
      if (score > -1 && score < 101) {
        System.out.println("입력받은 점수 = " + score);
        break;
      }
    }
    */
  }
}
