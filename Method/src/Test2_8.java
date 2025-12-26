import java.util.Arrays;

public class Test2_8 {
  public static void main(String[] args) {
    double result = getAvg(3, 5, 8);
    System.out.println(result);
  }

  public static double getAvg(int... numbers) {
    //.orElse(0.0)은 값이 없으면 0.0을 대신 반환
    return Arrays.stream(numbers).average().orElse(0.0);
  }

  /*public static double getAvg(int a, int b, int c) {
    return = (a + b + c) / 3.0;
  }*/
}
