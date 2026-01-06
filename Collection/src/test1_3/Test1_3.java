package test1_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1_3 {
  public static void main(String[] args) {
    List<String> name = new ArrayList<>();
    name.add("홍길동");
    name.add("김길동");
    name.add("이길동");

    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    if (name.contains(str)) {
      System.out.println("해당 이름이 존재합니다.");
    }
  }
}
