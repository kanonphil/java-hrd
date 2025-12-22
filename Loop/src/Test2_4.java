public class Test2_4 {
  public static void main(String[] args) {
    int sum = 0;
//    int lastNum;
    int i = 1;
    while (true) {
      sum += i;
//      lastNum = i;
      if (sum > 50){
        break;
      }
      i++;
    }
    System.out.println(sum);
    System.out.println(i);
  }
}
