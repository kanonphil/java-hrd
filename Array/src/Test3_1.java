public class Test3_1 {
  public static void main(String[] args) {
    int[] arr = new int[99];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = i + 1;
    }

    int tens, ones;
    for (int i = 0; i < arr.length; i++) {
      int cnt = 0;

      tens = arr[i] / 10;
      ones = arr[i] % 10;

      if (tens % 3 == 0 && tens != 0) {
        cnt++;
      }
      if (ones % 3 == 0 && ones != 0) {
        cnt++;
      }

      switch (cnt) {
        case 1:
          System.out.println(arr[i] + " 박수 한번");
          break;
        case 2:
          System.out.println(arr[i] + " 박수 두번");
      }
    }
  }
}
