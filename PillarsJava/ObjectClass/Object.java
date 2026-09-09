package PillarsJava.ObjectClass;
class Laptop{ // extend object class 
    String model;
    int price;

    @Override   // override existing toString method
    public String toString() {
        return "Laptop [model=" + model + ", price=" + price + "]";
    }
    
}

class Object{
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.model = "HP";
        laptop.price = 75_00_000;
        // System.out.println(laptop.toString()); // print class name@hexadecimal hashcode
        // it print laptop.toString()  --->  by default

        // Object class have toString method;
        // what we want custom Output -> method overriding
        System.out.println(laptop);
    }
}