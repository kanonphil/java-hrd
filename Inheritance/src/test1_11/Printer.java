package test1_11;

public class Printer {
  private String modelName;
  private String manufacturer;
  private int printCount;
  private int remainingPaper;
  private String interfaceType;

  public Printer(String modelName, String manufacturer, int remainingPaper, String interfaceType) {
    this.modelName = modelName;
    this.manufacturer = manufacturer;
    this.printCount = 0;
    this.remainingPaper = remainingPaper;
    this.interfaceType = interfaceType;
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

  public void showInfo() {
    System.out.println("=== 프린터 정보 ===");
    System.out.println("모델명: " + modelName);
    System.out.println("제조사: " + manufacturer);
    System.out.println("인터페이스: " + interfaceType);
    System.out.println("인쇄 매수: " + printCount);
    System.out.println("남은 용지: " + remainingPaper + "매");
  }

  public int getRemainingPaper() {
    return remainingPaper;
  }

  public int getPrintCount() {
    return printCount;
  }
}
