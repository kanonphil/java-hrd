public class Test2_5 {
  public static void main(String[] args) {
    int num = (int)(Math.random() * 101);
    System.out.println(num);
    String result = getGrade(num);
    System.out.println(result);
  }

  public static String getGrade(int num) {
    if (num >= 90) {
      return "A";
    }
    else if (num >= 70) {
      return "B";
    }
    else {
      return "C";
    }
  }
}
