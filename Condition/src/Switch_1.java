public class Switch_1 {
  public static void main(String[] args) {
    int num = 5;

    //switch문은 조건이 일치하는 위치부터 코드를 실행
    switch (num) {
      case 1:
        System.out.println(1);
        System.out.println(1);
        break;
      case 2:
        System.out.println(2);
        System.out.println(2);
        break;
      case 3:
        System.out.println(3);
        System.out.println(3);
      default:
        System.out.println(4);
        System.out.println(4);
    }
  }
}
