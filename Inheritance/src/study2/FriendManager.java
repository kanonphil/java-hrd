package study2;

public class FriendManager {
  public static void main(String[] args) {
    Friend[] fs = new Friend[10];
    int cnt = 0;

    fs[cnt++] = new UnivFriend("LEE", "010-333-555", "Computer");
    fs[cnt++] = new UnivFriend("SEO", "010-222-444", "Electronics");

    fs[cnt++] = new CompFriend("YOON", "02-123-999", "R&D 1");
    fs[cnt++] = new CompFriend("PARK", "02-321-777", "R&D 2");

    for (int i = 0; i < cnt; i++) {
      fs[i].showInfo();
      System.out.println();
    }
  }
}
