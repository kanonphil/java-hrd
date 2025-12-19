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

    System.out.println("========================================");

    int cnt = 0;
    for (int j = 1; j <= 100; j++){
      if (j % 5 == 0){
        System.out.println(j);
        cnt++;
      }
    }
    System.out.println(cnt);
  }
}
