package PillarsJava.Wrapper;
class WrapperClass {
    public static void main(String[] args) {
        double n1 = 5.0;
        int n2 = 10; // -> primitive data types -> fast
        Integer num1 = new Integer(20); // here line signify depricative
        // depricative -> no longer use
        // modern way
        Integer num2 = 10; // wrapper class of INTEGER
        System.out.println(num2+num1);

        // why we need Wrapper class -> Collection -> store data -> objects
        // array -> primitive type

        // primitive -> object (Boxing)
        Double point = n1;  // AutoBoxing

        // obj -> primitive
        int num = num1.intValue(); // Unboxing

        String pin = "4582";                // obj -> primitive
        int secure = Integer.parseInt(pin); // String to int
    }
}
