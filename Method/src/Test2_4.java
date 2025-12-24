import java.util.Arrays;
import java.util.stream.Collectors;

public class Test2_4 {
  public static void main(String[] args) {
    String result = sumString("안녕", "하세요");
    System.out.println(result);
  }

  public static String sumString(String... strings) {
    //String.join 사용
    return String.join("", strings);
    //stream 사용
    //return Arrays.stream(strings).collect(Collectors.joining());
  }
}
