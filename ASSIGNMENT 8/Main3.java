//Assignment 3: Interface + Abstract Class - Vehicle System



interface PollutionControl{

void checkEmission();
}
abstract class Vehicle{

void start(){
System.out.println("abstract class vehicle");

}
abstract void fuelType();



}

class Car extends Vehicle implements PollutionControl {

public void checkEmission(){

System.out.println("check emission method inside CAR");

}

void start()
{

System.out.println("START method inside CAR");
}
void fuelType(){
System.out.println("fuelType method inside CAR");


}
}

class Bike extends Vehicle implements PollutionControl  {


public void checkEmission(){

System.out.println("check emission method inside Bike");

}

void start()
{

System.out.println("START method inside Bike");
}
void fuelType(){
System.out.println("fuelType method inside Bike");


}











}



class Main3{

public static void main(String...k){





Car cr=new Car();
cr.checkEmission();
cr.start();
cr.fuelType();
Bike bi=new Bike();
bi.checkEmission();
bi.start();
bi.fuelType();
}

}