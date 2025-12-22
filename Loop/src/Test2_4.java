public class Test2_4 {
  public static void main(String[] args) {
    int i = 1;
    int sum = 0;
    while (true) {
      sum += i;
      if (sum > 50){
        break;
      }
      i++;
    }
    System.out.println(sum);
    System.out.println(i);
  }
}
