public class Switch_3 {
  public static void main(String[] args) {
    //90 <= score <= 100 ===> 'A'
    //80 <= score <= 89 ===> 'B'
    //70 <= score <= 79 ===> 'C'
    //score < 70 ===> 'D'

    int score = 87;

    switch (score / 10) {
      case 9:
        System.out.println("A");
        break;
      case 8:
        System.out.println("B");
        break;
      case 7:
        System.out.println("C");
      default:
        System.out.println("D");
    }
  }
}
