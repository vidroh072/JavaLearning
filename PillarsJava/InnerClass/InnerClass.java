package PillarsJava.InnerClass;

class A{
    int no;
    String name;
    public void show(){
        System.out.println("Class A");
    
    }
        class B{
            static String name = "Akash";
            public void show(){
                System.out.println("Class B");
            
            }
        }
}

class InnerClass {
    public static void main(String a[]){
        A objA = new A();
        // obj creation of B
        System.out.println(A.B.name);   // accesing class B static variable
        
        A.B objB = objA.new B();
        // object type A.B refrence type B
        objB.show();
        objA.show();
        // to access A variable and method(non-static) --> object create
        // thats why to create obj B -> need obj A
        
        // A.B objB = new B();  -> if B Static

    }
}
