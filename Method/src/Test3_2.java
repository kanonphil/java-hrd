import java.util.stream.IntStream;

public class Test3_2 {
  public static void main(String[] args) {
    printMultiple(5);
  }

  public static void printMultiple(int num) {
    IntStream.iterate(
            num,                  // 시작: 5
            n -> n <= 100,    // 조건: n이 100 이하일 때까지
            n -> n + num      // 증가: n에 5를 더한 값으로 변경
    )
            .forEach(System.out::println);
  }

  /*public static void printMultiple(int num) {
    for (int i = 1; num * i <= 100; i++) {
      System.out.println(num * i);
    }
  }*/
}
