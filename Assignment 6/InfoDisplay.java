//Assignment 5: Display Information


class InfoDisplay {

int inte;
String stri;


void show(int inte1){
inte=inte1;
System.out.println("integer value is="+inte);

}
void show(String stri1){
stri=stri1;
System.out.println("String value str="+stri);


}
void show(int inte1,String stri1){

inte=inte1;
stri=stri1;

System.out.println("integer value is ="+inte+"string value is ="+stri);
}
public  static void main(String...k)
{

InfoDisplay ifdis=new InfoDisplay();
ifdis.show(24,"java");

}



}


