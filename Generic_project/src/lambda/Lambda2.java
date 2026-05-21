package lambda;

// 자바에서 만들어준 함수형 인터페이스의 대표들
// 1. Predicate<T>: boolean test(T t);
//    전달 인자를 근거로 참 또는 거짓 결과를 반환

// 2. Supplier<T>: T get();
//    메서드 결과 데이터를 반환

// 3. Consumer<T>: void accept(T t);
//    인자로 데이터를 받아가고 결과 데이터는 반환하지 않음

// 4. Function<T, R>: R apply(T t);
//

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Lambda2 {
  public static void main(String[] args) {

    // Function<T, R>: R apply(T t);
    // 문자열 데이터가 주어지면 해당 문자열의 길이를 리턴하는 기능
    Function<String, Integer> f = str -> str.length();
    System.out.println(f.apply("abc"));
    System.out.println(f.apply("abcde"));

    List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

    // Consumer<? extends Integer> action
    // Consumer<Integer> action
    Consumer<Integer> c = num -> System.out.println(num);
    list.forEach(c);

    // 리스트의 정수를 차례로 출력
    list.forEach(num -> System.out.println(num));

    System.out.println();
    System.out.println();

    // 짝수만 삭제하는 기능 구현
    list.removeIf(n -> n % 2 == 0);

    // Predicate<? extends Integer> action
    // Predicate<Integer>: boolean test(Integer t)
    Predicate<Integer> p = num -> num % 2 == 0;
    list.remove(p);

    list.forEach(System.out::println);

    // 짝수의 합
    //printEvenSum(list);
    Predicate<Integer> p1 = num -> num % 2 == 0;
    sum(list, p1);

    // 홀수의 합
    //printOddSum(list);
    Predicate<Integer> p2 = num -> num % 2 == 1;
    sum(list, p2);

  }

  // 내 입맛에 맞는 합을 리턴하는 메서드
  public static int sum(List<Integer> list, Predicate<Integer> p) {
    int sum = 0;

    for (int e : list) {
      if (p.test(e)) {
        sum = sum + e;
      }
    }

    return sum;
  }

  public static void printEvenSum(List<Integer> list) {
    int evenSum = list.stream()
            .filter(n -> n % 2 == 0)
            .mapToInt(Integer::intValue)
            .sum();

    System.out.println(evenSum);
  }

  public static void printOddSum(List<Integer> list) {
    int oddSum = list.stream()
            .filter(n -> n % 2 != 0)
            .mapToInt(Integer::intValue)
            .sum();

    System.out.println(oddSum);
  }
}
