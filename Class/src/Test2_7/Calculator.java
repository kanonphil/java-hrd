package Test2_7;

import java.util.Scanner;

public class Calculator {
  private int a;
  private int b;
  private String operator;
  private Scanner sc;

  public Calculator() {
    sc = new Scanner(System.in);
  }

  public void run() {
    System.out.print("첫 번째 수 : ");
    a = sc.nextInt();
    System.out.print("두 번째 수 : ");
    b = sc.nextInt();
    sc.nextLine();
    System.out.print("연산자 : ");
    operator = sc.nextLine();

    switch (operator) {
      case "+":
        Add add = new Add();
        add.setValue(a, b);
        System.out.println(a + " + " + b + " = " + add.calculate());
        break;
      case "-":
        Sub sub = new Sub();
        sub.setValue(a, b);
        System.out.println(a + " - " + b + " = " + sub.calculate());
        break;
      case "*":
        Mul mul = new Mul();
        mul.setValue(a, b);
        System.out.println(a + " * " + b + " = " + mul.calculate());
        break;
      case "/":
        Div div = new Div();
        div.setValue(a, b);
        System.out.println(a + " / " + b + " = " + div.calculate());
        break;
      default:
        System.out.println("연산자를 잘못 입력했습니다.");
    }
  }
}

class Add {
  int a;
  int b;

  public void setValue(int a, int b) {
    this.a = a;
    this.b = b;
  }

  public int calculate() {
    return a + b;
  }
}

class Sub {
  int a;
  int b;

  public void setValue(int a, int b) {
    this.a = a;
    this.b = b;
  }

  public int calculate() {
    return a - b;
  }
}

class Mul {
  int a;
  int b;

  public void setValue(int a, int b) {
    this.a = a;
    this.b = b;
  }

  public int calculate() {
    return a * b;
  }
}

class Div {
  int a;
  int b;

  public void setValue(int a, int b) {
    this.a = a;
    this.b = b;
  }

  public int calculate() {
    return a / b;
  }
}
