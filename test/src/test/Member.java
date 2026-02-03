package test;

public class Member {
  private String id;
  private String pw;
  private String name;
  private int age;

  public void setInfo(String id, String pw, String name, int age) {
    this.id = id;
    this.pw = pw;
    this.name = name;
    this.age = age;
  }

  public void showInfo() {
    System.out.println("id: " + id);
    System.out.println("pw: " + pw);
    System.out.println("name: " + name);
    System.out.println("age: " + age);
  }

  public boolean isLogin(String id, String pw) {
    if (id.equals(this.id) && pw.equals(this.pw)) {
      System.out.println("로그인 가능");
      return true;
    }
    else {
      System.out.println("로그인 불가능");
      return false;
    }
  }
}
