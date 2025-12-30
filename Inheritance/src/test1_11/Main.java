package test1_11;

public class Main {
  public static void main(String[] args) {
    InkjetPrinter inkjet = new InkjetPrinter("HP DeskJet", "HP", 100, "USB", 50);
    LaserPrinter laser = new LaserPrinter("Samsung ML", "Samsung", 200, "네트워크", 30);

    System.out.println(">>> 잉크젯 프린터 테스트 <<<");
    inkjet.showInfo();
    inkjet.print();
    inkjet.print();
    inkjet.print();
    System.out.println();
    inkjet.showInfo();

    System.out.println("\n>>> 레이저 프린터 테스트 <<<");
    laser.showInfo();
    laser.print();
    laser.print();
    laser.print();
    System.out.println();
    laser.showInfo();
  }
}
