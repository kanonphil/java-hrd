package test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test5 {
  public static void main(String[] args) {
    // 난수 생성
    int[] targetNumbers = generateRandomNumbers();

    // 게임 루프
    int attempts = 1;

    System.out.println("만들어진 숫자 : " + Arrays.toString(targetNumbers));
    System.out.println("숫자를 정했습니다. 게임을 시작합니다.");
    while (true) {
      // 사용자 입력 받기
      System.out.print(attempts + " >> ");
      int[] userNumbers = getUserInput();

      // 결과 체크
      int strikes = countStrikes(targetNumbers, userNumbers);
      int balls = countBalls(targetNumbers, userNumbers);

      // 결과 표시
      System.out.println(strikes + " 스트라이크, " + balls + " 볼");

      // 게임 종료 조건 검사
      if (strikes == 3) {
        System.out.println(attempts + "회만에 정답을 맞췄습니다.");
        break;
      }

      attempts++;
    }
  }

  private static int[] generateRandomNumbers() {
    int[] numbers = new int[3];
    Random random = new Random();
    for (int i = 0; i < 3; i++) {
      while (true) {
        int randomNumber = random.nextInt(9) + 1; // 1부터 9까지의 난수 생성
        boolean isUnique = true;
        for (int j = 0; j < i; j++) { // 중복 검사
          if (numbers[j] == randomNumber) {
            isUnique = false;
            break;
          }
        }
        if (isUnique) {
          numbers[i] = randomNumber;
          break;
        }
      }
    }
    return numbers;
  }

  private static int[] getUserInput() {
    Scanner scanner = new Scanner(System.in);
    int[] numbers = new int[3];
    for (int i = 0; i < 3; i++) {
      while (true) {
        int number;
        try {
          number = scanner.nextInt();
        } catch (Exception e) {
          System.out.println("잘못된 입력입니다. 숫자를 다시 입력해 주세요.");
          scanner.next(); // 잘못된 입력 스트림 비우기
          continue; // 다시 입력 받음
        }

        // 유효하지 않은 입력 처리
        if (number < 1 || number > 9) {
          System.out.println("잘못된 숫자입니다. 1부터 9까지의 숫자를 입력해 주세요.");
          continue; // 다시 입력 받음
        }
        // 중복 숫자 입력 처리
        boolean isUnique = true;
        for (int j = 0; j < i; j++) {
          if (numbers[j] == number) {
            System.out.println("중복된 숫자입니다. 다른 숫자를 입력해 주세요.");
            isUnique = false;
            break; // 중복 발견 시 다시 입력
          }
        }
        if (isUnique) {
          numbers[i] = number;
          break; // 유효한 숫자면 반복 중단
        }
      }
    }
    return numbers;
  }

  private static int countStrikes(int[] targetNumbers, int[] userNumbers) {
    int strikes = 0;
    for (int i = 0; i < 3; i++) {
      if (targetNumbers[i] == userNumbers[i]) {
        strikes++;
      }
    }
    return strikes;
  }

  private static int countBalls(int[] targetNumbers, int[] userNumbers) {
    int balls = 0;
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (i != j && targetNumbers[i] == userNumbers[j]) {
          balls++;
        }
      }
    }
    return balls;
  }
}
