public class Test1_13_1 {
  public static void main(String[] args) {
    int num = 1;
    int sum = 0;

    while (true) {
      sum += num;
      if (sum > 300) {
        System.out.println(sum);
        System.out.println(num);
        break;
      }
      num++;
    }
  }
}
