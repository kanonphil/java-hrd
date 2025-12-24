import java.util.Arrays;
import java.util.stream.Stream;

public class Test3_8 {
  public static void main(String[] args) {
    Integer[] arr1 = {1, 2, 3};
    Integer[] arr2 = {4, 5, 6};
//    System.out.println(Arrays.toString(getArray(arr1, arr2)));
    System.out.println(Arrays.toString(addArray(arr1, arr2)));
  }

  //Stream 사용
  public static Integer[] addArray(Integer[] arr1, Integer[] arr2) {
    Integer[] arr = Stream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).toArray(Integer[]::new);
    return arr;
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
