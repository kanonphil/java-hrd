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
      if (tens == 3 || tens == 6 || tens == 9) {
        cnt++;
      }
      if (ones == 3 || ones == 6 || ones == 9) {
        cnt++;
      }

      if (cnt == 1) {
        System.out.println(arr[i] + " 박수 한번");
      }
      else if (cnt == 2) {
        System.out.println(arr[i] + " 박수 두번");
      }
    }
  }
}
