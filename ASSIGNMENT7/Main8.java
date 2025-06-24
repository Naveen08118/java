//Assignment 7: Real-life Example - Library System using Inheritance

class LibraryItem{



String title;
String publisher;
int year;

LibraryIem(){
System.out.println("please enter title of book");
Scanner sc new Scanner(System.in);
title=sc.nextLine();

System.out.println("please enter publisher of book");
Scanner sc new Scanner(System.in);
publisher=sc.nextLine();

System.out.println("please enter year published of book");
Scanner sc =new Scanner(System.in);
year=sc.nextInt();
}



public void display(){
System.out.println("entered title of the book="+title);
System.out.println("entered the publisher name of the book="+publisher);
System.out.println("entered year of the book relased="+year);

}




}

class Book extends LibraryItem{

String bookauthorname;
String bookmanufacturer;

Book(){
System.out.println("please enter the name of the bookauthorname");
Scanner sc=new Scanner(System.in);
this.bookauthorname=sc.nextLine();
System.out.println("please enter the name of the bookmanufacturer");
Scanner sc=new Scanner(System.in);
this.bookmanufacturer=sc.nextLine();
}

public void display()
System.out.println("entered name of the bookauthorname="+bookauthorname);
System.out.println("entered the name of the bookmanufacturer="+bookmanufacturer);




}


/**
class Magazine extends LibraryItem{


Magazine(){



}


}




class Newspaper extends LibraryItem{

String newspapertype;
String newpaperbreakingnews;


Newspaper(){


}


*/
}

class Main9{

public static void main(String...k){


Book bk=new Book();

bk.LibraryIem();
bk.display();
}

}