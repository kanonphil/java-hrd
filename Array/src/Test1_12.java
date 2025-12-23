import java.util.Scanner;

public class Test1_12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] scores = new int[4];
    String[] sbj = {"국어", "영어", "수학"};
    double avg;

    for (int i = 0; i < scores.length - 1; i++) {
      while (true) {
        System.out.print(sbj[i] + " 점수(0 ~ 100) : ");
        scores[i] = sc.nextInt();

        if (scores[i] >= 0 && scores[i] <= 100) {
          break;
        }
      }
    }

    for (int i = 0; i < scores.length - 1; i++) {
      scores[scores.length - 1] += scores[i];
    }
    avg = scores[scores.length - 1] / (double)(scores.length - 1);

    for (int i = 0; i < scores.length - 1; i++) {
      System.out.println(sbj[i] + "점수 = " + scores[i]);
    }
    System.out.println("총점 = " + scores[scores.length - 1]);
    System.out.println("평균 = " + avg);
  }
}
