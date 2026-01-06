package test;

public class MyStudent implements StudentUtil {
  @Override
  public int getTotalScore(Student s) {
    return s.getKorScore() + s.getMathScore() + s.getEngScore();
  }

  @Override
  public Student getHighScoreStudent(Student s1, Student s2) {
    int total1 = getTotalScore(s1);
    int total2 = getTotalScore(s2);
    if (total1 > total2) {
      return s1;
    } else if (total1 < total2) {
      return s2;
    } else {
      return null;
    }
  }

  @Override
  public String getGradeByStudentName(String name, Student... students) {
    for (Student s : students) {
      if (s.getName().equals(name)) {
        int total = getTotalScore(s);
        double average = total / 3.0;

        return average >= 90 ? "A" :
               average >= 80 ? "B" :
               average >= 70 ? "C" : "D";
      }
    }
    return "학생 정보 없음";
  }

  @Override
  public int[] getTotalScoresToArray(Student... students) {
    int[] totals = new int[students.length];

    for (int i = 0; i < students.length; i++) {
      totals[i] = getTotalScore(students[i]);
    }
    return totals;
  }
}
