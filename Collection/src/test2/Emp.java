package test2;

public class Emp {
  private int empNo;
  private String name;
  private String dept;
  private String phone;
  private int salary;

  public Emp() {
  }

  public Emp(int empNum, String name, String dept, String phone, int salary) {
    this.empNo = empNum;
    this.name = name;
    this.dept = dept;
    this.phone = phone;
    this.salary = salary;
  }

  public int getEmpNo() {
    return empNo;
  }

  public void setEmpNo(int empNo) {
    this.empNo = empNo;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDept() {
    return dept;
  }

  public void setDept(String dept) {
    this.dept = dept;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }
}
