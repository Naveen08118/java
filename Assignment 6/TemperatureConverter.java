
//Assignment 7: Temperature Converter

class TemperatureConverter {

double Celsius;

double fahrenheit;
double kelvin;

void convert(int Celsius,double fahrenheit){


 fahrenheit = (Celsius * 9/5) + 32;

System.out.println("fahrenit caluclated as="+fahrenheit);

}
void convert(double fahrenheit,double Celsius){

Celsius = (fahrenheit - 32) * 5.0 / 9.0;
System.out.println("celsius caluclated as="+Celsius);

}
void convert(double kelvin1){
kelvin=kelvin1;
Celsius = (kelvin - 273.15);


System.out.println("celsius caluclated from kelvin as="+Celsius);
}


public static void main(String...k){

TemperatureConverter tc=new TemperatureConverter();
tc.convert(23,45);
tc.convert(467.00,45);
tc.convert(234);

}








}