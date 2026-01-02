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

  public void disp() {
    System.out.print("x = " + x + ", y = " + y);
  }
}
