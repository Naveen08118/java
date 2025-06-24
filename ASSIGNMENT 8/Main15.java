//Assignment 6: Multiple Interfaces - Smart Home Devices
interface Switchable{

void addition();


}


interface Configurable{

void subtraction();


}


class SmartBulb implements Switchable,Configurable{



 public void addition(){

System.out.println("entered into additon method");
}


public void subtraction(){
System.out.println("entered into subtraction method");
}


}


class Main15{

public static void main(String...k){

SmartBulb swit=new SmartBulb();
swit.subtraction();
swit.addition();

}

}