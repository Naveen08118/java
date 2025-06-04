//4.Define a class Flight with following description:
//Private Members : 
//Flight Number, Destination, Distance and Fuel (instance variable)

import java.util.Scanner;
class Flight{

private String Flight_Number;
private String Destination;
private double Distance;
private double Fuel;

Flight(){
System.out.println("please enter Flight Number");
Scanner sc=new Scanner(System.in);
Flight_Number=sc.nextLine();

System.out.println("please enter Destination");

Destination=sc.nextLine();

System.out.println("please enter Distance ");

Distance =sc.nextDouble();

System.out.println("please enter Fuel ");
Fuel =sc.nextDouble();
}


public void calFuel(){

if(Distance<=1000){
Fuel=500;
}
else if((Distance>1000 && Distance<=2000)){
Fuel=1100;

}else if((Distance>2000))
{Fuel=2200;
}
System.out.println(Fuel);
}                                                          



public void showInfo(){

System.out.println("entered  Flight Number="+ Flight_Number);
System.out.println("entered  Destination="+ Destination);
System.out.println("entered  Distance="+ Distance);
System.out.println("updated   Fuel="+ Fuel);


}
}


public class Program4{


public static void main(String...k)
{

Flight fl=new Flight();
fl.calFuel();
fl.showInfo();

}


}