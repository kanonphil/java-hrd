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
  }
}
