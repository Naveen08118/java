//Assignment 3: Area Calculator

class Area {
int length;
int width;
int height;
int radius;
int base;
final double PI=3.14;
void calculate(int radius1){
int radius=radius1;
double areaofcircle=(PI*radius*radius);
System.out.println("areaofcircle="+areaofcircle);
}
void calculate(int length1,int width1){
int length=length1;
int width=width1;
int areaofrectangle=(length*width);
System.out.println("area of rectangle="+areaofrectangle);

}


void calculate(int base1,double height1){

int base=base1;
double height=height1;
double areaoftraingle=(base*height)/2;
System.out.println("area of traingle is ="+areaoftraingle);

}

public static void main(String...k){

Area ar=new Area();
ar.calculate(23);
ar.calculate(23,34);
}
}