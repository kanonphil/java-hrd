public class TvUser {
  public static void main(String[] args) {
    TV tv1 = new SamsungTV();
    SamsungTV tv2 = new SamsungTV();

    TV[] tvs = new TV[5];
    tvs[0] = new SamsungTV();
    tvs[1] = new LgTV();

    tv1.turnOn();
    tv1.volumeUp();
    tv1.volumeDown();
    tv1.turnOff();
  }
}
