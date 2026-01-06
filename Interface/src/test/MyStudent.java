package test;

public class MyStudent implements StudentUtil {
  @Override
  public int getTotalScore(Student s) {
    return s.getKorScore() + s.getMathScore() + s.getEngScore();
  }

  @Override
  public Student getHighScoreStudent(Student s1, Student s2) {
    return getTotalScore(s1) > getTotalScore(s2) ? s1 : s2;
  }

  @Override
  public String getGradeByStudentName(String name, Student... students) {
    String result = "학생 정보 없음";
    for (Student s : students) {
      if (s.getName().equals(name)) {
        int total = getTotalScore(s);
        double average = total / 3.0;
        result = getGrade(average);
        break;
      }
    }
    return result;
  }

  @Override
  public int[] getTotalScoresToArray(Student... students) {
    int[] totals = new int[students.length];

    for (int i = 0; i < students.length; i++) {
      totals[i] = getTotalScore(students[i]);
    }
    return totals;
  }

  //점수에 따른 등급을 리턴하는 메서드
  public String getGrade(double average) {
    String result;
    if (average >= 90 && average <= 100) {
      result = "A";
    } else if (average >= 80) {
      result = "B";
    } else if (average >= 70) {
      result = "C";
    } else {
      result = "D";
    }
    return result;
  }
}
