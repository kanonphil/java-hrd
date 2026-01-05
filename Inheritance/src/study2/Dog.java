package study2;

class Animal {
  public void cry() {
    System.out.println("동물이 웁니다.");
  }
}

public class Dog extends Animal {
  @Override
  public void cry() {
    System.out.println("강아지가 웁니다.");
  }
}

class Cat extends Animal {
  @Override
  public void cry() {
    System.out.println("고양이가 웁니다.");
  }
}

class Cow extends Animal {
  @Override
  public void cry() {
    System.out.println("소가 웁니다.");
  }
}


/*
친구가 프로그램 개발 의뢰
- 동물병원을 운영하고 있음.
- 동물병원에 케이지가 5개 있다. (최대 5마리)
- 강아지, 고양이, 소를 관리한다.
- 이 동물들이 각각 몇마리 들어올지는 모름
- 이 환경에서 동물들을 관리하는 시스템을 만들어줘

동물을 5마리 저장할 공간이 있어야 함
강아지 5, 고양이 5, 소 5마리 들어갈 수 있는 공간을 만들어서 프로그램을 구현.
*/