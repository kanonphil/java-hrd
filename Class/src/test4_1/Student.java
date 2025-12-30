package test4_1;

public class Student {
  private PersonInfo personInfo;
  private Sungjuk sungjuk;

  public Student() {
    this.personInfo = new PersonInfo("", 0, "");
    this.sungjuk = new Sungjuk(0, 0, 0);
  }

  public void setInfo(String name, int age, String address) {
    this.personInfo = new PersonInfo(name, age, address);
  }

  public void setSungjuk(int korScore, int engScore, int mathScore) {
    this.sungjuk = new Sungjuk(korScore, engScore, mathScore);
  }

  public void displayStudentInfo() {
    personInfo.showInfo();
    sungjuk.showInfo();
  }
}
