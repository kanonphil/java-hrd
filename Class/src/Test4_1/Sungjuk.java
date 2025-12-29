package Test4_1;

public class Sungjuk {
  private int korScore;
  private int engScore;
  private int mathScore;
  private int total;
  private double average;

  public Sungjuk(int korean, int english, int math) {
    this.korScore = korean;
    this.engScore = english;
    this.mathScore = math;
    calculateTotal();
    calculateAverage();
  }

  private void calculateTotal() {
    this.total = korScore + engScore + mathScore;
  }

  private void calculateAverage() {
    this.average = total / 3.0;
  }

  public void showInfo() {
    System.out.println("국어점수 : " + korScore);
    System.out.println("영어점수 : " + engScore);
    System.out.println("수학점수 : " + mathScore);
    System.out.println("총점 : " + total);
    System.out.println("평균 : " + average);
  }
}
