import java.util.InputMismatchException;
import java.util.Scanner;

/*
예외처리 문법
try {
  예외가 발생할 수 있는 코드 작성
} catch(Exception e) {

}
*/

//예외처리 -> 오류처리
public class Exception1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean success = false;

    while (!success) {
      try {
        System.out.print("첫번째 수 : ");
        int a = sc.nextInt();
        System.out.print("두번째 수 : ");
        int b = sc.nextInt();

        if (b == 0) {
          throw new ArithmeticException("0으로 나눌 수 없습니다.");
        }

        System.out.println("a / b = " + a / b);
        success = true;

      } catch (ArithmeticException e) {
        System.out.println("오류 : " + e.getMessage());
        System.out.println("다시 입력해주세요.\n");

      } catch (InputMismatchException e) {
        System.out.println("오류 : 정수만 입력할 수 있습니다.");
        System.out.println("다시 입력해주세요.\n");
        sc.nextLine();
      }
    }

    sc.close();
    System.out.println("프로그램 종료");
  }
}
