public class Circle {
  double r;

  public void setR(double r) {
    if (r < 0) {
      this.r = 0.0;
    }
    else {
      this.r = r;
    }
  }

  //원의 둘레를 리턴    2πr
  public double getSize() {
    // PI => 상수
    return 2 * Math.PI * r;
  }

  //원의 넓이를 리턴    πr²
  public double getArea() {
    return Math.PI * Math.pow(r, 2);
  }
}
