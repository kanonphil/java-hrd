package generic;// Generic: 자료형을 클래스나 메서드 정의 단계에서 정하지 않고,
//          객체 생성 시 자료형을 지정하는 코드 작성 문법.

// 상속: 상속한 클래스의 메서드. 변수를 내 것처럼 사용
// 다형성: 객체가 다양한 형태를 지닌다.
//        상속이 적용된 클래스의 객체를 만드는 형태가 다양

// 오렌지, 사과를 저장하고 빼낼 수 있는 상자
public class Box {
  private Object obj;

  public void set(Object obj) {
    this.obj = obj;
  }

  public Object get() {
    return obj;
  }
}

class Orange {
  public String say() {
    return "I am an generic.Orange";
  }
}

class Apple {
  public String say() {
    return "I am an generic.Apple";
  }
}