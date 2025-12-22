import java.util.Scanner;

public class Test3_2 {
  public static void main(String[] args) {
    boolean run = true;
    int studentNum = 0;
    int[] scores = null;
    Scanner sc = new Scanner(System.in);

    while (run) {
      System.out.println("==============================");
      System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
      System.out.println("==============================");
      System.out.print("선택> ");

      int selectNo = sc.nextInt();

      switch (selectNo) {
        case 1:
          System.out.print("학생수> ");
          studentNum = sc.nextInt();
          scores = new int[studentNum];
          break;
        case 2:
          for (int i = 0; i < studentNum; i++) {
            System.out.print("score[" + i + "]> ");
            scores[i] = sc.nextInt();
          }
          break;
        case 3:
          for (int i = 0; i < scores.length; i++) {
            System.out.println("scores[" + i + "]: " + scores[i]);
          }
          break;
        case 4:
          int max = 0;
          int sum = 0;
          for (int i = 0; i < scores.length; i++) {
            max = max > scores[i] ? max : scores[i];
            sum += scores[i];
          }
          int average = sum / scores.length;
          System.out.println("최고 점수: " + max);
          System.out.println("평균 점수: " + average);
          break;
        case 5:
          System.out.println("프로그램 종료");
        default:
          run = false;
      }
    }
    System.out.println("프로그램 종료");
  }
}
