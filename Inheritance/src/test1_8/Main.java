package test1_8;

class A {
  private int n;

  public int getN() {
    return n;
  }

  public void setN(int i) {
    n = i;
  }
}

class B {
  public String s;
  private int n;
  public int m;
  private char c;

  public int getN() {
    return n;
  }

  public void setN(int i) {
    n = i;
  }

  public char getC() {
    return c;
  }

  public void setC(char ch) {
    c = ch;
  }
}

class C extends B {
  public double d;
}

public class Main {
  public static void main(String[] args) {

  }
}
