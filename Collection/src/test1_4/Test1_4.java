package test1_4;

import java.util.ArrayList;

public class Test1_4 {
  public static void main(String[] args) {
    ArrayList<Integer> rand = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      rand.add((int) (Math.random() * 100 + 1));
    }

    System.out.println("생성된 랜덤 숫자: " + rand);

    ArrayList<Integer> evenNum = new ArrayList<>();
    for (Integer integer : rand) {
      if (integer % 2 == 0) {
        evenNum.add(integer);
      }
    }

    System.out.println("짝수의 개수: " + evenNum.size());
    System.out.println("모든 짝수: " + evenNum);
  }
}
