public class While_3 {
  public static void main(String[] args) {
    //1부터 10까지의 합을 출력
    int i = 1;
    int sum = 0;

    while (i < 11) {
      sum += i;
      i++;
    }

    System.out.println(sum);
  }
}
