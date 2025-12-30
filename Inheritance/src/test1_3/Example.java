package test1_3;

class A {
  public A() {
    System.out.println("생성자A");
  }
  public A(int x) {
    System.out.println("생성자A:" + x);
  }
}

class B extends A {
  public B(int x) {
    System.out.println("생성자B:" + x);
  }
}

public class Example {
  public static void main(String[] args) {
    A a = new A(10);
    B b = new B(11);
  }
}


// 생성자A:10
// 생성자A
// 생성자B:11
