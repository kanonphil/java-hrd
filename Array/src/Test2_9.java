import java.util.ArrayList;

public class Test2_9 {
  public static void main(String[] args) {
    int[] arr = new int[6];
    boolean[] used = new boolean[45];
    for (int i = 0; i < arr.length; i++) {
      int num;
      do {
        num = (int)(Math.random() * 45) + 1;
      } while (used[num]);

      used[num] = true;
      arr[i] = num;
    }
  }
}
