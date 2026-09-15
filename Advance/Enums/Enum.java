package Enums;
enum Status {
    // uppercase letters
    LOW,MEDIUM,HIGH;
    
}

public class Enum {
    public static void main(String[] args) {
        // group of constants

        Status s = Status.MEDIUM;
        switch (s) {
        case LOW -> System.out.println("Low level");
        case MEDIUM -> System.out.println("Medium level");
        case HIGH -> System.out.println("High level");
        }
        // .values - > array
        for (Status status : Status.values()) {
            System.out.print(status+" -> ");
            System.out.println(status.ordinal());
        }
        // Enums cannot extend any class because they already 
        // implicitly extend java.lang.Enum
        
        // cannot create new enum objects using the new keyword.
    }
}