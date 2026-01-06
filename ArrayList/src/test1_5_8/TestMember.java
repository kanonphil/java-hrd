package test1_5_8;

import java.util.ArrayList;

public class TestMember {
  public static void main(String[] args) {
    ArrayList<Member> memberList = new ArrayList<>();

    Member member1 = new Member("java", "1234", "홍길동", 25);
    Member member2 = new Member("python", "5678", "김철수", 30);
    Member member3 = new Member("c++", "9012", "이영희", 28);

    memberList.add(member1);
    memberList.add(member2);
    memberList.add(member3);

    int ageSum = 0;
    for (Member member : memberList) {
      ageSum += member.getAge();
    }
    System.out.println("모든 회원의 나이의 합: " + ageSum);

    for (int i = 0; i < memberList.size(); i++) {
      if (memberList.get(i).getId().contains("java")) {
        System.out.println("회원 삭제: " + memberList.get(i));
        memberList.remove(i);
        break;
      }
    }

    System.out.println("\n삭제 후 회원 정보");
    for (Member member : memberList) {
      System.out.println(member);
    }
  }
}
