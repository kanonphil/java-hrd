package practice_10;

public class PrinterTest {
  public static void main(String[] args) {
    InkjetPrinter inkjetPrinter1 = new InkjetPrinter(
            "PIXMA TS8320",
            "Canon",
            "USB",
            100,
            50
    );

    LaserPrinter laserPrinter1 = new LaserPrinter(
         "LaserJet Pro M404dn",
         "HP",
         "병렬",
         500,
         100
    );

    //잉크 부족
    InkjetPrinter lowInk = new InkjetPrinter(
            "OfficeJet Pro 9015",
            "HP",
            "USB",
            0,
            0
    );

    //용지 부족
    LaserPrinter lowPaper = new LaserPrinter(
            "ML-2165W",
            "Samsung",
            "USB",
            0,
            50
    );

    //Test1: 정상 인쇄
    System.out.println("정상 인쇄");
    inkjetPrinter1.print();
    System.out.println();
    laserPrinter1.print();
    System.out.println();

    //Test2: 잉크 부족 테스트
    System.out.println("잉크 부족 테스트");
    lowInk.print();
    System.out.println();

    //Test3: 용지 부족 테스트
    System.out.println("용지 부족 테스트");
    lowPaper.print();
    System.out.println();

    //Test4: 연속 인쇄
    for (int i = 0; i < 5; i++) {
      laserPrinter1.print();
    }
  }
}
