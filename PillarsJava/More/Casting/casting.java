package PillarsJava.Casting;
class Computer{
    public void show1(){
        System.out.println("Show computer");
    }
}
class Laptop extends Computer{
    public void show2(){
        System.out.println("Show Laptop");
    
    }

}
public class casting {
    public static void main(String[] args) {
        
        int num1 = 50;
        double num2 = 100.50;   
        int num3 = (int )num2;  // explicit casting -> type casting
        System.out.println(num3+"\n");

        // what about objects...
        // obj type = laptop , refrence = computer
        Computer lap = (Computer) new Laptop(); // this is by automatic happening 
        // upCasting    type cast, sub class -> parent class

        //lap.show2();    // Computer no idea is laptop exist
        Laptop lap1 =(Laptop) lap;  // manual
        // Upperclass -> downClass -> downCasting
        lap1.show1();   // he knows his parent
        lap1.show2();    
    }
    
    
}
