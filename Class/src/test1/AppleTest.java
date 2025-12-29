package test1;
import test1.inner.Banana;
import test2.Orange;

public class AppleTest {
  public static void main(String[] args) {
    //바나나 객체
    Banana banana = new Banana();
    banana.banana();

    //사과 객체
    //java.util.aaa -> java/util/aaa
    Apple apple = new Apple();
    //apple.price; 접근 가능

    //오렌지 객체
    Orange orange = new Orange();
    //orange.price; 접근 불가
    orange.orange();
  }
}
