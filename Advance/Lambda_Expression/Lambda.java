package Lambda_Expression;
interface A1{
    void show();    // by default public abstract
    // Marking a method as final prevents it from being overridden,
    // that completly defeats purpose of interface..
    // Static methods -> class or interface rather than an instance.
    // implementing classes couldn't use polymorphism to provide custom behavior

    // varibales -> public static final -> belong interface, cannot be reassigned
}
interface A2{
    void show(int a);
    
}
interface A3{
    void show(int a,int b);

}
public class Lambda {
    // lambda expressiom {Annonymous inner class}
    // only for functional interface
    public static void main(String[] args) {
        A1 obj1 = new A1() {
            public void show(){
                System.out.println("Without lambda expression..");
            }
        };
        obj1.show();

        // with lambda expression -> readablity reduce verbal and bulky code
        A1 obj2 = () -> System.out.println("With lambda expression..");
        obj2.show();

        // for arguments
        int a = 5;
        A2 obj3 = b -> System.out.println("With arguments.."+ a);
        obj3.show(a);   // pass arguments

        // two more arguments
        int c = 10;
        A3 obj4 = (i,j) -> System.out.println("Two Arguments "+a+c);
        obj4.show(a, c);
    }
}
