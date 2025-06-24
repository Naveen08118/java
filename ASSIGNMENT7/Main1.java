
//Assignment 4: Use of `super` Keyword - Customer Billing System

import java.util.Scanner;
class Customer{

int customerId;
String customerName;
Customer(){

System.out.println("please enter the CUSTOMERID ");
Scanner sc=new Scanner(System.in);
this.customerId=sc.nextInt();
System.out.println("please enter the CUSTOMER_NAME ");
sc.nextLine();
customerName=sc.nextLine();


}
public void display(){


System.out.println("entered CUSTOMERID is = "+this.customerId);
System.out.println("entered CUSTOMER_NAME is ="+this.customerName);
}

}

class Billing extends Customer {


double actualamt;
double baramount;
//error super must be first statement inside constructor
Billing(){

super();
}



public void calculateDiscount(){

super.display();

System.out.println("please enter the ACTUAL_AMOUNT ");
Scanner sc=new Scanner(System.in);
this.actualamt=sc.nextDouble();

System.out.println("please enter the BARGAIN AMOUNT ");
this.baramount=sc.nextDouble();

double discount=(actualamt-baramount);
System.out.println("discount is equals to="+discount);



}
}
public class Main1{

public static void main(String...k){

Billing bil=new Billing();
bil.calculateDiscount();
}
}