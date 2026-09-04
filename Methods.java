class Car{
    String brand; // -> instance variable
    // evry obj has its own copy
    // default null
    void start(){
        System.out.println(brand + " Car is Starting...");
    }
    // method overloading
    int totalDist(int first,int second){
        return first+second;
    }
    int totalDist(int first,int second,int third){
        return first+second+third;
    }
    
}

class Methods{
    public static void main(Strings a[]){
        Car car1 = new Car();
        car1.brand = "BMW"; // changing instance variable
        car1.start();
        int result = car1.totalDist(15, 15);
        System.out.println(result);
        result = car1.totalDist(15, 15, 15);
        System.out.println(result);
    }
}