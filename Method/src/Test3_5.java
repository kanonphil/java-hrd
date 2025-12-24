import java.util.Arrays;

public class Test3_5 {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    getArray(arr);
  }

  //stream 사용
  public static void getArray(int[] arr) {
    Arrays.stream(arr).forEach(n -> System.out.println(n));
  }

  /*public static void getArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }*/
}
