package test3;

import java.util.ArrayList;
import java.util.List;

public class School {
  private List<StudyClass> classes;

  public School(List<StudyClass> classes) {
    this.classes = classes;
  }

  //매개변수로 담당교사 / 담당교사가 맡고 있는 모든 반의 학생 정보를 출력
  public void printStudentsByTeacher(String tName) {
    System.out.println(tName + " 선생님이 담당하는 반:");

    for (StudyClass studyClass : classes) {
      if (studyClass.getTName().equals(tName)) {
        studyClass.printAllStudent();
      }
    }
  }

  //각 반별 평균 점수 및 전체 학급에 대한 평균 점수 출력
  public void printAllAverage() {
    double totalSum = 0;
    int classCount = 0;

    System.out.println("=== 반별 평균 성적 ===");
    for (StudyClass studyClass : classes) {
      double avg = studyClass.scoreAvg();
      System.out.println(studyClass.getClassName() + "반 평균: " + avg);
      totalSum += avg;
      classCount++;
    }

    double schoolAvg = totalSum / classCount;
    System.out.println("\n전체 학급 평균: " + schoolAvg);
  }

  //모든 반에서 최고 성적을 가진 학생의 이름과 점수 출력
  public void printTopStudent() {
    Student topStudent = null;

    for (StudyClass studyClass : classes) {
      Student classTop = studyClass.topScoreStu();

      if (topStudent == null || topStudent.getScore() < classTop.getScore()) {
        topStudent = classTop;
      }
    }

    if (topStudent != null) {
      System.out.println("전체 최고 성적 학생: " + topStudent.getStuName() + " (" + topStudent.getScore() +"점)");
    }
  }

  //매개변수 반 이름 / 반 이름을 받아 해당 반의 평균 리턴
  public double classAverage(String className) {
    for (StudyClass studyClass : classes) {
      if (studyClass.getClassName().equals(className)) {
        return studyClass.scoreAvg();
      }
    }
    return 0.0;
  }
}
