package test1_11;

public class InkjetPrinter extends Printer {
  private int remainingInk;

  public InkjetPrinter(String modelName, String manufacturer, int remainingPaper, String interfaceType, int remainingInk) {
    super(modelName, manufacturer, remainingPaper, interfaceType);
    this.remainingInk = remainingInk;
  }

  @Override
  public void print() {
    if (getRemainingPaper() > 0 && remainingInk > 0) {
      super.print();
      remainingInk--;
      System.out.println("잉크젯 프린터로 인쇄 완료 (남은 잉크: " + remainingInk + "ml)");
    } else if (remainingInk <= 0) {
      System.out.println("잉크가 부족합니다!");
    } else {
      super.print();
    }
  }

  @Override
  public void showInfo() {
    super.showInfo();
    System.out.println("남은 잉크: " + remainingInk + "ml");
    System.out.println();
  }
}
