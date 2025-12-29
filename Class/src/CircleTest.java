public class CircleTest {
  public static void main(String[] args) {
    Circle circle = new Circle();
    // 객체명.메서드호출
    // 맴버변수의 값에 직접 접근하는 것은 지양
    // 잘못된 데이터가 들어가는 것을 막을 수 없기 때문
    //circle.r = 10.5;
    circle.setR(10.5);
    System.out.println(circle.getSize());
    System.out.println(circle.getArea());
  }
}
