class Employee {
  String name;
  int age;
  double salary;

  Employee() {
    name = "Unknown";
    age = 0;
    salary = 0.0;
  }

  Employee(String name, int age, double salary) {
    this.name = name;
    this.age = age;
    this.salary = salary;
  }

  void displayDetails() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Salary: ₹" + salary);
    System.out.println("-----------------------");
  }
}

public class Constructors {
  public static void main(String[] args) {

    Employee emp1 = new Employee();
    emp1.displayDetails();

    Employee emp2 = new Employee("Raj", 30, 50000.0);
    emp2.displayDetails();
  }
}
