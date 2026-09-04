class mutableString {
    // mutable String -> String Buffer
    //                -> String Builder
    
    public static void main(String a[]){

        // give buffer size
        StringBuffer str = new StringBuffer();
        System.out.println(str.capacity()); // -> 16
        
        // str = "mukesh";  not work
        str.append("mukesh");
        System.out.println(str);

        // delete
        str.delete(0, 2); // kesh
        System.out.println(str);

        // lenght
        System.out.println(str.length()); //4

        String str1 = str.toString();   // StringBuffer -> String
        System.out.println(str1);

        str.deleteCharAt(0); // esh
        System.out.println(str);

        // insert
        str.insert(0,"Nag");
        System.out.println(str);

        // substring
        System.out.println(str.substring(2)); // start,end
        

    }
}
