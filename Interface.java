interface Printable {
  void print();
}

class Book implements Printable {
  public void print() {
    System.out.println("Printing a Book...");
  }
}

class Magazine implements Printable {
  public void print() {
    System.out.println("Printing a Magazine...");
  }
}

public class Interface {
  public static void main(String[] args) {
    Printable b = new Book();
    Printable m = new Magazine();

    b.print();
    m.print();
  }
}
