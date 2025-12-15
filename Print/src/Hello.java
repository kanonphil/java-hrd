//자바의 모든 내용은 클래스 안에 작성한다!
//클래스 안에는 반드시 main 메서드가 존재해야 한다.
//우리가 작성하는 코드는 반드시 main 매서드 안에 작성한다.
//코드 해석은 main 메서드 안의 첫 줄 부터 차례로 해석함.
public class Hello {
  public static void main(String[] args) {
    //출력문. 소괄호 안의 내용을 출력 + 한 줄 개행
    //문자열을 출력할 때에는 반드시 쌍따옴표에 감싸야 함!
    //문자 : 한 글자, 문자열 : 한 글자 이상의 글자
    System.out.println("hi~");
    System.out.println("A");

    //소괄호 안의 내용을 출력
    System.out.print("hi~");
    System.out.print("hi~");
    System.out.println("hi~");

    //숫자는 쌍따옴표에 감싸지 않는다
    System.out.println(5);
    System.out.println("5");


    /*int count;
    count = 10;

    System.out.println("count");
    System.out.println(count);
    System.out.println("count = " + count);
    System.out.println("5" + count);
    System.out.println(5 + count);
    System.out.println("변수 count의 값은 " + count + "입니다");

    int money;
    money = 100;
    System.out.println("money = " + money);

    money = 1000;
    System.out.println("money = " + money);

    money = 50 + 100;
    System.out.println("money = " + money);

    money = money - 50;
    System.out.println("money = " + money);

    int a;
    a = 10;
    int b;
    b = 20;
    int c;
    c = a + b;

    System.out.println(c);
    System.out.println("a + b = " + c);
    System.out.println(a + " + " + b + " = " + c);*/
  }
}
