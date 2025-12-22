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
        //switch문에서의 break랑 다르다.
        //반복문 안에서의 break는 가장 가까운 반복문(for, while)을 벗어나는 명령
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
