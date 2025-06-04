//Assignment 9: Bank Account Simulation

class BankAccount {
double account_number;
String name;

BankAccount(double account_number1){
double account_number=account_number1;
System.out.println("account number is="+account_number);
}
BankAccount (double account_number1,String name1){
double account_number=account_number1;
String name=name1;
System.out.println("account number is="+account_number);
System.out.println("name of account user is="+name);
}

void deposit(int deposit1){

int deposit=deposit1;
System.out.println("the deposited value size in int ="+deposit);

}

void deposit(double deposit2){

double  deposit=deposit2;

System.out.println("the deposited value size in int ="+deposit);
}


void withdraw(int withdraw1){

//int deposit=deposit1;
int withdraw=withdraw1;
//withdraw=deposit-withdraw;
System.out.println("amount withdrawn is="+withdraw);
}
void withdraw(double withdraw2){


//double deposit=deposit2;
double withdraw=withdraw2;
//double total_Amount=deposit-withdraw;
System.out.println("the withdrawn amount is="+withdraw);
}




public static void main(String...k){

BankAccount ba=new BankAccount(30339004958d);
BankAccount ba1=new BankAccount(3473898080d,"v n kumar");
ba.deposit(1000);
ba1.deposit(203000);
ba.withdraw(2000);
ba1.withdraw(34900);

}
}