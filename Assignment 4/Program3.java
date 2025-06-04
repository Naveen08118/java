//3.) to find area or circle and area of cylinder

import java.util.Scanner;


class Area {
    
final double PI=3.14;
   int radius; 
int radius2;
int height;

    //Method to set the Area of  circle data
    public void areaOfCircle()
    {

	System.out.println("please enter radius of circle=");
Scanner sc=new Scanner(System.in);
radius=sc.nextInt();        


	double area=(PI*radius*radius);    
	System.out.println("Area of circle=" + area);

}
    

    //Method to display the areaofcylinder data
    public void areaOfCylinder () {
	

	System.out.println("please enter radius of cylinder");
Scanner sc=new Scanner(System.in);
radius2=sc.nextInt();        

	System.out.println("please enter height of cylinder");
//Scanner sc=new Scanner(System.in);
height=sc.nextInt();
double Area1=(2*(PI*radius2*radius2));    
double Area2=(2*(PI*radius2*height));
double Areaofcylinderis=Area1+Area2;
System.out.println("Area of Areaofcylinderis=" + Areaofcylinderis);
       }
}



class Program3{
public static void main(String...k){
Area ar=new Area();
    ar.areaOfCircle();
ar.areaOfCylinder();



}}