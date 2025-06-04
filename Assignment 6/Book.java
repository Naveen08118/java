
//Assignment 4: Book Record

class Book{
String title;
String author;
int price;

Book(){
System.out.println("default constructor called");

}
public void Book(String title1){

String title=title1;
System.out.println("title of book is"+title);
}

public void Book(String title1,String author1){
String title=title1;
String author=author1;
System.out.println("title of book is="+title+"author of book="+author);


}
public void Book(String title1,String author1,int price1){
String title=title1;
String author=author1;
int price=price1;
System.out.println("title of book is="+title+"author of book="+author+"price of book is="+price);

}
public static void main(String...k){

Book bk=new Book();
bk.Book("JAVA","GOOSLE");
bk.Book("JAVA");
bk.Book("JAVA","GOOSLE",999);


}


}