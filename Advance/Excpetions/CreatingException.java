package Excpetions;
class MyException extends Exception{
    MyException(String str){
        System.out.println("This is created exception");
        super(str);
    }
}
public class CreatingException {
    public static void main(String[] args) {
        try{
            int i = 0;
            if(i==0){
                throw new MyException("Error i ==0");
            }
        }catch(MyException e){
            System.out.println(e.getMessage());
        }
    System.out.println("Code is Running..");
    }
}
