package Inheritance;
class Animal{
    int count;
    Animal(){
        count = 10;
    }
    public void eat(){
        System.out.println("Animal is eating!!");
    }
}
class Dog extends Animal{
    public void bark(){
        System.out.println("Dog is barking..");
        System.out.println(count);
    }

}
class Fish extends Animal{
    public void swim(){
        System.out.println("Fish is Swimming..");
    }

}
class Inheritance {
    public static void main(String a[]){
        //      IS              Car (parent class)
        //      BMW IS-A Car       |-> BMW  (child  class)
        // allow child class to inherit field & methods from parent class
        // implement using extends keyword.

        Dog dog1 = new Dog();
        dog1.eat();                     // Animal -> parent class
        dog1.bark();                    // dog and fish -> child class
        Fish fish1 = new Fish();        // inherit eat method from parent
        fish1.swim();
        
        // why fish cannot extend two classes
        //      -> Ambiguity problem
    }    
}
