package Test1_9_12;

public class Member {
  String name;
  String userId;
  String password;
  int age;

  public Member(String name, String userId, String password, int age) {
    this.name = name;
    this.userId = userId;
    this.password = password;
    this.age = age;
  }

  public void setMember(String name, String userId, String password, int age) {
    this.name = name;
    this.userId = userId;
    this.password = password;
    this.age = age;
  }

  public void printAllData() {
    System.out.println("이름: " + name);
    System.out.println("아이디: " + userId);
    System.out.println("비밀번호: " + password);
    System.out.println("나이: " + age);
  }
}
