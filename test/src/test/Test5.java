package test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test5 {
  public static void main(String[] args) {
    int[] targetNumbers = gameRandomNumbers();
    int attempts = 1;

    //System.out.println("만들어진 숫자 : " + Arrays.toString(targetNumbers));
    System.out.println("숫자를 정했습니다. 게임을 시작합니다.");

    while (true) {
      System.out.print(attempts + " >> ");
      int[] userNumbers = getUserInput();

      int strikes = countStrikes(targetNumbers, userNumbers);
      int balls = countBalls(targetNumbers, userNumbers);

      System.out.println(strikes + " 스트라이크, " + balls + " 볼");

      if (strikes == 3) {
        System.out.println(attempts + "회만에 정답을 맞췄습니다.");
        break;
      }

      attempts++;
    }
  }

  private static int[] gameRandomNumbers() {
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
    Scanner sc = new Scanner(System.in);
    int[] numbers = new int[3];
    for (int i = 0; i < 3; i++) {
      while (true) {
        int number;
        try {
          number = sc.nextInt();
        } catch (Exception e) {
          System.out.println("잘못된 입력입니다. 숫자를 다시 입력해 주세요.");
          sc.next();
          continue;
        }

        if (number < 1 || number > 9) {
          System.out.println("잘못된 숫자입니다. 1부터 9까지의 숫자를 입력해 주세요.");
          continue;
        }
        boolean isUnique = true;
        for (int j = 0; j < i; j++) {
          if (numbers[j] == number) {
            System.out.println("중복된 숫자입니다. 다른 숫자를 입력해 주세요.");
            isUnique = false;
            break;
          }
        }
        if (isUnique) {
          numbers[i] = number;
          break;
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
