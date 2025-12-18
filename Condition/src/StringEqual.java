public class StringEqual {
  public static void main(String[] args) {
    //문자열 비교에는 equals() 메서드를 사용
    String addr = "울산";
    System.out.println(addr.equals("서울"));
    System.out.println(addr.equals("울산"));


    //========================================
    String name = "홍갈동";

    //name 변수에 저장된 문자열이 "홍길동"이라면...
    if (name.equals("홍길동")) {
      System.out.println("A");
    }
  }
}
