public class BankAccount2 {
    private String accountType;
    private double balance;

    // Default constructor
    public BankAccount() {
        this.accountType = "Checking";
        this.balance = 0.0;
    }

    // Overloaded constructor for specific account type
    public BankAccount(String accountType) {
        this.accountType = accountType;
        this.balance = 0.0;
    }

    // Overloaded constructor for specific account type with initial balance
    public BankAccount(String accountType, double initialBalance) {
        this.accountType = accountType;
        this.balance = initialBalance;
    }

    // Method to deposit cash
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Overloaded method to deposit with a description (e.g., check)
    public void deposit(double amount, String description) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount + " (" + description + ")");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Method to check balance
    public double getBalance() {
        return balance;
    }

    // Method to get account type
    public String getAccountType() {
        return accountType;
    }
}
import java.util.Scanner;

public class BankAccountManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a bank account with different constructors
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount("Savings");
        BankAccount account3 = new BankAccount("Checking", 500.0);

        // Interact with the user to perform operations
        System.out.println("Bank Account Management");
        while (true) {
            System.out.println("\n1. Deposit Cash");
            System.out.println("2. Deposit Check");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double cashAmount = scanner.nextDouble();
                    account3.deposit(cashAmount);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double checkAmount = scanner.nextDouble();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter check description: ");
                    String description = scanner.nextLine();
                    account3.deposit(checkAmount, description);
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account3.withdraw(withdrawAmount);
                    break;

                case 4:
                    System.out.println("Current balance: $" + account3.getBalance());
                    break;

                case 5:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }
}
