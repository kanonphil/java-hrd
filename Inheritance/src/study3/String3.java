package study3;

public class String3 {
  public static void main(String[] args) {
    //String 클래스에서 많이 사용하는 메서드들
    String s1 = "Simple";
    String s2 = "String";

    //concat : 문자열 나열, +와 같은 역할
    //"a" + "b" => 내부적으로 "a".concat("b")를 실행
    System.out.println(s1.concat(s2));

    //length : 문자열의 길이
    System.out.println(s1.length());

    //String.valueOf(숫자) : 매개변수로 전달된 정수, 실수 모두를 문자열로 변환.
    String s3 = "10";
    System.out.println(String.valueOf(s3));

    //contains : 매개변수로 전달된 문자열의 포함 여부.
    System.out.println(s3.contains("1"));


  }
}
