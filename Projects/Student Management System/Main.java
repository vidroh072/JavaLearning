import java.util.Scanner;

public class Main {
    static int[] rollData;
    static String[] nameData; 
    static String[] courseData;
    static double[] cgpaData;
    static int choice;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        boolean isRunning = true;
        while (isRunning) {
            System.out.println(" ------ Student Management System ------");
            System.out.println("| 1. Student");
            System.out.println("| 2. Teacher");
            System.out.println("| 0. Exit");
            System.out.print(" ----> ");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> student();
                case 2 -> teacher();
                case 0 -> isRunning = false;
                default -> System.out.println("Wrong input!!"); 
            }
        }
    }
    public static void student(){
        if(rollData==null){
            System.out.println("No Data Available!!");
            return;
        }
        System.out.println(" ------ Student Management System ------");
        System.out.println("| 1. View CGPA");
        System.out.println("| 0. back");
        System.out.print(" ----> ");
        choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1 -> viewCgpa();
            default -> System.out.println("Wrong input!!"); 
        }
    }
    public static void viewCgpa(){
        System.out.println("\nEnter Your Roll: XXXX");
        System.out.print(" ----> ");
        int roll = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < rollData.length; i++) {
            if(rollData[i]==roll){
                System.out.printf("Name: %s, RollNo: %d%n",nameData[i],rollData[i]);
                System.out.printf("Your CGPA for Sem: %.2f, Course: %s%n",cgpaData[i],courseData[i]);
                if(cgpaData[i]>9){
                    System.out.println("You Achieved First Division..");
                }else if(cgpaData[i]>7){
                    System.out.println("You peformed Well...");
                }
                else if(cgpaData[i]>3.5){
                    System.out.println("You Just Passed!!!");
                }else{
                    System.out.println("You Failed..");
                }
                return;
            }
            
            System.out.println("ROll NOT FOUND...");
        }
    }
    public static void teacher(){
        boolean isRunning = true;
        while (isRunning) {
            if(!(rollData == null)){
                System.out.println(" ------ Student Management System ------");
                System.out.println(" 1. Show Student");
                System.out.println(" 2. Add Student");
                System.out.println(" 3. Update Student");
                System.out.println(" 4. Delete Student");
                System.out.println(" 0. Exit");
                System.out.print(" ----> ");
                choice = sc.nextInt();
                switch (choice) {

                    case 1 -> showStudent();
                    case 2 -> addStudent();
                    case 3 -> updateStudent();
                    case 4 -> deleteStudent();
                    default -> isRunning = false;
                }
            }else{
                System.out.println(" ------ Student Management System ------");
                System.out.println("| Total no of Students;");
                System.out.print(" ----> ");
                    choice = sc.nextInt();
                    if(choice>0 && choice<=100){
                        rollData = new int[choice];
                        nameData = new String[choice];
                        courseData = new String[choice];
                        cgpaData  = new double[choice];
                    }
                    else{
                        System.out.println("Wrong Input Exiting...");
                        isRunning = false;
                    }
            }
        }
    }
    
    public static void addStudent(){
        int roll;
        String name;
        String course;
        double cgpa;
        System.out.println(" ------ Student Management System ------");
        System.out.print("| Enter Student ROll XXXX: ");
        roll = sc.nextInt();
        sc.nextLine();
        System.out.print("| Enter Student Name     : ");
        name = sc.nextLine();
        System.out.print("| Enter Student Course   : ");
        course = sc.nextLine();
        System.out.print("| Enter Total CGPA   : ");
        cgpa = sc.nextDouble();
        sc.nextLine();
        for(int i = 0; i<rollData.length;i++){
            if(rollData[i]==0){
                rollData[i] = roll; 
                nameData[i] = name; 
                courseData[i] = course;
                cgpaData[i] = cgpa;
                break;
            }
        }
    }
    public static void showStudent(){
        if(rollData ==null || rollData.length == 0){
            System.out.println("No Data OopS!!");
        }
        else{
            int count = 0;
            System.out.println("\n------------- Data ------------");
            for (int i = 0; i < rollData.length; i++) {
                if(rollData[i]==0) continue;
                count++;
                System.out.printf("Data %d%n",count);
                System.out.printf("Roll: %d, Name: %s%n",rollData[i],nameData[i]);
                System.out.printf("Course: %s, CGPA: %.2f%n",courseData[i],cgpaData[i]);
            }
            System.out.println("\n========== Data Over ==========\n");
        }
    }
    public static void updateStudent(){
        int roll;
        System.out.print("| Enter Student ROll XXXX: ");
        roll = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < rollData.length; i++) {
            if(rollData[i]==roll){
                System.out.printf("Name: %s%n",nameData[i]);
                boolean isRunning = true;
                while (isRunning) {
                    System.out.println(" ------ UPDATION WINDOW ------");
                    System.out.println("| 1. Change Name");
                    System.out.println("| 2. Change Course");
                    System.out.println("| 3. Change CGPA");
                    System.out.println("| 0. Exit");
                    choice = sc.nextInt();
                    sc.nextLine();
                    switch (choice) {
                        case 1 -> changeName(i);
                        case 2 -> changeCourse(i);
                        case 3 -> changeCGPA(i);
                        case 0 -> isRunning = false;
                        default -> System.out.println("Wrong Input..");
                    }
                }
            }
        }
    }
    public static void changeName(int index){
        System.out.println("\n----- Enter New NAME -----");
        System.out.println(" ----> ");
        String name = sc.nextLine();
        nameData[index] = name;
        System.out.println("Name Successfully Changed....");
    }
    public static void changeCourse(int index){
        System.out.println("\n----- Enter New Course -----");
        System.out.println(" ----> ");
        String course = sc.nextLine();
        courseData[index] = course;
        System.out.println("Course Successfully Changed....");
    }
    
    public static void changeCGPA(int index){
    System.out.println("\n----- Enter New CGPA -----");
    System.out.println(" ----> ");
    double cgpa = sc.nextDouble();
    cgpaData[index] = cgpa;
    System.out.println("CGPA Successfully Changed....");
}

    public static void deleteStudent(){
        System.out.println("\n----- DELETE STUDENT WINDOW-----");
        System.out.println(" ----> ");
        int roll = sc.nextInt();
        for (int i = 0; i < rollData.length; i++) {
            if (rollData[i]==roll) {
                rollData[i] = 0;
                nameData[i] = null;
                cgpaData[i] = 0;
                courseData[i] = null;
                return; 
            }
        }
        System.out.println("ROll NOT FOUND....");
    }
}
