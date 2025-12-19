public class Test1_4 {
  public static void main(String[] args) {
    int i = 11;
    while (i > -1) {
      System.out.println(i);
      i--;
    }

    for (int n = 0; n < 30; n++){
      System.out.print("=");
    }
    System.out.println();

    String result = "";
    for (int j = 10; j >= 0; j--){
      result += j + "\n";
    }

    System.out.println(result);
  }
}
