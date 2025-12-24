import java.util.stream.IntStream;

public class Test2_9 {
  public static void main(String[] args) {
    int result = getOddSum(5);
    System.out.println(result);
  }

  public static int getOddSum(int num) {
    return IntStream
            .rangeClosed(1, num)
            .filter(i -> i % 2 != 0)
            .sum();
  }

  /*public static int getOddSum(int num) {
    int sum = 0;
    for (int i = 1; i <= num; i++) {
      if (i % 2 != 0) {
        sum += i;
      }
    }
    return sum;
  }*/
}
