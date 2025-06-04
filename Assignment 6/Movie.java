//Assignment 8: Movie Class
class Movie{

String Title;
String genre;

int release_year;


Movie(String Title1){
Title=Title1;
System.out.println("the title of movie is="+Title);

}
Movie(String Title1,String genre1){
Title=Title1;
genre=genre1;
System.out.println("the title of movie is="+Title+" "+"genre of movie"+genre);



}


Movie(String Title1,String genre1,int release_year1){

Title=Title1;
genre=genre1;
release_year=release_year1;
System.out.println("the title of movie is="+Title+" "+"genre of movie="+genre+""+"release_year of movie="+ release_year);

}

public static void main(String...k){

Movie mv=new Movie("spykids","scientific",2008);
Movie mv1=new Movie("spykids");
Movie mv2=new Movie("spykids","scientific");

}

}