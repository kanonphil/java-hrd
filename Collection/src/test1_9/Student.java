package test1_9;

public class Student {
  private String name;
  private int korScore;
  private int engScore;
  private int total;

  public Student() {
  }

  public Student(String name, int korScore, int engScore, int total) {
    this.name = name;
    this.korScore = korScore;
    this.engScore = engScore;
    this.total = total;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getKorScore() {
    return korScore;
  }

  public void setKorScore(int korScore) {
    this.korScore = korScore;
  }

  public int getEngScore() {
    return engScore;
  }

  public void setEngScore(int engScore) {
    this.engScore = engScore;
  }

  public int getTotal() {
    return total;
  }

  public void setTotal(int total) {
    this.total = total;
  }

  @Override
  public String toString() {
    return "Student{" +
            "name='" + name + '\'' +
            ", korScore=" + korScore +
            ", engScore=" + engScore +
            ", total=" + total +
            '}';
  }
}
