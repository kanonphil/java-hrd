package Test1_16;

public class StudentTest {
  public static void main(String[] args) {
    Student s1 = new Student();
    s1.initStudent("홍길동", 20, "울산광역시", 1111111, "010-0000-0000");
    s1.print();

    Student s2 = new Student();
    s2.setName("김길동");
    s2.setAge(22);
    s2.setAddress("대구광역시");
    s2.setStudentNumber(2222222);
    s2.setPhoneNumber("010-1111-1111");
    System.out.println("학생 정보");
    System.out.println("이름: " + s2.getName());
    System.out.println("나이: " + s2.getAge());
    System.out.println("주소: " + s2.getAddress());
    System.out.println("학번: " + s2.studentNumber);
    System.out.println("연락처: " + s2.phoneNumber);
    System.out.println();
  }
}
