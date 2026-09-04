class ConversionCasting {
    public static void main(Strings a[]){
        // type conversion 
        // large - small --> no risk
        // type casting
        // small - large --> preciion loss
        int a1 = 20;
        double a2 = a1;     // type conversion
        // no risk data, automaticaly
        System.out.println(a2); 

        int num = 257;      // 257%256 = 1
        byte b = (byte)num; // type casting

        byte b1 = 10;    // max value 127
        byte b2 = 30;
        int result;     // if its byte it exceds value
        result = b1*b2;

        double num1 = 50.5;
        int num2 = (int)num1;   // type casting -> precision loss
        System.out.println(num2);


        System.out.println(result);
    }
}
