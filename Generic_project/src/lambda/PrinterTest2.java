package lambda;

public class PrinterTest2 {
  public static void main(String[] args) {

//    Printable prn = new Printable() {
//      @Override
//      public void print() {
//        System.out.println(111);
//      }
//    };

    // 람다표현식 (interface 안에 메서드가 여러 개 이면 사용 불가능)
    Printable prn = () -> System.out.println(111);

    prn.print();
  }
}
