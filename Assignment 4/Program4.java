//program4 in assignment 4 important need to work this below program

import java.util.Scanner;
class Flight {
    
private String Flight_Number;

private String Destination;
private double Distance;
private double Fuel;
private void calFuel()
{      
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


//public calFuel(){}
public void showInfo()
{
System.out.println("entered flight number is="+Flight_Number);
System.out.println("entered the destination station is="+ Destination);
System.out.println("entered Distance is = " + Distance);
System.out.println("basing on  distance fuel  is = " + Fuel);


}

public void feedInfo()
{

System.out.println("enter the Flight number");
Scanner sc=new Scanner(System.in);
Flight_Number=sc.nextLine();
System.out.println("enter the Destination");
Destination=sc.nextLine();
System.out.println("enter the Distance");
Distance=sc.nextDouble();
System.out.println("enter the Fuel");
Fuel=sc.nextDouble();
calFuel();
}

}


public class Program4 {
    public static void main(String...args) {
        Flight obj = new Flight();

obj.feedInfo();

obj.showInfo();        

}
   
}