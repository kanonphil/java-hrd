public class Test2_6 {
  public static void main(String[] args) {
    for (int i = 2; i <= 30; i++){
      boolean isPrimeNumber = true;

      for (int j = 2; j <= Math.sqrt(i); j++){
        if (i % j == 0){
          isPrimeNumber = false;
          break;
        }
      }
      if (isPrimeNumber){
        System.out.println(i);
      }
    }
  }
}
