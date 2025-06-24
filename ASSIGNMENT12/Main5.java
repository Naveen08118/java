// 6.Build a Java application that simulates a simple banking system. Implement methods for deposit and withdraw. //Use exception handling to ensure that users cannot withdraw more than their balance.   


import java.util.Scanner;




class InsufficientFundsException extends Exception {
       public InsufficientFundsException(String message) {
           super(message);
       }
   }


   class BankAccount {
       private double balance;

       public BankAccount(double initialBalance) {
           this.balance = initialBalance;
       }

       public void deposit(double amount) {
           if (amount > 0) {
               this.balance += amount;
               System.out.println("Deposit successful. Current balance: " + this.balance);
           } else {
               System.out.println("Invalid deposit amount.");
           }
       }

       public void withdraw(double amount) throws InsufficientFundsException {
           if (amount <= 0) {
              System.out.println("Invalid withdraw amount.");
           } else if (amount <= balance) {
               this.balance -= amount;
               System.out.println("Withdrawal successful. Current balance: " + this.balance);
           } else {
               throw new InsufficientFundsException("Withdrawal amount exceeds available balance.");
           }
       }

       public double getBalance() {
           return balance;
       }
   }




    public class Main5 {
        public static void main(String[] args) {
            BankAccount account = new BankAccount(1000);

System.out.println("enter amount to depsoit");
Scanner sc1 =new Scanner(System.in);
double deposit1=sc1.nextDouble();            

account.deposit(deposit1);

            try {

System.out.println("enter amount to withdraw");
Scanner sc2 =new Scanner(System.in);
double withdrawn1=sc2.nextDouble();            

                account.withdraw(withdrawn1);
            } catch (InsufficientFundsException e) {
                System.out.println("Error: " + e.getMessage());
            }

             
        }
    }