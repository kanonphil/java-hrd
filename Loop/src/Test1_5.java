public class Test1_5 {
  public static void main(String[] args) {
    int i = 1;
    int sum = 0;

    while (i < 11){
      sum += i;
      i++;
    }

    System.out.println(sum);

    int sum2 = 0;
    for (int j = 1; j <= 10; j++){
      sum2 += j;
    }
    System.out.println(sum2);
  }
}
