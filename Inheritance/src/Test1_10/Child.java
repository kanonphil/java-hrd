package Test1_10;

public class Child extends Parent {
  private String name;

  public Child() {
    this("홍길동");
    System.out.println("Child() call");
  }

  public Child(String name) {
    this.name = name;
    System.out.println("Child(String name) call");
  }
}

/*
호출 순서.
1. Child child = new Child();로 Child()의 기본 생성자 호출
2. Child() 생성자 내부
   this("홍길동") -> Child(String name) 생성자 호출
3. Child(String name) 생성자 내부
   자동으로 super()삽입 후 Parent() 호출
4. Parent() 생성자 내부
   this("대한민국") -> Parent(String nation) 생성자 호출
5. Parent(String nation) 생성자 내부
   this.nation = nation 실행
   "Parent(String nation) call" 출력
6. Parent() 생성자로 복귀
   "Parent() call" 출력
7. Child(String name) 생성자로 복귀
   this.name = name 실행
   "Child(String name) call" 출력
8. Child() 생성자로 복귀
   "Child() call" 출력
*/