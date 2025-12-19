public class Test1_7 {
  public static void main(String[] args) {
    int i = 1;
    int count = 0;

    while (i < 101) {
      if (i % 5 == 0) {
        count++;
        System.out.println(i);
      }
      i++;
    }
    System.out.println(count);
  }
}
