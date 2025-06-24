//Assignment 4: Final Class - University Management


import java.util.Scanner;

final class University{
String name;
double location; 


}

class PrivateUniversity extends University{

void unv(){
System.out.println("enter ther name of university");
Scanner sc=new Scanner(System.in);
name=sc.nextLine();
this.name=name;
System.out.println("enter the location of university");

location=sc.nextDouble();

this.location=location;
}
}

class Main13{

public static void main(String...k){
PrivateUniversity pu=new PrivateUniversity();
System.out.println("name of university entered"+pu.name);

}
}