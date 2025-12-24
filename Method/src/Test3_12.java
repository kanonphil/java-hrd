import java.util.Arrays;

public class Test3_12 {
  public static void main(String[] args) {
    Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    reverseOrder(arr);
  }

  public static void reverseOrder(Integer[] arr) {
    Arrays.sort(arr, (a, b) -> b - a);
    System.out.println(Arrays.toString(arr));
  }
}
