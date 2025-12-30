package test4_1;

public class WorkInfo {
  private String company;
  private String department;
  private int salary;

  public WorkInfo(String company, String department, int salary) {
    this.company = company;
    this.department = department;
    this.salary = salary;
  }

  public void showInfo() {
    System.out.println("회사명 : " + company);
    System.out.println("부서 : " + department);
    System.out.println("급여 : " + salary);
  }
}
