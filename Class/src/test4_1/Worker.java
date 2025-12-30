package test4_1;

public class Worker {
  private PersonInfo personInfo;
  private WorkInfo workInfo;

  public Worker() {
    this.personInfo = new PersonInfo("", 0, "");
    this.workInfo = new WorkInfo("", "", 0);
  }

  public void setInfo(String name, int age, String address) {
    this.personInfo = new PersonInfo(name, age, address);
  }

  public void setWorkInfo(String company, String department, int salary) {
    this.workInfo = new WorkInfo(company, department, salary);
  }

  public void displayWorker() {
    personInfo.showInfo();
    workInfo.showInfo();
  }
}
