import java.util.*;

class Polymorphism{//supper class
   public void animalSound(){
       System.out.println("The animal make the sound");
   }
}//polymorphism means "many forms"
//Like we specified in the previous chapter; Inheritance lets us inherit attributes and methods from another class.
// Polymorphism " uses those methods to perform different tasks ". This allows us to perform a single action in different ways.

class Dog extends Polymorphism{//child class
    public void animalSound(){
       System.out.println("The dog say : Bow Bow");
    }
}

class Pig extends Polymorphism{//child class
    public void animalSound(){
       System.out.println("The pig say : Wee Wee");
    }
}

class Main{
    public static void main(String args[]){
        Polymorphism newObj = new Polymorphism();//create an object using supper class
        Polymorphism DogClass = new Dog();//create "DogClass" object using Dog child class because of Dog class extends supper class
        Polymorphism PigClass = new Pig();//create "PigClass" object using Dog child class because of Pig class extends supper class

        newObj.animalSound();
        DogClass.animalSound();
        PigClass.animalSound();
    }
}

//Why And When To Use "Inheritance" and "Polymorphism"?
//- It is useful for code reusability: reuse attributes and methods of an existing class when you create a new class.