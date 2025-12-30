package Test1_11;

public class LaserPrinter extends Printer {
  private int remainingToner;

  public LaserPrinter(String modelName, String manufacturer, int remainingPaper, String interfaceType, int remainingToner) {
    super(modelName,manufacturer, remainingPaper, interfaceType);
    this.remainingToner = remainingToner;
  }

  @Override
  public void print() {
    if (getRemainingPaper() > 0 && remainingToner > 0) {
      super.print();
      remainingToner--;
      System.out.println("레이저 프린터로 인쇄 완료 (남은 토너: " + remainingToner + "g)");
    } else if (remainingToner <= 0) {
      System.out.println("토너가 부족합니다!");
    } else {
      super.print();
    }
  }

  @Override
  public void showInfo() {
    super.showInfo();
    System.out.println("남은 토너: " + remainingToner + "g");
    System.out.println();
  }
}
