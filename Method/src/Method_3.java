public class Method_3 {
  public static void main(String[] args) {
    System.out.println("시작");
    printAge(20);
    printAge(30);
    printAge(40);

    int age = 40;
    printAge(age);

    System.out.println("종료");
  }

  //나이를 출력하는 메서드 정의
  public static void printAge(int age) {
    System.out.println("나이는 " + age);
  }
}
