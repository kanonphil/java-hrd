package test;

import java.util.Objects;

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
    return Objects.equals(this.id, id) && Objects.equals(this.pw, pw);
  }
}
