class Person {

  void greet(String name) {
    System.out.println("Hello, " + name);
  }

  void greet() {
    System.out.println("Hello!");
  }

  void displayDetails() {
    System.out.println("This is a person.");
  }
}

class Employee extends Person {

  @Override
  void greet() {
    super.greet();
    System.out.println("Welcome to the company!");
  }

  void greet(String name) {
    System.out.println("Hello, " + name + ", welcome to the company!");
  }

  @Override
  void displayDetails() {
    System.out.println("This is an employee.");
  }
}

public class MethodOverloadOverride {
  public static void main(String[] args) {
    // Creating objects
    Person person = new Person();
    person.greet(); // Calling greet without argument (from Person)
    person.greet("John"); //

    System.out.println("--------------------");

    Employee emp = new Employee();
    emp.greet(); // Calling overridden greet() (from Employee)
    emp.greet("Raj"); // Calling overloaded greet() (from Employee)
    emp.displayDetails(); // Calling overridden displayDetails() (from Employee)
  }
}
