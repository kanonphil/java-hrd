package test;

public class MemberTest {
  public static void main(String[] args) {
    Member member1 = new Member();
    member1.setInfo("java", "1234", "kim", 20);
    member1.showInfo();
    member1.isLogin("java", "1234");
    member1.isLogin("java", "1111");
  }
}
