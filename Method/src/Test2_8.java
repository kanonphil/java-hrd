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

  /*public static double getAvg(int num1, int num2, int num3) {
    int sum = num1 + num2 + num3;
    double avg = sum / 3.0;
    return avg;
  }*/
}
