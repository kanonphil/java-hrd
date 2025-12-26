// 휴대폰 객체 생성을 위한 설계도
// 클래스의 구성 요소
// 1. 변수(멤버변수, 필드)
//    지금까지 선언한 변수(메서드 안에서 선언한 변수)는 지역변수라 부른다.
//    지역변수는 반드시 초기화가 필요, 멤버변수는 자동으로 초기화 진행
// 2. 메서드의 정의
// 3. 생성자

public class PhoneP {
  int price;              //가격
  String modelName;       //모델명
  String brand;           //브랜드

  String msg;
  String sender;

  //문자 보내는 기능     <- 메서드로
  public void sendSms(String msg) {
    this.msg = msg;
    System.out.println("\"" + this.msg + "\" " + "전송 완료");
  }

  //전화하기 기능           <- 메서드로
  public void call(String sender) {
    this.sender = sender;
    System.out.println(this.sender + "님으로부터 전화가 왔습니다.");
  }
}
