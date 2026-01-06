public class SamsungTV implements TV {
  //tv 전원 on
  @Override
  public void turnOn() {
    System.out.println("삼성 tv - 전원 켬");
  }

  //tv 전원 off
  @Override
  public void turnOff() {
    System.out.println("삼성 tv - 전원 끔");
  }

  //볼륨 up
  @Override
  public void volumeUp() {
    System.out.println("삼성 tv - 소리 올림");
  }

  //볼륨 down
  @Override
  public void volumeDown() {
    System.out.println("삼성 tv - 소리 내림");
  }
}
