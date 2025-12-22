public class Test2_6_Method {
  public static void main(String[] args) {
    for (int num = 2; num <= 30; num++){
      if (isPrime(num)){
        System.out.println(num);
      }
    }
  }

  // 소수 판별 메서드
  public static boolean isPrime(int n){
    if (n < 2) {
      return false;
    } // 현재는 2부터 시작이기 때문에 필요 X

    // 2부터 n의 제곱근까지만 확인
    for (int i = 2; i <= Math.sqrt(n); i++){
      if (n % i == 0){
        return false;
      }
    }

    return true;
  }
}
