package generic;

public class BoxTest {
  public static void main(String[] args) {
    // 가능한 것
    // 1. Box에 generic.Orange, generic.Apple 등 다른 자료형을 저장할 수 있다.

    // 불편한 점
    // 1. Box는 generic.Orange, Apple만 저장할 수 있는게 아니다.
    // 2. 데이터를 뺄 때 형변환 코드를 넣어줘야 함.
    Box b1 = new Box();
    b1.set(new Orange());
    Object orange = b1.get();
    Orange orange1 = (Orange)orange;
    orange1.say();

    Box b2 = new Box();
    b2.set(new Apple());
    Apple apple = (Apple) (b2.get());
    apple.say();
  }
}
