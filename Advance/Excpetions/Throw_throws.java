package Excpetions;

public class Throw_throws {
    public static void main(String[] args) throws ArithmeticException{
        // throw  ->  throw the exception -> custom exception
        try{
            int y = 0;
            if(y==0){
                // specific exception object into the runtime environment.
                // Used inside a method body to actively throw a single exception
                throw new ArithmeticException("Y = 0");
            }
        }
        catch(ArithmeticException e){
            System.out.println("You answer cannot be zero "+e.getMessage());
        }
        System.out.println("Code is Running \n");

        try{
            divide(5, 0);
        }
        catch(ArithmeticException e){   // catching the throw statement
            System.out.println("b cannot be Zero "+ e.getMessage() );
        }
        
        
    }
    // throws -> Used in a method signature to warn, calling code
    //  -> method might throw exceptions it hasn't handled internally
    public static void divide(int a,int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Code is stoped");
        }
        int result = a/b;
    }
}
