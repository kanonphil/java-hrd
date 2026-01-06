public class LgTV implements TV {
  @Override
  public void turnOn() {
    System.out.println("엘지 tv - 전원 켬");
  }

  @Override
  public void turnOff() {
    System.out.println("엘지 tv - 전원 끔");
  }

  @Override
  public void volumeUp() {
    System.out.println("엘지 tv - 소리 올림");
  }

  @Override
  public void volumeDown() {
    System.out.println("엘지 tv - 소리 내림");
  }
  /*
  //tv 전원 on
  public void turnOn() {
    System.out.println("엘지 tv - 전원 켬");
  }
  //tv 전원 off
  public void turnOff() {
    System.out.println("엘지 tv - 전원 끔");
  }
  //볼륨 up
  public void soundUp() {
    System.out.println("엘지 tv - 소리 올림");
  }
  //볼륨 down
  public void soundDown() {
    System.out.println("엘지 tv - 소리 내림");
  }*/
}
