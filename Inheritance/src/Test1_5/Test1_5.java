package Test1_5;

class A {
  public int i;
  private int j;

  public int getJ() {
    return j;
  }

  public void setJ(int j) {
    this.j = j;
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

  /*public int getSum() {
    return n + i + j;
  }*/
}

public class Test1_5 {
}


// private 접근 제어자로 선언된 멤버는 해당 클래스 내부에서만 접근 가능