// Account.java
class Account {
    protected String accountNumber; // Accessible to subclasses
    protected double balance;       // Accessible to subclasses

    // Constructor
    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Setters (for flexibility, not necessarily always needed)
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method to deposit funds
    public void deposit(double amount) {
        balance += amount;
    }

    // Method to withdraw funds
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

// SavingsAccount.java
class SavingsAccount extends Account {
    private double interestRate; // Private to this class

    public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance); // Call the Account constructor
        this.interestRate = interestRate;
    }

    // Getter for interestRate
    public double getInterestRate() {
        return interestRate;
    }

    // Setter for interestRate (example)
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    // Method to calculate and add interest (example)
    public void addInterest() {
        double interest = balance * interestRate;
        deposit(interest);
    }
}

// CurrentAccount.java
class CurrentAccount extends Account {
    private double overdraftLimit; // Private to this class

    public CurrentAccount(String accountNumber, double initialBalance, double overdraftLimit) {
        super(accountNumber, initialBalance); // Call the Account constructor
        this.overdraftLimit = overdraftLimit;
    }

    // Getter for overdraftLimit
    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    // Setter for overdraftLimit (example)
    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    // Override withdraw to handle overdrafts (example)
    @Override
    public void withdraw(double amount) {
        if (balance - amount >= -overdraftLimit) {
            balance -= amount;
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }
}



public class Main5{
public static void main(String...k){

//Scanner sc =new Scanner


SavingsAccount sa=new SavingsAccount("30389800",74093,5);
System.out.println("savings acccout added");


sa.addInterest();
System.out.println("savings acccout added2");
CurrentAccount ca=new CurrentAccount("34567800",460000,20000);
ca.withdraw(4500);
System.out.println("savings acccout added3");
}
}