package lambda;

public class Lambda1 {
  public static void main(String[] args) {

    Test1 t1 = (a) -> {
      System.out.println(a);
    };

    t1.aaa(10);

    Test2 t2 = (a, b) -> {
      System.out.println("a=" + a + ", b=" + b);
    };

    t2.bbb("lambda", 23);

    Test3 t3 = b -> {
      System.out.println("b=" + b);
      return b;
    };

    t3.ccc(3);
  }
}
