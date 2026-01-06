package test;

import java.util.Arrays;

public class StudentTest {
  public static void main(String[] args) {
    StudentUtil result = new MyStudent();

    Student s1 = new Student();
    s1.setName("a");
    s1.setKorScore(100);
    s1.setMathScore(90);
    s1.setEngScore(80);

    Student s2 = new Student();
    s2.setName("b");
    s2.setKorScore(100);
    s2.setMathScore(90);
    s2.setEngScore(90);

    Student s3 = new Student();
    s3.setName("c");
    s3.setKorScore(70);
    s3.setMathScore(85);
    s3.setEngScore(95);

    System.out.println(result.getTotalScore(s1));
    System.out.println(result.getTotalScore(s2));
    System.out.println(result.getTotalScore(s3));

    Student sre = result.getHighScoreStudent(s1, s2);
    System.out.println(sre.getName() + "의 점수가 더 높습니다.");

    System.out.println(result.getGradeByStudentName("a", s1, s2, s3));
    System.out.println(result.getGradeByStudentName("b", s1, s2, s3));
    System.out.println(result.getGradeByStudentName("c", s1, s2, s3));

    int[] totals = result.getTotalScoresToArray(s1, s2, s3);
    System.out.println(Arrays.toString(totals));
  }
}
