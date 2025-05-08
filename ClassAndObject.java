class student {
  String name;
  int age;
  int rollNumber;

  // Constructor
  student(String name, int age, int rollNumber) {
    this.name = name;
    this.age = age;
    this.rollNumber = rollNumber;
  }

  // display details
  void displayDetails() {
    System.out.println("Name: " + name);
    System.out.println("age: " + age);
    System.out.println("Roll Number: " + rollNumber);
    System.out.println("---------------------------");

  }

}

class ClassAndObject {

  public static void main(String[] args) {
    student s1 = new student("Krishna", 24, 3);
    student s2 = new student("Sonam", 23, 2);

    s1.displayDetails();
    s2.displayDetails();

  }
}
