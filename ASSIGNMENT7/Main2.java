//Assignment 5: Method Overriding with Inheritance - Animal Sound System


class Animal{

void makeSound(){


System.out.println("Animal makes sound");


}
}


class Dog extends Animal{


void makeSound(){

System.out.println("Dog makes sound");



}






}

class Cat extends Animal{

void makeSound(){


System.out.println("Cat makes sound");


}





}


class Cow extends Animal{


void makeSound(){


System.out.println("Cow makes sound");


}





}



class Main2{

public static void main(String...k){

Animal cw=new Cow();
cw.makeSound();
Animal dg=new Dog();

dg.makeSound();
Animal ct=new Cat();
ct.makeSound();
}


}

