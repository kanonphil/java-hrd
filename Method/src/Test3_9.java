import java.util.Arrays;

public class Test3_9 {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    System.out.println(Arrays.toString(filterEven(arr)));
  }

  //Stream 사용
  public static int[] filterEven(int[] arr) {
    return Arrays.stream(arr).filter(n -> n % 2 == 0).toArray();
  }
}
