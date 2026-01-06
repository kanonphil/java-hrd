package test;

public class MyMath implements MathUtil {
  @Override
  public boolean isEven(int a, int b, int c) {
    int sum = a + b + c;
    return sum % 2 == 0 && sum % 5 == 0;
  }

  @Override
  public double getSumFromOne(int num) {
    int sum = 0;
    for (int i = 1; i <= num; i++) {
      sum += i;
    }
    return sum;
  }

  @Override
  public double getCircleArea(int rad) {
    return rad > 0 ? Math.pow(rad, 2) * Math.PI : 0;
  }
}
