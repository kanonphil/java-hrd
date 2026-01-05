package study2;

public class Hos {
  public static void main(String[] args) {
    Animal[] cage = new Animal[5];

    cage[0] = new Dog();
    cage[1] = new Cat();
    cage[2] = new Cow();
    cage[3] = new Cow();
    cage[4] = new Dog();

    for (Animal animal : cage) {
      animal.cry();
    }
  }
}
