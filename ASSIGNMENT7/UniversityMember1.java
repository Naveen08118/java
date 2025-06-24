//Assignment 3: Hierarchical Inheritance - University System

import java.util.Scanner;
class UniversityMember {
String name;
int id;

public void Uvm(){
System.out.println("please enter name");
Scanner sc =new Scanner(System.in);
this.name=sc.nextLine();
System.out.println("please enter id ");
this.id=sc.nextInt();
System.out.println("entered name is="+this.name);
System.out.println("entered id is="+this.id);


}
}

class Student extends UniversityMember{
String secname;
int age;

public void stu(){
Uvm();
System.out.println("please enter student section name");
Scanner sc =new Scanner(System.in);
this.secname=sc.nextLine();
System.out.println("please enter student  age ");
this.age=sc.nextInt();
System.out.println("entered student section name="+secname);
System.out.println("entered student age="+age);
}



}
class Professor extends UniversityMember{

String proftyp;
int experience;


public void prof(){
Uvm();
System.out.println("please enter PROFESSOR TYPE");
Scanner sc =new Scanner(System.in);
this.proftyp=sc.nextLine();
System.out.println("please enter YEARS OF EXPERIENCE for professor");
this.experience=sc.nextInt();
System.out.println("entered PROFESSOR TYPE is="+proftyp);
System.out.println("entered YEARS OF EXPERIENCE for professor");
}
}



class Staff extends UniversityMember{


String staf_type;
String streamstudied;

public void staf(){
Uvm();
System.out.println("please enter SATFF TYPE");
Scanner sc =new Scanner(System.in);
this.staf_type=sc.nextLine();
System.out.println("please enter the stream studied by staff");
this.streamstudied=sc.nextLine();

System.out.println("entered SATFF TYPE="+staf_type);
System.out.println("entered the stream studied by staff="+streamstudied);



}


}



class UniversityMember1{
public static void main(String...k){

Student swt=new Student();
swt.stu();

Professor prf=new Professor();
prf.prof();

Staff sft=new Staff();
sft.staf();
}

}

