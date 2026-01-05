package study3;

//클래스 선언 시 어떠한 클래스도 상속받지 않으면
//자동으로 Object 클래스를 상속한다.

import study2.Friend;

// 결론 : 자바의 모든 클래스는 Object 클래스를 상속한다.
// 파생 결론 : Object 클래스로 모든 객체를 받을 수 있다.
public class Student {
  private int stuNum;
  private String name;
  private int score;

  //매개변수에 무엇이든 다 넣겠다..
  public void aaa(Object a) {

  }
}
