package Test1_17;

public class Calculator {
  int num1;
  int num2;
  int result;
  String operator;

  public void setNum1(int num1) {
    this.num1 = num1;
  }

  public void setNum2(int num2) {
    this.num2 = num2;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }

  public void calculate() {
    switch (this.operator) {
      case "+":
        result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
        break;
      case "-":
        result = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + result);
        break;
      case "*":
        result = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + result);
        break;
      case "/":
        result = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + result);
    }
  }
}
