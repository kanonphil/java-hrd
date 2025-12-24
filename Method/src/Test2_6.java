public class Test2_6 {
  public static void main(String[] args) {
    int num = 10;
    System.out.println(getIntToString(num).getClass().getSimpleName() + " \"" + getIntToString(num) + "\"");
  }

  public static String getIntToString(int num) {
    String str = Integer.toString(num);
    return str;
  }
}
