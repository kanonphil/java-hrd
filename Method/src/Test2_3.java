public class Test2_3 {
  public static void main(String[] args) {
    int result = getBigNum(10, 20);
    System.out.println(result);
  }

  public static int getBigNum(int num1, int num2) {
    if (num1 > num2) {
      return num1;
    }
    else {
      return num2;
    }
  }
}
