package optional;

import java.util.Optional;

public class Optional1 {
  public static void main(String[] args) {

    String name = "jave";

    // null 체크 기능이 있는 Optional 상자에 데이터를 담는 코드.
    Optional<String> op1 = Optional.of(name);  // null 데이터 불가
    Optional<String> op2 = Optional.ofNullable(name);  // null 데이터 허용

    // op1 상자의 데이터가 null이 아니면
    if (op1.isPresent()) {
      System.out.println(op1.get());
    }

    // 데이터가 null이 아닐 때만 실행 코드 작성하는 방법
    // 매개변수: Consumer<String>: void accept(String t);
    op2.ifPresent(str -> System.out.println(str));

    Optional<String> op3 = Optional.of("Hello World");

    // map(): 반복 + 리턴 (상자 채로 리턴함)
    // Function<String, R>: R apply(String t)
    String a = op3.map(s -> s.replace(" ", "_"))
                  .map(s -> s.toLowerCase()).get();
  }
}
