public class Test1_1 {
  public static void main(String[] args) {
    int num1 = 40;
    int num2 = 20;

    if (num1 + num2 > 50) {
      System.out.println("두 수의 합이 50보다 큽니다.");
    }
    else {
      System.out.println("두 수의 합이 50이하 입니다.");
    }

    //삼항연상자 : if else문을 대체해서 사용!
    System.out.println((num1 + num2) > 50 ? "두 수의 합이 50보다 큽니다." : "두 수의 합이 50이하 입니다.");
  }
}
