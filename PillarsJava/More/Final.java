package More;

final class Animal{
    static final float PIE = 3.14f; 
}
/*
class dog extends Animal{
        // cannot extend final call -> no inheritance
        // for final method cannot ovveride them,
}
*/
class Final{
    public static void main(String a[]) {
        // Animal.PIE = 50;    // cannot assigned 
        System.out.println(Animal.PIE);
    }
}