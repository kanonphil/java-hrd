public class PhoneTest {
  public static void main(String[] args) {
    //기본자료형
    int num; //변수

    //배열
    int[] arr; //배열, 참조변수, 변수(비추천)

    //Phone 클래스에 대한 객체 선언
    PhoneP p1; //참조변수, 객체, 인스턴스, 변수(비추천)

    //객체 생성
    p1 = new PhoneP();

    //클래스명 객체명 = new 클래스명();
    PhoneP p2 = new PhoneP();

    //객체에 포함된 맴버변수에 접근하는 문법
    // -> 객체명.맴버변수명;

    //p1 인스턴스의 가격정보를 출력
    System.out.println(p1.price);

    //p1 인스턴스의 모델명을 "s20"으로 변경
    System.out.println(p1.modelName);
    p1.modelName = "s20";
    System.out.println(p1.modelName);
    System.out.println(p2.modelName);

    //객체에 포함된 메서드 호출 문법
    // -> 객체명.메서드호출;
    p1.sendSms("안녕하세요");
    p1.call("홍길동");
  }
}
