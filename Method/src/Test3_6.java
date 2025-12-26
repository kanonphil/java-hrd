import java.util.Arrays;

public class Test3_6 {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    System.out.println(getMax(arr));
  }

  //Stream 사용
  public static int getMax(int[] arr) {
    return Arrays.stream(arr).max()
            //배열이 비어있을 때 반환
            .orElseThrow(() -> new IllegalArgumentException("배열이 비어있습니다"));
  }

  /*public static int getMax(int[] arr) {
    int max = 0;
    for (int i = 0; i < arr.length; i++) {
      if (max < arr[i]) {
        max = arr[i];
      }
    }

    return max;
  }*/
}
