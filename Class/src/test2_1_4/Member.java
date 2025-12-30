package test2_1_4;

public class Member {
  private String name;
  private String id;
  private String password;

  public Member() {

  }

  public Member(String name, String id, String password) {
    this.name = name;
    this.id = id;
    this.password = password;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void displayInfo() {
    System.out.println("이름 : " + getName());
    System.out.println("아이디 : " + getId());
    System.out.println("비밀번호: " + getPassword());
  }
}
