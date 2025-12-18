import java.util.Scanner;

public class Test3_3 {
  public static void main(String[] args) {
    int a, b;
    String str;
    Scanner sc = new Scanner(System.in);

    System.out.print("첫 번째 수 : ");
    a = sc.nextInt();
    System.out.print("두 번째 수 : ");
    b = sc.nextInt();
    System.out.print("연산자 : ");
    str = sc.next();

    if (str.equals("+")){
      System.out.println(a + " + " + b + " = " + (a + b));
    }
    else if (str.equals("-")){
      System.out.println(a + " - " + b + " = " + (a - b));
    }
    else if (str.equals("*")){
      System.out.println(a + " * " + b + " = " + (a * b));
    }
    else if (str.equals("/")){
      System.out.println(a + " / " + b + " = " + (a / b));
    }
    else {
      System.out.println("연산자를 잘못 입력하였습니다.");
    }
  }
}
