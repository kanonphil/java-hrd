package generic;

// 특정 메서드에만 제네릭 적용
public class GBox3 {

  // 제네릭 문법이 적용된 메서드
  // 매개변수로 객체가 전달되면 그 객체를 담고 있는 상자를 리턴하는 메서드
  public <T> GBox<T> makeBox(T t) {
    GBox<T> box = new GBox<>();
    box.set(t);
    return box;
  }

  public <T> void aaa(GBox<T> t) {

  }

  // 와일드카드
  public void bbb(GBox<?> t) {

  }

  // 와일드카드 + 상한 제한(개발자 실수 방지) generic.Phone, generic.SmartPhone
  public void ccc(GBox<? extends Phone> t) {
  // public void ccc(generic.GBox<generic.Phone> t){
  }

  // 와일드카드 + 하한 제한 Object, generic.Phone
  public void ddd(GBox<? super Phone> t) {

  }

  // Box에 저장된 데이터를 읽기
  // 데이터를 읽기만 하는 역할 (Producer)
  public void outBox(GBox<? extends Toy> box) {
    Toy t = box.get(); // 안전하게 Toy로 꺼낼 수 있음
    // box.set(new generic.Toy()); // ERROR: 구체적으로 어떤 하위 타입인지 모름
  }

  // Box에 데이터를 넣기
  // 데이터를 저장하기만 하는 역할 (Consumer)
  public void inBox(GBox<? super Toy> box) {
    // generic.Toy y = box.get(); // ERROR: Toy의 부모일 수 있어 Object로만 반환됨
    Object obj = box.get(); // 이건 가능
    box.set(new Toy()); // 안전하게 Toy나 그 자식들을 넣을 수 있음
  }
}
