public class Test2_5 {
  public static void main(String[] args) {
    int num = (int)(Math.random() * 101);
    System.out.println(num);
    String result = getGrade(num);
    System.out.println(result);
  }

  public static String getGrade(int num) {
    //삼항 연산자
    //return num >= 90 ? "A" : num >= 70 ? "B" : "C";

    //switch expression
    return switch (num / 10) {
      case 10, 9 -> "A";
      case 8, 7 -> "B";
      default -> "C";
    };
  }
}
