package Test1_17;

import java.util.Scanner;

public class CalculatorTest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Calculator calc = new Calculator();
    System.out.print("첫 번째 수 : ");
    calc.setNum1(sc.nextInt());
    System.out.print("두 번째 수 : ");
    calc.setNum2(sc.nextInt());
    System.out.print("연산자 : ");
    calc.setOperator(sc.next());

    calc.calc();
  }
}
