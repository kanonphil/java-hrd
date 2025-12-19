public class Test2_4 {
  public static void main(String[] args) {
    int sum = 0;
    int lastNum = 0;
    for (int i = 1; i < 10; i++){
      sum += i;
      lastNum = i;
      if (sum > 50){
        break;
      }
    }
    System.out.println(sum);
    System.out.println(lastNum);
  }
}
