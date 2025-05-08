class BankAccount {

  private double balance;

  BankAccount(double initialBalance) {
    if (initialBalance >= 0) {
      balance = initialBalance;
    } else {
      System.out.println("Invalid initial balance. Setting to 0.");
      balance = 0;
    }
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double newBalance) {
    if (newBalance >= 0) {
      balance = newBalance;
    } else {
      System.out.println("Balance cannot be negative!");
    }
  }

  public void deposit(double amount) {
    if (amount > 0) {
      balance += amount;
      System.out.println("Deposited: ₹" + amount);
    } else {
      System.out.println("Invalid deposit amount.");
    }
  }

  public void withdraw(double amount) {
    if (amount > 0 && amount <= balance) {
      balance -= amount;
      System.out.println("Withdrawn: ₹" + amount);
    } else {
      System.out.println("Insufficient balance or invalid amount.");
    }
  }
}

public class Encapsulation {

  public static void main(String[] args) {
    BankAccount acc = new BankAccount(1000);

    System.out.println("Initial Balance: ₹" + acc.getBalance());

    acc.deposit(500);
    acc.withdraw(300);
    acc.setBalance(-200);
    acc.setBalance(2000);

    System.out.println("Final Balance: ₹" + acc.getBalance());
  }
}
