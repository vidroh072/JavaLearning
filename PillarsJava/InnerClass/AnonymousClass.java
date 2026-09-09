package PillarsJava.InnerClass;
class A{
    public void show(){
        System.out.println("CLass A");
    }
    /*
    Assume this class need only for one implementation
    why we would create infect -> use other
    class B{
        void show(){
            System.out.println("one time only");
        }
    }
         */
}
class AnonymousClass {
    // no name class 
    public static void main(String a[]) {
        A obj = new A()
        {
            // simple one time implementation
            public void show(){
                System.out.println("One time run..");
            }
        };  // use semicolon to end
        obj.show(); // only create class for "obj"
    }
    
}