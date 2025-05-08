package src.package1;

public class ClassInPackage1 {
  public int publicVar = 10;
  protected int protectedVar = 20;
  int defaultVar = 30; // default access modifier
  private int privateVar = 40;

  // Method to print values
  public void printValues() {
    System.out.println("Public: " + publicVar);
    System.out.println("Protected: " + protectedVar);
    System.out.println("Default: " + defaultVar);
    System.out.println("Private: " + privateVar);
  }
}
