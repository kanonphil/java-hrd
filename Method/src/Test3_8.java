import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test3_8 {
  public static void main(String[] args) {
    int[] arr1 = {1, 2, 3};
    int[] arr2 = {4, 5, 6};
//    System.out.println(Arrays.toString(getArray(arr1, arr2)));
    System.out.println(Arrays.toString(margeArrays(arr1, arr2)));
  }

  //Stream 사용
  public static int[] margeArrays(int[] arr1, int[] arr2) {
    if (arr1 == null || arr2 == null) {
      throw new IllegalArgumentException("배열이 null입니다");
    }

    return IntStream.concat(
            Arrays.stream(arr1),
            Arrays.stream(arr2)
    ).toArray();
  }

  /*public static int[] getArray(int[] arr1, int[] arr2) {
    int[] arr = new int[arr1.length + arr2.length];
    for (int i = 0; i < arr1.length; i++) {
      arr[i] = arr1[i];
    }
    for (int i = 0; i < arr2.length; i++) {
      arr[arr2.length + i] = arr2[i];
    }
    return arr;
  }*/
}
