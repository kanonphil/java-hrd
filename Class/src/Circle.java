public class Circle {
  double r;

  //원의 둘레를 리턴    2πr
  public double getSize() {
    // PI => 상수
    return 2 * Math.PI * r;
  }

  //원의 넓이를 리턴    πr²
  public double getArea() {
    return Math.PI * Math.pow(r, 2);
  }

  public void setR(double r) {
    this.r = r;
  }
}
