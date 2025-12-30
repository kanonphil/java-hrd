package Test1_7;

class LCD {
  int size;
  public LCD(int n) {
    size = n;
  }
}

class ColorLCD extends LCD {
  int colorSize;
  public ColorLCD(int colorSize, int size) {
    super(size); // 답
    this.colorSize = colorSize;
  }
}

public class Test1_7 {
}
