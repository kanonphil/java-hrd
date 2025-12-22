public class Test1_13 {
  public static void main(String[] args) {
    int sum = 0;
    int lastNum = 0;
    for (int i = 1; sum <= 300; i++){
      sum += i;
      lastNum = i;
      System.out.println("sum = " + sum + ", lastNum = " + lastNum); //검산
    }
    System.out.println("==================");
    System.out.println("sum = " + sum);
    System.out.println("lastNum = " + lastNum);
  }
}
