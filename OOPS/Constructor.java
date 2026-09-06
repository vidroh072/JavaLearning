package PillarsJava;

class Car{
    String origin;
    String name;
    String color;
    private double price;
    
    public Car(){   // default constructor, no return type
        origin = "india";
        // purpose -> initialise obj
        // implicit constructor         
        // when a class has no user-defined constructors
        // explicit is written manually
    }
    // paramerized constructor
    public Car(String name, String color, double price){
        this.name = name;
        this.color = color;
        this.price = price;
    }
    // there are two contructor that called constructor overloading;
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
class Constructor {
    public static void main(String a[]){
        // creating obj
        Car car1 = new Car();
        System.out.println(car1.origin);
        // new -> create obj -> called constructor if no value default one

        Car car2 = new Car("BMW","Blue",25_000_000);
        
        double price = car2.getPrice();
        System.out.printf("%,.2f%n",price);
    }    
}
