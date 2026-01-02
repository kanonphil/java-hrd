package practice_10;

public class LaserPrinter extends Printer {
  private int remainingToner;

  public LaserPrinter(String modelName, String manufacturer, String interfaceType, int remainingPaper, int remainingToner) {
    super(modelName, manufacturer, interfaceType, remainingPaper);
    this.remainingToner = remainingToner;
  }

  @Override
  public void print() {
    if (getRemainingPaper() <= 0 && remainingToner <= 0) {
      System.out.println("용지와 토너가 부족합니다.");
    } else if (getRemainingPaper() <= 0) {
      System.out.println("용지가 부족합니다.");
    } else if (remainingToner <= 0) {
      System.out.println("토너가 부족합니다.");
    } else {
      super.print();
      remainingToner--;
      System.out.println("(남은 토너: " + remainingToner + "g)");
    }
  }
}
