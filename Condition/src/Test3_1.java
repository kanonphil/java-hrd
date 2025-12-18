import java.util.Scanner;

public class Test3_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    if (str.equals("남")) {
      System.out.println("남자입니다.");
    }
    else if (str.equals("여")) {
      System.out.println("여자입니다.");
    }
    else {
      System.out.println("다시 입력하세요.");
    }
  }
}
