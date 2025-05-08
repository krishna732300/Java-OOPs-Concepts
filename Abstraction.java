abstract class Vehical {
  abstract void move();

  void fuel() {
    System.out.println("All vehical need fuel.");
  }
}

class Car extends Vehical {
  @Override
  void move() {
    System.out.println("Car moves on four wheels.");
  }

}

class Bike extends Vehical {
  @Override
  void move() {
    System.out.println("Bikes moves on th=wo wheels.");
  }
}

public class Abstraction {

  public static void main(String[] args) {
    Vehical car = new Car();
    Vehical bike = new Bike();

    car.move();
    car.fuel();

    System.out.println("                ");

    bike.move();
    bike.fuel();
  }
}
