import java.util.Scanner;

public class Test1_5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    String grade = "C";

    System.out.print("0 ~ 100까지의(0, 100 포함) 숫자 중 임의의 값을 입력하세요 : ");
    num = sc.nextInt();
    if (num > 90 && num <= 100) {
      grade = "A";
    }
    else if (num > 80) {
      grade = "B";
    }
    /*else {
      grade = "C";
    }*/
    System.out.println("학점은 " + grade + "입니다.");
  }
}
