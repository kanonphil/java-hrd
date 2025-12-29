//접근제한자 : 맴버변수 및 메서드의 접근 범위를 지정하는 문법
//public > default > protected > private
// private - 맴버변수 및 메서드를 정의한 클래스 내에서만 접근 허용
// protected - 상속 개념을 알아야 이해 가능
// default - 같은 패키지 내에서 접근 허용(접근제한자를 작성하지 않는 것이 default 접근제한자다.)
// public - 같은 프로젝트 내에서 접근 허용

//결론
// 맴버변수는 항상 private 접근 제한자를 사용
// 메서드의 접근제한자는 일단은 public 사용한다.
public class Circle {
  private double r;

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
