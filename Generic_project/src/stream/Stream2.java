package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class Stream2 {
  public static void main(String[] args) {

    List<Student> stuList = new ArrayList<>();

    stuList.add(new Student("Kim", 100, 90));
    stuList.add(new Student("Lee", 80, 85));
    stuList.add(new Student("Park", 70, 100));
    stuList.add(new Student("Hong", 60, 90));
    stuList.add(new Student("Kang", 100, 70));

    // 1. 학생리스트에서 국어점수가 80점 이상인 학생만 추출
    List<Student> result1 = stuList.stream()
            .filter(student -> student.getKorScore() >= 80)
            .toList();

    // 2. 국어는 70점 이상 그리고 영어는 80점 이상인 학생만 추출
    List<Student> result2 = stuList.stream()
            .filter(student -> student.getKorScore() >= 70)
            .filter(student -> student.getEngScore() >= 80)
            .toList();

    // 3. 리스트에 저장된 학생들의 국어점수만 리스트로 추출
    List<Integer> result3 = stuList.stream()
            .map(student -> student.getKorScore())
            .toList();
    System.out.println(result3);

    // 4. 총점이 170점 이상인 학생들의 이름을 리스트로 반환
    List<String> result4 =  stuList.stream()
            .filter(student -> student.getKorScore() + student.getEngScore() >= 170)
            .map(student -> student.getName())
            .toList();
    System.out.println(result4);

    // 국어 점수의 합
    int sum = stuList.stream().mapToInt(student -> student.getKorScore()).sum();
    System.out.println(sum);

    // 국어 점수 평균
    double avg = stuList.stream().mapToDouble(student -> student.getKorScore()).average().getAsDouble();
    System.out.println(avg);

    // 가장 큰 수
    int max = stuList.stream().mapToInt(student -> student.getKorScore()).max().getAsInt();
    System.out.println(max);

    // 가장 작은 수
    int min = stuList.stream().mapToInt(student -> student.getKorScore()).min().getAsInt();
    System.out.println(min);

    // 학생 수
    long stuCount = stuList.stream().count();
    System.out.println(stuCount);

  }
}
