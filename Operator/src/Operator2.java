public class Operator2 {
  public static void main(String[] args) {
    //증감연산자
    // ++, --
    int num1 = 5;
    num1++; //num1의 값을 1 증가
    System.out.println(num1); //6
    --num1; //num1의 값을 1 감소
    System.out.println(num1); //5

    int num2 = 5;
    int num3 = ++num2;
    System.out.println(num3); //6

    int num4 = num3++;
    System.out.println(num4); //6
    System.out.println(num3); //7

    //복합대입연산자
    int a = 3;
    int b = 7;
    a += b; // a = a + b;
    a /= 3; // a = a / 3;
    a *= b; // a = a * b;

    int score = 90;

    //score 값을 1 증가 시키는 코드
    ++score;
    score++;
    score = score + 1;
    score += 1;

    //삼항연산자
    int q = 10 > 3 ? 5 : 1; // 조건식 ? (값 또는 연산식 : 값 또는 연산식);
    System.out.println(q);
  }
}
