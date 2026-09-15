package Excpetions;

public class Handling {
    public static void main(String[] args) {
        
        // two type of statemtns
        // 1. normal
        int i = 5;
        // 2. critical
        // int j = i/0;

        // Handling using try-catch
        try{
            int[] array = {1,2,3};
            array[10] = 10;
            int j = i/0;
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by Zero");
        }
        catch(Exception e){
            System.out.println("Error occured");
        }

        // More
        //          Object
        //          Throwable   -> able -> interface (but it is class) <- exception
        
        // Runtime exception -> Checked   -> Compulsary to handle
        //                   -> Unchecked -> You can handle
    }

}
