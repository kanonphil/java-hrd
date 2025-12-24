import java.util.Arrays;
import java.util.stream.IntStream;

public class Test3_11 {
  public static void main(String[] args) {
    int[] arr1 = {10};
    int[] arr2 = {20};
    switching(arr1, arr2);

    int[] arr3 = {1, 2, 3, 4, 5};
    int[] arr4 = {10, 20, 30, 40, 50};
    switching2(arr3, arr4);
  }

  public static void switching(int[] arr1, int[] arr2) {
    int i = 0;
    int t = arr1[i];
    arr1[i] = arr2[i];
    arr2[i] = t;
    System.out.println(Arrays.toString(arr1));
    System.out.println(Arrays.toString(arr2));
  }

  //forEach 사용
  public static void switching2(int[] arr1, int[] arr2) {
    IntStream.range(0, arr1.length).forEach(i -> {
      int temp = arr1[i];
      arr1[i] = arr2[i];
      arr2[i] = temp;
    });

    System.out.println(Arrays.toString(arr1));
    System.out.println(Arrays.toString(arr2));
  }
}


