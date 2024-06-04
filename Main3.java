//Defining Interface
interface BankingInterface 
{
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}


//SavingsAccount class
class SavingsAccount implements BankingInterface
{
    private double balance;

    public SavingsAccount(double initialBalance) 
    {
        this.balance = initialBalance;
    }

   
    public void deposit(double amount) 
    {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } 
        else 
        {
            System.out.println("Invalid deposit amount");
        }
    }

    
    public void withdraw(double amount) 
    {
        if (amount > 0 && amount <= balance) 
        {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } 
        else
        {
            System.out.println("Insufficient balance");
        }
    }

    
    public double getBalance()
    {
        return balance;
    }
}


//CurrentAccount class
class CurrentAccount implements BankingInterface
{
    private double balance;

    public CurrentAccount(double initialBalance)
    {
        this.balance = initialBalance;
    }

    
    public void deposit(double amount) 
    {
        if (amount > 0) 
        {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } 
        else 
        {
            System.out.println("Invalid deposit amount");
        }
    }

    
    public void withdraw(double amount) 
    {
        if (amount > 0 && amount <= balance) 
        {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } 
        else
        {
            System.out.println("Insufficient balance");
        }
    }

    
    public double getBalance()
    {
        return balance;
    }
}


//Main class
public class Main3
{
    public static void main(String[] args) 
    {
        
        SavingsAccount savings = new SavingsAccount(1000);
        savings.deposit(500);
        savings.withdraw(200);
        System.out.println("Savings Account Balance:$"+ savings.getBalance());

        
        CurrentAccount current = new CurrentAccount(2000);
        current.deposit(1000);
        current.withdraw(1500);
        System.out.println("Current Account Balance:$"+ current.getBalance());
    }
}
