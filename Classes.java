class Calculator{
    static String greet = "Hello";
    static void greetings(){
        System.out.println(greet);
    }
    // method declaration
    double add(double num1,double num2){
        return num1+num2;
    }
}
class Classes {
    public static void main(Strings a[]){
        System.out.println();
        Calculator.greetings();

        // object creation
        Calculator calc = new Calculator();
        double result = calc.add(5.5, 10);
        System.out.println(result);


        
    }
}
