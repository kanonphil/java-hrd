package test;

public class MathTest {
  public static void main(String[] args) {
    MathUtil m = new MyMath();

    boolean result1 = m.isEven(2, 3, 4);
    System.out.println(result1);

    double result2 = m.getSumFromOne(10);
    System.out.println(result2);

    double result3 = m.getCircleArea(5);
    System.out.println(result3);
  }
}
