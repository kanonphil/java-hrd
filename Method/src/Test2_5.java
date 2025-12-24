public class Test2_5 {
  public static void main(String[] args) {
    int num = (int)(Math.random() * 101);
    System.out.println(num);
    String result = getGrade(num);
    System.out.println(result);
  }

  public static String getGrade(int num) {
    return num >= 90 ? "A" : num >= 70 ? "B" : "C";
  }
}
