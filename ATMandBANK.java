package bank;
public class Account {
    private String accountNumber;
    protected double balance;
    String accountHolderName;  
    public String bankName;
	public Account(String accountNumber, double balance, String accountHolderName, String bankName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
        this.bankName = bankName;
    }
private void displayAccountNumber() {
        System.out.println("Account Number: " + accountNumber);
    }
protected void displayBalance() {
        System.out.println("Balance: " + balance);
    }
void displayAccountHolderName() {
        System.out.println("Account Holder Name: " + accountHolderName);
    }
public void displayBankName() {
        System.out.println("Bank Name: " + bankName);
    }
 public void showAccountNumber() {
        displayAccountNumber(); 
	}
}
package bank;

public class Bank {
    public static void main(String[] args) {
        Account account = new Account("1235", 1000.00, "sneha", "Bank of Example");
        
        
        account.displayBalance();            
        account.displayAccountHolderName();
        account.displayBankName();          
        account.showAccountNumber();         
}
package atm;
import bank.Account;
public class ATMandBANK {
    public static void main(String[] args) {
        Account account = new Account("1234", 500.00, "krishna", "Example Bank");
		account.displayBankName();        
		account.showAccountNumber();     
    }
}
}