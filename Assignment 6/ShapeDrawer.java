
//Assignment 10: Shape Drawing



class ShapeDrawer 
{
 

void draw()
{
System.out.println("'Drawing shape");


}
void draw(String shapeName){
shapeName=shapeName;
System.out.println("'Drawing shape is ="+shapeName);

}
void draw(String shapeName, int size){
size=size;
shapeName=shapeName;
System.out.println("'Drawing shape is ="+shapeName);
System.out.println("'Drawing shape size is ="+size);



}
void draw(String shapeName, int width, int height){

height=height;
width=width;
shapeName=shapeName;
System.out.println("'Drawing shape is ="+shapeName);
System.out.println("'Drawing shape width is ="+width);
System.out.println("'Drawing shape height is ="+height);
}
public static void main(String...k){
ShapeDrawer sd=new ShapeDrawer();
sd.draw();
sd.draw("Circle");
sd.draw("rectangle",25);
sd.draw("traingle",23,34);
}


}