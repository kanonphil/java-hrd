package study2;

public class FriendManager {
  public static void main(String[] args) {
    Friend[] fs = new Friend[10];
    int cnt = 0;

    fs[cnt++] = new UnivFriend("LEE", "Computer", "010-333-555");
    fs[cnt++] = new UnivFriend("SEO", "Electronics", "010-222-444");

    fs[cnt++] = new CompFriend("YOON", "R&D 1", "02-123-999");
    fs[cnt++] = new CompFriend("PARK", "R&D 2", "02-321-777");

    for (int i = 0; i < cnt; i++) {
      fs[i].showInfo();
      System.out.println();
    }
  }
}
