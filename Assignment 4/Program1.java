import java.util.Scanner;

/** 1.Create a class as student with members:
data members : rollno, name, mark1, mark2, mark3, total and average.
member functions: gettotal(),getdata() and displaydata().

gettotal(): Return the total marks 
getdata() method used to get the student details.
displaydata() method used to display the student details.
*/





class Student {
    int rollno;
    String name;
    int mark1;
    int mark2;
    int mark3;
    int total;
    double average;

    //Method to calculate total marks
    public void getTotal() {
        total= (mark1+mark2+mark3);

    System.out.println(total);
    }

    //Method to get the student data
    public void getData()
    {
        System.out.println("please enter roll number");
        Scanner sc=new Scanner(System.in);
        rollno=sc.nextInt();
        System.out.println("please enter Name");
        sc.nextLine();
        name=sc.nextLine();
        System.out.println("please enter marks1");
        mark1=sc.nextInt();
        System.out.println("please enter marks2");
        mark2=sc.nextInt();
        System.out.println("please enter mark3");
        mark3=sc.nextInt();
        getTotal();
        getAverage();
        
    }
    //Method to calculate the average marks
    public void getAverage()
    {
        average=(double)total/3;
    System.out.println(average);
    }

    //Method to display the student data
    public void displayData() {
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
        System.out.println("Mark 3: " + mark3);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }
}



class Program1{
public static void main(String...k){
Student st=new Student();

    st.getData();
    //st.getData();
    //st.getData();
    //st.getData();
st.displayData();
st.getTotal();
st.getAverage();



}}