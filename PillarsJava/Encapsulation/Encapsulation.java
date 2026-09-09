class Car{
    String name;   // instance variable directly accesable
    String color;
    private double price;
    
    public void showCar(){
        System.out.println("Car: "+name+" Color: "+color+" Price: "+price);
    }
    // getter
    public double getPrice() {
        return price;
    }
    // setter
    public void setPrice(double price) {
        this.price = price;     // here this refer to current obj
    }
    

}
class Encapsulation {
    // one of 4 pillar of oops
    // wrapping data & methods into single unit..
    // protective shield prevent code outside class to direct access
    // provide authorised access through getter & Setter
    public static void main(String a[]){
        Car car1 = new Car();
        car1.name = "BMW";
        car1.color = "Black";
        // car1.price = 25_50_000;
        System.out.println(car1.color);
        // directly accessable
        // car1.price = 50000; // anyone can change its value
        car1.setPrice(25_00_000);   // providing authorised access
        System.out.println(car1.getPrice());

        // this -> refer to current obj we are working with
        // without this the problem
        // age = age    if both instance and local variable have same name;
    }
}
