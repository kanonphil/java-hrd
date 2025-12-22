public class Test2_6 {
  public static void main(String[] args) {
    for (int i = 2; i <= 30; i++){
      boolean isPrime = true;

      for (int j = 2; j <= Math.sqrt(i); j++){
        if (i % j == 0){
          isPrime = false;
          break;
        }
      }
      if (isPrime){
        System.out.println(i);
      }
    }

    System.out.println("====================");

    for (int i = 2; i < 31; i++) {
      int cnt = 0;
      for (int j = 1; j < i + 1; j++) {
        if (i % j == 0) {
          cnt++;
        }
        if (cnt > 2) {
          break;
        }
      }
      if (cnt == 2) {
        System.out.println(i);
      }
    }
  }
}
