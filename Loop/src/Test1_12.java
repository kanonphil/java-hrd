public class Test1_12 {
  public static void main(String[] args) {
    int i = 1;
    int result;
    while (i < 10) {
      result = 2 * i;
      System.out.println("2 * " + i + " = " + result);
      i++;
    }

    System.out.println("========================");

    for (int j = 1; j < 10; j++){
      int result2 = 2 * j;
      System.out.println("2 * " + j + " = " + result2);
    }
  }
}
