//Assignment 2: Interface - Payment Gateway

//interface consists of abstract methods by default

interface PaymentGateway{


void pay();
void refund();
}
class CreditCardPayment implements PaymentGateway{

public void pay(){

System.out.println("CreditCardPayment payment implemented");


}
public void refund(){

System.out.println("refund implemented");
}

}
class UPIPayment implements PaymentGateway{



public void pay(){

System.out.println("UPIPayment payment implemented");


}
public void refund(){

System.out.println(" UPIPayment  refund implemented");


}





}
 

class gateway{


public static void main(String...k){

PaymentGateway pg=new UPIPayment();
pg.pay();
pg.refund();

}

}