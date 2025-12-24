public class Test2_9 {
  public static void main(String[] args) {
    System.out.println(getOddSum(5));
  }

  public static int getOddSum(int num) {
    int sum = 0;
    for (int i = 1; i <= num; i++) {
      if (i % 2 != 0) {
        sum += i;
      }
    }
    return sum;
  }
}
