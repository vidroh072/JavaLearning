package PillarsJava;
class A{
    String name = "ABCD";
    public A(){
        // super() -> default call Object class
        System.out.println("Constructor A....");
    }
    
    public A(int n){
        System.out.println("Run Constructor A second...");
    }
    
}
class B extends A{
    String name = "EFGH";
    public B(){
        this(5);
        // super ()-> default -> call A() 
        System.out.println("Constructor B....");
    }
    public B(int n1){
        // super() -> default 
        System.out.println("Run Constructor B second...");
    }
    public B(int n1,int n2){
        super(n2); // created by explicit -> A(int) 
        // super() -> default
        System.out.println("Run Constructor B third...");
    }
    public void parentName(){
        System.out.println(super.name); // parent instance variable
    }
    public void myName(){
        System.out.println(name);
    }
}
class ThisSuper {
    public static void main(String a[]){
        B objB = new B();
        // call constructor of both SubClass & SuperClass
        // why bcz each construcor had super()
        //                          -> refrence variable -> refer -> parent class obj
        
        System.out.println("------");   
        B objB1 = new B(40);   // constructor B(int) <- super constrctor
        
        System.out.println("------");   
        B objB2 = new B(10,20); // call B(int,int) <- super(int) <- A(int)
        
        // uses of super
        // parent class method & instance variables if same
        objB.parentName(); // parent class instance variable
        objB.myName();      // same class instance variable
    }    
}
