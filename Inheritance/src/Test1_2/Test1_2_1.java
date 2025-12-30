package Test1_2;

class A {
  public A() {
    System.out.println("생성자A");
  }
  public A(int x) {
    System.out.println("매개변수생성자A" + x);
  }
}
class B extends A {
  public B() {
    super(30);
    System.out.println("생성자B");
  }
  public B(int x) {
    System.out.println("매개변수생성자B" + x);
  }
}

public class Test1_2_1 {
  public static void main(String[] args) {
    B b = new B();
  }
}

// 2-2
// super()는 생성자 본문의 첫 번째 구문이어야 한다.
