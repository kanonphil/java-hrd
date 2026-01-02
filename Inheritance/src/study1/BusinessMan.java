package study1;

public class BusinessMan extends Man {
  String company;

  //모든 맴버변수를 초기화 하는게 좋은 코드!
  //상속받은 맴버변수는 어디서 초기화?
  // -> 부모 클래스의 맴버변수 초기화는 부모클래스에서 하는게 맞음!
  //상속 관게에 있는 클래스의 생성자 첫 줄에 super() 명령어가 숨겨져 있음
  public BusinessMan(String company) {
    super("kim");
    this.company = company;
  }

  public void tellCompany() {
    System.out.println("company - " + company);
  }
}
