package test1_5;

class A {
  public int i;
  private int j;

  public int getJ() {
    return j;
  }

  public void setJ(int j) {
    this.j = j;
  }

  public void setI(int i) {
    this.i = i;
  }
}

class B extends A {
  private int n;

  public int getN() {
    return n;
  }

  public void setN(int n) {
    this.n = n;
  }

  public int getSum() {
    return n + i + getJ();
  }

  /*public int getSum() {
    return n + i + j;
  }*/
}

public class Test1_5 {
  public static void main(String[] args) {
    B b = new B();
    b.setN(10);
    b.setI(10);
    b.setJ(10);
    System.out.println(b.getSum());
  }

}


// private 접근 제어자로 선언된 멤버는 해당 클래스 내부에서만 접근 가능