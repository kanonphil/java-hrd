public class Test1_6 {
  public static void main(String[] args) {
    int i = 1;
    int count = 0;

    while (i < 101) {
      if (i % 3 == 0){
        count++;
      }
      i++;
    }
    System.out.println(count);

    int count2 = 0;
    for (int j = 1; j <= 100; j++){
      if (j % 3 == 0){
        count2++;
      }
    }
    System.out.println(count2);
  }
}
