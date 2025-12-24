public class Test3_3 {
  public static void main(String[] args) {
    System.out.println(getRandomInt());
  }

  public static int getRandomInt() {
    int random = (int)(Math.random() * 50 + 1);
    return random;
  }
}
