package test1_9;

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
