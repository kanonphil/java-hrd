public class Test3_7 {
  public static void main(String[] args) {
    String[] arr = {"안", "녕", "하", "세", "요"};
    System.out.println(getArray(arr));
  }

  public static String getArray(String[] arr) {
    String str = "";
    for (int i = 0; i < arr.length; i++) {
      str += arr[i];
    }
    return str;
  }
}
