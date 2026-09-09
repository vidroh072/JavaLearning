package Basics.Base2;
class ForamtingOut {
    public static void main(String a[]){
        System.out.print("Same line "); // same line
        System.out.println("Next new line"); // New line
        System.out.print("ok\n");

    //  System.out.printf(); -> here is foramt output
    //  %[flags][width][precision][special-char]

        int n = 10;
        boolean isTrue = false;
        String name = "Aakash";
        double marks = 500481.54;

        System.out.printf("numer: %d boolean: %b%n",n,isTrue);
        System.out.printf("String: %s marks : %f\n",name,marks);

        // precision
        System.out.printf("Marks foramted: %.2f\n",marks);
        System.out.printf("Marks foramted: %,.2f\n",marks);

        // flags
        int a1 = 500;
        int a2 = -500;  
        // (  add parenthis to ve- number
        // space add space to +ve number
        // + show sign
        
        System.out.printf("%+d\n",a1);
        System.out.printf("%+d",a2);

        // padding
        System.out.println();
        int num = 5;
        System.out.printf("%4d  ab\n",num); // padding left side
        System.out.printf("%-4d  ab\n",num); // padding Right side
        System.out.printf("%04d  ab\n",num); // Add 0 left side
        System.out.printf("% 04d  ab\n",num); // Add 0 Right side


    }    
}
