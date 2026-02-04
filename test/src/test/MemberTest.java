package test;

public class MemberTest {
  public static void main(String[] args) {
    Member member1 = new Member();
    member1.setInfo("java", "1234", "kim", 20);
    member1.showInfo();

    if (member1.isLogin("java", "1234")) {
      System.out.println("로그인 가능");
    } else {
      System.out.println("로그인 불가능");
    }

    if (member1.isLogin("java", "1111")) {
      System.out.println("로그인 가능");
    } else {
      System.out.println("로그인 불가능");
    }
  }
}
