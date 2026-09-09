package Polmorphism;
class Animal{
    public void show(){
        System.out.println("I Am Animal");
    }
}
class Dog extends Animal{
    public void show(){
        System.out.println("I Am Anishk!! Bhau...");
    }
    
}
class Cat extends Animal{
    public void show(){
        System.out.println("I Am Cat");
    }

}
class Polymorphism {
    // many behaviour

    public static void main(){
        Animal dog = new Dog();
        dog.show();
        // refrence type Animal -> data type variable -> tells -> compiler 
        //                              what allowed to do with variable dog
        // obj type Dog -> actual instance created in the computer's memory
       dog = new Cat();
       dog.show();
       // same dog variable but diff behaviour 
    }
}
