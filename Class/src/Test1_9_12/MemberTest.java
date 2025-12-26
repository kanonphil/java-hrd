package Test1_9_12;

public class MemberTest {
  public static void main(String[] args) {
    Member member = new Member("홍길동", "asdf", "1234", 20);

    member.printAllData();
    member.setMember("김길동", "zxxxc", "1231", 25);
    member.printAllData();
  }
}
