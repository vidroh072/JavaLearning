package PillarsJava;
class Mobile{
    static int counter;
    static{
        // static block
        // called once irrespective how many obj created
        System.out.println("static initialised!!");
    }
    double price;
    public Mobile(double price){
        counter++;
        this.price = price;
    }
    static double add(double n1,double n2){
        return n1+n2;
    }    
    // non-static can access static variable but not wiseVersa
    void showCounter(){
        System.out.println(counter);
    }
    // using non static variable in static method by passing obj
    static void showPrice(Mobile obj){
        System.out.println("price: "+obj.price);
    } 
}
public class Static {
    // static -> method variable belong to class not obj
    // accessable wihout creating obj
    // static -> method  - cannot access non static variables/method
    public static void main(String a[]){
        // add method accessable without creating obj
        Mobile m1 = new Mobile(10_00_000);
        Mobile m2 = new Mobile(50_00_000);
        m1.showCounter();
        Mobile.showPrice(m2);
        System.out.println(Mobile.add(1,2));

        // why 
        // public static void main()
        // why it is static;
        // if not static -> non static -> create obj for static class
        // main -> starting point execution -> if not started -
        //                                  Make it static  <-  how obj creates
    }
}
