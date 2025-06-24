//Assignment 5: Final Method - Banking System
class BankAccount{

final void generateAccountNumber(){
System.out.println("account number final method entered");

}

}

class SavingsAccount extends BankAccount{

void generateAccountNumber(){
System.out.println("savings account number final method entered");

}

}class Main14{

public static void main(String...k){


SavingsAccount sa=new SavingsAccount();
sa.generateAccountNumber();
}
}