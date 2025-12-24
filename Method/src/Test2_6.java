public class Test2_6 {
  public static void main(String[] args) {
    int num = 10;
    String result = getIntToString(num);
    System.out.println(getIntToString(num).getClass().getSimpleName() + " \"" + result + "\"");
  }

  public static String getIntToString(int num) {
    return Integer.toString(num);
  }
}
