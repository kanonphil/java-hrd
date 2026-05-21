package lambda;

public class SamsungPrinter implements Printable {

  @Override
  public void print() {

  }
}

class PrinterTest {
  public static void main(String[] args) {
    SamsungPrinter sp = new SamsungPrinter();
    sp.print();
  }
}
