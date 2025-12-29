package Test2_5;

public class MemberService {
  Member user1 = new Member("홍길동", "hong");
  Member user2 = new Member("강자바", "java");

  public boolean login(String id, String password) {
    return id.equals("hong") && password.equals("12345");
  }

  public void logout(String id) {
    System.out.println("로그아웃 되었습니다.");
  }
}
