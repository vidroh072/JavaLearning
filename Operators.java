class Operators {
    public static void main(Strings a[]) {
        // manupulate variables
        // Arithmetic
        // int + int -> int
        // double + int -> double
        // double * int -> double
        // int * int -> int
        int num1 = 10;
        int num2 = 30;
        System.out.println(num1+num2);
        System.out.println(num1-num2);
        System.out.println(num1*num2);
        System.out.println(num1/num2);  // 10/30 -> 0.33 ->0 exept double
        System.out.println(num1%num2);  // remainder

        System.out.println(num1);
        // post increment
        int result = num1++; // first assign than update
        System.out.println(result);
        // pre increment
        result = ++num1; // update assign than 

        // assignment
        // = , += , *= , /= , %=
        
        // realtional
        // >= , <= , > , < , == , !=
        System.out.println(5==5); // boolean

        // logical operators
        // && , || , !
        System.out.println(!(5>3 && 5>=5));


    }    
}
