public class Switch_3 {
  public static void main(String[] args) {
    //90 <= score <= 100 ===> 'A'
    //80 <= score <= 89 ===> 'B'
    //70 <= score <= 79 ===> 'C'
    //score < 70 ===> 'D'

    int score = 87;
    String grade = "";

    switch (score / 10) {
      case 10:
        grade = "A";
        break;
      case 9:
        grade = "A";
        break;
      case 8:
        grade = "B";
        break;
      case 7:
        grade = "C";
      default:
        grade = "D";
    }
    System.out.println(grade);
  }
}
