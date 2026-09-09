package PillarsJava.Abstract;
abstract class Shape{
    abstract void show();
}
class circle extends Shape{

    @Override
    void show() {
        System.out.println("Circle");
    }
    
}
class rectangle extends Shape{
    
    @Override
    void show() {
        System.out.println("Rectangle");
        
    }

}

class Abstract {
    public static void main(String[] args) {
        
        // abstract 
        // declare methods without implementation -> default template
        // sub class must deffine this method
        // abstract class -> no obj creation possible
        // but can refrence
        // Shape shape = new shape();   not possible

        Shape rect = new rectangle();
        rect.show();
    }
}
