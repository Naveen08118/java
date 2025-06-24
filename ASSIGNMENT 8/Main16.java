//Assignment 7: Abstract Class vs Interface - Online Learning Platform
abstract class User{

void login(){

System.out.println("entered into concrete method");
}




} 
interface CourseContent{
void accessContent();
}

class Student extends User implements CourseContent{


public void login(){

System.out.println("entred to login method");
}
public void accessContent(){


System.out.println("entred to accesscontent method");

}



}
class Main16
{

public static void main(String...k){

User us=new Student();
us.login();
CourseContent cs=new Student();
cs.accessContent();

}




}