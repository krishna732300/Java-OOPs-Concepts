class Calculator {
  int add(int a, int b) {
    return a + b;
  }

  double add(double a, double b) {
    return a + b;
  }
}

class Animal {
  void MakeSound() {
    System.out.println("Animal makes a sound");
  }
}

class Dog extends Animal {
  @Override
  void MakeSound() {
    System.out.println("Dog barks");
  }
}

class Cat extends Animal {
  @Override
  void MakeSound() {
    System.out.println("cat meows");

  }
}

public class Polymorphism {

  public static void main(String[] args) {
    Calculator calc = new Calculator();
    System.out.println("sum(int): " + calc.add(5, 010));
    System.out.println("sum(double): " + calc.add(3.5, 3.5));
    System.out.println("------------------------");

    Animal a;
    a = new Dog();
    a.MakeSound();

    a = new Cat();
    a.MakeSound();
  }
}