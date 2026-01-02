package practice_10;

public class Printer {
  private String modelName;
  private String manufacturer;
  private String interfaceType;
  private int printCount;
  private int remainingPaper;

  public Printer(String modelName, String manufacturer, String interfaceType, int remainingPaper) {
    this.modelName = modelName;
    this.manufacturer = manufacturer;
    this.interfaceType = interfaceType;
    this.printCount = 0;
    this.remainingPaper = remainingPaper;
  }

  public void print() {
    if (remainingPaper > 0) {
      printCount++;
      remainingPaper--;
      System.out.println("인쇄 중... (남은 용지: " + remainingPaper + "매)");
    }
    else {
      System.out.println("용지가 부족합니다.");
    }
  }

  public int getRemainingPaper() {
    return remainingPaper;
  }
}
