public class Test2_6 {
  public static void main(String[] args) {
    int num = 10;
    String result = getString(num);
    System.out.println(getString(num).getClass().getSimpleName() + " \"" + result + "\"");
  }

  public static String getString(int num) {
    //문자열 -> 정수
    //int a = Integer.parseInt("6");

    //정수 -> 문자열
    //string str = String.valueOf(6);

    //String.valueOf() <-> Integer.toString()
    //int Integer 모두 O <-> Integer의 값이 null인 경우 Interger.toString()에서
    //                      Integer가 아닌 int를 인자로 받고 있기 때문이다.

    return String.valueOf(num);
  }
}
