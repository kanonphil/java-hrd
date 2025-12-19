public class Test1_13 {
  public static void main(String[] args) {
    int total = 0;
    int lastNum = 0;
    for (int i = 1; i <= 1000; i++){
      total += i;
      if (total > 300) {
        lastNum = i;
        break;
      }
    }
    System.out.println(total);
    System.out.println(lastNum);
  }
}
