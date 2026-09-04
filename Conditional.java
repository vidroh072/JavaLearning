class Conditional{
    public static void main(Strings a[]){
        // if else -> condtion or decision making
        
        byte age = 18;
        char gender = 'M';
        if(age>=18) // single if statement
            System.out.println("Eligible for vote");
        
        if(gender=='M'){    // if-else if statement
            System.out.println("you are Male");
        }else if(gender=='F'){
            System.out.println("you are Female");
        }else{
            System.out.println("Not defined");
        }

        if(age>=18 && age<=28){     // nested if-else
            System.out.println("You can apply for gate");
            if (gender=='M') {
                System.out.println("Male");
            }else{
                System.out.println("Female");
            }
        }
    
    int day = 3; 
    // switch 
    switch (day){
        case 1 : 
            System.out.println("Monday");
            break;
        case 2 : 
            System.out.println("Tuesday");
            break;
        case 3 : 
            System.out.println("wednesday");
            break;
        default : System.out.println("Invalid day");
    }
    // enhanced switch
    String dayName = switch (day) { 
    case 1 -> "Monday";
    case 2 -> "Tuesday";
    case 3 -> "Wednesday"; // Matches and returns "Wednesday"
    default -> "Invalid day"; 
};
System.out.println(dayName);
    
    }
}