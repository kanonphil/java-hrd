import java.util.Arrays;

public class Test3_9 {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    System.out.println(Arrays.toString(removeOddNumbers(arr)));
  }

  //Stream 사용
  public static int[] removeOddNumbers(int[] arr) {
    int[] evenArr = Arrays.stream(arr).filter(n -> n % 2 == 0).toArray();
    return evenArr;
  }
}
