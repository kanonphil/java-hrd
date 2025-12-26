import java.util.Scanner;

public class StudentManager {
  public static void main(String[] args) {
    Student student = new Student();

    Scanner sc = new Scanner(System.in);
    String name = sc.next();
    int age = sc.nextInt();

    student.setInfo(name, age);
    student.displayInfo();
  }
}
