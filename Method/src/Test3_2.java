public class Test3_2 {
  public static void main(String[] args) {
    printMultiple(5);
  }

  public static void printMultiple(int num) {
    int i = 1;
    while (true) {
      int result = num * i;
      if (result > 100) {
        break;
      }
      System.out.println(result);
      i++;
    }
  }
}
