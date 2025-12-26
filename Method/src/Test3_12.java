import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Test3_12 {
  public static void main(String[] args) {
    int[] arr = {1, 9, 3, 7, 10, 6, 4, 8, 5, 2};
    sortDescending(arr);
    sortAscending(arr);
  }

  public static void sortDescending(int[] arr) {
//    Arrays.sort(arr, (a, b) -> Integer.compare(b, a));
//    Arrays.sort(arr, Comparator.reverseOrder());
    Arrays.stream(arr)
            .max()
            .orElseThrow(() -> new IllegalArgumentException("배열이 비어있습니다"));
    System.out.println(Arrays.toString(arr));
  }

  public static void sortAscending(int[] arr) {
//    Arrays.sort(arr, Integer::compare);
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
  }
}
