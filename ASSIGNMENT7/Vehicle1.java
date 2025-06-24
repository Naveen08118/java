
import java.util.Scanner;
class Vehicle{

String brand;
int model;
int year;



public void input(){


System.out.println("please enter the Brand of Car");
Scanner sc=new Scanner(System.in);
String brand1=sc.nextLine();
brand=brand1;


System.out.println("please enter the model of Car");
//Scanner sc=new Scanner(System.in);
int model1=sc.nextInt();
model=model1;

System.out.println("please enter the year of Car");
//Scanner sc=new Scanner(System.in);
int year1=sc.nextInt();
year=year1;
//System.out.println("the Brand of Car"+brand);
//System.out.println("the model of car"+model);
//System.out.println("enter the year of car"+year);
}
}




class Car extends Vehicle{

String fuelType;
int seatingCapacity;

public void input(){ 
System.out.println("enter fueltype of car");
Scanner sc=new Scanner(System.in);
this.fuelType=sc.nextLine();

System.out.println("enter seatingCapacity of car");
//Scanner sc=new Scanner(System.in);
this.seatingCapacity=sc.nextInt();
//System.out.println("the fueltype of car="+fuelType);
//System.out.println("the seatingCapacity of car="+seatingCapacity);

}
public void display(){
super.input();
input();
System.out.println("the fueltype of car="+fuelType);
System.out.println("the seatingCapacity of car="+seatingCapacity);
System.out.println("the Brand of Car="+brand);
System.out.println("the model of car="+model);
System.out.println("enter the year of car="+year);



}
}
class Vehicle1{

public static void main(String[] args){

Car c=new Car();
c.display();

}
}