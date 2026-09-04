class Strings {
    public static void main(String a[]){
        // character stream -> immutable
        // class -> so we have to create obj but...
        String name1 = new String("Aakash");
        // creates new obj in heap -Slower -create duplicate obj
        String name2 = "Aakash";
        // reuse memory if text alreay exist -> string pool

        String name3 = "Aakash";
        String name4 = "aakash";
        
        System.out.println(name1==name2); // diff refrence type
        System.out.println(name2==name3); // same refrence 
        System.out.println(name3==name4); // diff refrence type
        
        System.out.println(name2.charAt(0));
        System.out.println(name2.concat(name4));
        System.out.println(name2.length());
        System.out.println(name2.equals(name1)); // -> check actutal string

    }
}
