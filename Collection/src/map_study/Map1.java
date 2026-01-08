package map_study;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map1 {
  public static void main(String[] args) {
    //key, value
    Map<Integer, String> map = new HashMap();

    map.put(1, "홍길동");
    map.put(2, "이순신");
    map.put(3, "유관순"); //key 중복 불가
    map.put(3, "임꺽정"); //key 중복 불가
    map.put(4, "임꺽정");

    System.out.println(map.get(1));

    //모든 데이터 읽기
    //map은 순번이 없기 때문에 일반 for문 사용 불가
    //for-each문은 사용 가능. key가 빠져나옴
    //map.keySet() : map에서 key값만 추출
    for (int key : map.keySet()) {
      System.out.println("key = " + key + ", value = " + map.get(key));
    }
    System.out.println();

    //Iterator 사용
    Iterator<Integer> iterator = map.keySet().iterator();
    while (iterator.hasNext()) {
      Integer key = iterator.next();
      String value = map.get(key);
      System.out.println("key = " + key + ", value = " + value);
    }
    System.out.println();

    map.remove(1);
    System.out.println(map.get(1));
  }
}
