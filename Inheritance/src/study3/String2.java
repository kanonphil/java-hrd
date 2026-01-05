package study3;

public class String2 {
  public static void main(String[] args) {
    //String은 immutable 변수다
    // immutable : 한 번 값이 할당되면 더 이상 그 값을 바꿀 수 없는 성질을 지닌 객체
    String a = "java";
    String b = a;

    a = "python";

    System.out.println(a); // python
    System.out.println(b); // java
  }
}
