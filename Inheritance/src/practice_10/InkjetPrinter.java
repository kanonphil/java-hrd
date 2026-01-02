package practice_10;

public class InkjetPrinter extends Printer {
  private int remainingInk;

  public InkjetPrinter(String modelName, String manufacturer, String interfaceType, int remainingPaper, int remainingInk) {
    super(modelName, manufacturer, interfaceType, remainingPaper);
    this.remainingInk = remainingInk;
  }

  @Override
  public void print() {
    if (getRemainingPaper() <= 0 && remainingInk <= 0) {
      System.out.println("용지와 잉크가 부족합니다.");
    } else if (getRemainingPaper() <= 0) {
      System.out.println("용지가 부족합니다.");
    } else if (remainingInk <= 0) {
      System.out.println("잉크가 부족합니다.");
    } else {
      super.print();
      remainingInk--;
      System.out.println("(남은 잉크: " + remainingInk + "ml)");
    }
  }
}
