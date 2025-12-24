public class Test3_4 {
  public static void main(String[] args) {
    System.out.println(getEven(3));
  }

  public static boolean getEven(int num) {
    if (num % 2 == 0) {
      return true;
    }
    else {
      return false;
    }
  }
}
