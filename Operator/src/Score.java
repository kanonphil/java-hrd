import java.util.Scanner;

public class Score {
  public static void main(String[] args) {
    //===== 키보드 입력을 위한 객체 생성 =====//
    Scanner sc = new Scanner(System.in);

    //===== 점수를 담기 위한 변수 선언 =====//
    int korScore, engScore, mathScore, totalScore;
    double avg;

    //===== 출력 =====//
    System.out.println("- 결과 -");

    //===== 국영수 점수 입력 받기 =====//
    System.out.print("국어점수 : ");
    korScore = sc.nextInt();

    System.out.print("영어점수 : ");
    engScore = sc.nextInt();

    System.out.print("수학점수 : ");
    mathScore = sc.nextInt();

    //===== 총점, 평균 계산 및 출력 =====//
    totalScore = korScore + engScore + mathScore;
    avg = totalScore / 3.0;

    System.out.println("총점 : " + totalScore);
    System.out.println("평균 : " + avg);
  }
}
