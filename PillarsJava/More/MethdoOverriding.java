package More;
// package PillarsJava;
class Computer{
    void on(){
        System.out.println("Turn on Computer...");
    }
}
class Laptop extends Computer{
    @Override // Override the parent method
    void on(){
        System.out.println("Turn on Laptop...");
    }
    
}
class Mobile extends Computer{
    @Override 
    void on(){
        System.out.println("Turn on Mobile...");
    }

}
class MethdoOverriding{    
    public static void main(String a[]){
        Computer computer = new Computer();
        computer.on();

        Laptop laptop = new Laptop();
        laptop.on();
        // subClass provide method which are already define in parent class
    }
}
