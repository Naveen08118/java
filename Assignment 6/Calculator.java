//Assignment 1: Calculator Class
//Topic: Method Overloading
//Task:
//Create a Calculator class with overloaded add(), subtract(), multiply(), and divide() methods that accept:
//- Two integers
//- Two doubles
//- Three integers
// Goal: Understand how methods with same name handle different types and argument counts.



class Calculator 
{

public int add(int x,int y)
{
return (x+y);
}

public double add(double x,double y)
{
return (x+y);
}

public int add(int x,int y,int z)
{

return (x+y+z);

}

public int subtract(int x,int y)
{
return (x-y);
}
public double subtract(double x,double y)
{
return (x-y);
}

public int subtract(int x,int y,int z)
{return (x-y-z);
}
public int multiply(int x,int y)
{
return (x*y);
}



public double multiply(double x,double y)
{
return(x*y);

}

public int multiply(int x,int y,int z)
{


return (x*y*z);
}
public int divide(int x,int y)
{

return(x/y);


}
public double divide(double x,double y)
{
return(x/y);
}
public int divide(int x,int y,int z)
{

return (x/(y/z));

}







public static void main(String...k)
{
Calculator cal=new Calculator();
int addt1=cal.add(23,24);System.out.println("the addation of two integer numbers is="+ addt1);
int addt2=cal.add(23,24,34);System.out.println("the addation of three integers numbers is="+ addt2);
int addt3=cal.add(43,24);System.out.println("the addation of two double numbers is="+ addt3);
int subt1=cal.subtract(23,24);System.out.println("the subtraction of two integer numbers is="+ subt1);
int subt2=cal.subtract(23,24);System.out.println("the subtraction of two double numbers is="+ subt2);
int subt3=cal.subtract(24,24,24);System.out.println("the subtraction of three integer numbers is="+ subt3);
int mult1=cal.multiply(23,24);System.out.println("the multiplication  of two integer numbers is="+ mult1);
int mult2=cal.multiply(23,24);System.out.println("the multiplication of two double numbers is="+ mult2);
int mult3=cal.multiply(3,4,5);System.out.println("the multiplication of three integer numbers is="+ mult3);
int divt1=cal.divide(25,5);System.out.println("the divison of two integer numbers is="+ divt1);
int divt2=cal.divide(24,4);System.out.println("the divison of two double numbers is="+ divt2);
int divt3=cal.divide(3,5,5);System.out.println("the division of three integer numbers is="+ divt3);


//System.out.println("the addation of two integer numbers is="+ addt1);
}
}