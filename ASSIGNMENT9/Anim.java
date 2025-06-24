//Assignment 1: Abstract Class - Animal Kingdom
abstract class Animal{

abstract void makeSound();

void breathe();


}
class Dog extends Animal{

void makeSound(){
System.out.println("dog makes sound");
} 
void breathe(){
System.out.println("dog is breating");

}


}
}
class Cat extends Animal{

void makeSound(){
System.out.println("Cat makes sound");
} 
void breathe(){
System.out.println("CAT is breating");
}


}

public class Anim{



public static void main(String...k){

Dog dg=new Dog();
dg.makeSound();


Cat ct=new Cat();
ct.makeSound();

}
}