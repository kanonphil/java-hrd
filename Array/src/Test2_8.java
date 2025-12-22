public class Test2_8 {
  public static void main(String[] args) {
    int[] arr = new int[100];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = i + 1;
    }
    for (int i = 0; i < arr.length; i++) {
      if (isPrime(arr[i])) {
        System.out.println(arr[i]);
      }

    }
  }

  public static boolean isPrime(int n) {
    if (n < 2) {
      return false;
    }

    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}
