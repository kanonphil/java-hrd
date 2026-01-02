package test1_9;

class A {
  private int x;
  private int y;

  public A() {
    this.x = 1;
    this.y = 1;
  }

  public A(int x) {
    this.x = x;
    this.y = 1;
  }

  public A(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }
}

class B extends A {
  private int x;
  private int y;

  public B() {
    super();
    this.x = 1;
    this.y = 1;
  }

  public B(int ax) {
    super(ax);
    this.x = 1;
    this.y = 1;
  }

  public B(int ax, int ay) {
    super(ax, ay);
    this.x = 1;
    this.y = 1;
  }

  public B(int ax, int ay, int bx) {
    super(ax, ay);
    this.x = bx;
    this.y = 1;
  }

  public B(int ax, int ay, int bx, int by) {
    super(ax, ay);
    this.x = bx;
    this.y = by;
  }

  public void disp() {
    System.out.println("x = " + getX() + ", y = " + getY() + ", x = " + this.x + ", y = " + this.y);
  }
}

public class Work {
  public static void main(String[] args) {
    B bp = new B();
    B bp1 = new B(10);
    B bp2 = new B(10, 20);
    B bp3 = new B(10, 20, 30);
    B bp4 = new B(10, 20, 30, 40);
    bp.disp();
    bp1.disp();
    bp2.disp();
    bp3.disp();
    bp4.disp();
  }
}
