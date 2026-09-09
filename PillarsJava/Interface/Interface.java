package PillarsJava.Interface;
interface  Prey{
    public void run();  // not req to add inteface
}
interface Predator{
    public void hunt();

}

class Dog implements Prey{

    @Override
    public void run() {
        System.out.println("Dog is running");
    }
    
}
// Fish can be prey or predator
// means need to add to classes -> but inheritance not support -> Diamond problem
// solution -> interface
//      blueprint for class -> deffine contract of methods & constant
//      without providing full implimentation;
//      tell what class can do but not how to do...
// multiple inheritance reduce dependency;
//  keyoword -> implements

// class Fish extends Prey {
    class Fish implements Prey,Predator {

        @Override
        public void hunt() {
            System.out.println("Fish is Hunting..");
        }

        @Override
        public void run() {
            System.out.println("Fish is Running");
        }
            
        
}
class Interface {
    public static void main(String a[]) {
        // reason why we need Interface ?
        //  multiple inheritance
        // reduce dependency;

        Fish fish1 = new Fish();
        fish1.run();
        fish1.hunt();
        Predator fish2 = new Fish();
        fish2.hunt();
        // fish2.run(); // Predator obj type dont know existence Prey
    }    
}
