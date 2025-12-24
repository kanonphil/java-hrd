public class Test2_8 {
  public static void main(String[] args) {
    System.out.println(getAvg(3, 4, 5));
  }

  public static int getAvg(int num1, int num2, int num3) {
    int sum = num1 + num2 + num3;
    int avg = sum / 3;
    return avg;
  }
}
