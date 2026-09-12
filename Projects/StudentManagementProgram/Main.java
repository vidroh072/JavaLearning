import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ===== Enter Total No of Students =====");
        System.out.print("| ----> ");
        int choice = sc.nextInt();
        sc.nextLine();
        StudentManager student = new StudentManager(choice);
        boolean isRunning = true;
        while(isRunning){ 
            System.out.println("\n ----- Student Managemen System -----");
            System.out.println("| 1. Add Student");
            System.out.println("| 2. View Students");
            System.out.println("| 3. Find Student");
            System.out.println("| 4. Update Student"); 
            System.out.println("| 5. Delete Student");
            System.out.print(" -----> ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 ->{
                    System.out.println("\n----- Add Student -----");
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter NAME: ");
                    String name = sc.nextLine();
                    System.out.print("Enter COURSE: ");
                    String course = sc.nextLine();
                    System.out.print("Enter CGPA: ");
                    double cgpa = sc.nextDouble();
                    boolean studentAdded = student.addStudent(id, name, course, cgpa);

                    if(studentAdded) System.out.println(" - Data Succefully Added");
                    else System.out.println(" - Id Already Exists OR Storage Full..");
                }
                case 2 -> student.viewStudents();
                case 3 -> {
                    System.out.print("\n Enter ID of Student: ");
                    choice = sc.nextInt();
                    sc.nextLine();
                    student.findStudent(choice);
                }
                 
                case 4 -> {
                    System.out.println("\n----- Update Student -----");
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new NAME: ");
                    String name = sc.nextLine();
                    System.out.print("Enter new COURSE: ");
                    String course = sc.nextLine();
                    System.out.print("Enter new CGPA: ");
                    double cgpa = sc.nextDouble();
                    boolean updated = student.updateStudent(id, name, course, cgpa);
                    if(updated) System.out.println(" - Updated Succefully");
                    else System.out.println(" - Record Not found..");
                }
                case 5 -> {
                    System.out.print("\n Enter ID of Student: ");
                    choice = sc.nextInt();
                    sc.nextLine();
                    boolean isDeleted = student.deleteStudent(choice);
                    if(isDeleted) System.out.println(" - Succefully Deleted..");
                    else System.out.println(" - Record not found..");
                }
                case 0 -> isRunning = false;
                default -> System.out.println("Enter Valid Input!!..");
            }
        }
    }
}
