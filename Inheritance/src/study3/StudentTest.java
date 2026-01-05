package study3;

import study2.Cake;
import study2.UnivFriend;

public class StudentTest {
  public static void main(String[] args) {
    Student s = new Student();
    Object a = new Student();
    Object b = new Cake();

    //Object 클래스에 선언된 equlas() 메서드
    //public boolean equals(Object a)
    //현재 객체와 매개변수로 전달된 데이터가 같으면 true를 리턴하는 메서드
    //같다라는 의미는 개발자가 정하는 거다.
    //그렇지만 자바에서 의미하는 기본적인 같다의 의미는 '같은 주소값을 참조하고 있다'이다.

    UnivFriend f1 = new UnivFriend("aa", "010", "aa");
    UnivFriend f2 = new UnivFriend("aa", "010", "aa");
    System.out.println(f1.equals(f2));

    f2 = f1;
    System.out.println(f1.equals(f2));
  }
}
