package Test1_1;

public class Child extends Parent {
  private int studentNo;

  public Child(String name, int studentNo) {
    // 부모 클래스의 생성자가 먼저 호출되어야 함.
    super(name);
    this.studentNo = studentNo;
  }
}
