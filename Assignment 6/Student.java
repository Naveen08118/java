//Assignment 2: Student Details

class Student{

String name;
String department;
int age;

public Student(){


}
 public Student(String name)
{

this.name=name;


}

public Student(String name,int age)
{

this.name=name;
this.age=age;
System.out.println("name is ="+name+"age ="+age);


}


public Student(String name,int age,String department)
{
this.name=name;
this.age=age;
this.department=department;
}


public static void main(String...k){

Student st = new Student("satching",23,"ece");
//st.Student("satching",23,"ece");
System.out.println("name is ="+ st.name+"age="+st.age+"departement="+st.department);
}
}
